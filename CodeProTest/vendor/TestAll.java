package vendor;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 11/06/19 13:21
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	WeaponVendorTest.class,
	VendorTest.class,
	HorseServiceTest.class,
	VendorClassSetTest.class,
	GuildVendorTest.class,
	InventoryTypeAdapterTest.class,
	FoodVendorTest.class,
	ReagentTypeAdapterTest.class,
	MapIdAdapterTest.class,
	GuildItemAdapterTest.class,
	HealTypeAdapterTest.class,
	BaseVendorTest.class,
	ArmorVendorTest.class,
	InnServiceTest.class,
	SoundAdapterTest.class,
	InputTest.class,
	WeaponAdapterTest.class,
	HealerServiceTest.class,
	TinkerDialogTest.class,
	ArmorAdapterTest.class,
	VendorClassTest.class,
	ItemTest.class,
	ReagentServiceTest.class,
	TavernServiceTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
