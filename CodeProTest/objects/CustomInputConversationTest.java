package objects;

import java.util.ArrayList;
import java.util.List;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CustomInputConversationTest</code> contains tests for the class <code>{@link CustomInputConversation}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class CustomInputConversationTest {
	/**
	 * Run the CustomInputConversation(Tile,Conversation) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testCustomInputConversation_1()
		throws Exception {
		Tile tile = new Tile();
		Conversation orig = new Conversation(1, 1, 1, 1, new String[] {});
		orig.setMap(ultima.Constants.Maps.ABYSS);
		orig.setName("");
		orig.setTopics(new ArrayList());
		orig.setDescription("");
		orig.setPronoun("");

		CustomInputConversation result = new CustomInputConversation(tile, orig);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String getCustomInputQuery() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetCustomInputQuery_1()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;

		String result = fixture.getCustomInputQuery();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String getCustomInputResponse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetCustomInputResponse_1()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;

		String result = fixture.getCustomInputResponse();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the Party getParty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetParty_1()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;

		Party result = fixture.getParty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;
		String input = "";

		Conversation.Topic result = fixture.matchTopic(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
	public void testMatchTopic_2()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "a";
		fixture.pronoun = "a";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "a";
		fixture.respAffectsHumility = 1;
		String input = "0";

		Conversation.Topic result = fixture.matchTopic(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
	public void testMatchTopic_3()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "a";
		fixture.pronoun = "a";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "a";
		fixture.respAffectsHumility = 1;
		String input = "0";

		Conversation.Topic result = fixture.matchTopic(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
	public void testMatchTopic_4()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty((Party) null);
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;
		String input = "";

		Conversation.Topic result = fixture.matchTopic(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
	public void testMatchTopic_5()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;
		String input = "";

		Conversation.Topic result = fixture.matchTopic(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
	public void testMatchTopic_6()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;
		String input = "";

		Conversation.Topic result = fixture.matchTopic(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
	public void testMatchTopic_7()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;
		String input = "";

		Conversation.Topic result = fixture.matchTopic(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the void setCustomInputQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testSetCustomInputQuery_1()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;
		String customInputQuery = "";

		fixture.setCustomInputQuery(customInputQuery);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the void setCustomInputResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testSetCustomInputResponse_1()
		throws Exception {
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;
		String customInputResponse = "";

		fixture.setCustomInputResponse(customInputResponse);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
		Conversation conversation = new Conversation(1, 1, 1, 1, new String[] {});
		conversation.setMap(ultima.Constants.Maps.ABYSS);
		conversation.setName("");
		conversation.setTopics(new ArrayList());
		conversation.setDescription("");
		conversation.setPronoun("");
		CustomInputConversation fixture = new CustomInputConversation(new Tile(), conversation);
		fixture.setCustomInputResponse("");
		fixture.setParty(new Party(new SaveGame()));
		fixture.setCustomInputQuery("");
		fixture.name = "";
		fixture.pronoun = "";
		fixture.turnAwayProb = 1;
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.index = 1;
		fixture.topics = new ArrayList();
		fixture.description = "";
		fixture.respAffectsHumility = 1;
		Party party = new Party(new SaveGame());

		fixture.setParty(party);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
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
		new org.junit.runner.JUnitCore().run(CustomInputConversationTest.class);
	}
}