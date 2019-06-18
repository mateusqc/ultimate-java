package generator;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import ultima.GameScreen;
import static org.junit.Assert.*;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import util.DungeonTileModelInstance;
import objects.Creature;
import ultima.Context;
import ultima.Ultima4;
import ultima.BaseScreen;
import com.badlogic.gdx.graphics.g3d.environment.PointLight;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import ultima.Constants;
import ultima.SecondaryInputProcessor;
import objects.BaseMap;

/**
 * The class <code>StaticGeneratedDungeonScreenTest</code> contains tests for the class <code>{@link StaticGeneratedDungeonScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class StaticGeneratedDungeonScreenTest {
	/**
	 * Run the StaticGeneratedDungeonScreen(GameScreen,Context,Maps) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testStaticGeneratedDungeonScreen_1()
		throws Exception {
		GameScreen gameScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;

		StaticGeneratedDungeonScreen result = new StaticGeneratedDungeonScreen(gameScreen, context, map);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_6()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_7()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_8()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_9()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_10()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_11()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_12()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_13()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_14()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_15()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBlock(int,DungeonTile,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAddBlock_16()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int level = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		float tx = 1.0f;
		float ty = 1.0f;
		float tz = 1.0f;

		fixture.addBlock(level, tile, tx, ty, tz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void battleWandering(Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testBattleWandering_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		Creature cr = null;
		int x = 1;
		int y = 1;

		fixture.battleWandering(cr, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void battleWandering(Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testBattleWandering_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		Creature cr = new Creature();
		cr.setTile(ultima.Constants.CreatureType.balron);
		int x = 1;
		int y = 1;

		fixture.battleWandering(cr, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_6()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_7()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_8()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_9()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_10()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_11()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_12()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void checkTileAffects(DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCheckTileAffects_13()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.checkTileAffects(tile, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_6()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_7()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_8()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_9()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_10()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_11()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonDrinkFountain(DungeonTile,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonDrinkFountain_12()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		ultima.Constants.DungeonTile type = ultima.Constants.DungeonTile.ALTAR;
		int index = 1;

		fixture.dungeonDrinkFountain(type, index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 2, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 2, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 2, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 2, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_6()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 2, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_7()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_8()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_9()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 2, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_10()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_11()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_12()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 2, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_13()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_14()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_15()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 2, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void dungeonTouchOrb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testDungeonTouchOrb_16()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		combatMap.setType(ultima.Constants.MapType.city);
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		combatMap.setType(ultima.Constants.MapType.city);
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		combatMap.setType(ultima.Constants.MapType.city);
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = true;
		BaseMap combatMap = new BaseMap();
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = true;
		BaseMap combatMap = new BaseMap();
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_6()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = true;
		BaseMap combatMap = new BaseMap();
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_7()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering((Creature) null, 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		combatMap.setType(ultima.Constants.MapType.city);
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_8()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering((Creature) null, 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		combatMap.setType(ultima.Constants.MapType.city);
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_9()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering((Creature) null, 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		combatMap.setType(ultima.Constants.MapType.city);
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_10()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering((Creature) null, 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		combatMap.setType(ultima.Constants.MapType.city);
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_11()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering((Creature) null, 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		combatMap.setType(ultima.Constants.MapType.city);
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void endCombat(boolean,BaseMap,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testEndCombat_12()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering((Creature) null, 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		boolean isWon = true;
		BaseMap combatMap = new BaseMap();
		boolean wounded = true;

		fixture.endCombat(isWon, combatMap, wounded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testFinishTurn_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testFinishTurn_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_6()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_7()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_8()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_9()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_10()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {null};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_11()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_12()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_13()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_14()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_15()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetChest_16()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the Vector3 getCurrentMapCoords() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetCurrentMapCoords_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		Vector3 result = fixture.getCurrentMapCoords();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the Vector3 getMapPixelCoords(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetMapPixelCoords_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int x = 1;
		int y = 1;

		Vector3 result = fixture.getMapPixelCoords(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the InputProcessor getPeerGemInputProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetPeerGemInputProcessor_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		InputProcessor result = fixture.getPeerGemInputProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void hide() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testHide_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.hide();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_6()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_7()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_8()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_9()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_10()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_11()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_12()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_13()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_14()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {new Environment()};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {new TiledMapTileLayer(1, 1, 1, 1)};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_15()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_16()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testKeyUp_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int keycode = 1;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void partyDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testPartyDeath_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.partyDeath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = false;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = false;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = false;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_6()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = false;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_7()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_8()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = false;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRender_9()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void restoreSaveGameLocation(int,int,int,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRestoreSaveGameLocation_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		ultima.Constants.Direction orientation = ultima.Constants.Direction.EAST;

		fixture.restoreSaveGameLocation(x, y, z, orientation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void restoreSaveGameLocation(int,int,int,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRestoreSaveGameLocation_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		ultima.Constants.Direction orientation = ultima.Constants.Direction.EAST;

		fixture.restoreSaveGameLocation(x, y, z, orientation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void restoreSaveGameLocation(int,int,int,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRestoreSaveGameLocation_3()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		ultima.Constants.Direction orientation = ultima.Constants.Direction.EAST;

		fixture.restoreSaveGameLocation(x, y, z, orientation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void restoreSaveGameLocation(int,int,int,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRestoreSaveGameLocation_4()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		ultima.Constants.Direction orientation = ultima.Constants.Direction.EAST;

		fixture.restoreSaveGameLocation(x, y, z, orientation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void restoreSaveGameLocation(int,int,int,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRestoreSaveGameLocation_5()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		ultima.Constants.Direction orientation = ultima.Constants.Direction.EAST;

		fixture.restoreSaveGameLocation(x, y, z, orientation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void show() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testShow_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();

		fixture.show();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the boolean validTeleportLocation(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testValidTeleportLocation_1()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.validTeleportLocation(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean validTeleportLocation(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testValidTeleportLocation_2()
		throws Exception {
		StaticGeneratedDungeonScreen fixture = new StaticGeneratedDungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, ultima.Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.campfireModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.ladderModel = new Model();
		fixture.font = new BitmapFont();
		fixture.modelBatch = new ModelBatch();
		fixture.rocksModel = new Model();
		fixture.orbModel = new Model();
		fixture.scType = ultima.Constants.ScreenType.CODEX;
		fixture.dungeonTiles = new ultima.Constants.DungeonTile[][][] {};
		fixture.showMiniMap = true;
		fixture.assets = new AssetManager();
		fixture.modelInstances = new ArrayList();
		fixture.environment = new Environment[] {};
		fixture.fixedLight = new PointLight();
		fixture.fountainModel = new Model();
		fixture.chestModel = new Model();
		fixture.currentPos = new Vector3();
		fixture.mapTileIds = new String[] {};
		fixture.isTorchOn = true;
		fixture.layers = new TiledMapTileLayer[] {};
		fixture.altarModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.newMapPixelCoords = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.validTeleportLocation(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
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
	 * @generatedBy CodePro at 11/06/19 12:57
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
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StaticGeneratedDungeonScreenTest.class);
	}
}