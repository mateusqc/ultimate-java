package util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ShadowFOVTest</code> contains tests for the class <code>{@link ShadowFOV}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ShadowFOVTest {
	/**
	 * Run the float[][] calculateFOV(float[][],int,int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testCalculateFOV_1()
		throws Exception {
		ShadowFOV fixture = new ShadowFOV();
		fixture.calculateFOV(new float[][] {}, 1, 1, 1.0f, 1.0f, (RadiusStrategy) null);
		float[][] resistanceMap = new float[][] {};
		int startx = 1;
		int starty = 1;
		float radius = 1.0f;

		float[][] result = fixture.calculateFOV(resistanceMap, startx, starty, radius);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the float[][] calculateFOV(float[][],int,int,float,float,RadiusStrategy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testCalculateFOV_2()
		throws Exception {
		ShadowFOV fixture = new ShadowFOV();
		fixture.calculateFOV(new float[][] {}, 1, 1, 1.0f, 1.0f, (RadiusStrategy) null);
		float[][] resistanceMap = new float[][] {};
		int startx = 1;
		int starty = 1;
		float force = 1.0f;
		float decay = 1.0f;
		RadiusStrategy rStrat = null;

		float[][] result = fixture.calculateFOV(resistanceMap, startx, starty, force, decay, rStrat);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the float[][] calculateFOV(float[][],int,int,float,float,RadiusStrategy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testCalculateFOV_3()
		throws Exception {
		ShadowFOV fixture = new ShadowFOV();
		fixture.calculateFOV(new float[][] {}, 1, 1, 1.0f, 1.0f, (RadiusStrategy) null);
		float[][] resistanceMap = new float[][] {};
		int startx = 1;
		int starty = 1;
		float force = 1.0f;
		float decay = 1.0f;
		RadiusStrategy rStrat = null;

		float[][] result = fixture.calculateFOV(resistanceMap, startx, starty, force, decay, rStrat);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(ShadowFOVTest.class);
	}
}