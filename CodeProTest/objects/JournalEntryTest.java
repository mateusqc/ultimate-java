package objects;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JournalEntryTest</code> contains tests for the class <code>{@link JournalEntry}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class JournalEntryTest {
	/**
	 * Run the JournalEntry() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testJournalEntry_1()
		throws Exception {

		JournalEntry result = new JournalEntry();

		// add additional test code here
		assertNotNull(result);
		assertEquals("JournalEntry{name=null, location=null, text=null}", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getLocation());
		assertEquals(null, result.getText());
	}

	/**
	 * Run the JournalEntry(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testJournalEntry_2()
		throws Exception {
		String name = "";
		String loc = "";
		String t = "";

		JournalEntry result = new JournalEntry(name, loc, t);

		// add additional test code here
		assertNotNull(result);
		assertEquals("JournalEntry{name=, location=, text=}", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getLocation());
		assertEquals("", result.getText());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");
		Object obj = new JournalEntry("", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");
		Object obj = new JournalEntry("", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");
		Object obj = new JournalEntry("", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");
		Object obj = new JournalEntry("", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");

		String result = fixture.getLocation();

		// add additional test code here
		assertEquals("", result);
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
		JournalEntry fixture = new JournalEntry("", "", "");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");

		String result = fixture.getText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(121945, result);
	}

	/**
	 * Run the void setLocation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");
		String location = "";

		fixture.setLocation(location);

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
		JournalEntry fixture = new JournalEntry("", "", "");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetText_1()
		throws Exception {
		JournalEntry fixture = new JournalEntry("", "", "");
		String text = "";

		fixture.setText(text);

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
		JournalEntry fixture = new JournalEntry("", "", "");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("JournalEntry{name=, location=, text=}", result);
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
		new org.junit.runner.JUnitCore().run(JournalEntryTest.class);
	}
}