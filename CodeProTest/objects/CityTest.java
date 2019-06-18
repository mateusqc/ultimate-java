package objects;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CityTest</code> contains tests for the class <code>{@link City}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:00
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class CityTest {
	/**
	 * Run the List<Conversation> getConversations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetConversations_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		List<Conversation> result = fixture.getConversations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<Person> getPeople() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPeople_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		List<Person> result = fixture.getPeople();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Person getPersonAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPersonAt_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		int x = 1;
		int y = 1;

		Person result = fixture.getPersonAt(x, y);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Person getPersonAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPersonAt_2()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		int x = 1;
		int y = 1;

		Person result = fixture.getPersonAt(x, y);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Person getPersonAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPersonAt_3()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		int x = 1;
		int y = 1;

		Person result = fixture.getPersonAt(x, y);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Person getPersonAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPersonAt_4()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		int x = 1;
		int y = 1;

		Person result = fixture.getPersonAt(x, y);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Person getPersonAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPersonAt_5()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		int x = 1;
		int y = 1;

		Person result = fixture.getPersonAt(x, y);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<PersonRole> getPersonRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetPersonRoles_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		List<PersonRole> result = fixture.getPersonRoles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getTlk_fname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetTlk_fname_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		String result = fixture.getTlk_fname();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Person resetTalkingFlags() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testResetTalkingFlags_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		Person result = fixture.resetTalkingFlags();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Person resetTalkingFlags() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testResetTalkingFlags_2()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		Person result = fixture.resetTalkingFlags();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Person resetTalkingFlags() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testResetTalkingFlags_3()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		Person result = fixture.resetTalkingFlags();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setConversations(List<Conversation>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetConversations_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		List<Conversation> conversations = new ArrayList();

		fixture.setConversations(conversations);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPeople(List<Person>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetPeople_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		List<Person> people = new ArrayList();

		fixture.setPeople(people);

		// add additional test code here
	}

	/**
	 * Run the void setPersonRoles(List<PersonRole>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetPersonRoles_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		List<PersonRole> personRoles = new ArrayList();

		fixture.setPersonRoles(personRoles);

		// add additional test code here
	}

	/**
	 * Run the void setTlk_fname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetTlk_fname_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		String tlk_fname = "";

		fixture.setTlk_fname(tlk_fname);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	@Test
	public void testToString_1()
		throws Exception {
		City fixture = new City();
		fixture.setConversations(new ArrayList());
		fixture.setType("");
		fixture.setPersonRoles(new ArrayList());
		fixture.setPeople(new ArrayList());
		fixture.setTlk_fname("");
		fixture.setName("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("City [name=, type=, tlk_fname=, personRoles=[]]", result);
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
		new org.junit.runner.JUnitCore().run(CityTest.class);
	}
}