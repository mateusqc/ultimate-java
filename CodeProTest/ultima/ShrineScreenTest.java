package ultima;

import java.util.Random;
import org.junit.*;
import objects.SaveGame;
import objects.Creature;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import objects.Party;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * The class <code>ShrineScreenTest</code> contains tests for the class <code>{@link ShrineScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:05
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ShrineScreenTest {
	/**
	 * Run the ShrineScreen(BaseScreen,Party,Virtue,TiledMap,TextureAtlas,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testShrineScreen_1()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Party party = new Party(new SaveGame());
		Constants.Virtue virtue = Constants.Virtue.COMPASSION;
		TiledMap tmap = new TiledMap();
		TextureAtlas a1 = new TextureAtlas();
		TextureAtlas a2 = new TextureAtlas();

		ShrineScreen result = new ShrineScreen(returnScreen, party, virtue, tmap, a1, a2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testFinishTurn_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
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
	 * Run the Vector3 getCurrentMapCoords() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetCurrentMapCoords_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();

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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testGetMapPixelCoords_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testHide_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();

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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testKeyUp_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
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
	 * Run the void meditate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testMeditate_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		int cycles = 1;

		fixture.meditate(cycles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void meditate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testMeditate_2()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		int cycles = 1;

		fixture.meditate(cycles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void meditate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testMeditate_3()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		int cycles = 1;

		fixture.meditate(cycles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void meditate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testMeditate_4()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		int cycles = 1;

		fixture.meditate(cycles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void meditate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testMeditate_5()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		int cycles = 1;

		fixture.meditate(cycles);

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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testPartyDeath_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();

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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testRender_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		float delta = 1.0f;

		fixture.render(delta);

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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testResize_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
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
	 * Run the void show() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testShow_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();

		fixture.show();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void showVision(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testShowVision_1()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		boolean elevated = false;

		fixture.showVision(elevated);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void showVision(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testShowVision_2()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		boolean elevated = false;

		fixture.showVision(elevated);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void showVision(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testShowVision_3()
		throws Exception {
		ShrineScreen fixture = new ShrineScreen(new GameScreen(new Ultima4()), new Party(new SaveGame()), Constants.Virtue.COMPASSION, new TiledMap(), new TextureAtlas(), new TextureAtlas());
		fixture.newMapPixelCoords = new Vector3();
		fixture.time = 1.0f;
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.mapPixelHeight = 1;
		fixture.rand = new Random();
		fixture.currentEncounter = new Creature();
		fixture.camera = new OrthographicCamera();
		fixture.showZstats = 1;
		fixture.context = new Context();
		fixture.stage = new Stage();
		fixture.currentMousePos = new Vector2();
		fixture.runeVisionAtlas = new TextureAtlas();
		fixture.viewport = new ScreenViewport();
		boolean elevated = true;

		fixture.showVision(elevated);

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
		new org.junit.runner.JUnitCore().run(ShrineScreenTest.class);
	}
}