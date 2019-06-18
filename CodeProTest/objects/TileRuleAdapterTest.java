package objects;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>TileRuleAdapterTest</code> contains tests for the class <code>{@link TileRuleAdapter}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class TileRuleAdapterTest {
	/**
	 * Run the String marshal(TileRule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		TileRuleAdapter fixture = new TileRuleAdapter();
		ultima.Constants.TileRule t = ultima.Constants.TileRule.balloon;

		String result = fixture.marshal(t);

		// add additional test code here
		assertEquals("balloon", result);
	}

	/**
	 * Run the ultima.Constants.TileRule unmarshal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		TileRuleAdapter fixture = new TileRuleAdapter();
		String val = "";

		ultima.Constants.TileRule result = fixture.unmarshal(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No enum constant ultima.Constants.TileRule.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at ultima.Constants$TileRule.valueOf(Constants.java:1)
		//       at objects.TileRuleAdapter.unmarshal(TileRuleAdapter.java:14)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
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
	 * @generatedBy CodePro at 11/06/19 12:59
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
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileRuleAdapterTest.class);
	}
}