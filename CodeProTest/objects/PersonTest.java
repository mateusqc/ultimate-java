package objects;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import ultima.Constants;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import vendor.Vendor;

/**
 * The class <code>PersonTest</code> contains tests for the class <code>{@link Person}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class PersonTest {
	/**
	 * Run the Person() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testPerson_1()
		throws Exception {
		Person result = new Person();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Animation<TextureRegion> getAnim() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAnim_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		Animation<TextureRegion> result = fixture.getAnim();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0f, result.getAnimationDuration(), 1.0f);
		assertEquals(1.0f, result.getFrameDuration(), 1.0f);
	}

	/**
	 * Run the Conversation getConversation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetConversation_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		Conversation result = fixture.getConversation();

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\tConversation [index=0, name=null, pronoun=null, turnAwayProb=0, description=null, respAffectsHumility=0, topics=[]]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getMap());
		assertEquals(0, result.getIndex());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getPronoun());
		assertEquals(0, result.getTurnAwayProb());
		assertEquals(0, result.getRespAffectsHumility());
	}

	/**
	 * Run the Vector3 getCurrentPos() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetCurrentPos_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		Vector3 result = fixture.getCurrentPos();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0.0,0.0,0.0)", result.toString());
		assertEquals(0.0f, result.len(), 1.0f);
		assertEquals(true, result.isZero());
		assertEquals(0.0f, result.len2(), 1.0f);
		assertEquals(false, result.isUnit());
	}

	/**
	 * Run the int getDialogId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetDialogId_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		int result = fixture.getDialogId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Creature getEmulatingCreature() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetEmulatingCreature_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		Creature result = fixture.getEmulatingCreature();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Creature [id=0, name=null, tile=null, currentX=0, currentY=0 currentPos=null, sailDir=EAST]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getId());
		assertEquals(true, result.getVisible());
		assertEquals(null, result.getStatus());
		assertEquals(false, result.getNochest());
		assertEquals(false, result.getTeleports());
		assertEquals(false, result.getRanged());
		assertEquals(false, result.negates());
		assertEquals(false, result.stealsGold());
		assertEquals(false, result.castsSleep());
		assertEquals(false, result.stealsFood());
		assertEquals(false, result.getCamouflage());
		assertEquals(null, result.getMovement());
		assertEquals(false, result.getGood());
		assertEquals(false, result.getFlies());
		assertEquals(0, result.getAttackBonus());
		assertEquals(128, result.getDefense());
		assertEquals(false, result.getSails());
		assertEquals(false, result.getSwims());
		assertEquals(0, result.getExp());
		assertEquals(0, result.getHP());
		assertEquals(null, result.getResists());
		assertEquals(0, result.getLeader());
		assertEquals(0, result.getEncounterSize());
		assertEquals(null, result.getAnim());
		assertEquals(null, result.getCamouflageTile());
		assertEquals(false, result.getCanMoveOntoAvatar());
		assertEquals(null, result.getRangedmisstile());
		assertEquals(null, result.getWorldrangedtile());
		assertEquals(false, result.getCanMoveOntoCreatures());
		assertEquals(null, result.getCasts());
		assertEquals(false, result.getCantattack());
		assertEquals(null, result.getSteals());
		assertEquals(false, result.getPoisons());
		assertEquals(0, result.getBasehp());
		assertEquals(false, result.getAmbushes());
		assertEquals(null, result.getSpawntile());
		assertEquals(false, result.getIncorporeal());
		assertEquals(null, result.getRangedhittile());
		assertEquals(false, result.getForceOfNature());
		assertEquals(false, result.getSpawnsOnDeath());
		assertEquals(false, result.getWontattack());
		assertEquals(false, result.getDivides());
		assertEquals(false, result.getLeavestile());
		assertEquals(false, result.getUndead());
		assertEquals(null, result.getDecal());
		assertEquals(null, result.getTile());
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		int result = fixture.getId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ultima.Constants.ObjectMovementBehavior getMovement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMovement_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		ultima.Constants.ObjectMovementBehavior result = fixture.getMovement();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ATTACK_AVATAR", result.name());
		assertEquals("ATTACK_AVATAR", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the PersonRole getRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		PersonRole result = fixture.getRole();

		// add additional test code here
		assertNotNull(result);
		assertEquals("null, inventoryType=null, id=0", result.toString());
		assertEquals(0, result.getId());
		assertEquals(null, result.getRole());
		assertEquals(null, result.getInventoryType());
	}

	/**
	 * Run the int getStart_x() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetStart_x_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		int result = fixture.getStart_x();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getStart_y() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetStart_y_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		int result = fixture.getStart_y();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the TextureRegion getTextureRegion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTextureRegion_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		TextureRegion result = fixture.getTextureRegion();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0f, result.getV2(), 1.0f);
		assertEquals(0.0f, result.getU(), 1.0f);
		assertEquals(0.0f, result.getU2(), 1.0f);
		assertEquals(0, result.getRegionWidth());
		assertEquals(0, result.getRegionHeight());
		assertEquals(false, result.isFlipX());
		assertEquals(false, result.isFlipY());
		assertEquals(0.0f, result.getV(), 1.0f);
		assertEquals(null, result.getTexture());
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		Tile result = fixture.getTile();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Tile [name=null, idx=0]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(false, result.isOpaque());
		assertEquals(0, result.getIndex());
		assertEquals(null, result.getRule());
		assertEquals(false, result.getUsesReplacementTileAsBackground());
		assertEquals(false, result.getUsesWaterReplacementTileAsBackground());
		assertEquals(0, result.getRowtoswap());
		assertEquals(null, result.getAnimation());
		assertEquals(false, result.walkable());
		assertEquals(null, result.getDirections());
		assertEquals(0, result.getFrames());
		assertEquals(false, result.getTiledInDungeon());
	}

	/**
	 * Run the int getTileIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTileIndex_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		int result = fixture.getTileIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTileMapId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTileMapId_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		int result = fixture.getTileMapId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Vendor getVendor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetVendor_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		Vendor result = fixture.getVendor();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Vendor [mapId=null, name=null, owner=null, personId=0]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getOwner());
		assertEquals(0, result.getPersonId());
		assertEquals(null, result.getMapId());
		assertEquals(null, result.getInventoryItems());
		assertEquals(null, result.getVendorType());
		assertEquals(null, result.getGenericField1());
		assertEquals(null, result.getVendorClass());
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetX_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		int result = fixture.getX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetY_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		int result = fixture.getY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isRemovedFromMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsRemovedFromMap_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		boolean result = fixture.isRemovedFromMap();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isRemovedFromMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsRemovedFromMap_2()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(false);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		boolean result = fixture.isRemovedFromMap();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTalking() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsTalking_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		boolean result = fixture.isTalking();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isTalking() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsTalking_2()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(false);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		boolean result = fixture.isTalking();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setAnim(Animation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetAnim_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		Animation anim = new Animation(1.0f, new Array());

		fixture.setAnim(anim);

		// add additional test code here
	}

	/**
	 * Run the void setConversation(Conversation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetConversation_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		Conversation conversation = new Conversation();

		fixture.setConversation(conversation);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentPos(Vector3) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetCurrentPos_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		Vector3 currentPos = new Vector3();

		fixture.setCurrentPos(currentPos);

		// add additional test code here
	}

	/**
	 * Run the void setDialogId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetDialogId_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		int dialogId = 1;

		fixture.setDialogId(dialogId);

		// add additional test code here
	}

	/**
	 * Run the void setEmulatingCreature(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetEmulatingCreature_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		Creature emulatingCreature = new Creature();

		fixture.setEmulatingCreature(emulatingCreature);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setMovement(ObjectMovementBehavior) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMovement_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		ultima.Constants.ObjectMovementBehavior movement = ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR;

		fixture.setMovement(movement);

		// add additional test code here
	}

	/**
	 * Run the void setRemovedFromMap(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetRemovedFromMap_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		boolean removedFromMap = true;

		fixture.setRemovedFromMap(removedFromMap);

		// add additional test code here
	}

	/**
	 * Run the void setRole(PersonRole) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetRole_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		PersonRole role = new PersonRole();

		fixture.setRole(role);

		// add additional test code here
	}

	/**
	 * Run the void setStart_x(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetStart_x_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		int start_x = 1;

		fixture.setStart_x(start_x);

		// add additional test code here
	}

	/**
	 * Run the void setStart_y(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetStart_y_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		int start_y = 1;

		fixture.setStart_y(start_y);

		// add additional test code here
	}

	/**
	 * Run the void setTalking(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTalking_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		boolean isTalking = true;

		fixture.setTalking(isTalking);

		// add additional test code here
	}

	/**
	 * Run the void setTextureRegion(TextureRegion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTextureRegion_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		TextureRegion textureRegion = new TextureRegion();

		fixture.setTextureRegion(textureRegion);

		// add additional test code here
	}

	/**
	 * Run the void setTile(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTile_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		Tile tile = new Tile();

		fixture.setTile(tile);

		// add additional test code here
	}

	/**
	 * Run the void setTileIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTileIndex_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		int tileIndex = 1;

		fixture.setTileIndex(tileIndex);

		// add additional test code here
	}

	/**
	 * Run the void setTileMapId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTileMapId_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		int tileMapId = 1;

		fixture.setTileMapId(tileMapId);

		// add additional test code here
	}

	/**
	 * Run the void setVendor(Vendor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetVendor_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		Vendor vendor = new Vendor();

		fixture.setVendor(vendor);

		// add additional test code here
	}

	/**
	 * Run the void setX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetX_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		int x = 1;

		fixture.setX(x);

		// add additional test code here
	}

	/**
	 * Run the void setY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetY_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());
		int y = 1;

		fixture.setY(y);

		// add additional test code here
	}

	/**
	 * Run the String toCamelCase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToCamelCase_1()
		throws Exception {
		String s = null;

		String result = Person.toCamelCase(s);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String toCamelCase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToCamelCase_2()
		throws Exception {
		String s = "";

		String result = Person.toCamelCase(s);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toCamelCase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToCamelCase_3()
		throws Exception {
		String s = "";

		String result = Person.toCamelCase(s);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toCamelCase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToCamelCase_4()
		throws Exception {
		String s = "";

		String result = Person.toCamelCase(s);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Person [id=1, start_x=1, start_y=1, dialogId=1, role=null, inventoryType=null, id=0 tileIndex=1 conv: \r\n\tConversation [index=0, name=null, pronoun=null, turnAwayProb=0, description=null, respAffectsHumility=0, topics=[]]]", result);
	}

	/**
	 * Run the String toTMXString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation((Conversation) null);
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString();

		// add additional test code here
		assertEquals("<object name=\"anonymous\" type=\"null\" x=\"32\" y=\"32\" width=\"32\" height=\"32\">\r\n<properties>\r\n<property name=\"id\" value=\"1\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"startX\" value=\"1\"/>\r\n<property name=\"startY\" value=\"1\"/>\r\n<property name=\"dialogId\" value=\"1\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString_2()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString();

		// add additional test code here
		assertEquals("<object name=\"null\" type=\"null\" x=\"32\" y=\"32\" width=\"32\" height=\"32\">\r\n<properties>\r\n<property name=\"id\" value=\"1\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"startX\" value=\"1\"/>\r\n<property name=\"startY\" value=\"1\"/>\r\n<property name=\"dialogId\" value=\"1\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_1()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_2()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_3()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_4()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_5()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_6()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_7()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_8()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_9()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_10()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_11()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole(new PersonRole());
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation(new Conversation());
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor(new Vendor());
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"inventoryType\" value=\"null\"/>\r\n<property name=\"vendorName\" value=\"null\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toTMXString48() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToTMXString48_12()
		throws Exception {
		Person fixture = new Person();
		fixture.setMovement(ultima.Constants.ObjectMovementBehavior.ATTACK_AVATAR);
		fixture.setX(1);
		fixture.setTile(new Tile());
		fixture.setId(1);
		fixture.setAnim(new Animation(1.0f, new Array()));
		fixture.setRole((PersonRole) null);
		fixture.setCurrentPos(new Vector3());
		fixture.setTextureRegion(new TextureRegion());
		fixture.setRemovedFromMap(true);
		fixture.setConversation((Conversation) null);
		fixture.setY(1);
		fixture.setTalking(true);
		fixture.setTileIndex(1);
		fixture.setDialogId(1);
		fixture.setStart_x(1);
		fixture.setTileMapId(1);
		fixture.setVendor((Vendor) null);
		fixture.setStart_y(1);
		fixture.setEmulatingCreature(new Creature());

		String result = fixture.toTMXString48();

		// add additional test code here
		assertEquals("<object id=\"1\" name=\"null\" type=\"FRIENDLY\" x=\"48\" y=\"48\" width=\"48\" height=\"48\">\r\n<properties>\r\n<property name=\"movement\" value=\"ATTACK_AVATAR\"/>\r\n<property name=\"tileType\" value=\"null\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
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
	 * @generatedBy CodePro at 11/06/19 12:58
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
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PersonTest.class);
	}
}