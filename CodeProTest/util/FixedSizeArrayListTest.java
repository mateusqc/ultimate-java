package util;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FixedSizeArrayListTest</code> contains tests for the class <code>{@link FixedSizeArrayList}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class FixedSizeArrayListTest {
	/**
	 * Run the FixedSizeArrayList(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testFixedSizeArrayList_1()
		throws Exception {
		int maxSize = 1;

		FixedSizeArrayList result = new FixedSizeArrayList(maxSize);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean add(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		FixedSizeArrayList fixture = new FixedSizeArrayList(1);
		fixture.add((Object) null);

		boolean result = fixture.add(null);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean add(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		FixedSizeArrayList fixture = new FixedSizeArrayList(1);
		fixture.add((Object) null);

		boolean result = fixture.add(null);

		// add additional test code here
		assertEquals(true, result);
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
		new org.junit.runner.JUnitCore().run(FixedSizeArrayListTest.class);
	}
}