package objects;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import ultima.Constants;
import com.badlogic.gdx.graphics.g3d.decals.Decal;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

/**
 * The class <code>CreatureTest</code> contains tests for the class <code>{@link Creature}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class CreatureTest {
	/**
	 * Run the Creature() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCreature_1()
		throws Exception {

		Creature result = new Creature();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Creature [id=0, name=null, tile=null, currentX=0, currentY=0 currentPos=null, sailDir=EAST]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getId());
		assertEquals(0, result.getAttackBonus());
		assertEquals(128, result.getDefense());
		assertEquals(null, result.getResists());
		assertEquals(0, result.getExp());
		assertEquals(0, result.getHP());
		assertEquals(0, result.getLeader());
		assertEquals(0, result.getEncounterSize());
		assertEquals(null, result.getAnim());
		assertEquals(false, result.negates());
		assertEquals(false, result.getTeleports());
		assertEquals(false, result.getRanged());
		assertEquals(false, result.castsSleep());
		assertEquals(false, result.stealsGold());
		assertEquals(false, result.getCamouflage());
		assertEquals(false, result.stealsFood());
		assertEquals(true, result.getVisible());
		assertEquals(null, result.getStatus());
		assertEquals(false, result.getNochest());
		assertEquals(null, result.getMovement());
		assertEquals(false, result.getGood());
		assertEquals(false, result.getFlies());
		assertEquals(false, result.getSails());
		assertEquals(false, result.getSwims());
		assertEquals(false, result.getCanMoveOntoCreatures());
		assertEquals(null, result.getRangedmisstile());
		assertEquals(null, result.getWorldrangedtile());
		assertEquals(false, result.getCanMoveOntoAvatar());
		assertEquals(null, result.getCamouflageTile());
		assertEquals(false, result.getIncorporeal());
		assertEquals(false, result.getWontattack());
		assertEquals(false, result.getCantattack());
		assertEquals(false, result.getLeavestile());
		assertEquals(null, result.getRangedhittile());
		assertEquals(false, result.getSpawnsOnDeath());
		assertEquals(0, result.getBasehp());
		assertEquals(null, result.getSpawntile());
		assertEquals(null, result.getSteals());
		assertEquals(false, result.getForceOfNature());
		assertEquals(false, result.getDivides());
		assertEquals(null, result.getCasts());
		assertEquals(false, result.getPoisons());
		assertEquals(false, result.getAmbushes());
		assertEquals(false, result.getUndead());
		assertEquals(null, result.getDecal());
		assertEquals(null, result.getTile());
	}

	/**
	 * Run the Creature(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		Creature clone = new Creature();
		clone.setEncounterSize(1);
		clone.setCantattack(true);
		clone.setExp(1);
		clone.setAmbushes(true);
		clone.setTeleports(true);
		clone.setMovement("");
		clone.setRanged(true);
		clone.setSpawnsOnDeath(true);
		clone.setIncorporeal(true);
		clone.setRangedhittile("");
		clone.setPoisons(true);
		clone.setResists("");
		clone.setLeader(1);
		clone.setCanMoveOntoCreatures(true);
		clone.setCamouflageTile("");
		clone.setTile(ultima.Constants.CreatureType.balron);
		clone.setDivides(true);
		clone.setCanMoveOntoAvatar(true);
		clone.setNochest(true);
		clone.setCasts("");
		clone.setSpawntile("");
		clone.setBasehp(1);
		clone.setRangedmisstile("");
		clone.setGood(true);
		clone.setWorldrangedtile("");
		clone.setSteals("");
		clone.setForceOfNature(true);
		clone.setWontattack(true);
		clone.setSwims(true);
		clone.setLeavestile(true);
		clone.setFlies(true);
		clone.setName("");
		clone.setUndead(true);
		clone.setCamouflage(true);
		clone.setId(1);
		clone.setSails(true);

		Creature result = new Creature(clone);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Creature [id=1, name=, tile=balron, currentX=0, currentY=0 currentPos=null, sailDir=EAST]", result.toString());
		assertEquals("", result.getName());
		assertEquals(1, result.getId());
		assertEquals(0, result.getAttackBonus());
		assertEquals(128, result.getDefense());
		assertEquals("", result.getResists());
		assertEquals(1, result.getExp());
		assertEquals(1, result.getHP());
		assertEquals(1, result.getLeader());
		assertEquals(1, result.getEncounterSize());
		assertEquals(null, result.getAnim());
		assertEquals(false, result.negates());
		assertEquals(true, result.getTeleports());
		assertEquals(true, result.getRanged());
		assertEquals(false, result.castsSleep());
		assertEquals(false, result.stealsGold());
		assertEquals(true, result.getCamouflage());
		assertEquals(false, result.stealsFood());
		assertEquals(false, result.getVisible());
		assertEquals(null, result.getStatus());
		assertEquals(true, result.getNochest());
		assertEquals("", result.getMovement());
		assertEquals(true, result.getGood());
		assertEquals(true, result.getFlies());
		assertEquals(true, result.getSails());
		assertEquals(true, result.getSwims());
		assertEquals(true, result.getCanMoveOntoCreatures());
		assertEquals("", result.getRangedmisstile());
		assertEquals("", result.getWorldrangedtile());
		assertEquals(true, result.getCanMoveOntoAvatar());
		assertEquals("", result.getCamouflageTile());
		assertEquals(true, result.getIncorporeal());
		assertEquals(true, result.getWontattack());
		assertEquals(true, result.getCantattack());
		assertEquals(true, result.getLeavestile());
		assertEquals("", result.getRangedhittile());
		assertEquals(true, result.getSpawnsOnDeath());
		assertEquals(1, result.getBasehp());
		assertEquals("", result.getSpawntile());
		assertEquals("", result.getSteals());
		assertEquals(true, result.getForceOfNature());
		assertEquals(true, result.getDivides());
		assertEquals("", result.getCasts());
		assertEquals(true, result.getPoisons());
		assertEquals(true, result.getAmbushes());
		assertEquals(true, result.getUndead());
		assertEquals(null, result.getDecal());
	}

	/**
	 * Run the boolean castsSleep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCastsSleep_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("sleep");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.castsSleep();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean castsSleep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCastsSleep_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts((String) null);
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.castsSleep();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean castsSleep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCastsSleep_3()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.castsSleep();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getAmbushes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetAmbushes_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getAmbushes();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getAmbushes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetAmbushes_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(false);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getAmbushes();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Animation<TextureRegion> getAnim() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetAnim_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		Animation<TextureRegion> result = fixture.getAnim();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0f, result.getAnimationDuration(), 1.0f);
		assertEquals(1.0f, result.getFrameDuration(), 1.0f);
	}

	/**
	 * Run the int getAttackBonus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetAttackBonus_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getAttackBonus();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getBasehp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetBasehp_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getBasehp();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getCamouflage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCamouflage_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getCamouflage();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getCamouflage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCamouflage_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(false);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getCamouflage();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getCamouflageTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCamouflageTile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getCamouflageTile();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean getCanMoveOntoAvatar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCanMoveOntoAvatar_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getCanMoveOntoAvatar();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getCanMoveOntoAvatar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCanMoveOntoAvatar_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(false);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getCanMoveOntoAvatar();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getCanMoveOntoCreatures() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCanMoveOntoCreatures_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getCanMoveOntoCreatures();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getCanMoveOntoCreatures() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCanMoveOntoCreatures_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(false);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getCanMoveOntoCreatures();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getCantattack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCantattack_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getCantattack();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getCantattack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCantattack_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(false);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getCantattack();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getCasts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCasts_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getCasts();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getDamage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDamage_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getDamage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: bound must be positive
		//       at java.util.Random.nextInt(Unknown Source)
		//       at objects.Creature.getDamage(Creature.java:546)
		assertEquals(0, result);
	}

	/**
	 * Run the ultima.Constants.CreatureStatus getDamageStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDamageStatus_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(0);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		ultima.Constants.CreatureStatus result = fixture.getDamageStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals("DEAD", result.name());
		assertEquals("DEAD", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the ultima.Constants.CreatureStatus getDamageStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDamageStatus_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		ultima.Constants.CreatureStatus result = fixture.getDamageStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals("FLEEING", result.name());
		assertEquals("FLEEING", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the ultima.Constants.CreatureStatus getDamageStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDamageStatus_3()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(24);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		ultima.Constants.CreatureStatus result = fixture.getDamageStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BARELYWOUNDED", result.name());
		assertEquals("BARELYWOUNDED", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the ultima.Constants.CreatureStatus getDamageStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDamageStatus_4()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(24);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		ultima.Constants.CreatureStatus result = fixture.getDamageStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BARELYWOUNDED", result.name());
		assertEquals("BARELYWOUNDED", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the ultima.Constants.CreatureStatus getDamageStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDamageStatus_5()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(24);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		ultima.Constants.CreatureStatus result = fixture.getDamageStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BARELYWOUNDED", result.name());
		assertEquals("BARELYWOUNDED", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the ultima.Constants.CreatureStatus getDamageStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDamageStatus_6()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(24);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		ultima.Constants.CreatureStatus result = fixture.getDamageStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BARELYWOUNDED", result.name());
		assertEquals("BARELYWOUNDED", result.toString());
		assertEquals(6, result.ordinal());
	}

	/**
	 * Run the Decal getDecal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDecal_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		Decal result = fixture.getDecal();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(0.0f, result.getWidth(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.getHeight(), 1.0f);
		assertEquals(0.0f, result.getZ(), 1.0f);
		assertEquals(1.0f, result.getScaleX(), 1.0f);
		assertEquals(1.0f, result.getScaleY(), 1.0f);
		assertEquals(null, result.getTextureRegion());
	}

	/**
	 * Run the int getDefense() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDefense_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getDefense();

		// add additional test code here
		assertEquals(128, result);
	}

	/**
	 * Run the boolean getDivides() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDivides_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getDivides();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getDivides() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDivides_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(false);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getDivides();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getEncounterSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetEncounterSize_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getEncounterSize();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getExp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetExp_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getExp();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getFlies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetFlies_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getFlies();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getFlies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetFlies_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(false);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getFlies();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getForceOfNature() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetForceOfNature_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getForceOfNature();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getForceOfNature() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetForceOfNature_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(false);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getForceOfNature();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getGood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetGood_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getGood();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getGood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetGood_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(false);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getGood();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getHP() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetHP_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getHP();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getIncorporeal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetIncorporeal_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getIncorporeal();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getIncorporeal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetIncorporeal_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(false);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getIncorporeal();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getLeader() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetLeader_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		int result = fixture.getLeader();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getLeavestile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetLeavestile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getLeavestile();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getLeavestile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetLeavestile_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(false);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getLeavestile();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getMovement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetMovement_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getMovement();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean getNochest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetNochest_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getNochest();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getNochest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetNochest_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(false);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getNochest();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getPoisons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetPoisons_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getPoisons();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getPoisons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetPoisons_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(false);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getPoisons();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getRanged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetRanged_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getRanged();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getRanged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetRanged_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(false);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getRanged();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getRangedhittile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetRangedhittile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getRangedhittile();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getRangedmisstile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetRangedmisstile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getRangedmisstile();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getResists() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetResists_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getResists();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean getSails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetSails_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getSails();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getSails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetSails_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(false);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getSails();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getSpawnsOnDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetSpawnsOnDeath_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getSpawnsOnDeath();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getSpawnsOnDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetSpawnsOnDeath_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(false);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getSpawnsOnDeath();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getSpawntile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetSpawntile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getSpawntile();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the ultima.Constants.StatusType getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		ultima.Constants.StatusType result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
		assertEquals('D', result.getValue());
		assertEquals("DEAD", result.name());
		assertEquals("DEAD", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the String getSteals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetSteals_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getSteals();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean getSwims() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetSwims_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getSwims();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getSwims() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetSwims_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(false);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getSwims();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getTeleports() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetTeleports_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getTeleports();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getTeleports() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetTeleports_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(false);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getTeleports();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the ultima.Constants.CreatureType getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		ultima.Constants.CreatureType result = fixture.getTile();

		// add additional test code here
		assertNotNull(result);
		assertEquals(52, result.getValue());
		assertEquals(null, result.getCreature());
		assertEquals(0, result.getSpawnLevel());
		assertEquals(0, result.getSpawnWeight());
		assertEquals("balron", result.name());
		assertEquals("balron", result.toString());
		assertEquals(52, result.ordinal());
	}

	/**
	 * Run the boolean getUndead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetUndead_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getUndead();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getUndead() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetUndead_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(false);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getUndead();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetVisible_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetVisible_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(false);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getWontattack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetWontattack_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getWontattack();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getWontattack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetWontattack_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(false);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.getWontattack();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getWorldrangedtile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetWorldrangedtile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.getWorldrangedtile();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean negates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testNegates_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("negate");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.negates();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean negates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testNegates_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts((String) null);
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.negates();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean negates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testNegates_3()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.negates();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean rangedAttackIs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testRangedAttackIs_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String tile = "";

		boolean result = fixture.rangedAttackIs(tile);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean rangedAttackIs(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testRangedAttackIs_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String tile = "";

		boolean result = fixture.rangedAttackIs(tile);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setAmbushes(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetAmbushes_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean ambushes = true;

		fixture.setAmbushes(ambushes);

		// add additional test code here
	}

	/**
	 * Run the void setAnim(Animation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetAnim_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		Animation anim = new Animation(1.0f, new Array());

		fixture.setAnim(anim);

		// add additional test code here
	}

	/**
	 * Run the void setBasehp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetBasehp_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		int basehp = 1;

		fixture.setBasehp(basehp);

		// add additional test code here
	}

	/**
	 * Run the void setCamouflage(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetCamouflage_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean camouflage = true;

		fixture.setCamouflage(camouflage);

		// add additional test code here
	}

	/**
	 * Run the void setCamouflageTile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetCamouflageTile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String camouflageTile = "";

		fixture.setCamouflageTile(camouflageTile);

		// add additional test code here
	}

	/**
	 * Run the void setCanMoveOntoAvatar(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetCanMoveOntoAvatar_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean canMoveOntoAvatar = true;

		fixture.setCanMoveOntoAvatar(canMoveOntoAvatar);

		// add additional test code here
	}

	/**
	 * Run the void setCanMoveOntoCreatures(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetCanMoveOntoCreatures_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean canMoveOntoCreatures = true;

		fixture.setCanMoveOntoCreatures(canMoveOntoCreatures);

		// add additional test code here
	}

	/**
	 * Run the void setCantattack(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetCantattack_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean cantattack = true;

		fixture.setCantattack(cantattack);

		// add additional test code here
	}

	/**
	 * Run the void setCasts(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetCasts_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String casts = "";

		fixture.setCasts(casts);

		// add additional test code here
	}

	/**
	 * Run the void setDecal(Decal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetDecal_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		Decal d = new Decal();

		fixture.setDecal(d);

		// add additional test code here
	}

	/**
	 * Run the void setDivides(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetDivides_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean divides = true;

		fixture.setDivides(divides);

		// add additional test code here
	}

	/**
	 * Run the void setEncounterSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetEncounterSize_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		int encounterSize = 1;

		fixture.setEncounterSize(encounterSize);

		// add additional test code here
	}

	/**
	 * Run the void setExp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetExp_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		int exp = 1;

		fixture.setExp(exp);

		// add additional test code here
	}

	/**
	 * Run the void setFlies(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetFlies_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean flies = true;

		fixture.setFlies(flies);

		// add additional test code here
	}

	/**
	 * Run the void setForceOfNature(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetForceOfNature_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean forceOfNature = true;

		fixture.setForceOfNature(forceOfNature);

		// add additional test code here
	}

	/**
	 * Run the void setGood(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetGood_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean good = true;

		fixture.setGood(good);

		// add additional test code here
	}

	/**
	 * Run the void setHP(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetHP_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		int h = 1;

		fixture.setHP(h);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setIncorporeal(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetIncorporeal_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean incorporeal = true;

		fixture.setIncorporeal(incorporeal);

		// add additional test code here
	}

	/**
	 * Run the void setLeader(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetLeader_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		int leader = 1;

		fixture.setLeader(leader);

		// add additional test code here
	}

	/**
	 * Run the void setLeavestile(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetLeavestile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean leavestile = true;

		fixture.setLeavestile(leavestile);

		// add additional test code here
	}

	/**
	 * Run the void setMovement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetMovement_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String movement = "";

		fixture.setMovement(movement);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setNochest(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetNochest_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean nochest = true;

		fixture.setNochest(nochest);

		// add additional test code here
	}

	/**
	 * Run the void setPoisons(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetPoisons_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean poisons = true;

		fixture.setPoisons(poisons);

		// add additional test code here
	}

	/**
	 * Run the void setRanged(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetRanged_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean ranged = true;

		fixture.setRanged(ranged);

		// add additional test code here
	}

	/**
	 * Run the void setRangedhittile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetRangedhittile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String rangedhittile = "";

		fixture.setRangedhittile(rangedhittile);

		// add additional test code here
	}

	/**
	 * Run the void setRangedmisstile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetRangedmisstile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String rangedmisstile = "";

		fixture.setRangedmisstile(rangedmisstile);

		// add additional test code here
	}

	/**
	 * Run the void setResists(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetResists_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String resists = "";

		fixture.setResists(resists);

		// add additional test code here
	}

	/**
	 * Run the void setSails(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetSails_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean sails = true;

		fixture.setSails(sails);

		// add additional test code here
	}

	/**
	 * Run the void setSpawnsOnDeath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetSpawnsOnDeath_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean spawnsOnDeath = true;

		fixture.setSpawnsOnDeath(spawnsOnDeath);

		// add additional test code here
	}

	/**
	 * Run the void setSpawntile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetSpawntile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String spawntile = "";

		fixture.setSpawntile(spawntile);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(StatusType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		ultima.Constants.StatusType status = ultima.Constants.StatusType.DEAD;

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setSteals(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetSteals_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String steals = "";

		fixture.setSteals(steals);

		// add additional test code here
	}

	/**
	 * Run the void setSwims(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetSwims_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean swims = true;

		fixture.setSwims(swims);

		// add additional test code here
	}

	/**
	 * Run the void setTeleports(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetTeleports_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean teleports = true;

		fixture.setTeleports(teleports);

		// add additional test code here
	}

	/**
	 * Run the void setTile(CreatureType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetTile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		ultima.Constants.CreatureType tile = ultima.Constants.CreatureType.balron;

		fixture.setTile(tile);

		// add additional test code here
	}

	/**
	 * Run the void setUndead(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetUndead_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean undead = true;

		fixture.setUndead(undead);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetVisible_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean isVisible = true;

		fixture.setVisible(isVisible);

		// add additional test code here
	}

	/**
	 * Run the void setWontattack(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetWontattack_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		boolean wontattack = true;

		fixture.setWontattack(wontattack);

		// add additional test code here
	}

	/**
	 * Run the void setWorldrangedtile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetWorldrangedtile_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;
		String worldrangedtile = "";

		fixture.setWorldrangedtile(worldrangedtile);

		// add additional test code here
	}

	/**
	 * Run the boolean stealsFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testStealsFood_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("food");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.stealsFood();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean stealsFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testStealsFood_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals((String) null);
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.stealsFood();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean stealsFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testStealsFood_3()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.stealsFood();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean stealsGold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testStealsGold_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("gold");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.stealsGold();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean stealsGold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testStealsGold_2()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals((String) null);
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.stealsGold();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean stealsGold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testStealsGold_3()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		boolean result = fixture.stealsGold();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Creature fixture = new Creature();
		fixture.setEncounterSize(1);
		fixture.setCantattack(true);
		fixture.setExp(1);
		fixture.setAmbushes(true);
		fixture.setTeleports(true);
		fixture.setMovement("");
		fixture.setRanged(true);
		fixture.setSpawnsOnDeath(true);
		fixture.setIncorporeal(true);
		fixture.setRangedhittile("");
		fixture.setPoisons(true);
		fixture.setResists("");
		fixture.setCasts("");
		fixture.setGood(true);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setWorldrangedtile("");
		fixture.setSteals("");
		fixture.setForceOfNature(true);
		fixture.setFlies(true);
		fixture.setUndead(true);
		fixture.setCamouflage(true);
		fixture.setId(1);
		fixture.setLeader(1);
		fixture.setCanMoveOntoCreatures(true);
		fixture.setStatus(ultima.Constants.StatusType.DEAD);
		fixture.setCamouflageTile("");
		fixture.setTile(ultima.Constants.CreatureType.balron);
		fixture.setDivides(true);
		fixture.setDecal(new Decal());
		fixture.setCanMoveOntoAvatar(true);
		fixture.setNochest(true);
		fixture.setSpawntile("");
		fixture.setBasehp(1);
		fixture.setRangedmisstile("");
		fixture.setWontattack(true);
		fixture.setSwims(true);
		fixture.setLeavestile(true);
		fixture.setName("");
		fixture.setVisible(true);
		fixture.setSails(true);
		fixture.setHP(1);
		fixture.currentLevel = 1;
		fixture.currentY = 1;
		fixture.sailDir = ultima.Constants.Direction.EAST;
		fixture.currentPos = new Vector3();
		fixture.currentX = 1;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Creature [id=1, name=, tile=balron, currentX=1, currentY=1 currentPos=(0.0,0.0,0.0), sailDir=EAST]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureTest.class);
	}
}