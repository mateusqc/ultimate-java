package objects;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>CreatureTypeAdapterTest</code> contains tests for the class <code>{@link CreatureTypeAdapter}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class CreatureTypeAdapterTest {
	/**
	 * Run the String marshal(CreatureType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testMarshal_1()
		throws Exception {
		CreatureTypeAdapter fixture = new CreatureTypeAdapter();
		ultima.Constants.CreatureType t = ultima.Constants.CreatureType.balron;

		String result = fixture.marshal(t);

		// add additional test code here
		assertEquals("balron", result);
	}

	/**
	 * Run the ultima.Constants.CreatureType unmarshal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testUnmarshal_1()
		throws Exception {
		CreatureTypeAdapter fixture = new CreatureTypeAdapter();
		String val = "";

		ultima.Constants.CreatureType result = fixture.unmarshal(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No enum constant ultima.Constants.CreatureType.
		//       at java.lang.Enum.valueOf(Unknown Source)
		//       at ultima.Constants$CreatureType.valueOf(Constants.java:1)
		//       at objects.CreatureTypeAdapter.unmarshal(CreatureTypeAdapter.java:14)
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
		new org.junit.runner.JUnitCore().run(CreatureTypeAdapterTest.class);
	}
}