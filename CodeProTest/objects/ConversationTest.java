package objects;

import java.util.ArrayList;
import java.util.List;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConversationTest</code> contains tests for the class <code>{@link Conversation}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ConversationTest {
	/**
	 * Run the Conversation() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testConversation_1()
		throws Exception {

		Conversation result = new Conversation();

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\tConversation [index=0, name=null, pronoun=null, turnAwayProb=0, description=null, respAffectsHumility=0, topics=[]]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getMap());
		assertEquals(0, result.getIndex());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getPronoun());
		assertEquals(0, result.getTurnAwayProb());
		assertEquals(0, result.getRespAffectsHumility());
	}

	/**
	 * Run the Conversation(int,int,int,int,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testConversation_2()
		throws Exception {
		int index = 1;
		int turnAwayProb = 1;
		int questionFlag = 0;
		int respAffectsHumility = 1;
		String[] strings = new String[] {null, "", "", "", "", "", "", null, null, null, "", ""};

		Conversation result = new Conversation(index, turnAwayProb, questionFlag, respAffectsHumility, strings);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\tConversation [index=1, name=null, pronoun=, turnAwayProb=1, description=, respAffectsHumility=1, topics=[\r\n\t\tTopic null [query=job, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=health, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=look, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=name, phrase= says: I am null, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=give, phrase= says: I do not need thy gold.  Keep it!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=join, phrase= says: I cannot join thee., question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=, phrase=, question=null, yesResponse=null, noResponse=null]]]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getMap());
		assertEquals(1, result.getIndex());
		assertEquals("", result.getDescription());
		assertEquals("", result.getPronoun());
		assertEquals(1, result.getTurnAwayProb());
		assertEquals(1, result.getRespAffectsHumility());
	}

	/**
	 * Run the Conversation(int,int,int,int,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testConversation_3()
		throws Exception {
		int index = 1;
		int turnAwayProb = 1;
		int questionFlag = 6;
		int respAffectsHumility = 1;
		String[] strings = new String[] {null, "", "", "", "", "", "", "", "", "", "", ""};

		Conversation result = new Conversation(index, turnAwayProb, questionFlag, respAffectsHumility, strings);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\tConversation [index=1, name=null, pronoun=, turnAwayProb=1, description=, respAffectsHumility=1, topics=[\r\n\t\tTopic null [query=job, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=health, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=look, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=name, phrase= says: I am null, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=give, phrase= says: I do not need thy gold.  Keep it!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=join, phrase= says: I cannot join thee., question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=, phrase=, question=, yesResponse=, noResponse=]]]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getMap());
		assertEquals(1, result.getIndex());
		assertEquals("", result.getDescription());
		assertEquals("", result.getPronoun());
		assertEquals(1, result.getTurnAwayProb());
		assertEquals(1, result.getRespAffectsHumility());
	}

	/**
	 * Run the Conversation(int,int,int,int,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testConversation_4()
		throws Exception {
		int index = 1;
		int turnAwayProb = 1;
		int questionFlag = 5;
		int respAffectsHumility = 1;
		String[] strings = new String[] {null, "", "", "", "", "", "", "", "", "", "", ""};

		Conversation result = new Conversation(index, turnAwayProb, questionFlag, respAffectsHumility, strings);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\tConversation [index=1, name=null, pronoun=, turnAwayProb=1, description=, respAffectsHumility=1, topics=[\r\n\t\tTopic null [query=job, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=health, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=look, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=name, phrase= says: I am null, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=give, phrase= says: I do not need thy gold.  Keep it!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=join, phrase= says: I cannot join thee., question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=, phrase=, question=, yesResponse=, noResponse=], \r\n\t\tTopic null [query=, phrase=, question=null, yesResponse=null, noResponse=null]]]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getMap());
		assertEquals(1, result.getIndex());
		assertEquals("", result.getDescription());
		assertEquals("", result.getPronoun());
		assertEquals(1, result.getTurnAwayProb());
		assertEquals(1, result.getRespAffectsHumility());
	}

	/**
	 * Run the Conversation(int,int,int,int,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testConversation_5()
		throws Exception {
		int index = 1;
		int turnAwayProb = 1;
		int questionFlag = 1;
		int respAffectsHumility = 1;
		String[] strings = new String[] {null, "", "", "", "", null, null, null, null, null, "", ""};

		Conversation result = new Conversation(index, turnAwayProb, questionFlag, respAffectsHumility, strings);

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\tConversation [index=1, name=null, pronoun=, turnAwayProb=1, description=, respAffectsHumility=1, topics=[\r\n\t\tTopic null [query=job, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=health, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=look, phrase=, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=name, phrase= says: I am null, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=give, phrase= says: I do not need thy gold.  Keep it!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic null [query=join, phrase= says: I cannot join thee., question=null, yesResponse=null, noResponse=null]]]", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getMap());
		assertEquals(1, result.getIndex());
		assertEquals("", result.getDescription());
		assertEquals("", result.getPronoun());
		assertEquals(1, result.getTurnAwayProb());
		assertEquals(1, result.getRespAffectsHumility());
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		String result = fixture.getDescription();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetIndex_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		int result = fixture.getIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertEquals(0, result);
	}

	/**
	 * Run the ultima.Constants.Maps getMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMap_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		ultima.Constants.Maps result = fixture.getMap();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String getPronoun() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetPronoun_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		String result = fixture.getPronoun();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the int getRespAffectsHumility() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetRespAffectsHumility_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		int result = fixture.getRespAffectsHumility();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertEquals(0, result);
	}

	/**
	 * Run the List<Conversation.Topic> getTopics() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTopics_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		List<Conversation.Topic> result = fixture.getTopics();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the int getTurnAwayProb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTurnAwayProb_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		int result = fixture.getTurnAwayProb();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isStandardQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsStandardQuery_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String query = "";

		boolean result = fixture.isStandardQuery(query);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertTrue(result);
	}

	/**
	 * Run the boolean isStandardQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsStandardQuery_2()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String query = "";

		boolean result = fixture.isStandardQuery(query);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertTrue(result);
	}

	/**
	 * Run the boolean isStandardQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsStandardQuery_3()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String query = "";

		boolean result = fixture.isStandardQuery(query);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertTrue(result);
	}

	/**
	 * Run the Conversation.Topic matchTopic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testMatchTopic_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

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
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testMatchTopic_2()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

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
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testMatchTopic_3()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetIndex_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		int index = 1;

		fixture.setIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the void setMap(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMap_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		fixture.setMap(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the void setPronoun(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetPronoun_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		String pronoun = "";

		fixture.setPronoun(pronoun);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the void setRespAffectsHumility(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetRespAffectsHumility_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		int respAffectsHumility = 1;

		fixture.setRespAffectsHumility(respAffectsHumility);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the void setTopics(List<Topic>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTopics_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		List<Conversation.Topic> topics = new ArrayList();

		fixture.setTopics(topics);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the void setTurnAwayProb(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTurnAwayProb_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		int turnAwayProb = 1;

		fixture.setTurnAwayProb(turnAwayProb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString_2()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString_3()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString_4()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString_5()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString_6()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString2(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString2_1()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString2(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString2(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString2_2()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString2(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString2(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString2_3()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString2(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString2(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString2_4()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString2(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString2(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString2_5()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString2(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the String toXMLString2(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToXMLString2_6()
		throws Exception {
		Conversation fixture = new Conversation(1, 1, 1, 1, new String[] {});
		fixture.setName("");
		fixture.setDescription("");
		fixture.setMap(ultima.Constants.Maps.ABYSS);
		fixture.setPronoun("");
		fixture.setTopics(new ArrayList());
		ultima.Constants.Maps m = ultima.Constants.Maps.ABYSS;

		String result = fixture.toXMLString2(m);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Conversation.<init>(Conversation.java:29)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
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
	 * @generatedBy CodePro at 11/06/19 12:58
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
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConversationTest.class);
	}
}