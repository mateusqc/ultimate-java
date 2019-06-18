package objects;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>AuraTest</code> contains tests for the class <code>{@link Aura}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:00
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class AuraTest {
	/**
	 * Run the Aura() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testAura_1()
		throws Exception {
		Aura result = new Aura();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int getDuration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetDuration_1()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 1);

		int result = fixture.getDuration();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ultima.Constants.AuraType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 1);

		ultima.Constants.AuraType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("HORN", result.name());
		assertEquals("HORN", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsActive_1()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 1);

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testIsActive_2()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 0);

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void passTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testPassTurn_1()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 1);

		fixture.passTurn();

		// add additional test code here
	}

	/**
	 * Run the void passTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testPassTurn_2()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 1);

		fixture.passTurn();

		// add additional test code here
	}

	/**
	 * Run the void passTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testPassTurn_3()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 0);

		fixture.passTurn();

		// add additional test code here
	}

	/**
	 * Run the void set(AuraType,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSet_1()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 1);
		ultima.Constants.AuraType t = ultima.Constants.AuraType.HORN;
		int d = 1;

		fixture.set(t, d);

		// add additional test code here
	}

	/**
	 * Run the void setDuration(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetDuration_1()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 1);
		int d = 1;

		fixture.setDuration(d);

		// add additional test code here
	}

	/**
	 * Run the void setType(AuraType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		Aura fixture = new Aura();
		fixture.set(ultima.Constants.AuraType.HORN, 1);
		ultima.Constants.AuraType t = ultima.Constants.AuraType.HORN;

		fixture.setType(t);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
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
	 * @generatedBy CodePro at 11/06/19 13:00
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
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AuraTest.class);
	}
}