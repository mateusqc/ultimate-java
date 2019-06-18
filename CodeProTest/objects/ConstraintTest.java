package objects;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConstraintTest</code> contains tests for the class <code>{@link Constraint}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ConstraintTest {
	/**
	 * Run the boolean getCanuse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetCanuse_1()
		throws Exception {
		Constraint fixture = new Constraint();
		fixture.setCharClass("");
		fixture.setCanuse(true);

		boolean result = fixture.getCanuse();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getCanuse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetCanuse_2()
		throws Exception {
		Constraint fixture = new Constraint();
		fixture.setCharClass("");
		fixture.setCanuse(false);

		boolean result = fixture.getCanuse();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getCharClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetCharClass_1()
		throws Exception {
		Constraint fixture = new Constraint();
		fixture.setCharClass("");
		fixture.setCanuse(true);

		String result = fixture.getCharClass();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setCanuse(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetCanuse_1()
		throws Exception {
		Constraint fixture = new Constraint();
		fixture.setCharClass("");
		fixture.setCanuse(true);
		boolean canuse = true;

		fixture.setCanuse(canuse);

		// add additional test code here
	}

	/**
	 * Run the void setCharClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetCharClass_1()
		throws Exception {
		Constraint fixture = new Constraint();
		fixture.setCharClass("");
		fixture.setCanuse(true);
		String clazz = "";

		fixture.setCharClass(clazz);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Constraint fixture = new Constraint();
		fixture.setCharClass("");
		fixture.setCanuse(true);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Constraint [canuse=true, charClass=]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
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
	 * @generatedBy CodePro at 11/06/19 12:58
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
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConstraintTest.class);
	}
}