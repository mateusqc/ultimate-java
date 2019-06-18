package vendor;

import java.util.ArrayList;
import java.util.List;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VendorTest</code> contains tests for the class <code>{@link Vendor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:20
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class VendorTest {
	/**
	 * Run the String getGenericField1() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetGenericField1_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		String result = fixture.getGenericField1();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<Item> getInventoryItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetInventoryItems_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		List<Item> result = fixture.getInventoryItems();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Item getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String choice = "";

		Item result = fixture.getItem(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetItem_2()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String choice = "";

		Item result = fixture.getItem(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetItem_3()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String choice = "";

		Item result = fixture.getItem(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ultima.Constants.Maps getMapId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetMapId_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		ultima.Constants.Maps result = fixture.getMapId();

		// add additional test code here
		assertNotNull(result);
		assertEquals(24, result.getId());
		assertEquals(null, result.getMap());
		assertEquals("The Abyss", result.getLabel());
		assertEquals("ABYSS", result.name());
		assertEquals("ABYSS", result.toString());
		assertEquals(26, result.ordinal());
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetOwner_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		String result = fixture.getOwner();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getPersonId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetPersonId_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		int result = fixture.getPersonId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Item getTavernInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetTavernInfo_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String choice = "";

		Item result = fixture.getTavernInfo(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getTavernInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetTavernInfo_2()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String choice = "";

		Item result = fixture.getTavernInfo(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getTavernInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetTavernInfo_3()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String choice = "";

		Item result = fixture.getTavernInfo(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getTavernInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetTavernInfo_4()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String choice = "";

		Item result = fixture.getTavernInfo(choice);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendorClass getVendorClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetVendorClass_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		VendorClass result = fixture.getVendorClass();

		// add additional test code here
		assertNotNull(result);
		assertEquals("VendorClass [type=null, itemCatalog=null, vendors=null, backgroundMusic=null]", result.toString());
		assertEquals(null, result.getType());
		assertEquals(null, result.getVendors());
		assertEquals(null, result.getItemCatalog());
		assertEquals(null, result.getBackgroundMusic());
	}

	/**
	 * Run the ultima.Constants.InventoryType getVendorType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetVendorType_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		ultima.Constants.InventoryType result = fixture.getVendorType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ARMOR", result.name());
		assertEquals("ARMOR", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the void setGenericField1(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetGenericField1_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String genericField1 = "";

		fixture.setGenericField1(genericField1);

		// add additional test code here
	}

	/**
	 * Run the void setInventoryItems(List<Item>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetInventoryItems_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		List<Item> inventoryItems = new ArrayList();

		fixture.setInventoryItems(inventoryItems);

		// add additional test code here
	}

	/**
	 * Run the void setMapId(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetMapId_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		ultima.Constants.Maps mapId = ultima.Constants.Maps.ABYSS;

		fixture.setMapId(mapId);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setOwner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetOwner_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		String owner = "";

		fixture.setOwner(owner);

		// add additional test code here
	}

	/**
	 * Run the void setPersonId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetPersonId_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		int personId = 1;

		fixture.setPersonId(personId);

		// add additional test code here
	}

	/**
	 * Run the void setVendorClass(VendorClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetVendorClass_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		VendorClass vendorClass = new VendorClass();

		fixture.setVendorClass(vendorClass);

		// add additional test code here
	}

	/**
	 * Run the void setVendorType(InventoryType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetVendorType_1()
		throws Exception {
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");
		ultima.Constants.InventoryType vendorType = ultima.Constants.InventoryType.ARMOR;

		fixture.setVendorType(vendorType);

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
		Vendor fixture = new Vendor();
		fixture.setPersonId(1);
		fixture.setName("");
		fixture.setVendorClass(new VendorClass());
		fixture.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.setInventoryItems(new ArrayList());
		fixture.setVendorType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGenericField1("");
		fixture.setOwner("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Vendor [mapId=ABYSS, name=, owner=, personId=1]", result);
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
		new org.junit.runner.JUnitCore().run(VendorTest.class);
	}
}