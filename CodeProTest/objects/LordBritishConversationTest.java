package objects;

import java.util.ArrayList;
import java.util.List;
import ultima.Context;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LordBritishConversationTest</code> contains tests for the class <code>{@link LordBritishConversation}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class LordBritishConversationTest {
	/**
	 * Run the LordBritishConversation() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testLordBritishConversation_1()
		throws Exception {

		LordBritishConversation result = new LordBritishConversation();

		// add additional test code here
		assertNotNull(result);
		assertEquals("\r\n\tConversation [index=1, name=Lord British, pronoun=He, turnAwayProb=0, description=null, respAffectsHumility=0, topics=[\r\n\t\tTopic Lord British [query=look, phrase=Thou see the King with the Royal Sceptre., question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=name, phrase=He says: My name is Lord British, sovereign of all Britannia!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=job, phrase=He says: I rule all Britannia and shall do my best to help thee!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=truth, phrase=He says:  Many truths can  be learned at  the Lycaeum.  It  lies on the  northwestern  shore of Verity  Isle!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=love, phrase=He says:  Look for the  meaning of Love  at Empath Abbey.  The Abbey sits  on the western  edge of the Deep  Forest! , question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=cour, phrase=He says:  Serpent's Castle  on the Isle of  Deeds is where  Courage should  be sought!    , question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=honesty, phrase=He says:  The fair towne  of Moonglow on  Verity Isle is  where the virtue  of Honesty  thrives!  , question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=compas, phrase=He says:  The bards in the  towne of Britain  are well versed  in the virtue of  Compassion!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=valor, phrase=He says:  Many valiant  fighters come  from Jhelom  in the Valarian  Isles!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=justice, phrase=He says:  In the city of  Yew, in the Deep  Forest, Justice  is served!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=sacr, phrase=He says:  Minoc, towne of  self-sacrifice,  lies on the  eastern shores  of Lost Hope  Bay!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=honor, phrase=He says:  The Paladins who  strive for Honor  are oft seen in  Trinsic, north  of the Cape of  Heroes!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=spirit, phrase=He says:  In Skara Brae  the Spiritual  path is taught.  Find it on an  isle near  Spiritwood!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=humil, phrase=He says:  Humility is the  foundation of  Virtue!  The  ruins of proud  Magincia are a  testimony unto  the Virtue of  Humility! \n\nFind the Ruins  of Magincia far  off the shores  of Britannia,  on a small isle  in the vast  Ocean!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=pride, phrase=He says:  Of the eight  combinations of  Truth, Love and  Courage, that  which contains  neither Truth,  Love nor Courage  is Pride.\n\nPride being not  a Virtue must be  shunned in favor  of Humility, the  Virtue which is  the antithesis  of Pride!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=avatar, phrase=Lord British  says:  To be an Avatar  is to be the  embodiment of  the Eight  Virtues.\n\nIt is to live a  life constantly  and forever in  the Quest to  better thyself  and the world in  which we live. , question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=quest, phrase=Lord British  says:  The Quest of  the Avatar is  to know and  become the  embodiment of  the Eight  Virtues of  Goodness! \n\n It is known that  all who take on  this Quest must  prove themselves  by conquering  the Abyss and  Viewing the  Codex of  Ultimate Wisdom! , question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=brit, phrase=He says:  Even though the  Great Evil Lords  have been routed  evil yet remains  in Britannia.  If but one soul  could complete  the Quest of the  Avatar, our  people would  have a new hope,  a new goal for  life.\n\nThere would be a  shining example  that there is  more to life  than the endless  struggle for  possessions  and gold!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=ankh, phrase=He says:  The Ankh is the  symbol of one  who strives for  Virtue.  Keep it  with thee at all  times for by  this mark thou  shalt be known!  , question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=monda, phrase=He says:  Mondain is dead!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=minax, phrase=He says:  Minax is dead! , question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=exodus, phrase=He says:  Exodus is dead! , question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=virtue, phrase=He says:  The Eight  Virtues of the  Avatar are:  Honesty,  Compassion,  Valor,  Justice,  Sacrifice,  Honor,  Spirituality,  and Humility!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=abyss, phrase=He says:\nThe Great Stygian Abyss is the darkest pocket of evil remaining in Britannia!\nIt is said that in the deepest recesses of the Abyss is the Chamber of the Codex!\nIt is also said that only one of highest Virtue may enter this Chamber, one such as an Avatar!!!, question=null, yesResponse=null, noResponse=null], \r\n\t\tTopic Lord British [query=heal, phrase=He says: I am\nwell, thank ye., question=\n\nArt thou well?, yesResponse=He says: that is good., noResponse=He says: let me heal thy wounds!]]]", result.toString());
		assertEquals("Lord British", result.getName());
		assertEquals(1, result.getIndex());
		assertEquals(null, result.getDescription());
		assertEquals("He", result.getPronoun());
		assertEquals(0, result.getTurnAwayProb());
		assertEquals(0, result.getRespAffectsHumility());
	}

	/**
	 * Run the String intro(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testIntro_1()
		throws Exception {
		LordBritishConversation fixture = new LordBritishConversation();
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.turnAwayProb = 1;
		fixture.description = "";
		fixture.topics = new ArrayList();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));

		String result = fixture.intro(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at objects.LordBritishConversation.intro(LordBritishConversation.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the String intro(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testIntro_2()
		throws Exception {
		LordBritishConversation fixture = new LordBritishConversation();
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.turnAwayProb = 1;
		fixture.description = "";
		fixture.topics = new ArrayList();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));

		String result = fixture.intro(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at objects.LordBritishConversation.intro(LordBritishConversation.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the String intro(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testIntro_3()
		throws Exception {
		LordBritishConversation fixture = new LordBritishConversation();
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.turnAwayProb = 1;
		fixture.description = "";
		fixture.topics = new ArrayList();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));

		String result = fixture.intro(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at objects.LordBritishConversation.intro(LordBritishConversation.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the String intro(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testIntro_4()
		throws Exception {
		LordBritishConversation fixture = new LordBritishConversation();
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.turnAwayProb = 1;
		fixture.description = "";
		fixture.topics = new ArrayList();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));

		String result = fixture.intro(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at objects.LordBritishConversation.intro(LordBritishConversation.java:87)
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
		LordBritishConversation fixture = new LordBritishConversation();
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.turnAwayProb = 1;
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertEquals(null, result);
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
		LordBritishConversation fixture = new LordBritishConversation();
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.turnAwayProb = 1;
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertEquals(null, result);
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
		LordBritishConversation fixture = new LordBritishConversation();
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.turnAwayProb = 1;
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertEquals(null, result);
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
		LordBritishConversation fixture = new LordBritishConversation();
		fixture.index = 1;
		fixture.pronoun = "";
		fixture.map = ultima.Constants.Maps.ABYSS;
		fixture.respAffectsHumility = 1;
		fixture.name = "";
		fixture.turnAwayProb = 1;
		fixture.description = "";
		fixture.topics = new ArrayList();
		String query = "";

		Conversation.Topic result = fixture.matchTopic(query);

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(LordBritishConversationTest.class);
	}
}