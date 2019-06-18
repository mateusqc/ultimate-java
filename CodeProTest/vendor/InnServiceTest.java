package vendor;

import org.junit.*;
import ultima.GameScreen;
import objects.SaveGame;
import ultima.Context;
import ultima.Ultima4;
import ultima.BaseScreen;
import objects.Party;
import static org.junit.Assert.*;
import com.badlogic.gdx.math.Vector3;
import ultima.Constants;

/**
 * The class <code>InnServiceTest</code> contains tests for the class <code>{@link InnService}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:19
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class InnServiceTest {
	/**
	 * Run the InnService(Vendor,Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testInnService_1()
		throws Exception {
		Vendor vendor = new Vendor();
		Context context = new Context();

		InnService result = new InnService(vendor, context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.nextDialog());
		assertEquals(null, result.getScrollPane());
	}

	/**
	 * Run the boolean checkCanPay(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testCheckCanPay_1()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		Item item = null;

		boolean result = fixture.checkCanPay(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPay(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testCheckCanPay_2()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		Item item = new Item();
		item.setPrice(1);

		boolean result = fixture.checkCanPay(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPay(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testCheckCanPay_3()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		SaveGame saveGame = new SaveGame();
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		fixture.party = new Party(saveGame);
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		Item item = new Item();
		item.setPrice(1);

		boolean result = fixture.checkCanPay(item);

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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testInit_1()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_1()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = null;
		Item item = new Item();
		item.setPrice(1);
		fixture.currentSelectedItem = item;
		fixture.vendor = new Vendor();
		fixture.type = ultima.Constants.InventoryType.ARMOR;

		boolean result = fixture.nextDialog();

		// add additional test code here
		assertEquals(true, result);
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
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		GameScreen gameScreen = new GameScreen(new Ultima4());
		gameScreen.newMapPixelCoords = new Vector3();
		fixture.screen = gameScreen;
		Item item = new Item();
		item.setRoomX(1);
		item.setPrice(1);
		item.setRoomY(1);
		fixture.currentSelectedItem = item;
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_3()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_4()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_5()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_6()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setName("");
		vendor.setOwner("");
		fixture.vendor = vendor;
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_7()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		Vendor vendor = new Vendor();
		vendor.setGenericField1("");
		fixture.vendor = vendor;
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testNextDialog_8()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_1()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_2()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
		fixture.type = ultima.Constants.InventoryType.ARMOR;
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
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_4()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_5()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_6()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_7()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_8()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_9()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_10()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
	 * @generatedBy CodePro at 11/06/19 13:19
	 */
	@Test
	public void testSetResponse_11()
		throws Exception {
		InnService fixture = new InnService(new Vendor(), new Context());
		fixture.context = new Context();
		fixture.rentedRoom = true;
		fixture.party = new Party(new SaveGame());
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.currentCount = 1;
		fixture.welcomeMessage = "";
		fixture.screen = new GameScreen(new Ultima4());
		fixture.currentSelectedItem = new Item();
		fixture.vendor = new Vendor();
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
		new org.junit.runner.JUnitCore().run(InnServiceTest.class);
	}
}