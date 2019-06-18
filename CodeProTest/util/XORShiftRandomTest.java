package util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XORShiftRandomTest</code> contains tests for the class <code>{@link XORShiftRandom}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class XORShiftRandomTest {
	/**
	 * Run the XORShiftRandom() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testXORShiftRandom_1()
		throws Exception {

		XORShiftRandom result = new XORShiftRandom();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int next(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testNext_1()
		throws Exception {
		XORShiftRandom fixture = new XORShiftRandom();
		int nbits = 1;

		int result = fixture.next(nbits);

		// add additional test code here
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(XORShiftRandomTest.class);
	}
}