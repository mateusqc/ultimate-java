package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import objects.SaveGame.SaveGamePlayerRecord;

import org.apache.commons.lang3.StringUtils;

import ultima.Constants;
import ultima.Context;
import util.PartyDeathException;
import util.Utils;
import util.XORShiftRandom;

public class Party extends Observable implements Constants {

    private SaveGame saveGame;
    private List<PartyMember> members = new ArrayList<>();
    private int activePlayer = 0;
    private Tile transport;
    private int torchduration;
    private final Random rand = new XORShiftRandom();
    private Context context;

    public Party(SaveGame sg) {
        this.saveGame = sg;

        for (int i = 0; i < saveGame.members; i++) {
            members.add(new PartyMember(this, saveGame.players[i]));
        }

    }

    public void addMember(SaveGame.SaveGamePlayerRecord rec) throws Exception {
        if (rec == null) {
            throw new Exception("Cannot add null record to party members!");
        }
        members.add(new PartyMember(this, rec));
    }

    public List<PartyMember> getMembers() {
        return members;
    }

    public PartyMember getMember(int index) {
        if (index >= members.size()) {
            return null;
        }
        return members.get(index);
    }

    public SaveGame getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(SaveGame saveGame) {
        this.saveGame = saveGame;
    }

    public int getActivePlayer() {
        return activePlayer;
    }

    public Tile getTransport() {
        return transport;
    }

    /**
     * 0x10-ship facing west 
     * 0x11-ship facing north 
     * 0x12-ship facing east
     * 0x13-ship facing south 
     * 0x14-horse facing west 
     * 0x15-horse facing east
     * 0x18-balloon 
     * 0x1f-on foot
     *
     * @param transport
     */
    public void setTransport(Tile transport) {
        this.transport = transport;
        saveGame.transport = transport.getIndex();

        if (transport.getRule().has(TileAttrib.horse)) {
            context.setTransportContext(TransportContext.HORSE);
        } else if (transport.getRule().has(TileAttrib.ship)) {
            context.setTransportContext(TransportContext.SHIP);
        } else if (transport.getRule().has(TileAttrib.balloon)) {
            context.setTransportContext(TransportContext.BALLOON);
        } else {
            context.setTransportContext(TransportContext.FOOT);
        }
    }

    public int adjustShipHull(int val) {
        saveGame.shiphull = Utils.adjustValue(saveGame.shiphull, val, 50, 0);
        return saveGame.shiphull;
    }

    public void damageParty(int minDamage, int maxDamage) throws PartyDeathException {
        for (int i = 0; i < members.size(); i++) {
            if (rand.nextInt(2) == 0) {
                int damage = minDamage >= 0 && minDamage < maxDamage ? rand.nextInt(maxDamage + 1 - minDamage) + minDamage : maxDamage;
                members.get(i).applyDamage(damage, true);
            }
        }
    }

    public int getTorchduration() {
        return torchduration;
    }

    public void setMembers(List<PartyMember> members) {
        this.members = members;
    }

    public void swapPlayers(int p1, int p2) {

        int size = members.size();
        if (p1 >= size || p2 >= size) {
            return;
        }

        SaveGamePlayerRecord tmp = saveGame.players[p1];
        saveGame.players[p1] = saveGame.players[p2];
        saveGame.players[p2] = tmp;

        PartyMember tmp1 = members.get(p1);
        members.set(p1, members.get(p2));
        members.set(p2, tmp1);

        if (p1 == activePlayer) {
            activePlayer = p2;
        } else if (p2 == activePlayer) {
            activePlayer = p1;
        }

    }

    public PartyMember getActivePartyMember() {
        return members.get(activePlayer);
    }

    /**
     * Gets the next active index without changing the active index
     */
    public int getNextActiveIndex() {
        int tmp = activePlayer;
        boolean flag = true;
        while (flag) {
            tmp++;
            if (tmp >= members.size()) {
                tmp = 0;
            }
            if (!members.get(tmp).isDisabled()) {
                flag = false;
            }
        }
        return tmp;
    }

