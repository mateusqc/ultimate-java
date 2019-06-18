package objects;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.utils.Array;

/**
 * The class <code>JournalEntriesTest</code> contains tests for the class <code>{@link JournalEntries}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class JournalEntriesTest {
	/**
	 * Run the JournalEntries() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testJournalEntries_1()
		throws Exception {
		JournalEntries result = new JournalEntries();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void add(JournalEntry) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		JournalEntries fixture = new JournalEntries();
		fixture.add(new JournalEntry());
		JournalEntry e = new JournalEntry();

		fixture.add(e);

		// add additional test code here
	}

	/**
	 * Run the void add(JournalEntry) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		JournalEntries fixture = new JournalEntries();
		fixture.add(new JournalEntry());
		JournalEntry e = new JournalEntry();

		fixture.add(e);

		// add additional test code here
	}

	/**
	 * Run the void fromArray(Array<JournalEntry>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testFromArray_1()
		throws Exception {
		JournalEntries fixture = new JournalEntries();
		Array<JournalEntry> ar = new Array(true, new Object[] {}, 1, 1);

		fixture.fromArray(ar);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.System.arraycopy(Native Method)
		//       at com.badlogic.gdx.utils.Array.<init>(Array.java:95)
	}

	/**
	 * Run the void fromArray(Array<JournalEntry>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testFromArray_2()
		throws Exception {
		JournalEntries fixture = new JournalEntries();
		Array<JournalEntry> ar = new Array(true, new Object[] {}, 1, 0);

		fixture.fromArray(ar);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.System.arraycopy(Native Method)
		//       at com.badlogic.gdx.utils.Array.<init>(Array.java:95)
	}

	/**
	 * Run the List<JournalEntry> getEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetEntries_1()
		throws Exception {
		JournalEntries fixture = new JournalEntries();
		fixture.add(new JournalEntry());

		List<JournalEntry> result = fixture.getEntries();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the Array<JournalEntry> toArray() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testToArray_1()
		throws Exception {
		JournalEntries fixture = new JournalEntries();
		fixture.add(new JournalEntry());

		Array<JournalEntry> result = fixture.toArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[JournalEntry{name=null, location=null, text=null}]", result.toString());
		assertEquals(null, result.random());
	}

	/**
	 * Run the Array<JournalEntry> toArray() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testToArray_2()
		throws Exception {
		JournalEntries fixture = new JournalEntries();
		fixture.add(new JournalEntry());

		Array<JournalEntry> result = fixture.toArray();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[JournalEntry{name=null, location=null, text=null}]", result.toString());
		assertEquals(null, result.random());
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
		new org.junit.runner.JUnitCore().run(JournalEntriesTest.class);
	}
}