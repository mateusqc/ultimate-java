package objects;

import java.util.ArrayList;
import java.util.List;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ArmorTest</code> contains tests for the class <code>{@link Armor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ArmorTest {
	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCanUse_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(null);
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCanUse_2()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCanUse_3()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCanUse_4()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testCanUse_5()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the List<Constraint> getConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetConstraints_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);

		List<Constraint> result = fixture.getConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getDefense() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDefense_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);

		int result = fixture.getDefense();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the ultima.Constants.ArmorType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);

		ultima.Constants.ArmorType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getArmor());
		assertEquals("CHAIN", result.name());
		assertEquals("CHAIN", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the void setConstraints(List<Constraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetConstraints_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		List<Constraint> constraints = new ArrayList();

		fixture.setConstraints(constraints);

		// add additional test code here
	}

	/**
	 * Run the void setDefense(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetDefense_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		int defense = 1;

		fixture.setDefense(defense);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setType(ArmorType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		Armor fixture = new Armor();
		fixture.setDefense(1);
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setType(ultima.Constants.ArmorType.CHAIN);
		ultima.Constants.ArmorType type = ultima.Constants.ArmorType.CHAIN;

		fixture.setType(type);

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
		new org.junit.runner.JUnitCore().run(ArmorTest.class);
	}
}