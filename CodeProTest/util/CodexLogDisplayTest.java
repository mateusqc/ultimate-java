package util;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;

/**
 * The class <code>CodexLogDisplayTest</code> contains tests for the class <code>{@link CodexLogDisplay}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:18
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class CodexLogDisplayTest {
	/**
	 * Run the CodexLogDisplay(BitmapFont) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testCodexLogDisplay_1()
		throws Exception {
		BitmapFont font = new BitmapFont();

		CodexLogDisplay result = new CodexLogDisplay(font);

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		CodexLogDisplay fixture = new CodexLogDisplay(new BitmapFont());
		fixture.logs = new ArrayList();
		fixture.height = 1;
		fixture.logbkgrnd = new Texture("");
		fixture.width = 1;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testAppend_1()
		throws Exception {
		CodexLogDisplay fixture = new CodexLogDisplay(new BitmapFont());
		fixture.logs = new ArrayList();
		fixture.height = 1;
		fixture.logbkgrnd = new Texture("");
		fixture.width = 1;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testAppend_2()
		throws Exception {
		CodexLogDisplay fixture = new CodexLogDisplay(new BitmapFont());
		fixture.logs = new ArrayList();
		fixture.height = 1;
		fixture.logbkgrnd = new Texture("");
		fixture.width = 1;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testLogDeleteLastChar_1()
		throws Exception {
		CodexLogDisplay fixture = new CodexLogDisplay(new BitmapFont());
		fixture.logs = new ArrayList();
		fixture.height = 1;
		fixture.logbkgrnd = new Texture("");
		fixture.width = 1;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testLogDeleteLastChar_2()
		throws Exception {
		CodexLogDisplay fixture = new CodexLogDisplay(new BitmapFont());
		fixture.logs = new ArrayList();
		fixture.height = 1;
		fixture.logbkgrnd = new Texture("");
		fixture.width = 1;

		fixture.logDeleteLastChar();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void render(Batch) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testRender_1()
		throws Exception {
		CodexLogDisplay fixture = new CodexLogDisplay(new BitmapFont());
		fixture.logs = new ArrayList();
		fixture.height = 1;
		fixture.logbkgrnd = new Texture("");
		fixture.width = 1;
		Batch batch = new PolygonSpriteBatch();

		fixture.render(batch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void render(Batch) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testRender_2()
		throws Exception {
		CodexLogDisplay fixture = new CodexLogDisplay(new BitmapFont());
		fixture.logs = new ArrayList();
		fixture.height = 1;
		fixture.logbkgrnd = new Texture("");
		fixture.width = 1;
		Batch batch = new PolygonSpriteBatch();

		fixture.render(batch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Run the void render(Batch) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testRender_3()
		throws Exception {
		CodexLogDisplay fixture = new CodexLogDisplay(new BitmapFont());
		fixture.logs = new ArrayList();
		fixture.height = 1;
		fixture.logbkgrnd = new Texture("");
		fixture.width = 1;
		Batch batch = new PolygonSpriteBatch();

		fixture.render(batch);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.badlogic.gdx.graphics.g2d.BitmapFont.<init>(BitmapFont.java:72)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
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
	 * @generatedBy CodePro at 11/06/19 13:18
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodexLogDisplayTest.class);
	}
}