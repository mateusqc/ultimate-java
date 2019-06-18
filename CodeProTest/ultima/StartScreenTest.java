package ultima;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * The class <code>StartScreenTest</code> contains tests for the class <code>{@link StartScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:06
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class StartScreenTest {
	/**
	 * Run the StartScreen(Ultima4) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testStartScreen_1()
		throws Exception {
		Ultima4 mainGame = new Ultima4();

		StartScreen result = new StartScreen(mainGame);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
		assertNotNull(result);
	}

	/**
	 * Run the StartScreen(Ultima4) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testStartScreen_2()
		throws Exception {
		Ultima4 mainGame = new Ultima4();

		StartScreen result = new StartScreen(mainGame);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
		assertNotNull(result);
	}

	/**
	 * Run the StartScreen(Ultima4) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testStartScreen_3()
		throws Exception {
		Ultima4 mainGame = new Ultima4();

		StartScreen result = new StartScreen(mainGame);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
		assertNotNull(result);
	}

	/**
	 * Run the StartScreen(Ultima4) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testStartScreen_4()
		throws Exception {
		Ultima4 mainGame = new Ultima4();

		StartScreen result = new StartScreen(mainGame);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
		assertNotNull(result);
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the boolean doQuestion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testDoQuestion_1()
		throws Exception {
		int answer = 0;

		boolean result = StartScreen.doQuestion(answer);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean doQuestion(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testDoQuestion_2()
		throws Exception {
		int answer = 1;

		boolean result = StartScreen.doQuestion(answer);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getQuestion(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testGetQuestion_1()
		throws Exception {
		int v1 = 1;
		int v2 = 1;

		String result = StartScreen.getQuestion(v1, v2);

		// add additional test code here
		assertEquals("Thy Lord mistakenly believes he slew a dragon.  Thou hast proof that thy lance felled the beast.  When asked, \nDost thou A) Honestly claim the kill and the prize, or B) Humbly permit thy Lord his belief?", result);
	}

	/**
	 * Run the String getQuestion(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testGetQuestion_2()
		throws Exception {
		int v1 = 0;
		int v2 = 1;

		String result = StartScreen.getQuestion(v1, v2);

		// add additional test code here
		assertEquals("Entrusted to deliver an uncounted purse of gold, thou Dost meet a poor beggar. \nDost thou A) deliver the gold knowing the Trust in thee was well placed, or B) show Compassion, giving the beggar a coin, knowing it won't be missed?", result);
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();

		fixture.hide();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void initQuestionTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testInitQuestionTree_1()
		throws Exception {

		StartScreen.initQuestionTree();

		// add additional test code here
	}

	/**
	 * Run the void initQuestionTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testInitQuestionTree_2()
		throws Exception {

		StartScreen.initQuestionTree();

		// add additional test code here
	}

	/**
	 * Run the void initQuestionTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testInitQuestionTree_3()
		throws Exception {

		StartScreen.initQuestionTree();

		// add additional test code here
	}

	/**
	 * Run the void initQuestionTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testInitQuestionTree_4()
		throws Exception {

		StartScreen.initQuestionTree();

		// add additional test code here
	}

	/**
	 * Run the void initQuestionTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testInitQuestionTree_5()
		throws Exception {

		StartScreen.initQuestionTree();

		// add additional test code here
	}

	/**
	 * Run the void initQuestionTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testInitQuestionTree_6()
		throws Exception {

		StartScreen.initQuestionTree();

		// add additional test code here
	}

	/**
	 * Run the void initQuestionTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testInitQuestionTree_7()
		throws Exception {

		StartScreen.initQuestionTree();

		// add additional test code here
	}

	/**
	 * Run the void initQuestionTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testInitQuestionTree_8()
		throws Exception {

		StartScreen.initQuestionTree();

		// add additional test code here
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int keycode = 1;

		boolean result = fixture.keyDown(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		char character = '';

		boolean result = fixture.keyTyped(character);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int keycode = 38;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
	public void testKeyUp_2()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int keycode = 38;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
	public void testKeyUp_3()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int keycode = 1;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
	public void testKeyUp_4()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int keycode = 37;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
		assertTrue(result);
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int screenX = 1;
		int screenY = 1;

		boolean result = fixture.mouseMoved(screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();

		fixture.pause();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_3()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_4()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_5()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 23;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_6()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_7()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 21;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_8()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 20;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_9()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 17;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_10()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 15;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_11()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 11;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_12()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 6;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_13()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 0;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_14()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_15()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testRender_16()
		throws Exception {
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int width = 1;
		int height = 1;

		fixture.resize(width, height);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();

		fixture.resume();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int amount = 1;

		boolean result = fixture.scrolled(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
		assertTrue(result);
	}

	/**
	 * Run the void setAbacusBeads(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testSetAbacusBeads_1()
		throws Exception {
		int row = 1;
		int selectedVirtue = 1;
		int rejectedVirtue = 1;

		StartScreen.setAbacusBeads(row, selectedVirtue, rejectedVirtue);

		// add additional test code here
	}

	/**
	 * Run the void setAbacusBeads(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testSetAbacusBeads_2()
		throws Exception {
		int row = 1;
		int selectedVirtue = 1;
		int rejectedVirtue = 1;

		StartScreen.setAbacusBeads(row, selectedVirtue, rejectedVirtue);

		// add additional test code here
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();

		fixture.show();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int screenX = 1;
		int screenY = 1;
		int pointer = 1;
		int button = 1;

		boolean result = fixture.touchDown(screenX, screenY, pointer, button);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int screenX = 1;
		int screenY = 1;
		int pointer = 1;

		boolean result = fixture.touchDragged(screenX, screenY, pointer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
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
		StartScreen fixture = new StartScreen(new Ultima4());
		fixture.beast2 = new Animation(1.0f, new Array());
		fixture.GYP_PLACES_FIRST = 1;
		fixture.beast1 = new Animation(1.0f, new Array());
		fixture.camera = new OrthographicCamera();
		fixture.GYP_PLACES_TWOMORE = 1;
		fixture.GYP_SEGUE1 = 1;
		fixture.splashRenderer = new OrthogonalTiledMapRenderer(new TiledMap());
		fixture.storyInd = 1;
		fixture.GYP_SEGUE2 = 1;
		fixture.currentQuestion = "";
		fixture.dia = new StartScreen(new Ultima4()).new DoneInputAdapter();
		fixture.batch = new PolygonSpriteBatch();
		fixture.viewPort = new ScreenViewport();
		fixture.splashMap = new TiledMap();
		fixture.title = new Texture("");
		fixture.GYP_PLACES_LAST = 1;
		fixture.animator = null;
		fixture.nia = new StartScreen(new Ultima4()).new NameInputAdapter();
		fixture.time = 1.0f;
		fixture.state = StartScreen.State.ASK_NAME;
		fixture.stage = new Stage();
		fixture.stia = new StartScreen(new Ultima4()).new StoryInputAdapter();
		fixture.journey = new TextButton("", new Skin());
		fixture.sia = new StartScreen(new Ultima4()).new SexInputAdapter();
		fixture.pauseFlag = true;
		fixture.GYP_UPON_TABLE = 1;
		fixture.storyTexture = new TextureRegion();
		fixture.nameBuffer = new StringBuilder();
		fixture.font = new BitmapFont();
		fixture.sexBuffer = new StringBuilder();
		fixture.init = new TextButton("", new Skin());
		fixture.qia = new StartScreen(new Ultima4()).new QuestionInputAdapter();
		int screenX = 1;
		int screenY = 1;
		int pointer = 1;
		int button = 1;

		boolean result = fixture.touchUp(screenX, screenY, pointer, button);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.StartScreen.<init>(StartScreen.java:123)
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(StartScreenTest.class);
	}
}