package objects;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.commons.lang.StringUtils;

import ultima.Constants;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.google.common.io.LittleEndianDataInputStream;
import com.google.common.io.LittleEndianDataOutputStream;


public class SaveGame implements Constants {
	
	public SaveGamePlayerRecord[] players = new SaveGamePlayerRecord[8];

	public int unknown1 = 0;
	public int moves = 0;
	public int food = 0;
	public int gold = 0;
	public int torches = 0;
	public int gems = 0;
	public int keys = 0;
	public int sextants = 0;
	
	public int[] karma = new int[Virtue.MAX.ordinal()];
	public int[] armor = new int[8];
	public int[] weapons = new int[16];
	public int[] reagents = new int[8];
	public int[] mixtures = new int[SPELL_MAX];
	
	public int items = 0;
	public int x = 0;
	public int y = 0;
	public int stones = 0;
	public int runes = 0;
	public int members = 0;
	public int transport = 0;

	public int balloonstate = 0;
	public int torchduration = 0;

	public int trammelphase = 0;
	public int feluccaphase = 0;
	public int shiphull = 0;
	public int lbintro = 0;
	public int lastcamp = 0;
	public int lastreagent = 0;
	public int lastmeditation = 0;
	public int lastvirtue = 0;
	public int dngx = 0;
	public int dngy = 0;
	//dungeon orientation
	public int orientation = 0;
	public int dnglevel = (int) 0xFFFF;
	//see Constants.Maps enum for locations
	public int location = 0;

	public int write(String strFilePath) throws Exception {
			
		FileOutputStream fos = new FileOutputStream(strFilePath);
		LittleEndianDataOutputStream dos = new LittleEndianDataOutputStream(fos);		

		dos.writeInt(unknown1);
		dos.writeInt(moves);

		for (int i = 0; i < 8; i++) {
			if (players[i] == null) players[i] = new SaveGamePlayerRecord();
			players[i].write(dos);
		}

		dos.writeInt(food);
		dos.writeShort(gold);

		for (int i = 0; i < 8; i++) {
			dos.writeShort(karma[i]);
		}

		dos.writeShort(torches);
		dos.writeShort(gems);
		dos.writeShort(keys);
		dos.writeShort(sextants);

		for (int i = 0; i < 8; i++) {
			dos.writeShort(armor[i]);
		}

		for (int i = 0; i < 16; i++) {
			dos.writeShort(weapons[i]);
		}

		for (int i = 0; i < 8; i++) {
			dos.writeShort(reagents[i]);
		}

		for (int i = 0; i < SPELL_MAX; i++) {
			dos.writeShort(mixtures[i]);
		}

		dos.writeShort(items);
		dos.writeByte(x);
		dos.writeByte(y);
		dos.writeByte(stones);
		dos.writeByte(runes);
		dos.writeShort(members);
		dos.writeShort(transport);
		dos.writeShort(balloonstate);
		dos.writeShort(trammelphase);
		dos.writeShort(feluccaphase);
		dos.writeShort(shiphull);
		dos.writeShort(lbintro);
		dos.writeShort(lastcamp);
		dos.writeShort(lastreagent);
		dos.writeShort(lastmeditation);
		dos.writeShort(lastvirtue);
		dos.writeByte(dngx);
		dos.writeByte(dngy);
		dos.writeShort(orientation);
		dos.writeShort(dnglevel);
		dos.writeShort(location);
		
		dos.close();

		return 1;
	}

