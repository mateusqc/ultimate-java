package ultima;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SoundTest</code> contains tests for the class <code>{@link Sound}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:01
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class SoundTest {
	/**
	 * Run the String getFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testGetFile_1()
		throws Exception {
		Sound fixture = Sound.ACID;

		String result = fixture.getFile();

		// add additional test code here
		assertEquals("AcidicRain.ogg", result);
	}

	/**
	 * Run the boolean getLooping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testGetLooping_1()
		throws Exception {
		Sound fixture = Sound.ACID;

		boolean result = fixture.getLooping();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getLooping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testGetLooping_2()
		throws Exception {
		Sound fixture = Sound.ACID;

		boolean result = fixture.getLooping();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the float getVolume() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testGetVolume_1()
		throws Exception {
		Sound fixture = Sound.ACID;

		float result = fixture.getVolume();

		// add additional test code here
		assertEquals(0.3f, result, 0.1f);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
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
	 * @generatedBy CodePro at 11/06/19 13:01
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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SoundTest.class);
	}
}