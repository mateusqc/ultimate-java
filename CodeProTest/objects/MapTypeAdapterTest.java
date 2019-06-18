package objects;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>MapTypeAdapterTest</code> contains tests for the class <code>{@link MapTypeAdapter}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class MapTypeAdapterTest {
	/**
	 * Run the String marshal(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		MapTypeAdapter fixture = new MapTypeAdapter();
		ultima.Constants.MapType t = ultima.Constants.MapType.city;

		String result = fixture.marshal(t);

		// add additional test code here
		assertEquals("city", result);
	}

	/**
	 * Run the ultima.Constants.MapType unmarshal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		MapTypeAdapter fixture = new MapTypeAdapter();
		String val = "";

		ultima.Constants.MapType result = fixture.unmarshal(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No enum constant ultima.Constants.MapType.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at ultima.Constants$MapType.valueOf(Constants.java:1)
		//       at objects.MapTypeAdapter.unmarshal(MapTypeAdapter.java:14)
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
		new org.junit.runner.JUnitCore().run(MapTypeAdapterTest.class);
	}
}