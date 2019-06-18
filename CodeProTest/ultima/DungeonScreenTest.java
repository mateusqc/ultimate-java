package ultima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import objects.BaseMap;
import com.badlogic.gdx.graphics.g3d.Renderable;
import objects.Creature;
import com.badlogic.gdx.graphics.g3d.environment.PointLight;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import util.DungeonTileModelInstance;

/**
 * The class <code>DungeonScreenTest</code> contains tests for the class <code>{@link DungeonScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:11
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class DungeonScreenTest {
	/**
	 * Run the DungeonScreen(GameScreen,Context,Maps) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonScreen_1()
		throws Exception {
		GameScreen gameScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		Constants.Maps map = Constants.Maps.ABYSS;

		DungeonScreen result = new DungeonScreen(gameScreen, context, map);

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_5()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_6()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_7()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_8()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_9()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_10()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_11()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_12()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_13()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_14()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_15()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testAddBlock_16()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int level = 1;
		Constants.DungeonTile tile = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testBattleWandering_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testBattleWandering_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Creature cr = new Creature();
		cr.setTile(Constants.CreatureType.balron);
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
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_5()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_6()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_7()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_8()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_9()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_10()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_11()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_12()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_13()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_14()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_15()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void createMiniMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testCreateMiniMap_16()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.createMiniMap();

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.dispose();

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDispose_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.dispose();

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDispose_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.dispose();

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDispose_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_5()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_6()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_7()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_8()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_9()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_10()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_11()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonDrinkFountain_12()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		Constants.DungeonTile type = Constants.DungeonTile.ALTAR;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_5()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_6()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_7()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_8()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_9()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_10()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_11()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_12()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_13()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_14()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_15()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testDungeonTouchOrb_16()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
		int index = 1;

		fixture.dungeonTouchOrb(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void enterRoom(RoomLocater,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testEnterRoom_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		DungeonScreen.RoomLocater loc = null;
		Constants.Direction entryDir = Constants.Direction.EAST;

		fixture.enterRoom(loc, entryDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void enterRoom(RoomLocater,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testEnterRoom_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		DungeonScreen.RoomLocater loc = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new RoomLocater(1, 1, 1, new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1));
		Constants.Direction entryDir = Constants.Direction.EAST;

		fixture.enterRoom(loc, entryDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void enterRoom(RoomLocater,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testEnterRoom_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		DungeonScreen.RoomLocater loc = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new RoomLocater(1, 1, 1, new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1));
		Constants.Direction entryDir = Constants.Direction.EAST;

		fixture.enterRoom(loc, entryDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void enterRoom(RoomLocater,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testEnterRoom_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		DungeonScreen.RoomLocater loc = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new RoomLocater(1, 1, 1, new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1));
		Constants.Direction entryDir = Constants.Direction.EAST;

		fixture.enterRoom(loc, entryDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void enterRoom(RoomLocater,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testEnterRoom_5()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		DungeonScreen.RoomLocater loc = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new RoomLocater(1, 1, 1, new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1));
		Constants.Direction entryDir = Constants.Direction.EAST;

		fixture.enterRoom(loc, entryDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void enterRoom(RoomLocater,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testEnterRoom_6()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		DungeonScreen.RoomLocater loc = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new RoomLocater(1, 1, 1, new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1));
		Constants.Direction entryDir = Constants.Direction.EAST;

		fixture.enterRoom(loc, entryDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void enterRoom(RoomLocater,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testEnterRoom_7()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		DungeonScreen.RoomLocater loc = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new RoomLocater(1, 1, 1, new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1));
		Constants.Direction entryDir = Constants.Direction.EAST;

		fixture.enterRoom(loc, entryDir);

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testFinishTurn_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testFinishTurn_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_5()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_6()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_7()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_8()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_9()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_10()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {null};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_11()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_12()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_13()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_14()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_15()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetChest_16()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetCurrentMapCoords_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testGetMapPixelCoords_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * Run the void hide() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testHide_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

		fixture.hide();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void moveMiniMapIcon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testMoveMiniMapIcon_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;

		fixture.moveMiniMapIcon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void partyDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testPartyDeath_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = false;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = false;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = false;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_5()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = false;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_6()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_7()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = false;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_8()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_9()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = false;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRender_10()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = false;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 0;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		Renderable renderable = new Renderable();
		renderable.material = new Material();
		fixture.pLight = renderable;
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.currentPos = vector3;
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRestoreSaveGameLocation_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		Constants.Direction orientation = Constants.Direction.EAST;

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRestoreSaveGameLocation_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		Constants.Direction orientation = Constants.Direction.EAST;

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRestoreSaveGameLocation_3()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		Constants.Direction orientation = Constants.Direction.EAST;

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRestoreSaveGameLocation_4()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		Constants.Direction orientation = Constants.Direction.EAST;

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testRestoreSaveGameLocation_5()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
		int x = 1;
		int y = 1;
		int z = 1;
		Constants.Direction orientation = Constants.Direction.EAST;

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testShow_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();

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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testValidTeleportLocation_1()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	@Test
	public void testValidTeleportLocation_2()
		throws Exception {
		DungeonScreen fixture = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		fixture.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		fixture.battleWandering(new Creature(), 1, 1);
		fixture.showMiniMap = true;
		fixture.environment = new Environment();
		fixture.isTorchOn = true;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.orbModel = new Model();
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.blocksModel = new Model();
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.stage = new Stage();
		fixture.fountainModel = new Model();
		fixture.rooms = new DungeonScreen.DungeonRoom[] {};
		fixture.locaters = new ArrayList();
		fixture.lightModel = new Model();
		fixture.viewport = new ScreenViewport();
		fixture.altarModel = new Model();
		fixture.assets = new AssetManager();
		fixture.currentMousePos = new Vector2();
		fixture.ceiling = new ArrayList();
		fixture.time = 1.0f;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.floor = new ArrayList();
		fixture.showZstats = 1;
		fixture.modelInstances = new ArrayList();
		fixture.ladderModel = new Model();
		fixture.lightFactor = 1.0f;
		fixture.newMapPixelCoords = new Vector3();
		fixture.chestModel = new Model();
		fixture.camera = new OrthographicCamera();
		fixture.dungeonTiles = new Constants.DungeonTile[][][] {};
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.fixedLight = new PointLight();
		fixture.currentPos = new Vector3();
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
	 * @generatedBy CodePro at 11/06/19 13:11
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
	 * @generatedBy CodePro at 11/06/19 13:11
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
	 * @generatedBy CodePro at 11/06/19 13:11
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DungeonScreenTest.class);
	}
}