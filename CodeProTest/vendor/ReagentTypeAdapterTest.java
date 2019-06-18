package vendor;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>ReagentTypeAdapterTest</code> contains tests for the class <code>{@link ReagentTypeAdapter}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:20
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ReagentTypeAdapterTest {
	/**
	 * Run the String marshal(Reagent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		ReagentTypeAdapter fixture = new ReagentTypeAdapter();
		ultima.Constants.Reagent t = ultima.Constants.Reagent.ASH;

		String result = fixture.marshal(t);

		// add additional test code here
		assertEquals("ASH", result);
	}

	/**
	 * Run the ultima.Constants.Reagent unmarshal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		ReagentTypeAdapter fixture = new ReagentTypeAdapter();
		String val = "";

		ultima.Constants.Reagent result = fixture.unmarshal(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No enum constant ultima.Constants.Reagent.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at ultima.Constants$Reagent.valueOf(Constants.java:1)
		//       at vendor.ReagentTypeAdapter.unmarshal(ReagentTypeAdapter.java:14)
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
		new org.junit.runner.JUnitCore().run(ReagentTypeAdapterTest.class);
	}
}