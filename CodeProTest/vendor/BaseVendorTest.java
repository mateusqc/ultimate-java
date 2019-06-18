package vendor;

import org.junit.*;
import ultima.GameScreen;
import objects.SaveGame;
import static org.junit.Assert.*;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import ultima.Context;
import ultima.Ultima4;
import ultima.BaseScreen;
import objects.Party;
import util.LogScrollPane;
import ultima.Constants;

/**
 * The class <code>BaseVendorTest</code> contains tests for the class <code>{@link BaseVendor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:20
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class BaseVendorTest {
	/**
	 * Run the boolean checkCanPay(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testCheckCanPay_1()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testCheckCanPay_2()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setDescription("");
		item.setPrice(1);

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testCheckCanPay_3()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setPrice(1);

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
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testCheckCanPay_4()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setPrice(1);

		boolean result = fixture.checkCanPay(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPay(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testCheckCanPay_5()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Item item = null;
		int count = 1;

		boolean result = fixture.checkCanPay(item, count);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPay(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testCheckCanPay_6()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setPrice(1);
		int count = 1;

		boolean result = fixture.checkCanPay(item, count);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkCanPay(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testCheckCanPay_7()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		Item item = new Item();
		item.setPrice(1);
		int count = 1;

		boolean result = fixture.checkCanPay(item, count);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void displayToScreen(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testDisplayToScreen_1()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		String s = "";

		fixture.displayToScreen(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void displayToScreen(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testDisplayToScreen_2()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		String s = "";

		fixture.displayToScreen(s);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the LogScrollPane getScrollPane() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testGetScrollPane_1()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();

		LogScrollPane result = fixture.getScrollPane();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void setScreen(BaseScreen) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetScreen_1()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		BaseScreen screen = new GameScreen(new Ultima4());

		fixture.setScreen(screen);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setScrollPane(LogScrollPane) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:20
	 */
	@Test
	public void testSetScrollPane_1()
		throws Exception {
		ArmorVendor fixture = new ArmorVendor(new Vendor(), new Context());
		fixture.screen = new GameScreen(new Ultima4());
		fixture.vendor = new Vendor();
		fixture.party = new Party(new SaveGame());
		fixture.type = ultima.Constants.InventoryType.ARMOR;
		fixture.welcomeMessage = "";
		fixture.state = BaseVendor.ConvState.ANYTHING_ELSE;
		fixture.context = new Context();
		fixture.currentCount = 1;
		fixture.currentSelectedItem = new Item();
		LogScrollPane scrollPane = new LogScrollPane(new Skin(), 1);

		fixture.setScrollPane(scrollPane);

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
		new org.junit.runner.JUnitCore().run(BaseVendorTest.class);
	}
}