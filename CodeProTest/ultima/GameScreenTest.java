package ultima;

import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import objects.Tile;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import objects.Party;
import util.UltimaMapRenderer;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import objects.Drawable;
import objects.BaseMap;
import objects.SaveGame;
import com.badlogic.gdx.utils.viewport.Viewport;
import objects.Creature;

/**
 * The class <code>GameScreenTest</code> contains tests for the class <code>{@link GameScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:12
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class GameScreenTest {
	/**
	 * Run the GameScreen(Ultima4) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGameScreen_1()
		throws Exception {
		Ultima4 mainGame = new Ultima4();

		GameScreen result = new GameScreen(mainGame);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void addBalloonActor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testAddBalloonActor_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.addBalloonActor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addBalloonActor(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testAddBalloonActor_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.addBalloonActor(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void attackAt(Maps,Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testAttackAt_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps combat = Constants.Maps.ABYSS;
		Creature cr = new Creature();
		cr.setTile(Constants.CreatureType.balron);

		fixture.attackAt(combat, cr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_7()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_8()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_9()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_10()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_11()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_12()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_13()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_14()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_15()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void board(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testBoard_16()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setLastShip(new Drawable(new BaseMap(), 1, 1, new Tile(), new TextureAtlas()));
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int x = 1;
		int y = 1;

		fixture.board(x, y);

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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		boolean isWon = false;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		boolean isWon = false;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		boolean isWon = false;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		boolean isWon = false;
		BaseMap combatMap = new BaseMap();
		boolean wounded = false;

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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		boolean isWon = false;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_7()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_8()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_9()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_10()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_11()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_12()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_13()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_14()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_15()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testEndCombat_16()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		fixture.attackAt(Constants.Maps.ABYSS, new Creature());
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_7()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_8()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_9()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_10()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_11()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_12()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_13()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_14()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_15()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testFinishTurn_16()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_7()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_8()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_9()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_10()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_11()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_12()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_13()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_14()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_15()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetChest_16()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetCurrentMapCoords_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetMapPixelCoords_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testGetPeerGemInputProcessor_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testHide_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		GameScreen.GameTimer gameScreen$GameTimer = new GameScreen(new Ultima4()).new GameTimer();
		gameScreen$GameTimer.active = true;
		fixture.gameTimer = gameScreen$GameTimer;
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.hide();

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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testKeyUp_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setCurrentMap(new BaseMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int keycode = 34;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void loadNextMap(Maps,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;

		fixture.loadNextMap(m, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = false;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_7()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_8()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = false;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_9()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_10()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = false;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_11()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_12()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = null;
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_13()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_14()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_15()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = false;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_16()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = true;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void loadNextMap(Maps,int,int,int,int,int,Direction,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testLoadNextMap_17()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Maps m = Constants.Maps.ABYSS;
		int x = 1;
		int y = 1;
		int dngx = 1;
		int dngy = 1;
		int dngLevel = 1;
		Constants.Direction orientation = Constants.Direction.EAST;
		boolean restoreSG = false;

		fixture.loadNextMap(m, x, y, dngx, dngy, dngLevel, orientation, restoreSG);

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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testPartyDeath_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.partyDeath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void peerGem() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testPeerGem_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.peerGem();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void peerGem() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testPeerGem_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.peerGem();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void peerTelescope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testPeerTelescope_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.peerTelescope();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void recalcFOV(BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRecalcFOV_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		BaseMap bm = new BaseMap();
		bm.setShadownMap(new float[][] {});
		int x = 1;
		int y = 1;

		fixture.recalcFOV(bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = null;
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setWindDirection(Constants.Direction.EAST);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setWindDirection(Constants.Direction.EAST);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setWindDirection(Constants.Direction.EAST);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setWindDirection(Constants.Direction.EAST);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setWindDirection(Constants.Direction.EAST);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_7()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setWindDirection(Constants.Direction.EAST);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_8()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setWindDirection(Constants.Direction.EAST);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_9()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_10()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_11()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_12()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_13()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_14()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_15()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testRender_16()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 0;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void replaceTile(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testReplaceTile_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		String name = null;
		int x = 1;
		int y = 1;

		fixture.replaceTile(name, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void replaceTile(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testReplaceTile_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setCurrentTiledMap(new TiledMap());
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		String name = "";
		int x = 1;
		int y = 1;

		fixture.replaceTile(name, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void resize(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testResize_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		int width = 1;
		int height = 1;

		fixture.resize(width, height);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_7()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_8()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_9()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_10()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_11()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useBBC(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseBBC_12()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;
		Constants.Item item = Constants.Item.BELL;

		fixture.useBBC(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useHorn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseHorn_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useHorn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useHorn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseHorn_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useHorn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useSkull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseSkull_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useSkull();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useSkull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseSkull_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useSkull();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useSkull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseSkull_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useSkull();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useSkull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseSkull_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useSkull();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useSkull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseSkull_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useSkull();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useSkull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseSkull_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useSkull();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useWheel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseWheel_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useWheel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useWheel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseWheel_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useWheel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useWheel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseWheel_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useWheel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useWheel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	@Test
	public void testUseWheel_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.moonAtlas = new TextureAtlas();
		fixture.mapBatch = new PolygonSpriteBatch();
		fixture.showZstats = 1;
		fixture.sip = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.camera = new OrthographicCamera();
		fixture.rand = new Random();
		fixture.mapObjectsStage = new Stage();
		fixture.moongateTextures = new Array();
		fixture.batch = new PolygonSpriteBatch();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.renderer = new UltimaMapRenderer(new Context(), new TextureAtlas(), new BaseMap(), new TiledMap(), 1.0f);
		fixture.gameTimer = new GameScreen(new Ultima4()).new GameTimer();
		fixture.map = new TiledMap();
		fixture.projectilesStage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.stage = new Stage();
		Context context = new Context();
		context.setTransportContext(Constants.TransportContext.ANY);
		context.setParty(new Party(new SaveGame()));
		fixture.context = context;
		fixture.viewport = new ScreenViewport();
		fixture.currentMousePos = new Vector2();
		fixture.time = 1.0f;

		fixture.useWheel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:12
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
	 * @generatedBy CodePro at 11/06/19 13:12
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
	 * @generatedBy CodePro at 11/06/19 13:12
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GameScreenTest.class);
	}
}