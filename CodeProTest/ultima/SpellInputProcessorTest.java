package ultima;

import org.junit.*;
import objects.Party;
import objects.SaveGame;
import static org.junit.Assert.*;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * The class <code>SpellInputProcessorTest</code> contains tests for the class <code>{@link SpellInputProcessor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:16
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class SpellInputProcessorTest {
	/**
	 * Run the SpellInputProcessor(BaseScreen,Context,Stage,int,int,PartyMember) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellInputProcessor_1()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Context context = new Context();
		Stage stage = new Stage();
		int x = 1;
		int y = 1;
		objects.Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellInputProcessor result = new SpellInputProcessor(screen, context, stage, x, y, pm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
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
	 * @generatedBy CodePro at 11/06/19 13:16
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
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SpellInputProcessorTest.class);
	}
}