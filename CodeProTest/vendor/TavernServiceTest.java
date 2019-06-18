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
 * The class <code>TavernServiceTest</code> contains tests for the class <code>{@link TavernService}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:18
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class TavernServiceTest {
	/**
	 * Run the TavernService(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testTavernService_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		Context context = new Context();

		TavernService result = new TavernService(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the TavernService(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testTavernService_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		vendor.setGenericField1("");
		Context context = new Context();

		TavernService result = new TavernService(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the TavernService(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testTavernService_3()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		vendor.setGenericField1("");
		Context context = new Context();

		TavernService result = new TavernService(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the TavernService(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testTavernService_4()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		Context context = new Context();

		TavernService result = new TavernService(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the boolean checkCanPayAle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testCheckCanPayAle_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		fixture.ale = item;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

		boolean result = fixture.checkCanPayAle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPayAle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testCheckCanPayAle_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		fixture.ale = item;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

		boolean result = fixture.checkCanPayAle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPayFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testCheckCanPayFood_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setPrice(1);
		fixture.specFood = item;
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

		boolean result = fixture.checkCanPayFood();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPayFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testCheckCanPayFood_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setPrice(1);
		fixture.specFood = item;
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

		boolean result = fixture.checkCanPayFood();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testInit_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		Vendor vendor1 = new Vendor();
		vendor1.setOwner("");
		vendor1.setName("");
		fixture.vendor = vendor1;
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_3()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setPrice(1);
		fixture.specFood = item;
		fixture.context = new Context();
		fixture.youPay = 1;
		Vendor vendor1 = new Vendor();
		vendor1.setGenericField1("");
		fixture.vendor = vendor1;
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_4()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setPrice(1);
		fixture.specFood = item;
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_5()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		fixture.ale = item;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_6()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_7()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_8()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_9()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		Item item = new Item();
		item.setDescription("");
		fixture.currentSelectedItem = item;
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		Vendor vendor1 = new Vendor();
		vendor1.setOwner("");
		vendor1.setMapId(ultima.Constants.Maps.ABYSS);
		fixture.vendor = vendor1;
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_10()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_11()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_12()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testNextDialog_13()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;

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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		Item item = new Item();
		item.setPrice(1);
		fixture.currentSelectedItem = item;
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_3()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_4()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(2);
		fixture.ale = item;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_5()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(2);
		fixture.ale = item;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_6()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(2);
		fixture.ale = item;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_7()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		fixture.ale = item;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_8()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		Item item = new Item();
		item.setPrice(1);
		fixture.ale = item;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_9()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_10()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_11()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_12()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_13()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_14()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_15()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	@Test
	public void testSetResponse_16()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		TavernService fixture = new TavernService(vendor, new Context());
		fixture.currentSelectedItem = new Item();
		fixture.specFood = new Item();
		fixture.context = new Context();
		fixture.youPay = 1;
		fixture.vendor = new Vendor();
		fixture.ale = new Item();
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.welcomeMessage = "";
		fixture.currentCount = 1;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.tip = 1;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		String input = "f";

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
	 * @generatedBy CodePro at 11/06/19 13:18
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
	 * @generatedBy CodePro at 11/06/19 13:18
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
	 * @generatedBy CodePro at 11/06/19 13:18
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TavernServiceTest.class);
	}
}