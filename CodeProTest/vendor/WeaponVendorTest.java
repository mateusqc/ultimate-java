package vendor;

import java.util.ArrayList;
import java.util.List;
import ultima.Constants;
import objects.Party;
import org.junit.*;
import ultima.GameScreen;
import objects.SaveGame;
import ultima.Context;
import ultima.Ultima4;
import ultima.BaseScreen;
import static org.junit.Assert.*;

/**
 * The class <code>WeaponVendorTest</code> contains tests for the class <code>{@link WeaponVendor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:21
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class WeaponVendorTest {
	/**
	 * Run the WeaponVendor(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testWeaponVendor_1()
		throws Exception {
		Vendor vendor = new Vendor();
		Context context = new Context();

		WeaponVendor result = new WeaponVendor(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testInit_1()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_1()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setOwner("");
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_2()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setOwner("");
		vendor.setName("");
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_3()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_4()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_5()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		Item item = new Item();
		item.setPrice(1);
		item.setDescription("");
		fixture.currentSelectedItem = item;
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_6()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		Item item = new Item();
		item.setPrice(1);
		item.setDescription("");
		fixture.currentSelectedItem = item;
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_7()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		Item item = new Item();
		item.setWeaponType(ultima.Constants.WeaponType.AXE);
		item.setPrice(1);
		fixture.currentSelectedItem = item;
		Vendor vendor = new Vendor();
		vendor.setOwner("");
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_8()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setVendorClass(new VendorClass());
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_9()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setVendorClass(new VendorClass());
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_10()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setVendorClass(new VendorClass());
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_11()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		Item item = new Item();
		item.setPrice(1);
		fixture.currentSelectedItem = item;
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_12()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		Item item = new Item();
		item.setPrice(1);
		item.setName("");
		fixture.currentSelectedItem = item;
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_13()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_14()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		Item item = new Item();
		item.setWeaponType(ultima.Constants.WeaponType.AXE);
		item.setPrice(1);
		fixture.currentSelectedItem = item;
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testNextDialog_15()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_1()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "a";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_2()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_3()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_4()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		Item item = new Item();
		item.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.currentSelectedItem = item;
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_5()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setVendorClass(new VendorClass());
		fixture.vendor = vendor;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_6()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_7()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_8()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "y";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_9()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_10()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_11()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_12()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_13()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_14()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_15()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "s";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetResponse_16()
		throws Exception {
		WeaponVendor fixture = new WeaponVendor(new Vendor(), new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.party = new Party(new SaveGame());
		String input = "b";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
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
	 * @generatedBy CodePro at 11/06/19 13:21
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
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WeaponVendorTest.class);
	}
}