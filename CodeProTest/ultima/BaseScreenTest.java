package ultima;

import java.util.Observable;
import java.util.Random;
import org.junit.*;
import objects.BaseMap;
import objects.Creature;
import static org.junit.Assert.*;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * The class <code>BaseScreenTest</code> contains tests for the class <code>{@link BaseScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:06
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class BaseScreenTest {
	/**
	 * Run the void addButtons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testAddButtons_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.addButtons();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addButtons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testAddButtons_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.addButtons();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addButtons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testAddButtons_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.addButtons();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addButtons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testAddButtons_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.addButtons();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void addButtons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testAddButtons_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.addButtons();

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
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.dispose();

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
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testEndCombat_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
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
	 * Run the InputProcessor getPeerGemInputProcessor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testGetPeerGemInputProcessor_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		InputProcessor result = fixture.getPeerGemInputProcessor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the Stage getStage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testGetStage_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		Stage result = fixture.getStage();

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
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testHide_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.hide();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the boolean keyDown(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testKeyDown_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		int keycode = 1;

		boolean result = fixture.keyDown(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyTyped(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testKeyTyped_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		char character = '';

		boolean result = fixture.keyTyped(character);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testKeyUp_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
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
	 * Run the void log(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testLog_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		String s = "";

		fixture.log(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void logAppend(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testLogAppend_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		String s = "";

		fixture.logAppend(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void logDeleteLastChar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testLogDeleteLastChar_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.logDeleteLastChar();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the boolean mouseMoved(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testMouseMoved_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		int screenX = 1;
		int screenY = 1;

		boolean result = fixture.mouseMoved(screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void pause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testPause_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.pause();

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
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
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
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testResize_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
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
	 * Run the void resume() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testResume_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.resume();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the boolean scrolled(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testScrolled_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		int amount = 1;

		boolean result = fixture.scrolled(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void show() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testShow_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();

		fixture.show();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the boolean touchDown(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testTouchDown_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		int screenX = 1;
		int screenY = 1;
		int pointer = 1;
		int button = 1;

		boolean result = fixture.touchDown(screenX, screenY, pointer, button);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean touchDragged(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testTouchDragged_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		int screenX = 1;
		int screenY = 1;
		int pointer = 1;

		boolean result = fixture.touchDragged(screenX, screenY, pointer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean touchUp(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testTouchUp_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		int screenX = 1;
		int screenY = 1;
		int pointer = 1;
		int button = 1;

		boolean result = fixture.touchUp(screenX, screenY, pointer, button);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_7()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_8()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_9()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_10()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_11()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_12()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_13()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void update(Observable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testUpdate_14()
		throws Exception {
		GameScreen fixture = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		fixture.attackAt(Constants.Maps.ABYSS, creature);
		fixture.currentMousePos = new Vector2();
		fixture.rand = new Random();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.stage = new Stage();
		fixture.mapPixelHeight = 1;
		fixture.camera = new OrthographicCamera();
		fixture.time = 1.0f;
		fixture.showZstats = 1;
		fixture.viewport = new ScreenViewport();
		fixture.context = new Context();
		Observable obs = new Observable();
		Object obj = new Object();

		fixture.update(obs, obj);

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
		new org.junit.runner.JUnitCore().run(BaseScreenTest.class);
	}
}