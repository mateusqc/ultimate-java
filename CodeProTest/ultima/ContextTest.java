package ultima;

import org.junit.*;
import objects.Drawable;
import objects.BaseMap;
import objects.SaveGame;
import objects.Creature;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import objects.Party;
import objects.JournalEntries;
import objects.Tile;
import objects.Aura;
import com.badlogic.gdx.maps.tiled.TiledMap;

/**
 * The class <code>ContextTest</code> contains tests for the class <code>{@link Context}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:05
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ContextTest {
	/**
	 * Run the Context() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testContext_1()
		throws Exception {
		Context result = new Context();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addEntry(String,Maps,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testAddEntry_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		String name = "";
		Constants.Maps map = Constants.Maps.ABYSS;
		String text = "";

		fixture.addEntry(name, map, text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.addEntry(Context.java:177)
	}

	/**
	 * Run the void addEntry(String,Maps,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testAddEntry_2()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		String name = "";
		Constants.Maps map = Constants.Maps.ABYSS;
		String text = "";

		fixture.addEntry(name, map, text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.addEntry(Context.java:177)
	}

	/**
	 * Run the void addEntry(String,Maps,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testAddEntry_3()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		String name = "";
		Constants.Maps map = Constants.Maps.ABYSS;
		String text = "";

		fixture.addEntry(name, map, text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.addEntry(Context.java:177)
	}

	/**
	 * Run the void addEntry(String,Maps,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testAddEntry_4()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		String name = "";
		Constants.Maps map = Constants.Maps.ABYSS;
		String text = "";

		fixture.addEntry(name, map, text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.addEntry(Context.java:177)
	}

	/**
	 * Run the void addEntry(String,Maps,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testAddEntry_5()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		String name = "";
		Constants.Maps map = Constants.Maps.ABYSS;
		String text = "";

		fixture.addEntry(name, map, text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.addEntry(Context.java:177)
	}

	/**
	 * Run the void addEntry(String,Maps,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testAddEntry_6()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		String name = "";
		Constants.Maps map = Constants.Maps.ABYSS;
		String text = "";

		fixture.addEntry(name, map, text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.addEntry(Context.java:177)
	}

	/**
	 * Run the void damageShip(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testDamageShip_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int minDamage = -1;
		int maxDamage = 1;

		fixture.damageShip(minDamage, maxDamage);

		// add additional test code here
	}

	/**
	 * Run the void damageShip(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testDamageShip_2()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int minDamage = 1;
		int maxDamage = 1;

		fixture.damageShip(minDamage, maxDamage);

		// add additional test code here
	}

	/**
	 * Run the void damageShip(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testDamageShip_3()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int minDamage = 1;
		int maxDamage = 1;

		fixture.damageShip(minDamage, maxDamage);

		// add additional test code here
	}

	/**
	 * Run the void damageShip(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testDamageShip_4()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int minDamage = 1;
		int maxDamage = 1;

		fixture.damageShip(minDamage, maxDamage);

		// add additional test code here
	}

	/**
	 * Run the Aura getAura() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetAura_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		Aura result = fixture.getAura();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isActive());
		assertEquals(0, result.getDuration());
	}

	/**
	 * Run the boolean getChestTrapHandler(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetChestTrapHandler_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		objects.Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		boolean result = fixture.getChestTrapHandler(pm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		assertTrue(result);
	}

	/**
	 * Run the boolean getChestTrapHandler(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetChestTrapHandler_2()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		objects.Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		boolean result = fixture.getChestTrapHandler(pm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		assertTrue(result);
	}

	/**
	 * Run the boolean getChestTrapHandler(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetChestTrapHandler_3()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		objects.Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		boolean result = fixture.getChestTrapHandler(pm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		assertTrue(result);
	}

	/**
	 * Run the boolean getChestTrapHandler(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetChestTrapHandler_4()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		objects.Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		boolean result = fixture.getChestTrapHandler(pm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		assertTrue(result);
	}

	/**
	 * Run the boolean getChestTrapHandler(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetChestTrapHandler_5()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		objects.Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		boolean result = fixture.getChestTrapHandler(pm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		assertTrue(result);
	}

	/**
	 * Run the boolean getChestTrapHandler(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetChestTrapHandler_6()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		objects.Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		boolean result = fixture.getChestTrapHandler(pm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		assertTrue(result);
	}

	/**
	 * Run the int getCol() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCol_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		int result = fixture.getCol();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Constants.Maps getCombatMap(Creature,BaseMap,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMap_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Creature c = new Creature();
		c.setSwims(true);
		BaseMap bm = new BaseMap();
		int creatureX = 1;
		int creatureY = 1;
		int avatarX = 1;
		int avatarY = 1;

		Constants.Maps result = fixture.getCombatMap(c, bm, creatureX, creatureY, avatarX, avatarY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMap(Context.java:443)
		assertNotNull(result);
	}

	/**
	 * Run the Constants.Maps getCombatMap(Creature,BaseMap,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMap_2()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Creature c = new Creature();
		c.setSails(true);
		c.setSwims(false);
		BaseMap bm = new BaseMap();
		int creatureX = 1;
		int creatureY = 1;
		int avatarX = 1;
		int avatarY = 1;

		Constants.Maps result = fixture.getCombatMap(c, bm, creatureX, creatureY, avatarX, avatarY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMap(Context.java:443)
		assertNotNull(result);
	}

	/**
	 * Run the Constants.Maps getCombatMapForTile(Tile,TransportContext,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMapForTile_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Tile combatantTile = new Tile();
		combatantTile.setRule(Constants.TileRule.balloon);
		Constants.TransportContext transport = Constants.TransportContext.ANY;
		int x = 1;
		int y = 1;

		Constants.Maps result = fixture.getCombatMapForTile(combatantTile, transport, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMapForTile(Context.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the Constants.Maps getCombatMapForTile(Tile,TransportContext,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMapForTile_2()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Tile combatantTile = new Tile();
		combatantTile.setRule(Constants.TileRule.balloon);
		Constants.TransportContext transport = Constants.TransportContext.ANY;
		int x = 1;
		int y = 1;

		Constants.Maps result = fixture.getCombatMapForTile(combatantTile, transport, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMapForTile(Context.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the Constants.Maps getCombatMapForTile(Tile,TransportContext,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMapForTile_3()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Tile combatantTile = new Tile();
		combatantTile.setRule(Constants.TileRule.balloon);
		Constants.TransportContext transport = Constants.TransportContext.ANY;
		int x = 1;
		int y = 1;

		Constants.Maps result = fixture.getCombatMapForTile(combatantTile, transport, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMapForTile(Context.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the Constants.Maps getCombatMapForTile(Tile,TransportContext,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMapForTile_4()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Tile combatantTile = new Tile();
		combatantTile.setRule(Constants.TileRule.balloon);
		Constants.TransportContext transport = Constants.TransportContext.ANY;
		int x = 1;
		int y = 1;

		Constants.Maps result = fixture.getCombatMapForTile(combatantTile, transport, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMapForTile(Context.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the Constants.Maps getCombatMapForTile(Tile,TransportContext,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMapForTile_5()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Tile combatantTile = new Tile();
		combatantTile.setRule(Constants.TileRule.balloon);
		Constants.TransportContext transport = Constants.TransportContext.ANY;
		int x = 1;
		int y = 1;

		Constants.Maps result = fixture.getCombatMapForTile(combatantTile, transport, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMapForTile(Context.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the Constants.Maps getCombatMapForTile(Tile,TransportContext,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMapForTile_6()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Tile combatantTile = new Tile();
		combatantTile.setRule(Constants.TileRule.balloon);
		Constants.TransportContext transport = Constants.TransportContext.ANY;
		int x = 1;
		int y = 1;

		Constants.Maps result = fixture.getCombatMapForTile(combatantTile, transport, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMapForTile(Context.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the Constants.Maps getCombatMapForTile(Tile,TransportContext,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCombatMapForTile_7()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Tile combatantTile = new Tile();
		combatantTile.setRule(Constants.TileRule.balloon);
		Constants.TransportContext transport = Constants.TransportContext.ANY;
		int x = 1;
		int y = 1;

		Constants.Maps result = fixture.getCombatMapForTile(combatantTile, transport, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.getCombatMapForTile(Context.java:289)
		assertNotNull(result);
	}

	/**
	 * Run the BaseMap getCurrentMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCurrentMap_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		BaseMap result = fixture.getCurrentMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BaseMap [id=0, fname=null, portals=null]", result.toString());
		assertEquals(0, result.getId());
		assertEquals(null, result.getType());
		assertEquals(0, result.getOffset());
		assertEquals(null, result.getLabels());
		assertEquals(0, result.getLevels());
		assertEquals(0, result.getWidth());
		assertEquals(0, result.getHeight());
		assertEquals(null, result.getTileset());
		assertEquals(null, result.getFname());
		assertEquals(null, result.getPortals());
		assertEquals(false, result.getFirstperson());
		assertEquals(0, result.getChunkheight());
		assertEquals(null, result.getMoongates());
		assertEquals(false, result.getNolineofsight());
		assertEquals(null, result.getMusic());
		assertEquals(null, result.getTilemap());
		assertEquals(false, result.getShowavatar());
		assertEquals(false, result.getContextual());
		assertEquals(0, result.getChunkwidth());
		assertEquals(null, result.getCity());
		assertEquals(null, result.getDungeon());
		assertEquals(null, result.getShrine());
		assertEquals(null, result.getTiles());
		assertEquals(null, result.getShadownMap());
		assertEquals(null, result.getCombatPlayers());
		assertEquals(null, result.getSurfaceMapStage());
		assertEquals(null, result.getBorderbehavior());
	}

	/**
	 * Run the Drawable getCurrentShip() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCurrentShip_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		Drawable result = fixture.getCurrentShip();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getCx());
		assertEquals(1, result.getCy());
		assertEquals(0, result.getMapId());
		assertEquals(50, result.getShipHull());
		assertEquals(false, result.remove());
		assertEquals("Drawable", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(true, result.getDebug());
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(null, result.getUserObject());
		assertEquals(0.0f, result.getRight(), 1.0f);
		assertEquals(true, result.isVisible());
		assertEquals(0.0f, result.getWidth(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.getHeight(), 1.0f);
		assertEquals(0.0f, result.getTop(), 1.0f);
		assertEquals(-1, result.getZIndex());
		assertEquals(null, result.getStage());
		assertEquals(false, result.hasParent());
		assertEquals(true, result.isTouchable());
		assertEquals(false, result.hasActions());
		assertEquals(false, result.clipBegin());
		assertEquals(0.0f, result.getOriginX(), 1.0f);
		assertEquals(0.0f, result.getRotation(), 1.0f);
		assertEquals(0.0f, result.getOriginY(), 1.0f);
		assertEquals(1.0f, result.getScaleX(), 1.0f);
		assertEquals(1.0f, result.getScaleY(), 1.0f);
	}

	/**
	 * Run the TiledMap getCurrentTiledMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCurrentTiledMap_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		TiledMap result = fixture.getCurrentTiledMap();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getHorseSpeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetHorseSpeed_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		int result = fixture.getHorseSpeed();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the JournalEntries getJournal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetJournal_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		JournalEntries result = fixture.getJournal();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the long getLastCommandTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetLastCommandTime_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		long result = fixture.getLastCommandTime();

		// add additional test code here
		assertEquals(1L, result);
	}

	/**
	 * Run the Drawable getLastShip() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetLastShip_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		Drawable result = fixture.getLastShip();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getCx());
		assertEquals(1, result.getCy());
		assertEquals(0, result.getMapId());
		assertEquals(50, result.getShipHull());
		assertEquals(false, result.remove());
		assertEquals("Drawable", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(true, result.getDebug());
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(null, result.getUserObject());
		assertEquals(0.0f, result.getRight(), 1.0f);
		assertEquals(true, result.isVisible());
		assertEquals(0.0f, result.getWidth(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.getHeight(), 1.0f);
		assertEquals(0.0f, result.getTop(), 1.0f);
		assertEquals(-1, result.getZIndex());
		assertEquals(null, result.getStage());
		assertEquals(false, result.hasParent());
		assertEquals(true, result.isTouchable());
		assertEquals(false, result.hasActions());
		assertEquals(false, result.clipBegin());
		assertEquals(0.0f, result.getOriginX(), 1.0f);
		assertEquals(0.0f, result.getRotation(), 1.0f);
		assertEquals(0.0f, result.getOriginY(), 1.0f);
		assertEquals(1.0f, result.getScaleX(), 1.0f);
		assertEquals(1.0f, result.getScaleY(), 1.0f);
	}

	/**
	 * Run the int getLine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetLine_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		int result = fixture.getLine();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getLocationMask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetLocationMask_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		int result = fixture.getLocationMask();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMoonPhase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetMoonPhase_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		int result = fixture.getMoonPhase();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getOpacity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetOpacity_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		int result = fixture.getOpacity();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Party getParty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetParty_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		Party result = fixture.getParty();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTransport());
		assertEquals(0, result.getActivePlayer());
		assertEquals(true, result.isRoundDone());
		assertEquals(false, result.didAnyoneFlee());
		assertEquals(0, result.getTorchduration());
		assertEquals(false, result.isFlying());
		assertEquals(63, result.getChestGold());
		assertEquals(0, result.countObservers());
		assertEquals(false, result.hasChanged());
	}

	/**
	 * Run the Constants.TransportContext getTransportContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetTransportContext_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		Constants.TransportContext result = fixture.getTransportContext();

		// add additional test code here
		assertNotNull(result);
		assertEquals(65535, result.getIntValue());
		assertEquals("ANY", result.name());
		assertEquals("ANY", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the Constants.Direction getWindDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetWindDirection_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		Constants.Direction result = fixture.getWindDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getMask());
		assertEquals(3, result.getVal());
		assertEquals("EAST", result.name());
		assertEquals("EAST", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the int incrementBalloonCounter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testIncrementBalloonCounter_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		int result = fixture.incrementBalloonCounter();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int incrementWindCounter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testIncrementWindCounter_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		int result = fixture.incrementWindCounter();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the void loadJournalEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testLoadJournalEntries_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		fixture.loadJournalEntries();

		// add additional test code here
	}

	/**
	 * Run the void loadJournalEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testLoadJournalEntries_2()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		fixture.loadJournalEntries();

		// add additional test code here
	}

	/**
	 * Run the void loadJournalEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testLoadJournalEntries_3()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		fixture.loadJournalEntries();

		// add additional test code here
	}

	/**
	 * Run the void loadJournalEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testLoadJournalEntries_4()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);

		fixture.loadJournalEntries();

		// add additional test code here
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_2()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_3()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_4()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_5()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_6()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_7()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_8()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_9()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_10()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_11()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_12()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_13()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_14()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_15()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void saveGame(float,float,float,Direction,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSaveGame_16()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;
		Constants.Direction orientation = Constants.Direction.EAST;
		Constants.Maps map = Constants.Maps.ABYSS;

		fixture.saveGame(x, y, z, orientation, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Context.saveGame(Context.java:191)
	}

	/**
	 * Run the void setAura(AuraType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetAura_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Constants.AuraType t = Constants.AuraType.HORN;
		int duration = 1;

		fixture.setAura(t, duration);

		// add additional test code here
	}

	/**
	 * Run the void setBalloonCounter(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetBalloonCounter_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int v = 1;

		fixture.setBalloonCounter(v);

		// add additional test code here
	}

	/**
	 * Run the void setCol(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetCol_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int col = 1;

		fixture.setCol(col);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentMap(BaseMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetCurrentMap_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		BaseMap currentMap = new BaseMap();

		fixture.setCurrentMap(currentMap);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentShip(Drawable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetCurrentShip_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Drawable currentShip = new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas());

		fixture.setCurrentShip(currentShip);

		// add additional test code here
	}

	/**
	 * Run the void setCurrentTiledMap(TiledMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetCurrentTiledMap_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		TiledMap currentTiledMap = new TiledMap();

		fixture.setCurrentTiledMap(currentTiledMap);

		// add additional test code here
	}

	/**
	 * Run the void setHorseSpeed(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetHorseSpeed_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int horseSpeed = 1;

		fixture.setHorseSpeed(horseSpeed);

		// add additional test code here
	}

	/**
	 * Run the void setLastCommandTime(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetLastCommandTime_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		long lastCommandTime = 1L;

		fixture.setLastCommandTime(lastCommandTime);

		// add additional test code here
	}

	/**
	 * Run the void setLastShip(Drawable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetLastShip_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Drawable lastShip = new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas());

		fixture.setLastShip(lastShip);

		// add additional test code here
	}

	/**
	 * Run the void setLine(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetLine_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int line = 1;

		fixture.setLine(line);

		// add additional test code here
	}

	/**
	 * Run the void setLocationMask(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetLocationMask_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int locationMask = 1;

		fixture.setLocationMask(locationMask);

		// add additional test code here
	}

	/**
	 * Run the void setMoonPhase(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetMoonPhase_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int moonPhase = 1;

		fixture.setMoonPhase(moonPhase);

		// add additional test code here
	}

	/**
	 * Run the void setOpacity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetOpacity_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int opacity = 1;

		fixture.setOpacity(opacity);

		// add additional test code here
	}

	/**
	 * Run the void setParty(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetParty_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Party party = new Party(new SaveGame());

		fixture.setParty(party);

		// add additional test code here
	}

	/**
	 * Run the void setTransportContext(TransportContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetTransportContext_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Constants.TransportContext transportContext = Constants.TransportContext.ANY;

		fixture.setTransportContext(transportContext);

		// add additional test code here
	}

	/**
	 * Run the void setWindCounter(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetWindCounter_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		int v = 1;

		fixture.setWindCounter(v);

		// add additional test code here
	}

	/**
	 * Run the void setWindDirection(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetWindDirection_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Constants.Direction windDirection = Constants.Direction.EAST;

		fixture.setWindDirection(windDirection);

		// add additional test code here
	}

	/**
	 * Run the boolean slowedByTile(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSlowedByTile_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Tile tile = new Tile();
		tile.setRule((Constants.TileRule) null);

		boolean result = fixture.slowedByTile(tile);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean slowedByWind(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSlowedByWind_1()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Constants.Direction direction = Constants.Direction.EAST;

		boolean result = fixture.slowedByWind(direction);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean slowedByWind(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSlowedByWind_2()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Constants.Direction direction = Constants.Direction.EAST;

		boolean result = fixture.slowedByWind(direction);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean slowedByWind(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSlowedByWind_3()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Constants.Direction direction = Constants.Direction.EAST;

		boolean result = fixture.slowedByWind(direction);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean slowedByWind(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSlowedByWind_4()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Constants.Direction direction = Constants.Direction.EAST;

		boolean result = fixture.slowedByWind(direction);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean slowedByWind(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSlowedByWind_5()
		throws Exception {
		Context fixture = new Context();
		fixture.setParty(new Party(new SaveGame()));
		fixture.setMoonPhase(1);
		fixture.setWindDirection(Constants.Direction.EAST);
		fixture.setTransportContext(Constants.TransportContext.ANY);
		fixture.setWindCounter(1);
		fixture.setLocationMask(1);
		fixture.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setCol(1);
		fixture.setLastCommandTime(1L);
		fixture.setCurrentMap(new BaseMap());
		fixture.setCurrentShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		fixture.setLine(1);
		fixture.setCurrentTiledMap(new TiledMap());
		fixture.setOpacity(1);
		fixture.setBalloonCounter(1);
		fixture.setHorseSpeed(1);
		Constants.Direction direction = Constants.Direction.EAST;

		boolean result = fixture.slowedByWind(direction);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
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
	 * @generatedBy CodePro at 11/06/19 13:05
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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ContextTest.class);
	}
}