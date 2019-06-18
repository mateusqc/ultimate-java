package objects;

import java.util.ArrayList;
import java.util.List;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HawkwindConversationTest</code> contains tests for the class <code>{@link HawkwindConversation}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class HawkwindConversationTest {
	/**
	 * Run the HawkwindConversation() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testHawkwindConversation_1()
		throws Exception {

		HawkwindConversation result = new HawkwindConversation();

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\tConversation [index=1, name=Hawkwind, pronoun=He, turnAwayProb=0, description=null, respAffectsHumility=0, topics=[]]", result.toString());
		assertEquals("Hawkwind", result.getName());
		assertEquals(1, result.getIndex());
		assertEquals(null, result.getDescription());
		assertEquals("He", result.getPronoun());
		assertEquals(0, result.getTurnAwayProb());
		assertEquals(0, result.getRespAffectsHumility());
	}

	/**
	 * Run the String intro() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testIntro_1()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();

		String result = fixture.intro();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at objects.HawkwindConversation.intro(HawkwindConversation.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the String intro() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testIntro_2()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();

		String result = fixture.intro();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at objects.HawkwindConversation.intro(HawkwindConversation.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the String intro() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testIntro_3()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();

		String result = fixture.intro();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at objects.HawkwindConversation.intro(HawkwindConversation.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the Conversation.Topic matchTopic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMatchTopic_1()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "none";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\t\tTopic  [query=bye, phrase=\n\nHawkwind says: Fare thee well and may thou complete the Quest of the Avatar!, question=null, yesResponse=null, noResponse=null]", result.toString());
		assertEquals("bye", result.getQuery());
		assertEquals(null, result.getQuestion());
		assertEquals(null, result.getYesResponse());
		assertEquals(false, result.isLbHeal());
		assertEquals(null, result.getNoResponse());
		assertEquals("\n\nHawkwind says: Fare thee well and may thou complete the Quest of the Avatar!", result.getPhrase());
		assertEquals("<topic query=\"bye\" phrase=\"\n\nHawkwind says: Fare thee well and may thou complete the Quest of the Avatar! \" />\n", result.toXMLString2());
		assertEquals("        <topic query=\"bye\"\r\n               phrase=\"\n\nHawkwind says: Fare thee well and may thou complete the Quest of the Avatar!\" \r\n               question=\"\"\r\n               no=\"\"\r\n               yes=\"\" />\r\n", result.toXMLString());
	}

	/**
	 * Run the Conversation.Topic matchTopic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMatchTopic_2()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "bye";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\t\tTopic  [query=bye, phrase=\n\nHawkwind says: Fare thee well and may thou complete the Quest of the Avatar!, question=null, yesResponse=null, noResponse=null]", result.toString());
		assertEquals("bye", result.getQuery());
		assertEquals(null, result.getQuestion());
		assertEquals(null, result.getYesResponse());
		assertEquals(false, result.isLbHeal());
		assertEquals(null, result.getNoResponse());
		assertEquals("\n\nHawkwind says: Fare thee well and may thou complete the Quest of the Avatar!", result.getPhrase());
		assertEquals("<topic query=\"bye\" phrase=\"\n\nHawkwind says: Fare thee well and may thou complete the Quest of the Avatar! \" />\n", result.toXMLString2());
		assertEquals("        <topic query=\"bye\"\r\n               phrase=\"\n\nHawkwind says: Fare thee well and may thou complete the Quest of the Avatar!\" \r\n               question=\"\"\r\n               no=\"\"\r\n               yes=\"\" />\r\n", result.toXMLString());
	}

	/**
	 * Run the Conversation.Topic matchTopic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMatchTopic_3()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\t\tTopic  [query=, phrase=He says: That is not a subject for enlightenment., question=null, yesResponse=null, noResponse=null]", result.toString());
		assertEquals("", result.getQuery());
		assertEquals(null, result.getQuestion());
		assertEquals(null, result.getYesResponse());
		assertEquals(false, result.isLbHeal());
		assertEquals(null, result.getNoResponse());
		assertEquals("He says: That is not a subject for enlightenment.", result.getPhrase());
		assertEquals("<topic query=\"\" phrase=\"He says: That is not a subject for enlightenment. \" />\n", result.toXMLString2());
		assertEquals("        <topic query=\"\"\r\n               phrase=\"He says: That is not a subject for enlightenment.\" \r\n               question=\"\"\r\n               no=\"\"\r\n               yes=\"\" />\r\n", result.toXMLString());
	}

	/**
	 * Run the Conversation.Topic matchTopic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMatchTopic_4()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\t\tTopic  [query=, phrase=He says: That is not a subject for enlightenment., question=null, yesResponse=null, noResponse=null]", result.toString());
		assertEquals("", result.getQuery());
		assertEquals(null, result.getQuestion());
		assertEquals(null, result.getYesResponse());
		assertEquals(false, result.isLbHeal());
		assertEquals(null, result.getNoResponse());
		assertEquals("He says: That is not a subject for enlightenment.", result.getPhrase());
		assertEquals("<topic query=\"\" phrase=\"He says: That is not a subject for enlightenment. \" />\n", result.toXMLString2());
		assertEquals("        <topic query=\"\"\r\n               phrase=\"He says: That is not a subject for enlightenment.\" \r\n               question=\"\"\r\n               no=\"\"\r\n               yes=\"\" />\r\n", result.toXMLString());
	}

	/**
	 * Run the Conversation.Topic matchTopic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMatchTopic_5()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\t\tTopic  [query=, phrase=He says: That is not a subject for enlightenment., question=null, yesResponse=null, noResponse=null]", result.toString());
		assertEquals("", result.getQuery());
		assertEquals(null, result.getQuestion());
		assertEquals(null, result.getYesResponse());
		assertEquals(false, result.isLbHeal());
		assertEquals(null, result.getNoResponse());
		assertEquals("He says: That is not a subject for enlightenment.", result.getPhrase());
		assertEquals("<topic query=\"\" phrase=\"He says: That is not a subject for enlightenment. \" />\n", result.toXMLString2());
		assertEquals("        <topic query=\"\"\r\n               phrase=\"He says: That is not a subject for enlightenment.\" \r\n               question=\"\"\r\n               no=\"\"\r\n               yes=\"\" />\r\n", result.toXMLString());
	}

	/**
	 * Run the Conversation.Topic matchTopic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMatchTopic_6()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\t\tTopic  [query=, phrase=He says: That is not a subject for enlightenment., question=null, yesResponse=null, noResponse=null]", result.toString());
		assertEquals("", result.getQuery());
		assertEquals(null, result.getQuestion());
		assertEquals(null, result.getYesResponse());
		assertEquals(false, result.isLbHeal());
		assertEquals(null, result.getNoResponse());
		assertEquals("He says: That is not a subject for enlightenment.", result.getPhrase());
		assertEquals("<topic query=\"\" phrase=\"He says: That is not a subject for enlightenment. \" />\n", result.toXMLString2());
		assertEquals("        <topic query=\"\"\r\n               phrase=\"He says: That is not a subject for enlightenment.\" \r\n               question=\"\"\r\n               no=\"\"\r\n               yes=\"\" />\r\n", result.toXMLString());
	}

	/**
	 * Run the Conversation.Topic matchTopic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testMatchTopic_7()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\t\tTopic  [query=, phrase=He says: That is not a subject for enlightenment., question=null, yesResponse=null, noResponse=null]", result.toString());
		assertEquals("", result.getQuery());
		assertEquals(null, result.getQuestion());
		assertEquals(null, result.getYesResponse());
		assertEquals(false, result.isLbHeal());
		assertEquals(null, result.getNoResponse());
		assertEquals("He says: That is not a subject for enlightenment.", result.getPhrase());
		assertEquals("<topic query=\"\" phrase=\"He says: That is not a subject for enlightenment. \" />\n", result.toXMLString2());
		assertEquals("        <topic query=\"\"\r\n               phrase=\"He says: That is not a subject for enlightenment.\" \r\n               question=\"\"\r\n               no=\"\"\r\n               yes=\"\" />\r\n", result.toXMLString());
	}

	/**
	 * Run the void setParty(Party) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testSetParty_1()
		throws Exception {
		HawkwindConversation fixture = new HawkwindConversation();
		fixture.setParty(new Party(new SaveGame()));
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.turnAwayProb = 1;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.description = "";
		fixture.topics = new ArrayList();
		Party p = new Party(new SaveGame());

		fixture.setParty(p);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(HawkwindConversationTest.class);
	}
}