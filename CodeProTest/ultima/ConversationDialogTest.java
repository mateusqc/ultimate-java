package ultima;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import vendor.InnService;
import vendor.Vendor;
import vendor.ArmorVendor;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import vendor.BaseVendor;
import objects.Person;
import com.badlogic.gdx.scenes.scene2d.actions.RunnableAction;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import util.LogScrollPane;
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener;
import objects.Conversation;

/**
 * The class <code>ConversationDialogTest</code> contains tests for the class <code>{@link ConversationDialog}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:01
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ConversationDialogTest {
	/**
	 * Run the ConversationDialog(Person,GameScreen,Stage) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testConversationDialog_1()
		throws Exception {
		Person p = new Person();
		GameScreen screen = new GameScreen(new Ultima4());
		Stage stage = new Stage();

		ConversationDialog result = new ConversationDialog(p, screen, stage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void hide() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_1()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");

		fixture.hide();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_2()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		InnService innService = new InnService(new Vendor(), new Context());
		innService.rentedRoom = true;
		fixture.vendor = innService;
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = null;

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_3()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		InnService innService = new InnService(new Vendor(), new Context());
		innService.rentedRoom = false;
		fixture.vendor = innService;
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_4()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = null;
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_5()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = null;
		fixture.previousScrollFocus = null;
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_6()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = null;
		fixture.previousScrollFocus = null;
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_7()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = null;
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_8()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_9()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = null;
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_10()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_11()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_12()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = null;
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_13()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_14()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_15()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = null;
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_16()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void hide(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testHide_17()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Action action = new RunnableAction();

		fixture.hide(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the ConversationDialog show(Stage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testShow_1()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Stage stage = new Stage();

		ConversationDialog result = fixture.show(stage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ConversationDialog show(Stage,Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testShow_2()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Stage stage = new Stage();
		Action action = new RunnableAction();

		ConversationDialog result = fixture.show(stage, action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ConversationDialog show(Stage,Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testShow_3()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Stage stage = new Stage();
		Action action = new RunnableAction();

		ConversationDialog result = fixture.show(stage, action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ConversationDialog show(Stage,Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testShow_4()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Stage stage = new Stage();
		Action action = null;

		ConversationDialog result = fixture.show(stage, action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void workspace(Stage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testWorkspace_1()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Stage stage = new Stage();

		fixture.workspace(stage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void workspace(Stage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	@Test
	public void testWorkspace_2()
		throws Exception {
		ConversationDialog fixture = new ConversationDialog(new Person(), new GameScreen(new Ultima4()), new Stage());
		fixture.ignoreTouchDown = new InputListener();
		fixture.internalTable = new Table();
		fixture.input = new TextField("", new Skin());
		fixture.focusListener = null;
		fixture.vendor = new ArmorVendor(new Vendor(), new Context());
		fixture.scrollPane = new LogScrollPane(new Skin(), 1);
		fixture.previousKeyboardFocus = new Actor();
		fixture.previousScrollFocus = new Actor();
		fixture.cancelHide = true;
		fixture.previousTopic = new Conversation().new Topic("");
		Stage stage = null;

		fixture.workspace(stage);

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
	 * @generatedBy CodePro at 11/06/19 13:01
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
	 * @generatedBy CodePro at 11/06/19 13:01
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
	 * @generatedBy CodePro at 11/06/19 13:01
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConversationDialogTest.class);
	}
}