package vendor;

import org.junit.*;
import ultima.Sound;
import static org.junit.Assert.*;

/**
 * The class <code>SoundAdapterTest</code> contains tests for the class <code>{@link SoundAdapter}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:21
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class SoundAdapterTest {
	/**
	 * Run the String marshal(Sound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		SoundAdapter fixture = new SoundAdapter();
		Sound t = Sound.ACID;

		String result = fixture.marshal(t);

		// add additional test code here
		assertEquals("ACID", result);
	}

	/**
	 * Run the Sound unmarshal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		SoundAdapter fixture = new SoundAdapter();
		String val = "";

		Sound result = fixture.unmarshal(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No enum constant ultima.Sound.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at ultima.Sound.valueOf(Sound.java:3)
		//       at vendor.SoundAdapter.unmarshal(SoundAdapter.java:14)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
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
	 * @generatedBy CodePro at 11/06/19 13:21
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
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SoundAdapterTest.class);
	}
}