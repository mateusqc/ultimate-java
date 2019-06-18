package util;

import org.junit.*;
import ultima.GameScreen;
import ultima.Context;
import ultima.DungeonScreen;
import ultima.Ultima4;
import ultima.Constants;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;

/**
 * The class <code>DungeonRoomTiledMapLoaderTest</code> contains tests for the class <code>{@link DungeonRoomTiledMapLoader}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class DungeonRoomTiledMapLoaderTest {
	/**
	 * Run the DungeonRoomTiledMapLoader(DungeonRoom,Direction,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testDungeonRoomTiledMapLoader_1()
		throws Exception {
		ultima.DungeonScreen.DungeonRoom room = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1);
		ultima.Constants.Direction entryDir = ultima.Constants.Direction.EAST;
		TextureAtlas atlas = new TextureAtlas();

		DungeonRoomTiledMapLoader result = new DungeonRoomTiledMapLoader(room, entryDir, atlas);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		DungeonRoomTiledMapLoader fixture = new DungeonRoomTiledMapLoader(new DungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1), ultima.Constants.Direction.EAST, new TextureAtlas());

		TiledMap result = fixture.load();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_2()
		throws Exception {
		DungeonRoomTiledMapLoader fixture = new DungeonRoomTiledMapLoader(new DungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1), ultima.Constants.Direction.EAST, new TextureAtlas());

		TiledMap result = fixture.load();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_3()
		throws Exception {
		DungeonRoomTiledMapLoader fixture = new DungeonRoomTiledMapLoader(new DungeonScreen(new GameScreen(new Ultima4()), new Context(), ultima.Constants.Maps.ABYSS).new DungeonRoom(new byte[] {}, 1), ultima.Constants.Direction.EAST, new TextureAtlas());

		TiledMap result = fixture.load();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
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
	 * @generatedBy CodePro at 11/06/19 13:17
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
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DungeonRoomTiledMapLoaderTest.class);
	}
}