	public int read(String strFilePath) throws Exception {
		InputStream is;
		LittleEndianDataInputStream dis = null;
		try {
			is = new FileInputStream(Gdx.files.internal(strFilePath).file());
			dis = new LittleEndianDataInputStream(is);
		} catch (Exception e) {
			is = this.getClass().getResourceAsStream("/data/" + PARTY_SAV_BASE_FILENAME);
			dis = new LittleEndianDataInputStream(is);
		}

		unknown1 = dis.readInt();
		moves = dis.readInt();

		for (int i = 0; i < 8; i++) {
			players[i] = new SaveGamePlayerRecord();
			players[i].read(dis);
		}

		food = dis.readInt()& 0xff;
		gold = dis.readShort()& 0xff;

		for (int i = 0; i < 8; i++) {
			karma[i] = dis.readShort();
		}

		torches = dis.readShort()& 0xff;
		gems = dis.readShort()& 0xff;
		keys = dis.readShort()& 0xff;
		sextants = dis.readShort()& 0xff;

		for (int i = 0; i < 8; i++) {
			armor[i] = dis.readShort();
		}

		for (int i = 0; i < 16; i++) {
			weapons[i] = dis.readShort();

		}

		for (int i = 0; i < 8; i++) {
			reagents[i] = dis.readShort();
		}

		for (int i = 0; i < SPELL_MAX; i++) {
			mixtures[i] = dis.readShort();
		}

		items = dis.readShort();
		x = dis.readByte() & 0xff;
		y = dis.readByte() & 0xff;
		stones = dis.readByte();
		runes = dis.readByte();
		members = dis.readShort();
		transport = dis.readShort();
		balloonstate = dis.readShort();
		trammelphase = dis.readShort();
		feluccaphase = dis.readShort();
		shiphull = dis.readShort()& 0xff;
		lbintro = dis.readShort();
		lastcamp = dis.readShort()& 0xff;
		lastreagent = dis.readShort()& 0xff;
		lastmeditation = dis.readShort()& 0xff;
		lastvirtue = dis.readShort()& 0xff;
		dngx = dis.readByte() & 0xff;
		dngy = dis.readByte() & 0xff;
		orientation = dis.readShort();
		dnglevel = dis.readShort();
		location = dis.readShort()& 0xff;

		/* workaround of U4DOS bug to retain savegame compatibility */
		if (location == 0 && dnglevel == 0) {
			dnglevel = (short) 0xFFFF;
		}
		
		dis.close();


		return 1;
	}
	
	/**
	 * The Ultima IV savegame player record data.
	 */
	public class SaveGamePlayerRecord {

		public String name = "";

		public int hp = 0;
		public int hpMax = 0;
		public int xp = 0;
		public int str = 0;
		public int dex = 0;
		public int intel = 0;
		public int mp = 0;
		public int unknown = 0;
		
		public WeaponType weapon = WeaponType.HANDS;
		public ArmorType armor = ArmorType.NONE;
		public SexType sex = SexType.SEX_MALE;
		public ClassType klass = ClassType.MAGE;
		public StatusType status = StatusType.STAT_GOOD;
		
		public int write(LittleEndianDataOutputStream dos) throws Exception {
	    
			dos.writeShort(hp); 
			dos.writeShort(hpMax); 
			dos.writeShort(xp); 
			dos.writeShort(str); 
			dos.writeShort(dex); 
			dos.writeShort(intel); 
			dos.writeShort(mp); 
			dos.writeShort(unknown); 
			dos.writeShort(weapon.ordinal()); 
			dos.writeShort(armor.ordinal());
			
			String paddedName = StringUtils.rightPad(name, 16);

			byte[] nameArray = paddedName.getBytes();
			for (int i = 0; i < 16; i++) {
				if (nameArray[i] == 32) nameArray[i] = 0;
				dos.writeByte(nameArray[i]);
			}
	    
			dos.writeByte(sex.getValue()); 
			dos.writeByte(klass.ordinal()); 
			dos.writeByte((byte)status.getValue());

	    
			return 1;
		}

		public int read(LittleEndianDataInputStream dis) throws Exception {

			hp = dis.readShort();
			hpMax = dis.readShort();
			xp = dis.readShort();
			str = dis.readShort();
			dex = dis.readShort();
			intel = dis.readShort();
			mp = dis.readShort();
			unknown = dis.readShort();

			int s = dis.readShort();
			weapon = WeaponType.get(s);

			s = dis.readShort();
			armor = ArmorType.get(s);

			byte[] nameArray = new byte[16];
			boolean end = false;
			for (int i = 0; i < 16; i++) {
				byte b = dis.readByte();
				if (b == 0) end = true;;
				if (!end) nameArray[i] = b;
			}
			name = new String(nameArray).trim();
			
			byte ch = dis.readByte();
			sex = SexType.get(ch);

			ch = dis.readByte();
			klass = ClassType.get(ch);

			ch = dis.readByte();
			status = StatusType.get(ch);

			return 1;
		}

