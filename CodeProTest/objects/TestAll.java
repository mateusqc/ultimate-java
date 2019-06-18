package objects;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 11/06/19 13:00
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	LordBritishConversationTest.class,
	PartyTest.class,
	CityTest.class,
	ShrineTest.class,
	BaseMapTest.class,
	AuraTest.class,
	TileTest.class,
	ArmorTest.class,
	RetroActiveDestTest.class,
	CustomInputConversationTest.class,
	LabelTest.class,
	ConstraintTest.class,
	CreatureSetTest.class,
	MapSetTest.class,
	WeaponTypeAdapterTest.class,
	ProjectileActorTest.class,
	WeaponTest.class,
	TileRuleAdapterTest.class,
	WeaponSetTest.class,
	DungeonTest.class,
	ArmorSetTest.class,
	JournalEntriesTest.class,
	PortalTest.class,
	SaveGameTest.class,
	ArmorTypeAdapterTest.class,
	DirectionTypeAdapterTest.class,
	HawkwindConversationTest.class,
	BorderTypeAdapterTest.class,
	ConversationTest.class,
	MapTypeAdapterTest.class,
	CreatureTypeAdapterTest.class,
	JournalEntryTest.class,
	PersonRoleTest.class,
	PersonTest.class,
	TileSetTest.class,
	DrawableTest.class,
	MoongateTest.class,
	CreatureTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/06/19 13:00
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
