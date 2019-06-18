package objects;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ArmorSetTest</code> contains tests for the class <code>{@link ArmorSet}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ArmorSetTest {
	/**
	 * Run the List<Armor> getArmors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetArmors_1()
		throws Exception {
		ArmorSet fixture = new ArmorSet();
		fixture.setArmors(new ArrayList());

		List<Armor> result = fixture.getArmors();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testInit_1()
		throws Exception {
		ArmorSet fixture = new ArmorSet();
		fixture.setArmors(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testInit_2()
		throws Exception {
		ArmorSet fixture = new ArmorSet();
		fixture.setArmors(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void setArmors(List<Armor>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetArmors_1()
		throws Exception {
		ArmorSet fixture = new ArmorSet();
		fixture.setArmors(new ArrayList());
		List<Armor> armors = new ArrayList();

		fixture.setArmors(armors);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(ArmorSetTest.class);
	}
}