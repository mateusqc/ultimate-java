package ultima;

import org.junit.*;
import objects.JournalEntries;
import static org.junit.Assert.*;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * The class <code>JournalScreenTest</code> contains tests for the class <code>{@link JournalScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:06
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class JournalScreenTest {
	/**
	 * Run the JournalScreen(Ultima4,BaseScreen,Skin,JournalEntries) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:06
	 */
	@Test
	public void testJournalScreen_1()
		throws Exception {
		Ultima4 mainGame = new Ultima4();
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Skin skin = new Skin();
		JournalEntries entries = new JournalEntries();

		JournalScreen result = new JournalScreen(mainGame, returnScreen, skin, entries);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
		int i = 1;

		boolean result = fixture.keyDown(i);

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
		char c = '';

		boolean result = fixture.keyTyped(c);

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
		int i = 1;

		boolean result = fixture.keyUp(i);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
		int i = 1;
		int i1 = 1;

		boolean result = fixture.mouseMoved(i, i1);

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
		int i = 1;

		boolean result = fixture.scrolled(i);

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
		int i = 1;
		int i1 = 1;
		int i2 = 1;
		int i3 = 1;

		boolean result = fixture.touchDown(i, i1, i2, i3);

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
		int i = 1;
		int i1 = 1;
		int i2 = 1;

		boolean result = fixture.touchDragged(i, i1, i2);

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
		JournalScreen fixture = new JournalScreen(new Ultima4(), new GameScreen(new Ultima4()), new Skin(), new JournalEntries());
		int i = 1;
		int i1 = 1;
		int i2 = 1;
		int i3 = 1;

		boolean result = fixture.touchUp(i, i1, i2, i3);

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
		new org.junit.runner.JUnitCore().run(JournalScreenTest.class);
	}
}