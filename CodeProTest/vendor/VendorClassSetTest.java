package vendor;

import java.util.ArrayList;
import java.util.List;
import ultima.Context;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VendorClassSetTest</code> contains tests for the class <code>{@link VendorClassSet}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:19
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class VendorClassSetTest {
	/**
	 * Run the Vendor getVendor(InventoryType,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendor_1()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps id = ultima.Constants.Maps.ABYSS;

		Vendor result = fixture.getVendor(type, id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Vendor getVendor(InventoryType,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendor_2()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps id = ultima.Constants.Maps.ABYSS;

		Vendor result = fixture.getVendor(type, id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Vendor getVendor(InventoryType,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendor_3()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps id = ultima.Constants.Maps.ABYSS;

		Vendor result = fixture.getVendor(type, id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Vendor getVendor(InventoryType,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendor_4()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps id = ultima.Constants.Maps.ABYSS;

		Vendor result = fixture.getVendor(type, id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Vendor getVendor(InventoryType,Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendor_5()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps id = ultima.Constants.Maps.ABYSS;

		Vendor result = fixture.getVendor(type, id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<VendorClass> getVendorClasses() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorClasses_1()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());

		List<VendorClass> result = fixture.getVendorClasses();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_1()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_2()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_3()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_4()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_5()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_6()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_7()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_8()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_9()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_10()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the BaseVendor getVendorImpl(InventoryType,Maps,Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testGetVendorImpl_11()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;
		ultima.Constants.Maps map = ultima.Constants.Maps.ABYSS;
		Context context = new Context();

		BaseVendor result = fixture.getVendorImpl(type, map, context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at vendor.BaseVendor.<init>(BaseVendor.java:67)
		//       at vendor.ArmorVendor.<init>(ArmorVendor.java:10)
		//       at vendor.VendorClassSet.getVendorImpl(VendorClassSet.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testInit_1()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testInit_2()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testInit_3()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void setVendorClasses(List<VendorClass>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetVendorClasses_1()
		throws Exception {
		VendorClassSet fixture = new VendorClassSet();
		fixture.setVendorClasses(new ArrayList());
		List<VendorClass> vendorClasses = new ArrayList();

		fixture.setVendorClasses(vendorClasses);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
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
	 * @generatedBy CodePro at 11/06/19 13:19
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendorClassSetTest.class);
	}
}