		@Override
		public String toString() {
			return String.format("SaveGamePlayerRecord [name=%s, hp=%s, xp=%s, weapon=%s, armor=%s, sex=%s, klass=%s, status=%s]", name, hp, xp, weapon, armor, sex, klass, status);
		}
		
		
	}

	/**
	 * How Ultima IV stores monster information
	 */
	public class SaveGameMonsterRecord {
		public byte tile;
		public byte x;
		public byte y;
		public byte prevTile;
		public byte prevx;
		public byte prevy;
		public byte unused1;
		public byte unused2;
	}

	public int saveGameMonstersWrite(SaveGameMonsterRecord[] monsterTable, DataOutputStream dos) throws Exception {
		int i;
		int max;

		if (monsterTable != null && monsterTable.length > 0) {
			for (i = 0; i < MONSTERTABLE_SIZE; i++) {
				dos.writeByte(monsterTable[i].tile);
			}
			for (i = 0; i < MONSTERTABLE_SIZE; i++) {
				dos.writeByte(monsterTable[i].x);
			}
			for (i = 0; i < MONSTERTABLE_SIZE; i++) {
				dos.writeByte(monsterTable[i].y);
			}
			for (i = 0; i < MONSTERTABLE_SIZE; i++) {
				dos.writeByte(monsterTable[i].prevTile);
			}
			for (i = 0; i < MONSTERTABLE_SIZE; i++) {
				dos.writeByte(monsterTable[i].prevx);
			}
			for (i = 0; i < MONSTERTABLE_SIZE; i++) {
				dos.writeByte(monsterTable[i].prevy);
			}
			for (i = 0; i < MONSTERTABLE_SIZE; i++) {
				dos.writeByte(monsterTable[i].unused1);
			}
			for (i = 0; i < MONSTERTABLE_SIZE; i++) {
				dos.writeByte(monsterTable[i].unused2);
			}
		} else {
			max = MONSTERTABLE_SIZE * 8;
			for (i = 0; i < max; i++) {
				dos.writeByte((byte) 0);
			}
		}
		return 1;
	}
	
	public int saveGameMonstersRead(SaveGameMonsterRecord[] monsterTable, DataInputStream dis) throws Exception {
		int i;

		for (i = 0; i < MONSTERTABLE_SIZE; i++) {
			monsterTable[i].tile = dis.readByte();
		}
		for (i = 0; i < MONSTERTABLE_SIZE; i++) {
			monsterTable[i].x = dis.readByte();
		}
		for (i = 0; i < MONSTERTABLE_SIZE; i++) {
			monsterTable[i].y = dis.readByte();
		}
		for (i = 0; i < MONSTERTABLE_SIZE; i++) {
			monsterTable[i].prevTile = dis.readByte();
		}
		for (i = 0; i < MONSTERTABLE_SIZE; i++) {
			monsterTable[i].prevx = dis.readByte();
		}
		for (i = 0; i < MONSTERTABLE_SIZE; i++) {
			monsterTable[i].prevy = dis.readByte();
		}
		for (i = 0; i < MONSTERTABLE_SIZE; i++) {
			monsterTable[i].unused1 = dis.readByte();
		}
		for (i = 0; i < MONSTERTABLE_SIZE; i++) {
			monsterTable[i].unused1 = dis.readByte();
		}

		return 1;
	}
	
