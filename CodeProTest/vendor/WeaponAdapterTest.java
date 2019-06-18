package vendor;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>WeaponAdapterTest</code> contains tests for the class <code>{@link WeaponAdapter}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:19
 * @author Arthur Ferr�o
 * @version $Revision: 1.0 $
 */
public class WeaponAdapterTest {
	/**
	 * Run the String marshal(WeaponType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		WeaponAdapter fixture = new WeaponAdapter();
		ultima.Constants.WeaponType t = ultima.Constants.WeaponType.AXE;

		String result = fixture.marshal(t);

		// add additional test code here
		assertEquals("AXE", result);
	}

	/**
	 * Run the ultima.Constants.WeaponType unmarshal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		WeaponAdapter fixture = new WeaponAdapter();
		String val = "";

		ultima.Constants.WeaponType result = fixture.unmarshal(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No enum constant ultima.Constants.WeaponType.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at ultima.Constants$WeaponType.valueOf(Constants.java:1)
		//       at vendor.WeaponAdapter.unmarshal(WeaponAdapter.java:14)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
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
	 * @generatedBy CodePro at 11/06/19 13:19
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WeaponAdapterTest.class);
	}
}