    public boolean isRoundDone() {
        int tmp = activePlayer;
        tmp++;
        if (tmp >= members.size()) {
            return true;
        }
        boolean noMoreAble = true;;
        for (int i = tmp; i < members.size(); i++) {
            if (!members.get(i).isDisabled()) {
                noMoreAble = false;
            }
        }
        return noMoreAble;
    }

    /**
     * Gets and sets the next active player
     */
    public PartyMember getAndSetNextActivePlayer() {
        boolean allbad = true;
        for (int i = 0; i < members.size(); i++) {
            if (!members.get(i).isDisabled()) {
                allbad = false;
            }
        }
        if (allbad) {
            activePlayer = members.size() - 1;
            return null;
        }

        PartyMember p = null;
        boolean flag = true;
        while (flag) {
            this.activePlayer++;
            if (activePlayer >= members.size()) {
                activePlayer = 0;
            }
            if (!members.get(activePlayer).isDisabled()) {
                p = members.get(activePlayer);
                flag = false;
            }
        }
        return p;
    }

    public boolean isOKtoExitDirection(Direction dir) {
        for (PartyMember pm : members) {
            if (pm.combatMapExitDirection != null && pm.combatMapExitDirection != dir) {
                return false;
            }
        }
        return true;
    }

    public boolean didAnyoneFlee() {
        boolean anyonefled = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).fled) {
                anyonefled = true;
            }
        }
        return anyonefled;
    }

    public int getAbleCombatPlayers() {
        int n = 0;
        for (int i = 0; i < members.size(); i++) {
            if (!members.get(i).isDisabled()) {
                n++;
            }
        }
        return n;
    }

    public boolean isAnyoneAlive() {
        boolean anyonealive = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getPlayer().status != StatusType.DEAD) {
                anyonealive = true;
            }
        }
        return anyonealive;
    }

    public void reviveAll() {
        activePlayer = 0;
        for (PartyMember pm : members) {
            pm.fled = false;
            pm.getPlayer().status = StatusType.GOOD;
            pm.getPlayer().hp = pm.getPlayer().hpMax;
        }
    }

    public void killAll() {
        activePlayer = 0;
        for (PartyMember pm : members) {
            pm.fled = false;
            pm.getPlayer().status = StatusType.DEAD;
            pm.getPlayer().hp = 0;
        }
    }

    public void reset() {
        for (PartyMember pm : members) {
            pm.fled = false;
            pm.combatMapExitDirection = null;
        }
        activePlayer = 0;
    }

    public boolean canEnterShrine(Virtue virtue) {
        return ((saveGame.runes & virtue.getLoc()) > 0);
    }

    public boolean attemptElevation(Virtue virtue) {
        if (saveGame.karma[virtue.ordinal()] == 99) {
            saveGame.karma[virtue.ordinal()] = 0;
            return true;
        } else {
            return false;
        }
    }

    public void setTorchduration(int torchduration) {
        this.torchduration = torchduration;
    }

    public void adjustFood(int v) {
        saveGame.food = Utils.adjustValue(saveGame.food, v, 999900, 0);
    }

    public void adjustGold(int v) {
        saveGame.gold = Utils.adjustValue(saveGame.gold, v, 9999, 0);
    }

    public int getChestGold() {
        int gold = rand.nextInt(50) + rand.nextInt(8) + 10;
        adjustGold(gold);
        return gold;
    }

    public boolean isFlying() {
        return (saveGame.balloonstate > 0);
    }

    public void applyEffect(TileEffect effect) throws PartyDeathException {
        for (int i = 0; i < members.size(); i++) {
            switch (effect) {
                case NONE:
                    break;
                case ELECTRICITY:
                    members.get(i).applyEffect(effect);
                    break;
                case LAVA:
                case FIRE:
                case SLEEP:
                    if (rand.nextInt(2) == 0) {
                        members.get(i).applyEffect(effect);
                    }
                    break;
                case POISONFIELD:
                case POISON:
                    if (rand.nextInt(5) == 0) {
                        members.get(i).applyEffect(effect);
                    }
                    break;
            }
        }
    }
    
    public void applyEffect(PartyMember pm, TileEffect effect) throws PartyDeathException {
        switch (effect) {
            case NONE:
                break;
            case ELECTRICITY:
                pm.applyEffect(effect);
                break;
            case LAVA:
            case FIRE:
            case SLEEP:
                if (rand.nextInt(2) == 0) {
                    pm.applyEffect(effect);
                }
                break;
            case POISONFIELD:
            case POISON:
                if (rand.nextInt(5) == 0) {
                    pm.applyEffect(effect);
                }
                break;
        }
    }

    public class PartyMember {

        private SaveGamePlayerRecord player;
        private Party party;

        public boolean fled;
        public Direction combatMapExitDirection;
        public Creature combatCr;

        public PartyMember(Party py, SaveGamePlayerRecord p) {
            this.party = py;
            this.player = p;
        }

        public CreatureStatus getDamagedState() {
            if (player.hp <= 0) {
                return CreatureStatus.DEAD;
            } else if (player.hp < 24) {
                return CreatureStatus.FLEEING;
            } else {
                return CreatureStatus.BARELYWOUNDED;
            }
        }

        public int getDamage() {
            int maxDamage = player.weapon.getWeapon().getDamage();
            maxDamage += player.str;
            if (maxDamage > 255) {
                maxDamage = 255;
            }
            return rand.nextInt(maxDamage);
        }

        public void applyEffect(TileEffect effect) throws PartyDeathException {
            if (player.status == StatusType.DEAD) {
                return;
            }

            switch (effect) {
                case NONE:
                    break;
                case LAVA:
                case FIRE:
                    applyDamage(16 + (rand.nextInt(32)), false);
                    break;
                case SLEEP:
                    putToSleep();
                    break;
                case POISONFIELD:
                case POISON:
                    if (player.status != StatusType.POISONED) {
                        player.status = StatusType.POISONED;
                    }
                    break;
                case ELECTRICITY:
                    break;
                default:
            }

        }

        public void awardXP(int value) {
            int exp = Utils.adjustValueMax(player.xp, value, 9999);
            player.xp = exp;
        }

        public void adjustMagic(int value) {
            player.mp = Utils.adjustValueMin(player.mp, -value, 0);
        }

        public boolean heal(HealType type) {
            switch (type) {

                case NONE:
                    return true;

                case CURE:
                    if (player.status != StatusType.POISONED) {
                        return false;
                    }
                    player.status = StatusType.GOOD;
                    break;

                case FULLHEAL:
                    if (player.status == StatusType.DEAD || player.hp == player.hpMax) {
                        return false;
                    }
                    player.hp = player.hpMax;
                    break;

                case RESURRECT:
                    if (player.status != StatusType.DEAD) {
                        return false;
                    }
                    player.status = StatusType.GOOD;
                    break;

                case HEAL:
                    if (player.status == StatusType.DEAD || player.hp == player.hpMax) {
                        return false;
                    }
                    player.hp += 75 + (rand.nextInt(256) % 25);
                    break;

                case CAMPHEAL:
                    if (player.status == StatusType.DEAD || player.hp == player.hpMax) {
                        return false;
                    }
                    player.hp += 99 + (rand.nextInt(256) & 119);
                    break;

                case INNHEAL:
                    if (player.status == StatusType.DEAD || player.hp == player.hpMax) {
                        return false;
                    }
                    player.hp += 100 + (rand.nextInt(50) * 2);
                    break;

                default:
                    return false;
            }

            if (player.hp > player.hpMax) {
                player.hp = player.hpMax;
            }

            return true;
        }

        public Party getParty() {
            return party;
        }

        public SaveGamePlayerRecord getPlayer() {
            return player;
        }

        public Creature nearestOpponent(int dist, boolean ranged) {
            return null;
        }

        public boolean isDead() {
            return player.status == StatusType.DEAD;
        }

        public boolean isDisabled() {
            return ((player.status == StatusType.GOOD || player.status == StatusType.POISONED) && !fled) ? false : true;
        }

        /**
         * Lose the equipped weapon for the player (flaming oil, ranged daggers,
         * etc.) Returns the number of weapons left of that type, including the
         * one in the players hand
         */
        public WeaponType loseWeapon() {
            int weapon = player.weapon.ordinal();
            if (saveGame.weapons[weapon] > 0) {
                --saveGame.weapons[weapon];
                int w = saveGame.weapons[weapon] + 1;
                return WeaponType.get(w);
            } else {
                player.weapon = WeaponType.HANDS;
                return WeaponType.HANDS;
            }
        }

        public boolean readyWeapon(int i) {

            if (i >= 16) {
                return false;
            }
            
            //check if they are going bare hands
            if (i == 0) {
                //take off the old and put it in inventory
                if (player.weapon.ordinal() != 0) {
                    party.getSaveGame().weapons[player.weapon.ordinal()]++;
                }
                player.weapon = WeaponType.HANDS;
                return true;
            }

            //check if they are already wearing it
            if (player.weapon.ordinal() == i) {
                return true;
            }

            //check if it is in the inventory
            if (party.getSaveGame().weapons[i] <= 0) {
                return false;
            }

            //check if they can wear it
            WeaponType wt = WeaponType.get(i);
            if (!wt.getWeapon().canUse(player.klass)) {
                return false;
            }
                        
            //take off the old and put it in inventory
            if (player.weapon.ordinal() != 0) {
                party.getSaveGame().weapons[player.weapon.ordinal()]++;
            }

            player.weapon = wt;
            party.getSaveGame().weapons[i]--;
            return true;
        }

        public boolean wearArmor(int i) {
            
            if (i >= 8) {
                return false;
            }
            
            //check if they are going naked
            if (i == 0) {
                //take off the old and put it in inventory
                if (player.armor.ordinal() != 0) {
                    party.getSaveGame().armor[player.armor.ordinal()]++;
                }
                player.armor = ArmorType.NONE;
                return true;
            }
            
            //check if they are already wearing it
            if (player.armor.ordinal() == i) {
                return true;
            }
            
            //check if it is in the inventory
            if (party.getSaveGame().armor[i] <= 0) {
                return false;
            }
            
            //check if they can wear it
            ArmorType at = ArmorType.get(i);
            if (!at.getArmor().canUse(player.klass)) {
                return false;
            }
            
            //take off the old and put it in inventory
            if (player.armor.ordinal() != 0) {
                party.getSaveGame().armor[player.armor.ordinal()]++;
            }

            player.armor = at;
            party.getSaveGame().armor[i]--;
            return true;
        }

        public void putToSleep() {
            if (!isDead()) {
                player.status = StatusType.SLEEPING;
            }
        }

        public void wakeUp() {
            if (player.status == StatusType.SLEEPING) {
                player.status = StatusType.GOOD;
            }
        }

        public boolean applyDamage(int damage, boolean combatRelatedDamage) throws PartyDeathException {
            int newHp = player.hp;

            if (isDead()) {
                return false;
            }

            newHp -= damage;

            if (newHp < 0) {
                player.status = StatusType.DEAD;
                newHp = 0;
            }

            player.hp = newHp;

            if (!combatRelatedDamage && isDead() && !this.party.isAnyoneAlive()) {
                throw new PartyDeathException();
            }

            return true;
        }

        public int getAttackBonus() {
            if (player.dex >= 40) {
                return 255;
            }
            return player.dex;
        }

        public int getDefense() {
            return player.armor.getArmor().getDefense();
        }

    }

    public boolean isJoinedInParty(String name) {
        for (PartyMember pm : members) {
            if (pm.getPlayer().name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Determine of character name is joinable and return the virtue for that
     * character.
     */
    public Virtue getVirtueForJoinable(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (int i = 1; i < 8; i++) {
            if (name.equals(saveGame.players[i].name)) {
                return saveGame.players[i].klass.getVirtue();
            }
        }
        return null;
    }

    /**
     * See if the character can join the party
     */
    public CannotJoinError join(String name) {
        int i;

        for (i = saveGame.members; i < 8; i++) {
            if (name.equals(saveGame.players[i].name)) {

                /* ensure avatar is experienced enough */
                if (saveGame.members + 1 > (saveGame.players[0].hpMax / 100)) {
                    return CannotJoinError.JOIN_NOT_EXPERIENCED;
                }

                /* ensure character has enough karma */
                if ((saveGame.karma[saveGame.players[i].klass.ordinal()] > 0)
                        && (saveGame.karma[saveGame.players[i].klass.ordinal()] < 40)) {
                    return CannotJoinError.JOIN_NOT_VIRTUOUS;
                }

                //swap the positions in the saved game file , this is how we know if the NPC is a member of the party or not
                SaveGamePlayerRecord tmp = saveGame.players[saveGame.members];
                saveGame.players[saveGame.members] = saveGame.players[i];
                saveGame.players[i] = tmp;

                members.add(new PartyMember(this, saveGame.players[saveGame.members++]));

                setChanged();
                notifyObservers(PartyEvent.MEMBER_JOINED);

                return CannotJoinError.JOIN_SUCCEEDED;
            }
        }

        return CannotJoinError.JOIN_NOT_EXPERIENCED;
    }

    public void adjustKarma(KarmaAction action) {

        int timeLimited = 0;
        int[] newKarma = new int[8];
        int[] maxVal = new int[8];

        for (int v = 0; v < 8; v++) {
            newKarma[v] = saveGame.karma[v] == 0 ? 100 : saveGame.karma[v];
            maxVal[v] = saveGame.karma[v] == 0 ? 100 : 99;
        }

        switch (action) {
            case FOUND_ITEM:
                adjustKarmaMax(newKarma, Virtue.HONOR, 5, maxVal);
                break;
            case STOLE_CHEST:
                adjustKarmaMin(newKarma, Virtue.HONESTY, -1, 1);
                adjustKarmaMin(newKarma, Virtue.JUSTICE, -1, 1);
                adjustKarmaMin(newKarma, Virtue.HONOR, -1, 1);
                break;
            case GAVE_ALL_TO_BEGGAR:
            case GAVE_TO_BEGGAR:
                timeLimited = 1;
                adjustKarmaMax(newKarma, Virtue.COMPASSION, 2, maxVal);
                adjustKarmaMax(newKarma, Virtue.HONOR, 3, maxVal);
                break;
            case BRAGGED:
                adjustKarmaMin(newKarma, Virtue.HUMILITY, -5, 1);
                break;
            case HUMBLE:
                timeLimited = 1;
                adjustKarmaMax(newKarma, Virtue.HUMILITY, 10, maxVal);
                break;
            case HAWKWIND:
            case MEDITATION:
                timeLimited = 1;
                adjustKarmaMax(newKarma, Virtue.SPIRITUALITY, 3, maxVal);
                break;
            case BAD_MANTRA:
                adjustKarmaMin(newKarma, Virtue.SPIRITUALITY, -3, 1);
                break;
            case ATTACKED_GOOD:
                adjustKarmaMin(newKarma, Virtue.COMPASSION, -5, 1);
                adjustKarmaMin(newKarma, Virtue.JUSTICE, -3, 1);
                adjustKarmaMin(newKarma, Virtue.HONOR, -3, 1);
                break;
            case HEALTHY_FLED_EVIL:
                adjustKarmaMin(newKarma, Virtue.VALOR, -2, 1);
                adjustKarmaMin(newKarma, Virtue.SACRIFICE, -2, 1);
                break;
            case KILLED_EVIL:
                adjustKarmaMax(newKarma, Virtue.VALOR, rand.nextInt(2), maxVal);
                break;
            case FLED_GOOD:
                adjustKarmaMax(newKarma, Virtue.COMPASSION, 2, maxVal);
                adjustKarmaMax(newKarma, Virtue.JUSTICE, 2, maxVal);
                break;
            case SPARED_GOOD:
                adjustKarmaMax(newKarma, Virtue.COMPASSION, 1, maxVal);
                adjustKarmaMax(newKarma, Virtue.JUSTICE, 1, maxVal);
                break;
            case DONATED_BLOOD:
                adjustKarmaMax(newKarma, Virtue.SACRIFICE, 5, maxVal);
                break;
            case DIDNT_DONATE_BLOOD:
                adjustKarmaMin(newKarma, Virtue.SACRIFICE, -5, 1);
                break;
            case CHEAT_REAGENTS:
                adjustKarmaMin(newKarma, Virtue.HONESTY, -10, 1);
                adjustKarmaMin(newKarma, Virtue.JUSTICE, -10, 1);
                adjustKarmaMin(newKarma, Virtue.HONOR, -10, 1);
                break;
            case DIDNT_CHEAT_REAGENTS:
                timeLimited = 1;
                adjustKarmaMax(newKarma, Virtue.HONESTY, 2, maxVal);
                adjustKarmaMax(newKarma, Virtue.JUSTICE, 2, maxVal);
                adjustKarmaMax(newKarma, Virtue.HONOR, 2, maxVal);
                break;
            case USED_SKULL:
                for (Virtue virt : Virtue.values()) {
                    adjustKarmaMin(newKarma, virt, -5, 1);
                }
                break;
            case DESTROYED_SKULL:
                for (Virtue virt : Virtue.values()) {
                    adjustKarmaMax(newKarma, virt, 10, maxVal);
                }
                break;
        }

        /*
         * check if enough time has passed since last virtue award if action is
         * time limited -- if not, throw away new values
         */
        if (timeLimited > 0) {
            if (((saveGame.moves / 16) >= 0x10000) || (((saveGame.moves / 16) & 0xFFFF) != saveGame.lastvirtue)) {
                saveGame.lastvirtue = (saveGame.moves / 16) & 0xFFFF;
            } else {
                return;
            }
        }

        /*
         * handle losing of eighths
         */
        for (int v = 0; v < 8; v++) {
            if (maxVal[v] == 100) { // already an avatar
                if (newKarma[v] < 100) { // but lost it
                    saveGame.karma[v] = newKarma[v];
                    setChanged();
                    notifyObservers(PartyEvent.LOST_EIGHTH);
                } else {
                    saveGame.karma[v] = 0;
                }
            } else {
                if (saveGame.karma[v] > newKarma[v]) {
                    setChanged();
                    notifyObservers(PartyEvent.NEGATIVE_KARMA);
                } else if (saveGame.karma[v] < newKarma[v]) {
                    setChanged();
                    notifyObservers(PartyEvent.POSITIVE_KARMA);
                }
                saveGame.karma[v] = newKarma[v];
            }
        }

    }

    private void adjustKarmaMax(int[] karma, Virtue v, int value, int[] max) {
        int n = Utils.adjustValueMax(karma[v.ordinal()], value, max[v.ordinal()]);
        karma[v.ordinal()] = n;
        v.adjustProgress(n);
    }

    private void adjustKarmaMin(int[] karma, Virtue v, int value, int min) {
        int n = Utils.adjustValueMin(karma[v.ordinal()], value, min);
        karma[v.ordinal()] = n;
        v.adjustProgress(n);
    }

    public void endTurn(MapType mapType) throws PartyDeathException {

        saveGame.moves++;

        for (int i = 0; i < members.size(); i++) {

            PartyMember member = members.get(i);

            if (mapType != MapType.combat) {

                if (member.player.status != StatusType.DEAD) {
                    adjustFood(-1);
                }

                if (member.player.status == StatusType.POISONED) {
                    member.applyDamage(2, false);
                    setChanged();
                    notifyObservers(PartyEvent.POISON_DAMAGE);
                }

            }

            if (member.player.status == StatusType.SLEEPING && rand.nextInt(5) == 0) {
                member.wakeUp();
            }

            if (!member.isDisabled() && member.player.mp < member.player.getMaxMp()) {
                member.player.mp++;
            }
        }

        if ((saveGame.food == 0)) {
            members.get(0).applyDamage(1, false);
            setChanged();
            notifyObservers(PartyEvent.STARVING);
        }

        if (context.getCurrentMap().getId() == Maps.WORLD.getId() && saveGame.shiphull < 50 && rand.nextInt(4) == 0) {
            saveGame.shiphull++;
            if (saveGame.shiphull > 50) {
                saveGame.shiphull = 50;
            }
        }
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
