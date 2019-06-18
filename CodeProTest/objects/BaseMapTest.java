package objects;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import ultima.GameScreen;
import ultima.Context;
import ultima.Ultima4;
import ultima.BaseScreen;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import ultima.Constants;

/**
 * The class <code>BaseMapTest</code> contains tests for the class <code>{@link BaseMap}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:00
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class BaseMapTest {
	/**
	 * Run the BaseMap() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testBaseMap_1()
		throws Exception {
		BaseMap result = new BaseMap();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addCreature(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testAddCreature_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Creature cr = null;

		fixture.addCreature(cr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7f6cedf4
	}

	/**
	 * Run the void addCreature(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testAddCreature_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Creature cr = new Creature();

		fixture.addCreature(cr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7d23f662
	}

	/**
	 * Run the void clearCreatures() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testClearCreatures_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());

		fixture.clearCreatures();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@196e082b
	}

	/**
	 * Run the ultima.Constants.MapBorderBehavior getBorderbehavior() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetBorderbehavior_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		ultima.Constants.MapBorderBehavior result = fixture.getBorderbehavior();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3e784a90
		assertNotNull(result);
	}

	/**
	 * Run the int getChunkheight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetChunkheight_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		int result = fixture.getChunkheight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7269ca3e
		assertEquals(0, result);
	}

	/**
	 * Run the int getChunkwidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetChunkwidth_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		int result = fixture.getChunkwidth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@42a7bc18
		assertEquals(0, result);
	}

	/**
	 * Run the City getCity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetCity_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		City result = fixture.getCity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6b4da0c6
		assertNotNull(result);
	}

	/**
	 * Run the List<Party.PartyMember> getCombatPlayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetCombatPlayers_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		List<Party.PartyMember> result = fixture.getCombatPlayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@25805ac8
		assertNotNull(result);
	}

	/**
	 * Run the boolean getContextual() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetContextual_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		boolean result = fixture.getContextual();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@51ee90fb
		assertTrue(result);
	}

	/**
	 * Run the boolean getContextual() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetContextual_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(false);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		boolean result = fixture.getContextual();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1ffdf7b4
		assertTrue(result);
	}

	/**
	 * Run the Creature getCreatureAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetCreatureAt_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Creature result = fixture.getCreatureAt(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1e89cb0e
		assertNotNull(result);
	}

	/**
	 * Run the Creature getCreatureAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetCreatureAt_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Creature result = fixture.getCreatureAt(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7cfffa3f
		assertNotNull(result);
	}

	/**
	 * Run the Creature getCreatureAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetCreatureAt_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Creature result = fixture.getCreatureAt(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@70e45905
		assertNotNull(result);
	}

	/**
	 * Run the Creature getCreatureAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetCreatureAt_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Creature result = fixture.getCreatureAt(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@27fcb6ae
		assertNotNull(result);
	}

	/**
	 * Run the List<Creature> getCreatures() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetCreatures_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		List<Creature> result = fixture.getCreatures();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2bf8caf5
		assertNotNull(result);
	}

	/**
	 * Run the BaseMap.DoorStatus getDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetDoor_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		BaseMap.DoorStatus result = fixture.getDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@603e9203
		assertNotNull(result);
	}

	/**
	 * Run the BaseMap.DoorStatus getDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetDoor_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		BaseMap.DoorStatus result = fixture.getDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@48bbe298
		assertNotNull(result);
	}

	/**
	 * Run the BaseMap.DoorStatus getDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetDoor_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		BaseMap.DoorStatus result = fixture.getDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5fe3b661
		assertNotNull(result);
	}

	/**
	 * Run the BaseMap.DoorStatus getDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetDoor_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		BaseMap.DoorStatus result = fixture.getDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7705dff1
		assertNotNull(result);
	}

	/**
	 * Run the Dungeon getDungeon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetDungeon_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		Dungeon result = fixture.getDungeon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@553884d4
		assertNotNull(result);
	}

	/**
	 * Run the boolean getFirstperson() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetFirstperson_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		boolean result = fixture.getFirstperson();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@43b18d
		assertTrue(result);
	}

	/**
	 * Run the boolean getFirstperson() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetFirstperson_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(false);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		boolean result = fixture.getFirstperson();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2196d29d
		assertTrue(result);
	}

	/**
	 * Run the String getFname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetFname_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		String result = fixture.getFname();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@227f91a9
		assertNotNull(result);
	}

	/**
	 * Run the int getHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetHeight_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		int result = fixture.getHeight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4488f8a
		assertEquals(0, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		int result = fixture.getId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4a08336e
		assertEquals(0, result);
	}

	/**
	 * Run the List<Label> getLabels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetLabels_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		List<Label> result = fixture.getLabels();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4484a73d
		assertNotNull(result);
	}

	/**
	 * Run the int getLevels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetLevels_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		int result = fixture.getLevels();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@54378705
		assertEquals(0, result);
	}

	/**
	 * Run the Moongate getMoongate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetMoongate_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(null);
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int phase = 1;

		Moongate result = fixture.getMoongate(phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Moongate getMoongate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetMoongate_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int phase = 1;

		Moongate result = fixture.getMoongate(phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Moongate getMoongate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetMoongate_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int phase = 1;

		Moongate result = fixture.getMoongate(phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Moongate getMoongate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetMoongate_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int phase = 1;

		Moongate result = fixture.getMoongate(phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the List<Moongate> getMoongates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetMoongates_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		List<Moongate> result = fixture.getMoongates();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22db1a09
		assertNotNull(result);
	}

	/**
	 * Run the String getMusic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetMusic_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		String result = fixture.getMusic();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3da74116
		assertNotNull(result);
	}

	/**
	 * Run the boolean getNolineofsight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetNolineofsight_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		boolean result = fixture.getNolineofsight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6955a2ce
		assertTrue(result);
	}

	/**
	 * Run the boolean getNolineofsight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetNolineofsight_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(false);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		boolean result = fixture.getNolineofsight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7831386c
		assertTrue(result);
	}

	/**
	 * Run the int getOffset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetOffset_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		int result = fixture.getOffset();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@59cb1c99
		assertEquals(0, result);
	}

	/**
	 * Run the Portal getPortal(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(null);
		fixture.addCreature(new Creature());
		int id = 1;

		Portal result = fixture.getPortal(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int id = 1;

		Portal result = fixture.getPortal(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int id = 1;

		Portal result = fixture.getPortal(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int id = 1;

		Portal result = fixture.getPortal(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_5()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(null);
		fixture.addCreature(new Creature());
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;

		Portal result = fixture.getPortal(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_6()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;

		Portal result = fixture.getPortal(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_7()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;

		Portal result = fixture.getPortal(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_8()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;

		Portal result = fixture.getPortal(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_9()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;

		Portal result = fixture.getPortal(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Portal getPortal(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortal_10()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;

		Portal result = fixture.getPortal(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the List<Portal> getPortals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortals_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		List<Portal> result = fixture.getPortals();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@44bafc0e
		assertNotNull(result);
	}

	/**
	 * Run the List<Portal> getPortals(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortals_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(null);
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		int z = 1;

		List<Portal> result = fixture.getPortals(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the List<Portal> getPortals(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortals_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		int z = 1;

		List<Portal> result = fixture.getPortals(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the List<Portal> getPortals(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortals_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		int z = 1;

		List<Portal> result = fixture.getPortals(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@108b90e
		assertNotNull(result);
	}

	/**
	 * Run the List<Portal> getPortals(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortals_5()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		int z = 1;

		List<Portal> result = fixture.getPortals(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6662b737
		assertNotNull(result);
	}

	/**
	 * Run the List<Portal> getPortals(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortals_6()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		int z = 1;

		List<Portal> result = fixture.getPortals(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5398b32a
		assertNotNull(result);
	}

	/**
	 * Run the List<Portal> getPortals(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPortals_7()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		int z = 1;

		List<Portal> result = fixture.getPortals(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@37f0c0b1
		assertNotNull(result);
	}

	/**
	 * Run the float[][] getShadownMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetShadownMap_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		float[][] result = fixture.getShadownMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6ea233ff
		assertNotNull(result);
	}

	/**
	 * Run the boolean getShowavatar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetShowavatar_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		boolean result = fixture.getShowavatar();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@673c4907
		assertTrue(result);
	}

	/**
	 * Run the boolean getShowavatar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetShowavatar_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(false);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		boolean result = fixture.getShowavatar();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2ed25c2c
		assertTrue(result);
	}

	/**
	 * Run the Shrine getShrine() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetShrine_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		Shrine result = fixture.getShrine();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1588ecb5
		assertNotNull(result);
	}

	/**
	 * Run the Stage getSurfaceMapStage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetSurfaceMapStage_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		Stage result = fixture.getSurfaceMapStage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@676b7796
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(Vector3) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Vector3 v = new Vector3();
		v.set(1, 1, 1.0f);

		Tile result = fixture.getTile(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7c90275c
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = -1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4efbd2
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = -1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@41710be8
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5dff83da
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_5()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3e7cd4ae
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_6()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5224d987
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_7()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7edff73a
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_8()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@464f8d3a
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_9()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4727a058
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_10()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@636aa66
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_11()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@281d6939
		assertNotNull(result);
	}

	/**
	 * Run the Tile getTile(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTile_12()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage((Stage) null);
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		Tile result = fixture.getTile(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@454f9b8e
		assertNotNull(result);
	}

	/**
	 * Run the String getTilemap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTilemap_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		String result = fixture.getTilemap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2c8fcd2
		assertNotNull(result);
	}

	/**
	 * Run the Tile[] getTiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTiles_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		Tile[] result = fixture.getTiles();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@63bfae6c
		assertNotNull(result);
	}

	/**
	 * Run the String getTileset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTileset_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		String result = fixture.getTileset();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2e410f91
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.MapType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		ultima.Constants.MapType result = fixture.getType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@15fac63f
		assertNotNull(result);
	}

	/**
	 * Run the int getValidMovesMask(Context,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetValidMovesMask_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Context context = new Context();
		int x = 1;
		int y = 1;

		int result = fixture.getValidMovesMask(context, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3a6b8197
		assertEquals(0, result);
	}

	/**
	 * Run the int getValidMovesMask(Context,int,int,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetValidMovesMask_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Context context = new Context();
		int x = 1;
		int y = 1;
		Creature cr = new Creature();
		int avatarX = 1;
		int avatarY = 1;

		int result = fixture.getValidMovesMask(context, x, y, cr, avatarX, avatarY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7acf73d7
		assertEquals(0, result);
	}

	/**
	 * Run the int getValidMovesMask(Context,int,int,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetValidMovesMask_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Context context = new Context();
		int x = 1;
		int y = 1;
		Creature cr = new Creature();
		int avatarX = 1;
		int avatarY = 1;

		int result = fixture.getValidMovesMask(context, x, y, cr, avatarX, avatarY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7f614856
		assertEquals(0, result);
	}

	/**
	 * Run the int getValidMovesMask(Context,int,int,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetValidMovesMask_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Context context = new Context();
		int x = 1;
		int y = 1;
		Creature cr = new Creature();
		int avatarX = 1;
		int avatarY = 1;

		int result = fixture.getValidMovesMask(context, x, y, cr, avatarX, avatarY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@28d60356
		assertEquals(0, result);
	}

	/**
	 * Run the int getWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetWidth_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		int result = fixture.getWidth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@748fdf55
		assertEquals(0, result);
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7ff78e87
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7d7df88
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@25eac2ac
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@cc851db
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_5()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(0);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity((City) null);
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@70833a11
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_6()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22ecec4b
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_7()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@405550a0
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_8()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@696ca169
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_9()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1bdd9c7a
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_10()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3042ea8a
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_11()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@631a98b8
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_12()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3552f894
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_13()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3032c490
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_14()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3cc71905
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_15()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@53c45704
	}

	/**
	 * Run the void initObjects(GameScreen,TextureAtlas,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testInitObjects_16()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity((City) null);
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(0);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		GameScreen screen = new GameScreen(new Ultima4());
		TextureAtlas atlas1 = new TextureAtlas();
		TextureAtlas atlas2 = new TextureAtlas();

		fixture.initObjects(screen, atlas1, atlas2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4a94bdd1
	}

	/**
	 * Run the boolean isDoorOpen(DoorStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsDoorOpen_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		BaseMap.DoorStatus ds = null;

		boolean result = fixture.isDoorOpen(ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b2ba3ec
		assertTrue(result);
	}

	/**
	 * Run the boolean isDoorOpen(DoorStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsDoorOpen_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		BaseMap.DoorStatus ds = null;

		boolean result = fixture.isDoorOpen(ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3931c922
		assertTrue(result);
	}

	/**
	 * Run the boolean isDoorOpen(DoorStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsDoorOpen_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		BaseMap.DoorStatus ds = null;

		boolean result = fixture.isDoorOpen(ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7b5ce1ab
		assertTrue(result);
	}

	/**
	 * Run the boolean isDoorOpen(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsDoorOpen_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		boolean result = fixture.isDoorOpen(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5f8ef386
		assertTrue(result);
	}

	/**
	 * Run the boolean isDoorOpen(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsDoorOpen_5()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		boolean result = fixture.isDoorOpen(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@11a634c2
		assertTrue(result);
	}

	/**
	 * Run the boolean isDoorOpen(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsDoorOpen_6()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		boolean result = fixture.isDoorOpen(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@c7054e5
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileBlockedForRangedAttack(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsTileBlockedForRangedAttack_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		boolean checkForCreatures = false;

		boolean result = fixture.isTileBlockedForRangedAttack(x, y, checkForCreatures);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7c6a2d3d
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileBlockedForRangedAttack(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsTileBlockedForRangedAttack_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		boolean checkForCreatures = true;

		boolean result = fixture.isTileBlockedForRangedAttack(x, y, checkForCreatures);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@35a596f
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileBlockedForRangedAttack(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsTileBlockedForRangedAttack_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		boolean checkForCreatures = true;

		boolean result = fixture.isTileBlockedForRangedAttack(x, y, checkForCreatures);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@54d1ce48
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileBlockedForRangedAttack(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsTileBlockedForRangedAttack_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		boolean checkForCreatures = true;

		boolean result = fixture.isTileBlockedForRangedAttack(x, y, checkForCreatures);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6efc84c6
		assertTrue(result);
	}

	/**
	 * Run the boolean isTileBlockedForRangedAttack(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsTileBlockedForRangedAttack_5()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;
		boolean checkForCreatures = true;

		boolean result = fixture.isTileBlockedForRangedAttack(x, y, checkForCreatures);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@37b09d76
		assertTrue(result);
	}

	/**
	 * Run the boolean openDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testOpenDoor_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		boolean result = fixture.openDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1a30be6f
		assertTrue(result);
	}

	/**
	 * Run the boolean openDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testOpenDoor_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		boolean result = fixture.openDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@63ca1b24
		assertTrue(result);
	}

	/**
	 * Run the boolean openDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testOpenDoor_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		boolean result = fixture.openDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5bd66f45
		assertTrue(result);
	}

	/**
	 * Run the void removeCreature(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveCreature_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Creature cr = null;

		fixture.removeCreature(cr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2db95aa3
	}

	/**
	 * Run the void removeCreature(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveCreature_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Creature cr = new Creature();

		fixture.removeCreature(cr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1770ca92
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity((City) null);
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@79a3f5c9
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@25befa60
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@525e2e87
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@742d8aa2
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_5()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2a2778e7
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_6()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5aaacaa
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_7()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b0e082c
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_8()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@70a380f
	}

	/**
	 * Run the void removeJoinedPartyMemberFromPeopleList(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testRemoveJoinedPartyMemberFromPeopleList_9()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());

		fixture.removeJoinedPartyMemberFromPeopleList(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@67085f79
	}

	/**
	 * Run the void setBorderbehavior(MapBorderBehavior) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetBorderbehavior_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		ultima.Constants.MapBorderBehavior borderbehavior = ultima.Constants.MapBorderBehavior.exit;

		fixture.setBorderbehavior(borderbehavior);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5fbdd189
	}

	/**
	 * Run the void setChunkHeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetChunkHeight_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int chunk_height = 1;

		fixture.setChunkHeight(chunk_height);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4f60701b
	}

	/**
	 * Run the void setChunkWidth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetChunkWidth_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int chunk_width = 1;

		fixture.setChunkWidth(chunk_width);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@58843926
	}

	/**
	 * Run the void setChunkheight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetChunkheight_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int chunkheight = 1;

		fixture.setChunkheight(chunkheight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1a00e438
	}

	/**
	 * Run the void setChunkwidth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetChunkwidth_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int chunkwidth = 1;

		fixture.setChunkwidth(chunkwidth);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@538ef42e
	}

	/**
	 * Run the void setCity(City) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetCity_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		City city = new City();

		fixture.setCity(city);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@78d9e16a
	}

	/**
	 * Run the void setCombatPlayers(List<PartyMember>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetCombatPlayers_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		List<Party.PartyMember> combatPlayers = new ArrayList();

		fixture.setCombatPlayers(combatPlayers);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@542a8209
	}

	/**
	 * Run the void setContextual(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetContextual_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		boolean contextual = true;

		fixture.setContextual(contextual);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4c81e417
	}

	/**
	 * Run the void setDungeon(Dungeon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetDungeon_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Dungeon dungeon = new Dungeon();

		fixture.setDungeon(dungeon);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@43df5e29
	}

	/**
	 * Run the void setFirstperson(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetFirstperson_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		boolean firstperson = true;

		fixture.setFirstperson(firstperson);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7126a524
	}

	/**
	 * Run the void setFname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetFname_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		String fname = "";

		fixture.setFname(fname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7e46488e
	}

	/**
	 * Run the void setHeight(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetHeight_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int height = 1;

		fixture.setHeight(height);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@71b96eb
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int id = 1;

		fixture.setId(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@b1d5d7a
	}

	/**
	 * Run the void setLabels(List<Label>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetLabels_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		List<Label> labels = new ArrayList();

		fixture.setLabels(labels);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1129fc1d
	}

	/**
	 * Run the void setLevels(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetLevels_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int levels = 1;

		fixture.setLevels(levels);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@153d5c87
	}

	/**
	 * Run the void setMoongates(List<Moongate>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetMoongates_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		List<Moongate> moongate = new ArrayList();

		fixture.setMoongates(moongate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@12e4dec5
	}

	/**
	 * Run the void setMusic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetMusic_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		String music = "";

		fixture.setMusic(music);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1f31d7a6
	}

	/**
	 * Run the void setNolineofsight(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetNolineofsight_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		boolean nolineofsight = true;

		fixture.setNolineofsight(nolineofsight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@52223893
	}

	/**
	 * Run the void setOffset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetOffset_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int offset = 1;

		fixture.setOffset(offset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2a8fa14a
	}

	/**
	 * Run the void setPortals(List<Portal>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetPortals_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		List<Portal> portals = new ArrayList();

		fixture.setPortals(portals);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@78cfe2a7
	}

	/**
	 * Run the void setShadownMap(float[][]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetShadownMap_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		float[][] shadownMap = new float[][] {};

		fixture.setShadownMap(shadownMap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@75ec886e
	}

	/**
	 * Run the void setShowavatar(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetShowavatar_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		boolean showavatar = true;

		fixture.setShowavatar(showavatar);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5eb41356
	}

	/**
	 * Run the void setShrine(Shrine) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetShrine_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Shrine shrine = new Shrine();

		fixture.setShrine(shrine);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@614ae484
	}

	/**
	 * Run the void setSurfaceMapStage(Stage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetSurfaceMapStage_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Stage surfaceMapStage = new Stage();

		fixture.setSurfaceMapStage(surfaceMapStage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3f3fe94f
	}

	/**
	 * Run the void setTile(Tile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetTile_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Tile tile = new Tile();
		int x = -1;
		int y = 1;

		fixture.setTile(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6c0e47e0
	}

	/**
	 * Run the void setTile(Tile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetTile_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Tile tile = new Tile();
		int x = 1;
		int y = -1;

		fixture.setTile(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5f28c688
	}

	/**
	 * Run the void setTile(Tile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetTile_3()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Tile tile = new Tile();
		int x = 1;
		int y = 1;

		fixture.setTile(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7219b2f3
	}

	/**
	 * Run the void setTile(Tile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetTile_4()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Tile tile = new Tile();
		int x = 1;
		int y = 1;

		fixture.setTile(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2144a7be
	}

	/**
	 * Run the void setTilemap(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetTilemap_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		String tilemap = "";

		fixture.setTilemap(tilemap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1cb9e57a
	}

	/**
	 * Run the void setTiles(Tile[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetTiles_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		Tile[] tiles = new Tile[] {};

		fixture.setTiles(tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7cd8b307
	}

	/**
	 * Run the void setTileset(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetTileset_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		String tileset = "";

		fixture.setTileset(tileset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5c0ef6fa
	}

	/**
	 * Run the void setType(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		ultima.Constants.MapType type = ultima.Constants.MapType.city;

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@21d7d3b0
	}

	/**
	 * Run the void setWidth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetWidth_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int width = 1;

		fixture.setWidth(width);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@174283
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testToString_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1c800698
		assertNotNull(result);
	}

	/**
	 * Run the boolean unlockDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testUnlockDoor_1()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		boolean result = fixture.unlockDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2c21e81c
		assertTrue(result);
	}

	/**
	 * Run the boolean unlockDoor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testUnlockDoor_2()
		throws Exception {
		BaseMap fixture = new BaseMap();
		fixture.setDungeon(new Dungeon());
		fixture.setChunkwidth(1);
		fixture.setChunkheight(1);
		fixture.setTiles(new Tile[] {});
		fixture.setId(1);
		fixture.setFirstperson(true);
		fixture.setFname("");
		fixture.setShowavatar(true);
		fixture.setMusic("");
		fixture.setLabels(new ArrayList());
		fixture.setContextual(true);
		fixture.setNolineofsight(true);
		fixture.setLevels(1);
		fixture.setShadownMap(new float[][] {});
		fixture.setTileset("");
		fixture.setCombatPlayers(new ArrayList());
		fixture.setHeight(1);
		fixture.setOffset(1);
		fixture.setMoongates(new ArrayList());
		fixture.setCity(new City());
		fixture.setSurfaceMapStage(new Stage());
		fixture.setType(ultima.Constants.MapType.city);
		fixture.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		fixture.setShrine(new Shrine());
		fixture.setTilemap("");
		fixture.setWidth(1);
		fixture.setPortals(new ArrayList());
		fixture.addCreature(new Creature());
		int x = 1;
		int y = 1;

		boolean result = fixture.unlockDoor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6344794d
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
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
	 * @generatedBy CodePro at 11/06/19 13:00
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
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BaseMapTest.class);
	}
}