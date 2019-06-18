package ultima;

import java.util.ArrayList;
import java.util.List;
import objects.Party;
import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import util.CodexLogDisplay;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import objects.SaveGame;
import com.badlogic.gdx.graphics.g3d.Renderable;
import objects.Creature;
import com.badlogic.gdx.graphics.g3d.environment.PointLight;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * The class <code>CodexScreenTest</code> contains tests for the class <code>{@link CodexScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:01
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class CodexScreenTest {
	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_1()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_2()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_3()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_4()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_5()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_6()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_7()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_8()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_9()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_10()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_11()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_12()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_13()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_14()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_15()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		Party party = new Party(new SaveGame());

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.scenes.scene2d.Stage.<init>(Stage.java:92)
		//       at ultima.CodexScreen.<init>(CodexScreen.java:144)
		assertNotNull(result);
	}

	/**
	 * Run the CodexScreen(Screen,Party) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCodexScreen_16()
		throws Exception {
		Screen returnScreen = new ScreenAdapter();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);

		CodexScreen result = new CodexScreen(returnScreen, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the ModelInstance createPolygonBox(Color,float,float,float,float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testCreatePolygonBox_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
		Color color = new Color();
		float width = 1.0f;
		float height = 1.0f;
		float length = 1.0f;
		float rotation = 1.0f;
		float x = 1.0f;
		float y = 1.0f;
		float z = 1.0f;

		ModelInstance result = fixture.createPolygonBox(color, width, height, length, rotation, x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testDispose_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testDispose_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testDispose_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testFinishTurn_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testGetCurrentMapCoords_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();

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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testGetMapPixelCoords_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
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
	 * Run the void hide() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();

		fixture.hide();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testKeyUp_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
		int keycode = 1;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testKeyUp_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
		int keycode = 1;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testKeyUp_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
		int keycode = 1;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the void partyDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testPartyDeath_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();

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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testRender_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testRender_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testRender_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testRender_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void show() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testShow_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		CodexScreen fixture = new CodexScreen(new ScreenAdapter(), party);
		fixture.newMapPixelCoords = new Vector3();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.returnScreen = new GameScreen(new Ultima4());
		fixture.inputController = new CameraInputController(new OrthographicCamera());
		fixture.time = 1.0f;
		fixture.logs = new CodexLogDisplay(new BitmapFont());
		fixture.assets = new AssetManager();
		fixture.rand = new Random();
		fixture.fixedLight = new PointLight();
		fixture.environment = new Environment();
		fixture.altarModel = new Model();
		fixture.context = new Context();
		fixture.viewport = new ScreenViewport();
		fixture.mapPixelHeight = 1;
		fixture.currentEncounter = new Creature();
		fixture.font = new BitmapFont();
		fixture.currentPos = new Vector3();
		fixture.camera = new OrthographicCamera();
		fixture.stage = new Stage();
		fixture.lightFactor = 1.0f;
		fixture.pLight = new Renderable();
		fixture.modelBatch = new ModelBatch();
		fixture.showZstats = 1;
		fixture.floor = new ArrayList();
		fixture.axesModel = new Model();
		fixture.axesInstance = new ModelInstance(new Model());
		fixture.codexQuestionCount = 1;
		fixture.avatarModel = new Model();
		fixture.lightModel = new Model();
		fixture.state = CodexScreen.State.codexQuestions;
		fixture.modelInstances = new ArrayList();
		fixture.currentMousePos = new Vector2();

		fixture.show();

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
	 * @generatedBy CodePro at 11/06/19 13:01
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
	 * @generatedBy CodePro at 11/06/19 13:01
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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodexScreenTest.class);
	}
}