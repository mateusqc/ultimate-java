package vendor;

import java.util.ArrayList;
import java.util.List;
import ultima.Sound;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VendorClassTest</code> contains tests for the class <code>{@link VendorClass}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:20
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class VendorClassTest {
	/**
	 * Run the Sound getBackgroundMusic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetBackgroundMusic_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);

		Sound result = fixture.getBackgroundMusic();

		// add additional test code here
		assertNotNull(result);
		assertEquals("AcidicRain.ogg", result.getFile());
		assertEquals(0.3f, result.getVolume(), 1.0f);
		assertEquals(false, result.getLooping());
		assertEquals("ACID", result.name());
		assertEquals("ACID", result.toString());
		assertEquals(24, result.ordinal());
	}

	/**
	 * Run the List<Item> getItemCatalog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetItemCatalog_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);

		List<Item> result = fixture.getItemCatalog();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Item getItemForChoice(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetItemForChoice_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(null);
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		String choice = "";

		Item result = fixture.getItemForChoice(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getItemForChoice(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetItemForChoice_2()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		String choice = "";

		Item result = fixture.getItemForChoice(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getItemForChoice(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetItemForChoice_3()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		String choice = "";

		Item result = fixture.getItemForChoice(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getItemForChoice(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetItemForChoice_4()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		String choice = "";

		Item result = fixture.getItemForChoice(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ultima.Constants.InventoryType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);

		ultima.Constants.InventoryType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ARMOR", result.name());
		assertEquals("ARMOR", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the List<Vendor> getVendors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetVendors_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);

		List<Vendor> result = fixture.getVendors();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setBackgroundMusic(Sound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetBackgroundMusic_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		Sound backgroundMusic = Sound.ACID;

		fixture.setBackgroundMusic(backgroundMusic);

		// add additional test code here
	}

	/**
	 * Run the void setItemCatalog(List<Item>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetItemCatalog_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		List<Item> itemCatalog = new ArrayList();

		fixture.setItemCatalog(itemCatalog);

		// add additional test code here
	}

	/**
	 * Run the void setType(InventoryType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setVendors(List<Vendor>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetVendors_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		List<Vendor> vendors = new ArrayList();

		fixture.setVendors(vendors);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testToString_1()
		throws Exception {
		VendorClass fixture = new VendorClass();
		fixture.setBackgroundMusic(Sound.ACID);
		fixture.setItemCatalog(new ArrayList());
		fixture.setVendors(new ArrayList());
		fixture.setType(ultima.Constants.InventoryType.ARMOR);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("VendorClass [type=ARMOR, itemCatalog=[], vendors=[], backgroundMusic=ACID]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
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
	 * @generatedBy CodePro at 11/06/19 13:20
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendorClassTest.class);
	}
}