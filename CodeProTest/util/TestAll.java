package util;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 11/06/19 13:18
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	UltimaMapRendererTest.class,
	Direction3DTest.class,
	FixedSizeArrayListTest.class,
	RadiusStrategy3DTest.class,
	UltimaTiledMapLoaderTest.class,
	SpreadFOVTest.class,
	CodexLogDisplayTest.class,
	XORShiftRandomTest.class,
	PartyDeathExceptionTest.class,
	BasicRadiusStrategyTest.class,
	DungeonTileModelInstanceTest.class,
	JournalListTest.class,
	FOVSolverTest.class,
	ShadowFOVTest.class,
	DirectionIntercardinalTest.class,
	LogDisplayTest.class,
	DungeonRoomTiledMapLoaderTest.class,
	RadiusStrategyTest.class,
	DirectionCardinalTest.class,
	LogScrollPaneTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
