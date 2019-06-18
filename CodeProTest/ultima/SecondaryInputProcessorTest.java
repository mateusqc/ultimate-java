package ultima;

import org.junit.*;
import objects.BaseMap;
import objects.CreatureSet;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * The class <code>SecondaryInputProcessorTest</code> contains tests for the class <code>{@link SecondaryInputProcessor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:05
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class SecondaryInputProcessorTest {
	/**
	 * Run the SecondaryInputProcessor(BaseScreen,Stage) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSecondaryInputProcessor_1()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Stage stage = new Stage();

		SecondaryInputProcessor result = new SecondaryInputProcessor(screen, stage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
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
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(48, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(48, new BaseMap(), 1, 1);
		int keycode = 19;

		boolean result = fixture.keyUp(keycode);

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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testKeyUp_2()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new CombatScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas()), new Stage());
		fixture.setinitialKeyCode(49, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(1, new BaseMap(), 1, 1);
		int keycode = 66;

		boolean result = fixture.keyUp(keycode);

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
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testKeyUp_3()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(29, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int keycode = 22;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void setinitialKeyCode(int,BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_1()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 48;
		BaseMap bm = new BaseMap();
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setinitialKeyCode(int,BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_2()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 43;
		BaseMap bm = new BaseMap();
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setinitialKeyCode(int,BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_3()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 38;
		BaseMap bm = new BaseMap();
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setinitialKeyCode(int,BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_4()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 40;
		BaseMap bm = new BaseMap();
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setinitialKeyCode(int,BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_5()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 29;
		BaseMap bm = new BaseMap();
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setinitialKeyCode(int,BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_6()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 51;
		BaseMap bm = new BaseMap();
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setinitialKeyCode(int,BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_7()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 46;
		BaseMap bm = new BaseMap();
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setinitialKeyCode(int,BaseMap,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_8()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 35;
		BaseMap bm = new BaseMap();
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, bm, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setinitialKeyCode(int,DungeonTile,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:05
	 */
	@Test
	public void testSetinitialKeyCode_9()
		throws Exception {
		SecondaryInputProcessor fixture = new SecondaryInputProcessor(new GameScreen(new Ultima4()), new Stage());
		fixture.setinitialKeyCode(1, Constants.DungeonTile.ALTAR, 1, 1);
		fixture.setinitialKeyCode(29, new BaseMap(), 1, 1);
		int k = 1;
		Constants.DungeonTile dngTile = Constants.DungeonTile.ALTAR;
		int x = 1;
		int y = 1;

		fixture.setinitialKeyCode(k, dngTile, x, y);

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
		new org.junit.runner.JUnitCore().run(SecondaryInputProcessorTest.class);
	}
}