package vendor;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>ArmorAdapterTest</code> contains tests for the class <code>{@link ArmorAdapter}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:20
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ArmorAdapterTest {
	/**
	 * Run the String marshal(ArmorType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		ArmorAdapter fixture = new ArmorAdapter();
		ultima.Constants.ArmorType t = ultima.Constants.ArmorType.CHAIN;

		String result = fixture.marshal(t);

		// add additional test code here
		assertEquals("CHAIN", result);
	}

	/**
	 * Run the ultima.Constants.ArmorType unmarshal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		ArmorAdapter fixture = new ArmorAdapter();
		String val = "";

		ultima.Constants.ArmorType result = fixture.unmarshal(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No enum constant ultima.Constants.ArmorType.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at ultima.Constants$ArmorType.valueOf(Constants.java:1)
		//       at vendor.ArmorAdapter.unmarshal(ArmorAdapter.java:14)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
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
	 * @generatedBy CodePro at 11/06/19 13:20
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ArmorAdapterTest.class);
	}
}