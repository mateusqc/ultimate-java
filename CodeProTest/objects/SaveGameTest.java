package objects;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.google.common.io.LittleEndianDataInputStream;

/**
 * The class <code>SaveGameTest</code> contains tests for the class <code>{@link SaveGame}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class SaveGameTest {
	/**
	 * Run the SaveGame() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testSaveGame_1()
		throws Exception {
		SaveGame result = new SaveGame();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String pc(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testPc_1()
		throws Exception {
		String s = "";

		String result = SaveGame.pc(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 1
		//       at java.lang.String.substring(Unknown Source)
		//       at objects.SaveGame.pc(SaveGame.java:537)
		assertNotNull(result);
	}

	/**
	 * Run the void read(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testRead_1()
		throws Exception {
		SaveGame fixture = new SaveGame();
		fixture.lastreagent = 1;
		fixture.lbintro = 1;
		fixture.stones = 1;
		fixture.location = 1;
		fixture.reagents = new int[] {};
		fixture.keys = 1;
		fixture.objects_save_y = new byte[] {};
		fixture.monster_save_y = new byte[] {};
		fixture.torches = 1;
		fixture.sextants = 1;
		fixture.gems = 1;
		fixture.shiphull = 1;
		fixture.objects_save_x = new byte[] {};
		fixture.orientation = 1;
		fixture.balloonx = 1;
		fixture.dngx = 1;
		fixture.y = 1;
		fixture.balloonfound = 1;
		fixture.monster_save_x = new byte[] {};
		fixture.monster_save_tileids = new byte[] {};
		fixture.mixtures = new int[] {};
		fixture.members = 1;
		fixture.lastmeditation = 1;
		fixture.zstatsBox = new Texture("");
		fixture.unknown1 = 1;
		fixture.lastcamp = 1;
		fixture.transport = 1;
		fixture.armor = new int[] {};
		fixture.x = 1;
		fixture.moves = 1;
		fixture.trammelphase = 1;
		fixture.runes = 1;
		fixture.items = 1;
		fixture.dnglevel = 1;
		fixture.gold = 1;
		fixture.feluccaphase = 1;
		fixture.balloony = 1;
		fixture.lastmask = 1;
		fixture.balloonstate = 1;
		fixture.lastrage = 1;
		fixture.lastvirtue = 1;
		fixture.karma = new int[] {};
		fixture.torchduration = 1;
		fixture.players = new SaveGame.SaveGamePlayerRecord[] {};
		fixture.objects_save_tileids = new byte[] {};
		fixture.dngy = 1;
		fixture.weapons = new int[] {};
		fixture.food = 1;
		String strFilePath = "";

		fixture.read(strFilePath);

		// add additional test code here
	}

	/**
	 * Run the void read(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testRead_2()
		throws Exception {
		SaveGame fixture = new SaveGame();
		fixture.lastreagent = 1;
		fixture.lbintro = 1;
		fixture.stones = 1;
		fixture.location = 1;
		fixture.reagents = new int[] {};
		fixture.keys = 1;
		fixture.objects_save_y = new byte[] {};
		fixture.monster_save_y = new byte[] {};
		fixture.torches = 1;
		fixture.sextants = 1;
		fixture.gems = 1;
		fixture.shiphull = 1;
		fixture.objects_save_x = new byte[] {};
		fixture.orientation = 1;
		fixture.balloonx = 1;
		fixture.dngx = 1;
		fixture.y = 1;
		fixture.balloonfound = 1;
		fixture.monster_save_x = new byte[] {};
		fixture.monster_save_tileids = new byte[] {};
		fixture.mixtures = new int[] {};
		fixture.members = 1;
		fixture.lastmeditation = 1;
		fixture.zstatsBox = new Texture("");
		fixture.unknown1 = 1;
		fixture.lastcamp = 1;
		fixture.transport = 1;
		fixture.armor = new int[] {};
		fixture.x = 1;
		fixture.moves = 1;
		fixture.trammelphase = 1;
		fixture.runes = 1;
		fixture.items = 1;
		fixture.dnglevel = 1;
		fixture.gold = 1;
		fixture.feluccaphase = 1;
		fixture.balloony = 1;
		fixture.lastmask = 1;
		fixture.balloonstate = 1;
		fixture.lastrage = 1;
		fixture.lastvirtue = 1;
		fixture.karma = new int[] {};
		fixture.torchduration = 1;
		fixture.players = new SaveGame.SaveGamePlayerRecord[] {};
		fixture.objects_save_tileids = new byte[] {};
		fixture.dngy = 1;
		fixture.weapons = new int[] {};
		fixture.food = 1;
		String strFilePath = "";

		fixture.read(strFilePath);

		// add additional test code here
	}

	/**
	 * Run the void renderZstats(int,BitmapFont,Batch,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRenderZstats_1()
		throws Exception {
		SaveGame fixture = new SaveGame();
		fixture.lastreagent = 1;
		fixture.lbintro = 1;
		fixture.stones = 1;
		fixture.location = 1;
		fixture.reagents = new int[] {};
		fixture.keys = 1;
		fixture.objects_save_y = new byte[] {};
		fixture.monster_save_y = new byte[] {};
		fixture.torches = 1;
		fixture.sextants = 1;
		fixture.gems = 1;
		fixture.shiphull = 1;
		fixture.objects_save_x = new byte[] {};
		fixture.orientation = 1;
		fixture.balloonx = 1;
		fixture.dngx = 1;
		fixture.y = 1;
		fixture.balloonfound = 1;
		fixture.monster_save_x = new byte[] {};
		fixture.monster_save_tileids = new byte[] {};
		fixture.mixtures = new int[] {};
		fixture.members = 1;
		fixture.lastmeditation = 1;
		fixture.zstatsBox = null;
		fixture.unknown1 = 1;
		fixture.lastcamp = 1;
		fixture.transport = 1;
		fixture.armor = new int[] {};
		fixture.x = 1;
		fixture.moves = 1;
		fixture.trammelphase = 1;
		fixture.runes = 1;
		fixture.items = 1;
		fixture.dnglevel = 1;
		fixture.gold = 1;
		fixture.feluccaphase = 1;
		fixture.balloony = 1;
		fixture.lastmask = 1;
		fixture.balloonstate = 1;
		fixture.lastrage = 1;
		fixture.lastvirtue = 1;
		fixture.karma = new int[] {};
		fixture.torchduration = 1;
		fixture.players = new SaveGame.SaveGamePlayerRecord[] {};
		fixture.objects_save_tileids = new byte[] {};
		fixture.dngy = 1;
		fixture.weapons = new int[] {};
		fixture.food = 1;
		int showZstats = 13;
		BitmapFont font = new BitmapFont();
		Batch batch = new PolygonSpriteBatch();
		int SCREEN_HEIGHT = 1;

		fixture.renderZstats(showZstats, font, batch, SCREEN_HEIGHT);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void renderZstats(int,BitmapFont,Batch,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testRenderZstats_2()
		throws Exception {
		SaveGame fixture = new SaveGame();
		fixture.lastreagent = 1;
		fixture.lbintro = 1;
		fixture.stones = 1;
		fixture.location = 1;
		fixture.reagents = new int[] {};
		fixture.keys = 1;
		fixture.objects_save_y = new byte[] {};
		fixture.monster_save_y = new byte[] {};
		fixture.torches = 1;
		fixture.sextants = 1;
		fixture.gems = 1;
		fixture.shiphull = 1;
		fixture.objects_save_x = new byte[] {};
		fixture.orientation = 1;
		fixture.balloonx = 1;
		fixture.dngx = 1;
		fixture.y = 1;
		fixture.balloonfound = 1;
		fixture.monster_save_x = new byte[] {};
		fixture.monster_save_tileids = new byte[] {};
		fixture.mixtures = new int[] {};
		fixture.members = 1;
		fixture.lastmeditation = 1;
		fixture.zstatsBox = new Texture("");
		fixture.unknown1 = 1;
		fixture.lastcamp = 1;
		fixture.transport = 1;
		fixture.armor = new int[] {};
		fixture.x = 1;
		fixture.moves = 1;
		fixture.trammelphase = 1;
		fixture.runes = 1;
		fixture.items = 1;
		fixture.dnglevel = 1;
		fixture.gold = 1;
		fixture.feluccaphase = 1;
		fixture.balloony = 1;
		fixture.lastmask = 1;
		fixture.balloonstate = 1;
		fixture.lastrage = 1;
		fixture.lastvirtue = 1;
		fixture.karma = new int[] {};
		fixture.torchduration = 1;
		fixture.players = new SaveGame.SaveGamePlayerRecord[] {};
		fixture.objects_save_tileids = new byte[] {};
		fixture.dngy = 1;
		fixture.weapons = new int[] {};
		fixture.food = 1;
		int showZstats = 1;
		BitmapFont font = new BitmapFont();
		Batch batch = new PolygonSpriteBatch();
		int SCREEN_HEIGHT = 1;

		fixture.renderZstats(showZstats, font, batch, SCREEN_HEIGHT);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.Texture.<init>(Texture.java:88)
	}

	/**
	 * Run the void resetMonsters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testResetMonsters_1()
		throws Exception {
		SaveGame fixture = new SaveGame();
		fixture.lastreagent = 1;
		fixture.lbintro = 1;
		fixture.stones = 1;
		fixture.location = 1;
		fixture.reagents = new int[] {};
		fixture.keys = 1;
		fixture.objects_save_y = new byte[] {};
		fixture.monster_save_y = new byte[] {};
		fixture.torches = 1;
		fixture.sextants = 1;
		fixture.gems = 1;
		fixture.shiphull = 1;
		fixture.objects_save_x = new byte[] {};
		fixture.orientation = 1;
		fixture.balloonx = 1;
		fixture.dngx = 1;
		fixture.y = 1;
		fixture.balloonfound = 1;
		fixture.monster_save_x = new byte[] {};
		fixture.monster_save_tileids = new byte[] {};
		fixture.mixtures = new int[] {};
		fixture.members = 1;
		fixture.lastmeditation = 1;
		fixture.zstatsBox = new Texture("");
		fixture.unknown1 = 1;
		fixture.lastcamp = 1;
		fixture.transport = 1;
		fixture.armor = new int[] {};
		fixture.x = 1;
		fixture.moves = 1;
		fixture.trammelphase = 1;
		fixture.runes = 1;
		fixture.items = 1;
		fixture.dnglevel = 1;
		fixture.gold = 1;
		fixture.feluccaphase = 1;
		fixture.balloony = 1;
		fixture.lastmask = 1;
		fixture.balloonstate = 1;
		fixture.lastrage = 1;
		fixture.lastvirtue = 1;
		fixture.karma = new int[] {};
		fixture.torchduration = 1;
		fixture.players = new SaveGame.SaveGamePlayerRecord[] {};
		fixture.objects_save_tileids = new byte[] {};
		fixture.dngy = 1;
		fixture.weapons = new int[] {};
		fixture.food = 1;

		fixture.resetMonsters();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.Texture.<init>(Texture.java:88)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
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
	 * @generatedBy CodePro at 11/06/19 12:57
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
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SaveGameTest.class);
	}
}