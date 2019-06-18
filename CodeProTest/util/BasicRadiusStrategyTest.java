package util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BasicRadiusStrategyTest</code> contains tests for the class <code>{@link BasicRadiusStrategy}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class BasicRadiusStrategyTest {
	/**
	 * Run the float radius(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_1()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float dx = 1.0f;
		float dy = 1.0f;

		float result = fixture.radius(dx, dy);

		// add additional test code here
		assertEquals(1.4142135f, result, 0.1f);
	}

	/**
	 * Run the float radius(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_2()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		int dx = 1;
		int dy = 1;

		float result = fixture.radius(dx, dy);

		// add additional test code here
		assertEquals(1.4142135f, result, 0.1f);
	}

	/**
	 * Run the float radius(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_3()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float dx = 1.0f;
		float dy = 1.0f;
		float dz = 1.0f;

		float result = fixture.radius(dx, dy, dz);

		// add additional test code here
		assertEquals(1.7320508f, result, 0.1f);
	}

	/**
	 * Run the float radius(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_4()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float dx = 1.0f;
		float dy = 1.0f;
		float dz = 1.0f;

		float result = fixture.radius(dx, dy, dz);

		// add additional test code here
		assertEquals(1.7320508f, result, 0.1f);
	}

	/**
	 * Run the float radius(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_5()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float dx = 1.0f;
		float dy = 1.0f;
		float dz = 1.0f;

		float result = fixture.radius(dx, dy, dz);

		// add additional test code here
		assertEquals(1.7320508f, result, 0.1f);
	}

	/**
	 * Run the float radius(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_6()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float dx = 1.0f;
		float dy = 1.0f;
		float dz = 1.0f;

		float result = fixture.radius(dx, dy, dz);

		// add additional test code here
		assertEquals(1.7320508f, result, 0.1f);
	}

	/**
	 * Run the float radius(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_7()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float dx = 1.0f;
		float dy = 1.0f;
		float dz = 1.0f;

		float result = fixture.radius(dx, dy, dz);

		// add additional test code here
		assertEquals(1.7320508f, result, 0.1f);
	}

	/**
	 * Run the float radius(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_8()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float dx = 1.0f;
		float dy = 1.0f;
		float dz = 1.0f;

		float result = fixture.radius(dx, dy, dz);

		// add additional test code here
		assertEquals(1.7320508f, result, 0.1f);
	}

	/**
	 * Run the float radius(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_9()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		int dx = 1;
		int dy = 1;
		int dz = 1;

		float result = fixture.radius(dx, dy, dz);

		// add additional test code here
		assertEquals(1.7320508f, result, 0.1f);
	}

	/**
	 * Run the float radius(float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_10()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float startx = 1.0f;
		float starty = 1.0f;
		float endx = 1.0f;
		float endy = 1.0f;

		float result = fixture.radius(startx, starty, endx, endy);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float radius(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_11()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		int startx = 1;
		int starty = 1;
		int endx = 1;
		int endy = 1;

		float result = fixture.radius(startx, starty, endx, endy);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float radius(float,float,float,float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_12()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		float startx = 1.0f;
		float starty = 1.0f;
		float startz = 1.0f;
		float endx = 1.0f;
		float endy = 1.0f;
		float endz = 1.0f;

		float result = fixture.radius(startx, starty, startz, endx, endy, endz);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float radius(int,int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRadius_13()
		throws Exception {
		BasicRadiusStrategy fixture = BasicRadiusStrategy.CIRCLE;
		int startx = 1;
		int starty = 1;
		int startz = 1;
		int endx = 1;
		int endy = 1;
		int endz = 1;

		float result = fixture.radius(startx, starty, startz, endx, endy, endz);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
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
		new org.junit.runner.JUnitCore().run(BasicRadiusStrategyTest.class);
	}
}