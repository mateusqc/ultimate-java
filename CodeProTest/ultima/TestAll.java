package ultima;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 11/06/19 13:16
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	SoundsTest.class,
	ConstantsTest.class,
	GameScreenTest.class,
	SpellUtilTest.class,
	CombatScreenTest.class,
	MixtureScreenTest.class,
	SpellInputProcessorTest.class,
	CodexScreenTest.class,
	DeathScreenTest.class,
	SoundTest.class,
	BaseScreenTest.class,
	JournalScreenTest.class,
	StartScreenTest.class,
	ContextTest.class,
	DungeonScreenTest.class,
	SecondaryInputProcessorTest.class,
	ConversationDialogTest.class,
	ShrineScreenTest.class,
	Ultima4Test.class,
	BookScreenTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
