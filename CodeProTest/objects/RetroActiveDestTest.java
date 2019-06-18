package objects;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RetroActiveDestTest</code> contains tests for the class <code>{@link RetroActiveDest}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class RetroActiveDestTest {
	/**
	 * Run the int getMapid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMapid_1()
		throws Exception {
		RetroActiveDest fixture = new RetroActiveDest();
		fixture.setMapid(1);
		fixture.setX(1);
		fixture.setY(1);

		int result = fixture.getMapid();

		// add additional test code here
		assertEquals(1, result);
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
		RetroActiveDest fixture = new RetroActiveDest();
		fixture.setMapid(1);
		fixture.setX(1);
		fixture.setY(1);

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
		RetroActiveDest fixture = new RetroActiveDest();
		fixture.setMapid(1);
		fixture.setX(1);
		fixture.setY(1);

		int result = fixture.getY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setMapid(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMapid_1()
		throws Exception {
		RetroActiveDest fixture = new RetroActiveDest();
		fixture.setMapid(1);
		fixture.setX(1);
		fixture.setY(1);
		int mapid = 1;

		fixture.setMapid(mapid);

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
		RetroActiveDest fixture = new RetroActiveDest();
		fixture.setMapid(1);
		fixture.setX(1);
		fixture.setY(1);
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
		RetroActiveDest fixture = new RetroActiveDest();
		fixture.setMapid(1);
		fixture.setX(1);
		fixture.setY(1);
		int y = 1;

		fixture.setY(y);

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
		RetroActiveDest fixture = new RetroActiveDest();
		fixture.setMapid(1);
		fixture.setX(1);
		fixture.setY(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("RetroActiveDest [x=1, y=1, mapid=1]", result);
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
		new org.junit.runner.JUnitCore().run(RetroActiveDestTest.class);
	}
}