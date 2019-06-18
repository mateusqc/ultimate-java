package objects;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>BorderTypeAdapterTest</code> contains tests for the class <code>{@link BorderTypeAdapter}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class BorderTypeAdapterTest {
	/**
	 * Run the String marshal(MapBorderBehavior) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		BorderTypeAdapter fixture = new BorderTypeAdapter();
		ultima.Constants.MapBorderBehavior t = ultima.Constants.MapBorderBehavior.exit;

		String result = fixture.marshal(t);

		// add additional test code here
		assertEquals("exit", result);
	}

	/**
	 * Run the ultima.Constants.MapBorderBehavior unmarshal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		BorderTypeAdapter fixture = new BorderTypeAdapter();
		String val = "";

		ultima.Constants.MapBorderBehavior result = fixture.unmarshal(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No enum constant ultima.Constants.MapBorderBehavior.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at ultima.Constants$MapBorderBehavior.valueOf(Constants.java:1)
		//       at objects.BorderTypeAdapter.unmarshal(BorderTypeAdapter.java:14)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
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
	 * @generatedBy CodePro at 11/06/19 12:57
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
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BorderTypeAdapterTest.class);
	}
}