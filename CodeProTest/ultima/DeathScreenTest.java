package ultima;

import java.util.Random;
import org.junit.*;
import objects.SaveGame;
import objects.Creature;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import objects.Party;

/**
 * The class <code>DeathScreenTest</code> contains tests for the class <code>{@link DeathScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:06
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class DeathScreenTest {
	/**
	 * Run the DeathScreen(BaseScreen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testDeathScreen_1()
		throws Exception {
		BaseScreen retScreen = new GameScreen(new Ultima4());
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);

		DeathScreen result = new DeathScreen(retScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the DeathScreen(BaseScreen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testDeathScreen_2()
		throws Exception {
		BaseScreen retScreen = new GameScreen(new Ultima4());
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);

		DeathScreen result = new DeathScreen(retScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testFinishTurn_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		DeathScreen fixture = new DeathScreen(new GameScreen(new Ultima4()), party);
		fixture.time = 1.0f;
		fixture.font = new BitmapFont();
		fixture.currentMousePos = new Vector2();
		fixture.showZstats = 1;
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.context = new Context();
		fixture.batch = new PolygonSpriteBatch();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.viewport = new ScreenViewport();
		fixture.initTime = 1L;
		fixture.newMapPixelCoords = new Vector3();
		fixture.rand = new Random();
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the Vector3 getCurrentMapCoords() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testGetCurrentMapCoords_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		DeathScreen fixture = new DeathScreen(new GameScreen(new Ultima4()), party);
		fixture.time = 1.0f;
		fixture.font = new BitmapFont();
		fixture.currentMousePos = new Vector2();
		fixture.showZstats = 1;
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.context = new Context();
		fixture.batch = new PolygonSpriteBatch();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.viewport = new ScreenViewport();
		fixture.initTime = 1L;
		fixture.newMapPixelCoords = new Vector3();
		fixture.rand = new Random();

		Vector3 result = fixture.getCurrentMapCoords();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the Vector3 getMapPixelCoords(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testGetMapPixelCoords_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		DeathScreen fixture = new DeathScreen(new GameScreen(new Ultima4()), party);
		fixture.time = 1.0f;
		fixture.font = new BitmapFont();
		fixture.currentMousePos = new Vector2();
		fixture.showZstats = 1;
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.context = new Context();
		fixture.batch = new PolygonSpriteBatch();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.viewport = new ScreenViewport();
		fixture.initTime = 1L;
		fixture.newMapPixelCoords = new Vector3();
		fixture.rand = new Random();
		int x = 1;
		int y = 1;

		Vector3 result = fixture.getMapPixelCoords(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the void partyDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testPartyDeath_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		DeathScreen fixture = new DeathScreen(new GameScreen(new Ultima4()), party);
		fixture.time = 1.0f;
		fixture.font = new BitmapFont();
		fixture.currentMousePos = new Vector2();
		fixture.showZstats = 1;
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.context = new Context();
		fixture.batch = new PolygonSpriteBatch();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.viewport = new ScreenViewport();
		fixture.initTime = 1L;
		fixture.newMapPixelCoords = new Vector3();
		fixture.rand = new Random();

		fixture.partyDeath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		DeathScreen fixture = new DeathScreen(new GameScreen(new Ultima4()), party);
		fixture.time = 1.0f;
		fixture.font = new BitmapFont();
		fixture.currentMousePos = new Vector2();
		fixture.showZstats = 1;
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.context = new Context();
		fixture.batch = new PolygonSpriteBatch();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.viewport = new ScreenViewport();
		fixture.initTime = 1L;
		fixture.newMapPixelCoords = new Vector3();
		fixture.rand = new Random();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		DeathScreen fixture = new DeathScreen(new GameScreen(new Ultima4()), party);
		fixture.time = 1.0f;
		fixture.font = new BitmapFont();
		fixture.currentMousePos = new Vector2();
		fixture.showZstats = 1;
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.context = new Context();
		fixture.batch = new PolygonSpriteBatch();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.viewport = new ScreenViewport();
		fixture.initTime = 1L;
		fixture.newMapPixelCoords = new Vector3();
		fixture.rand = new Random();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
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
	 * @generatedBy CodePro at 11/06/19 13:06
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
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DeathScreenTest.class);
	}
}