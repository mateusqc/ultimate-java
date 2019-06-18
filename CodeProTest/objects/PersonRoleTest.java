package objects;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>PersonRoleTest</code> contains tests for the class <code>{@link PersonRole}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class PersonRoleTest {
	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		PersonRole fixture = new PersonRole();
		fixture.setRole("");
		fixture.setId(1);
		fixture.setInventoryType(ultima.Constants.InventoryType.ARMOR);

		int result = fixture.getId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ultima.Constants.InventoryType getInventoryType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetInventoryType_1()
		throws Exception {
		PersonRole fixture = new PersonRole();
		fixture.setRole("");
		fixture.setId(1);
		fixture.setInventoryType(ultima.Constants.InventoryType.ARMOR);

		ultima.Constants.InventoryType result = fixture.getInventoryType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ARMOR", result.name());
		assertEquals("ARMOR", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the String getRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		PersonRole fixture = new PersonRole();
		fixture.setRole("");
		fixture.setId(1);
		fixture.setInventoryType(ultima.Constants.InventoryType.ARMOR);

		String result = fixture.getRole();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		PersonRole fixture = new PersonRole();
		fixture.setRole("");
		fixture.setId(1);
		fixture.setInventoryType(ultima.Constants.InventoryType.ARMOR);
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setInventoryType(InventoryType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testSetInventoryType_1()
		throws Exception {
		PersonRole fixture = new PersonRole();
		fixture.setRole("");
		fixture.setId(1);
		fixture.setInventoryType(ultima.Constants.InventoryType.ARMOR);
		ultima.Constants.InventoryType inventoryType = ultima.Constants.InventoryType.ARMOR;

		fixture.setInventoryType(inventoryType);

		// add additional test code here
	}

	/**
	 * Run the void setRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testSetRole_1()
		throws Exception {
		PersonRole fixture = new PersonRole();
		fixture.setRole("");
		fixture.setId(1);
		fixture.setInventoryType(ultima.Constants.InventoryType.ARMOR);
		String role = "";

		fixture.setRole(role);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testToString_1()
		throws Exception {
		PersonRole fixture = new PersonRole();
		fixture.setRole("");
		fixture.setId(1);
		fixture.setInventoryType(ultima.Constants.InventoryType.ARMOR);

		String result = fixture.toString();

		// add additional test code here
		assertEquals(", inventoryType=ARMOR, id=1", result);
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
		new org.junit.runner.JUnitCore().run(PersonRoleTest.class);
	}
}