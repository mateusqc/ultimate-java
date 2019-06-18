package objects;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WeaponSetTest</code> contains tests for the class <code>{@link WeaponSet}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class WeaponSetTest {
	/**
	 * Run the List<Weapon> getWeapons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetWeapons_1()
		throws Exception {
		WeaponSet fixture = new WeaponSet();
		fixture.setWeapons(new ArrayList());

		List<Weapon> result = fixture.getWeapons();

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
		WeaponSet fixture = new WeaponSet();
		fixture.setWeapons(new ArrayList());

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
		WeaponSet fixture = new WeaponSet();
		fixture.setWeapons(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void setWeapons(List<Weapon>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetWeapons_1()
		throws Exception {
		WeaponSet fixture = new WeaponSet();
		fixture.setWeapons(new ArrayList());
		List<Weapon> weapons = new ArrayList();

		fixture.setWeapons(weapons);

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
		new org.junit.runner.JUnitCore().run(WeaponSetTest.class);
	}
}