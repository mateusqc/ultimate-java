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
 * The class <code>FoodVendorTest</code> contains tests for the class <code>{@link FoodVendor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:19
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class FoodVendorTest {
	/**
	 * Run the FoodVendor(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testFoodVendor_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		Context context = new Context();

		FoodVendor result = new FoodVendor(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the FoodVendor(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testFoodVendor_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		Context context = new Context();

		FoodVendor result = new FoodVendor(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the FoodVendor(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testFoodVendor_3()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		Context context = new Context();

		FoodVendor result = new FoodVendor(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the boolean checkCanPayFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testCheckCanPayFood_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		fixture.context = new Context();
		Item item = new Item();
		item.setPrice(1);
		fixture.food = item;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

		boolean result = fixture.checkCanPayFood();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPayFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testCheckCanPayFood_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		fixture.context = new Context();
		Item item = new Item();
		item.setPrice(1);
		fixture.food = item;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

		boolean result = fixture.checkCanPayFood();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
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
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		Vendor vendor1 = new Vendor();
		vendor1.setName("");
		vendor1.setOwner("");
		fixture.vendor = vendor1;

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_3()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		Item item = new Item();
		item.setQuantity(1);
		item.setPrice(1);
		fixture.food = item;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_4()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		fixture.context = new Context();
		Item item = new Item();
		item.setQuantity(1);
		item.setPrice(1);
		fixture.food = item;
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_5()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_6()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_7()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_1()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_2()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		String input = null;

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_3()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_4()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_5()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_6()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "a";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		String input = "0";

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_7()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_8()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "a";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		String input = "0";

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_9()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_10()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "a";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		String input = "0";

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_11()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_12()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_13()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_14()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_15()
		throws Exception {
		Vendor vendor = new Vendor();
		vendor.setInventoryItems(new ArrayList());
		FoodVendor fixture = new FoodVendor(vendor, new Context());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.screen = new GameScreen(new Ultima4());
		fixture.party = new Party(new SaveGame());
		fixture.context = new Context();
		fixture.food = new Item();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		String input = "y";

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
		new org.junit.runner.JUnitCore().run(FoodVendorTest.class);
	}
}