	//to proper case
	public static String pc(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}
	
	
	public String[] getZstats() {
		
		StringBuffer sb1 = new StringBuffer();
		for (int i=0;i<members;i++) {
			SaveGamePlayerRecord p = players[i];
			
			sb1.append(
					pc(p.name) + "  " +
					pc(p.klass.toString()) + "  " +
					pc(p.sex.getDesc()) + "  " +
					p.status.getValue() + "|"
					);
			
			sb1.append(
					"MP: " + p.mp + "  LV: " + Math.round(p.hpMax / 100) + "|" +
					"STR: " + p.str + "  HP: " + p.hp + "|"+
					"DEX: " + p.dex + "  HM: " + p.hpMax + "|"+
					"INT: " + p.intel + "  EX: " + p.xp + "|"+
					"W: " + pc(p.weapon.toString()) + "|" +
					"A: " + pc(p.armor.toString()) + "|"
					);
			
			sb1.append("~");

		}
		
		StringBuffer sb2 = new StringBuffer();
		for (int i=0;i<16;i++) {
			int count = weapons[i];
			if (count == 0) continue;
			sb2.append(count + " - " + pc(WeaponType.get(i).toString()) + "|");
		}
		
		StringBuffer sb3 = new StringBuffer();
		for (int i=0;i<8;i++) {
			int count = armor[i];
			if (count == 0) continue;
			sb3.append(count + " - " + pc(ArmorType.get(i).toString()) + "|");
		}
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append(torches + " - Torches|");
		sb4.append(gems + " - Gems|");
		sb4.append(keys + " - Keys|");
		if (sextants > 0) sb4.append(sextants + " - Sextant|");

		StringBuffer sb5 = new StringBuffer();
		for (int i=0;i<8;i++) {
			int count = reagents[i];
			if (count == 0) continue;
			sb5.append(count + " - " + pc(Reagent.get(i).toString()) + "|");
		}
		
		StringBuffer sb6 = new StringBuffer();
		for (int i=0;i<SPELL_MAX;i++) {
			int count = mixtures[i];
			if (count == 0) continue;
			sb6.append(count + " - " + pc(SpellNames.get(i).toString()) + "|");
		}
		
		String[] ret = new String[6];
		ret[0] = sb1.toString();
		ret[1] = sb2.toString();
		ret[2] = sb3.toString();
		ret[3] = sb4.toString();
		ret[4] = sb5.toString();
		ret[5] = sb6.toString();

		
		return ret;
	}
	
	public void renderZstats(int showZstats, BitmapFont font, Batch batch, int SCREEN_HEIGHT) {
		
		int rx = 10;
		int ry = SCREEN_HEIGHT - 50;
		
		String[] pages = getZstats();
		if (showZstats == 1) {
			// players
			String[] players = pages[0].split("\\~");
			for (int i = 0; i < players.length; i++) {
				String[] lines = players[i].split("\\|");
				rx = 10 + i * 150;
				ry = SCREEN_HEIGHT - 50;
				font.draw(batch, "Player " + (i + 1), rx, ry);
				ry = ry - 18;
				for (int j = 0; j < lines.length; j++) {
					if (lines[j] == null || lines[j].length() < 1)
						continue;
					font.draw(batch, lines[j], rx, ry);
					ry = ry - 18;
				}
			}
		} else if (showZstats == 2) {
			String[] lines = pages[1].split("\\|");
			font.draw(batch, "Weapons", rx, ry);
			ry = ry - 18;
			for (int j = 0; j < lines.length; j++) {
				if (lines[j] == null || lines[j].length() < 1)
					continue;
				font.draw(batch, lines[j], rx, ry);
				ry = ry - 18;
			}
		} else if (showZstats == 3) {
			String[] lines = pages[2].split("\\|");
			font.draw(batch, "Armor", rx, ry);
			ry = ry - 18;
			for (int j = 0; j < lines.length; j++) {
				if (lines[j] == null || lines[j].length() < 1)
					continue;
				font.draw(batch, lines[j], rx, ry);
				ry = ry - 18;
			}
		} else if (showZstats == 4) {
			String[] lines = pages[3].split("\\|");
			font.draw(batch, "Items", rx, ry);
			ry = ry - 18;
			for (int j = 0; j < lines.length; j++) {
				if (lines[j] == null || lines[j].length() < 1)
					continue;
				font.draw(batch, lines[j], rx, ry);
				ry = ry - 18;
			}
		} else if (showZstats == 5) {
			String[] lines = pages[4].split("\\|");
			font.draw(batch, "Reagents", rx, ry);
			ry = ry - 18;
			for (int j = 0; j < lines.length; j++) {
				if (lines[j] == null || lines[j].length() < 1)
					continue;
				font.draw(batch, lines[j], rx, ry);
				ry = ry - 18;
			}
		} else if (showZstats == 6) {
			String[] lines = pages[5].split("\\|");
			font.draw(batch, "Spell Mixtures", rx, ry);
			ry = ry - 18;
			for (int j = 0; j < lines.length; j++) {
				if (lines[j] == null || lines[j].length() < 1)
					continue;
				font.draw(batch, lines[j], rx, ry);
				ry = ry - 18;
			}
		}
		
		
	}

}
