package util;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import objects.Party;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import objects.SaveGame;
import ultima.Context;

/**
 * The class <code>LogDisplayTest</code> contains tests for the class <code>{@link LogDisplay}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class LogDisplayTest {
	/**
	 * Run the LogDisplay(BitmapFont) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLogDisplay_1()
		throws Exception {
		BitmapFont font = new BitmapFont();

		LogDisplay result = new LogDisplay(font);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
		assertNotNull(result);
	}

	/**
	 * Run the void add(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		String s = "";

		fixture.add(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void append(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testAppend_1()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		String s = "";

		fixture.append(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void append(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testAppend_2()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		String s = "";

		fixture.append(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void logDeleteLastChar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLogDeleteLastChar_1()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());

		fixture.logDeleteLastChar();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void logDeleteLastChar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLogDeleteLastChar_2()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");

		fixture.logDeleteLastChar();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_1()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_2()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_3()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_4()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_5()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_6()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_7()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_8()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_9()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_10()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_11()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_12()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_13()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_14()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_15()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void render(Batch,Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_16()
		throws Exception {
		LogDisplay fixture = new LogDisplay(new BitmapFont());
		fixture.add("");
		Batch batch = new PolygonSpriteBatch();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		party.setContext(new Context());

		fixture.render(batch, party);

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
		new org.junit.runner.JUnitCore().run(LogDisplayTest.class);
	}
}