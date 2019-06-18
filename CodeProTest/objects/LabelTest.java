package objects;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LabelTest</code> contains tests for the class <code>{@link Label}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class LabelTest {
	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetX_1()
		throws Exception {
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");

		int result = fixture.getX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetY_1()
		throws Exception {
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");

		int result = fixture.getY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getZ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetZ_1()
		throws Exception {
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");

		int result = fixture.getZ();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetX_1()
		throws Exception {
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");
		int x = 1;

		fixture.setX(x);

		// add additional test code here
	}

	/**
	 * Run the void setY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetY_1()
		throws Exception {
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");
		int y = 1;

		fixture.setY(y);

		// add additional test code here
	}

	/**
	 * Run the void setZ(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetZ_1()
		throws Exception {
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");
		int z = 1;

		fixture.setZ(z);

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
		Label fixture = new Label();
		fixture.setY(1);
		fixture.setX(1);
		fixture.setZ(1);
		fixture.setName("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("<object name=\"\" type=\"label\" x=\"32\" y=\"32\" width=\"32\" height=\"32\">\r\n<properties>\r\n<property name=\"x\" value=\"1\"/>\r\n<property name=\"y\" value=\"1\"/>\r\n</properties>\r\n</object>\r\n", result);
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
		new org.junit.runner.JUnitCore().run(LabelTest.class);
	}
}