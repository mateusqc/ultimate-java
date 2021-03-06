package objects;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ultima.Constants.CreatureType;
import util.Utils;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g3d.decals.Decal;
import com.badlogic.gdx.utils.Array;
import util.XORShiftRandom;

@XmlRootElement(name = "creatures")
public class CreatureSet {

    private List<Creature> creatures;

    @XmlElement(name = "creature")
    public List<Creature> getCreatures() {
        return creatures;
    }

    public void setCreatures(List<Creature> creatures) {
        this.creatures = creatures;
    }

    public void init() {

        for (Creature cr : creatures) {
            CreatureType ct = CreatureType.get(cr.getId());
            if (ct != null) {
                ct.setCreature(cr);
            } else {
                System.err.printf("CreatureSet.init: Could not find creature type with id %d\n", cr.getId());
            }
        }
    }

    public Creature getInstance(CreatureType type, TextureAtlas atlas1) {
        for (Creature cr : creatures) {
            if (cr.getTile() == type) {

                Creature newCr = new Creature(cr);

                Array<AtlasRegion> tr = atlas1.findRegions(cr.getTile().toString());

                int frameRate = Utils.getRandomBetween(1, 3);

                int fr = Utils.getRandomBetween(0, tr.size);
                TextureRegion reg = tr.get(fr);

                //newCr.setAnim(new Animation(frameRate, reg));
                newCr.setAnim(new Animation<>(frameRate, tr));

                Decal d = Decal.newDecal(reg, true);
                d.setScale(.018f);
                newCr.setDecal(d);

                if (type == CreatureType.pirate_ship) {
                    //newCr.setAnim(new Animation(frameRate, tr));
                }
                
                if (type == CreatureType.twister) {
                    newCr.setAnim(new Animation<>(.2f, tr));
                }
                
                if (type == CreatureType.whirlpool) {
                    newCr.setAnim(new Animation<>(.3f, tr));
                }

                return newCr;
            }
        }

        System.err.println(type + " not found.");

        return null;
    }

    public CreatureType getRandomAmbushing() {

        int numAmbushingCreatures = 0, randCreature = 0;
        for (Creature cr : creatures) {
            if (cr.getAmbushes()) {
                numAmbushingCreatures++;
            }
        }

        if (numAmbushingCreatures > 0) {

            randCreature = new XORShiftRandom().nextInt(numAmbushingCreatures);
            numAmbushingCreatures = 0;

            for (Creature cr : creatures) {

                if (cr.getAmbushes()) {

                    if (numAmbushingCreatures == randCreature) {
                        return cr.getTile();
                    } else {
                        numAmbushingCreatures++;
                    }
                }
            }
        }

        return null;
    }

}
