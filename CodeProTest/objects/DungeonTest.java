package objects;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DungeonTest</code> contains tests for the class <code>{@link Dungeon}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class DungeonTest {
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
		Dungeon fixture = new Dungeon();
		fixture.setRooms(1);
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getRooms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetRooms_1()
		throws Exception {
		Dungeon fixture = new Dungeon();
		fixture.setRooms(1);
		fixture.setName("");

		int result = fixture.getRooms();

		// add additional test code here
		assertEquals(1, result);
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
		Dungeon fixture = new Dungeon();
		fixture.setRooms(1);
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setRooms(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetRooms_1()
		throws Exception {
		Dungeon fixture = new Dungeon();
		fixture.setRooms(1);
		fixture.setName("");
		int rooms = 1;

		fixture.setRooms(rooms);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Dungeon fixture = new Dungeon();
		fixture.setRooms(1);
		fixture.setName("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Dungeon [name=, rooms=1]", result);
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
		new org.junit.runner.JUnitCore().run(DungeonTest.class);
	}
}