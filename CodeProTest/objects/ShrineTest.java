package objects;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ShrineTest</code> contains tests for the class <code>{@link Shrine}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ShrineTest {
	/**
	 * Run the String getMantra() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMantra_1()
		throws Exception {
		Shrine fixture = new Shrine();
		fixture.setVirtue("");
		fixture.setMantra("");

		String result = fixture.getMantra();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getVirtue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetVirtue_1()
		throws Exception {
		Shrine fixture = new Shrine();
		fixture.setVirtue("");
		fixture.setMantra("");

		String result = fixture.getVirtue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setMantra(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMantra_1()
		throws Exception {
		Shrine fixture = new Shrine();
		fixture.setVirtue("");
		fixture.setMantra("");
		String mantra = "";

		fixture.setMantra(mantra);

		// add additional test code here
	}

	/**
	 * Run the void setVirtue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetVirtue_1()
		throws Exception {
		Shrine fixture = new Shrine();
		fixture.setVirtue("");
		fixture.setMantra("");
		String virtue = "";

		fixture.setVirtue(virtue);

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
		Shrine fixture = new Shrine();
		fixture.setVirtue("");
		fixture.setMantra("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Shrine [mantra=, virtue=]", result);
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
		new org.junit.runner.JUnitCore().run(ShrineTest.class);
	}
}