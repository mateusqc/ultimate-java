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
 * The class <code>ArmorVendorTest</code> contains tests for the class <code>{@link ArmorVendor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:20
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ArmorVendorTest {
	/**
	 * Run the ArmorVendor(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testArmorVendor_1()
		throws Exception {
		Vendor vendor = new Vendor();
		Context context = new Context();

		ArmorVendor result = new ArmorVendor(vendor, context);

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testInit_1()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_1()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setOwner("");
		fixture.vendor = vendor;
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_2()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setName("");
		vendor.setOwner("");
		fixture.vendor = vendor;
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_3()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		fixture.vendor = vendor;
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_4()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		fixture.vendor = vendor;
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_5()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		item.setDescription("");
		fixture.currentSelectedItem = item;

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_6()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_7()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setOwner("");
		fixture.vendor = vendor;
		Item item = new Item();
		item.setPrice(1);
		item.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.currentSelectedItem = item;

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_8()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setVendorClass(new VendorClass());
		fixture.vendor = vendor;
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_9()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setVendorClass(new VendorClass());
		fixture.vendor = vendor;
		fixture.currentSelectedItem = new Item();

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_10()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setVendorClass(new VendorClass());
		fixture.vendor = vendor;
		fixture.currentSelectedItem = new Item();

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_11()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		fixture.currentSelectedItem = item;

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_12()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		item.setName("");
		fixture.currentSelectedItem = item;

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_13()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_14()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		item.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.currentSelectedItem = item;

		boolean result = fixture.nextDialog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean nextDialog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testNextDialog_15()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_1()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_2()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_3()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_4()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.currentSelectedItem = item;
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_5()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		Vendor vendor = new Vendor();
		vendor.setVendorClass(new VendorClass());
		fixture.vendor = vendor;
		fixture.currentSelectedItem = new Item();
		String input = "";

		fixture.setResponse(input);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setResponse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_6()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_7()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_8()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_9()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_10()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_11()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_12()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_13()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_14()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_15()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetResponse_16()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.welcomeMessage = "";
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.currentSelectedItem = new Item();
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
		new org.junit.runner.JUnitCore().run(ArmorVendorTest.class);
	}
}