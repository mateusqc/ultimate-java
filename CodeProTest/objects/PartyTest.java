package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import ultima.Constants;
import java.util.Observer;
import ultima.GameScreen;
import ultima.Context;
import ultima.Ultima4;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PartyTest</code> contains tests for the class <code>{@link Party}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class PartyTest {
	/**
	 * Run the Party(SaveGame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testParty_1()
		throws Exception {
		SaveGame sg = new SaveGame();
		sg.players = new SaveGame.SaveGamePlayerRecord[] {new SaveGame().new SaveGamePlayerRecord()};
		sg.members = 1;

		Party result = new Party(sg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContext());
		assertEquals(null, result.getTransport());
		assertEquals(0, result.getActivePlayer());
		assertEquals(0, result.getTorchduration());
		assertEquals(true, result.isRoundDone());
		assertEquals(false, result.didAnyoneFlee());
		assertEquals(true, result.isAnyoneAlive());
		assertEquals(false, result.isFlying());
		assertEquals(58, result.getChestGold());
		assertEquals(0, result.getNextActiveIndex());
		assertEquals(1, result.getAbleCombatPlayers());
		assertEquals(0, result.countObservers());
		assertEquals(false, result.hasChanged());
	}

	/**
	 * Run the Party(SaveGame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testParty_2()
		throws Exception {
		SaveGame sg = new SaveGame();
		sg.members = 0;

		Party result = new Party(sg);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContext());
		assertEquals(null, result.getTransport());
		assertEquals(0, result.getActivePlayer());
		assertEquals(0, result.getTorchduration());
		assertEquals(true, result.isRoundDone());
		assertEquals(false, result.didAnyoneFlee());
		assertEquals(false, result.isAnyoneAlive());
		assertEquals(false, result.isFlying());
		assertEquals(33, result.getChestGold());
		assertEquals(null, result.getAndSetNextActivePlayer());
		assertEquals(0, result.getAbleCombatPlayers());
		assertEquals(0, result.countObservers());
		assertEquals(false, result.hasChanged());
	}

	/**
	 * Run the void addMember(SaveGamePlayerRecord) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testAddMember_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame.SaveGamePlayerRecord rec = null;

		fixture.addMember(rec);

		// add additional test code here
	}

	/**
	 * Run the void addMember(SaveGamePlayerRecord) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testAddMember_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame.SaveGamePlayerRecord rec = new SaveGame().new SaveGamePlayerRecord();

		fixture.addMember(rec);

		// add additional test code here
	}

	/**
	 * Run the void adjustFood(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustFood_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int v = 1;

		fixture.adjustFood(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustGold(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustGold_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int v = 1;

		fixture.adjustGold(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_5()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_6()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_7()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_8()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_9()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_10()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_11()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_12()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_13()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_14()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_15()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void adjustKarma(KarmaAction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustKarma_16()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.KarmaAction action = ultima.Constants.KarmaAction.ATTACKED_GOOD;

		fixture.adjustKarma(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the int adjustShipHull(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAdjustShipHull_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int val = 1;

		int result = fixture.adjustShipHull(val);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_5()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_6()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_7()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_8()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_9()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_10()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_11()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_12()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_13()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_14()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_15()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_16()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_17()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_18()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_19()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_20()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_21()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_22()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_23()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_24()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_25()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_26()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_27()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_28()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_29()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_30()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void applyEffect(PartyMember,TileEffect) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testApplyEffect_31()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame1 = new SaveGame();
		saveGame1.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame1.members = 1;
		Party party = new Party(saveGame1);
		Party.PartyMember pm = new Party(new SaveGame()).new PartyMember(party, new SaveGame().new SaveGamePlayerRecord());
		ultima.Constants.TileEffect effect = ultima.Constants.TileEffect.ELECTRICITY;

		fixture.applyEffect(pm, effect);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the boolean attemptElevation(Virtue) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAttemptElevation_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.Virtue virtue = ultima.Constants.Virtue.COMPASSION;

		boolean result = fixture.attemptElevation(virtue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean attemptElevation(Virtue) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testAttemptElevation_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.Virtue virtue = ultima.Constants.Virtue.COMPASSION;

		boolean result = fixture.attemptElevation(virtue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean canEnterShrine(Virtue) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testCanEnterShrine_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.Virtue virtue = ultima.Constants.Virtue.COMPASSION;

		boolean result = fixture.canEnterShrine(virtue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean canEnterShrine(Virtue) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testCanEnterShrine_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.Virtue virtue = ultima.Constants.Virtue.COMPASSION;

		boolean result = fixture.canEnterShrine(virtue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the void damageParty(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageParty_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int minDamage = 1;
		int maxDamage = 1;

		fixture.damageParty(minDamage, maxDamage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void damageParty(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageParty_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int minDamage = -1;
		int maxDamage = 1;

		fixture.damageParty(minDamage, maxDamage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void damageParty(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageParty_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int minDamage = 1;
		int maxDamage = 1;

		fixture.damageParty(minDamage, maxDamage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void damageParty(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageParty_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int minDamage = 1;
		int maxDamage = 1;

		fixture.damageParty(minDamage, maxDamage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void damageParty(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageParty_5()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int minDamage = 1;
		int maxDamage = 1;

		fixture.damageParty(minDamage, maxDamage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void damageParty(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageParty_6()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int minDamage = 1;
		int maxDamage = 1;

		fixture.damageParty(minDamage, maxDamage);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the boolean didAnyoneFlee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDidAnyoneFlee_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.didAnyoneFlee();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean didAnyoneFlee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDidAnyoneFlee_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.didAnyoneFlee();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean didAnyoneFlee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDidAnyoneFlee_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.didAnyoneFlee();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_5()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_6()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_7()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_8()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_9()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_10()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_11()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_12()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_13()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_14()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_15()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void endTurn(MapType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testEndTurn_16()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.MapType mapType = ultima.Constants.MapType.city;

		fixture.endTurn(mapType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the int getAbleCombatPlayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAbleCombatPlayers_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getAbleCombatPlayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAbleCombatPlayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAbleCombatPlayers_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getAbleCombatPlayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the int getAbleCombatPlayers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAbleCombatPlayers_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getAbleCombatPlayers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the Party.PartyMember getActivePartyMember() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetActivePartyMember_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		Party.PartyMember result = fixture.getActivePartyMember();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the int getActivePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetActivePlayer_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getActivePlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the Party.PartyMember getAndSetNextActivePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAndSetNextActivePlayer_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		Party.PartyMember result = fixture.getAndSetNextActivePlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the Party.PartyMember getAndSetNextActivePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAndSetNextActivePlayer_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		Party.PartyMember result = fixture.getAndSetNextActivePlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the Party.PartyMember getAndSetNextActivePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAndSetNextActivePlayer_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		Party.PartyMember result = fixture.getAndSetNextActivePlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the Party.PartyMember getAndSetNextActivePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAndSetNextActivePlayer_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		Party.PartyMember result = fixture.getAndSetNextActivePlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the int getChestGold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetChestGold_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getChestGold();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the Context getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetContext_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		Context result = fixture.getContext();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the Party.PartyMember getMember(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMember_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int index = 1;

		Party.PartyMember result = fixture.getMember(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the Party.PartyMember getMember(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMember_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int index = 1;

		Party.PartyMember result = fixture.getMember(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the List<Party.PartyMember> getMembers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMembers_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		List<Party.PartyMember> result = fixture.getMembers();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the int getNextActiveIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetNextActiveIndex_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getNextActiveIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNextActiveIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetNextActiveIndex_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getNextActiveIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the int getNextActiveIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetNextActiveIndex_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getNextActiveIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the SaveGame getSaveGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetSaveGame_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		SaveGame result = fixture.getSaveGame();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the int getTorchduration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTorchduration_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		int result = fixture.getTorchduration();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertEquals(0, result);
	}

	/**
	 * Run the Tile getTransport() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTransport_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		Tile result = fixture.getTransport();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.Virtue getVirtueForJoinable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetVirtueForJoinable_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.Virtue result = fixture.getVirtueForJoinable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.Virtue getVirtueForJoinable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetVirtueForJoinable_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {null};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.Virtue result = fixture.getVirtueForJoinable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.Virtue getVirtueForJoinable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetVirtueForJoinable_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {null};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.Virtue result = fixture.getVirtueForJoinable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.Virtue getVirtueForJoinable(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetVirtueForJoinable_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.Virtue result = fixture.getVirtueForJoinable(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAnyoneAlive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsAnyoneAlive_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isAnyoneAlive();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAnyoneAlive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsAnyoneAlive_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isAnyoneAlive();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isAnyoneAlive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsAnyoneAlive_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isAnyoneAlive();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isFlying() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsFlying_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isFlying();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isFlying() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsFlying_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isFlying();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isJoinedInParty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsJoinedInParty_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		boolean result = fixture.isJoinedInParty(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isJoinedInParty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsJoinedInParty_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		boolean result = fixture.isJoinedInParty(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isJoinedInParty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsJoinedInParty_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		boolean result = fixture.isJoinedInParty(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOKtoExitDirection(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsOKtoExitDirection_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.Direction dir = ultima.Constants.Direction.EAST;

		boolean result = fixture.isOKtoExitDirection(dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOKtoExitDirection(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsOKtoExitDirection_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.Direction dir = ultima.Constants.Direction.EAST;

		boolean result = fixture.isOKtoExitDirection(dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOKtoExitDirection(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsOKtoExitDirection_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.Direction dir = ultima.Constants.Direction.EAST;

		boolean result = fixture.isOKtoExitDirection(dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isOKtoExitDirection(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsOKtoExitDirection_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		ultima.Constants.Direction dir = ultima.Constants.Direction.EAST;

		boolean result = fixture.isOKtoExitDirection(dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRoundDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsRoundDone_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isRoundDone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRoundDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsRoundDone_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isRoundDone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRoundDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsRoundDone_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isRoundDone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the boolean isRoundDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsRoundDone_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		boolean result = fixture.isRoundDone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertTrue(result);
	}

	/**
	 * Run the ultima.Constants.CannotJoinError join(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testJoin_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.CannotJoinError result = fixture.join(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.CannotJoinError join(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testJoin_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.CannotJoinError result = fixture.join(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.CannotJoinError join(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testJoin_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.CannotJoinError result = fixture.join(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.CannotJoinError join(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testJoin_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.CannotJoinError result = fixture.join(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.CannotJoinError join(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testJoin_5()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {null};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.CannotJoinError result = fixture.join(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the ultima.Constants.CannotJoinError join(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testJoin_6()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 8;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		String name = "";

		ultima.Constants.CannotJoinError result = fixture.join(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the void killAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testKillAll_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		fixture.killAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void killAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testKillAll_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		fixture.killAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testReset_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		fixture.reset();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testReset_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		fixture.reset();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void reviveAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testReviveAll_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		fixture.reviveAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void reviveAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testReviveAll_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));

		fixture.reviveAll();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setContext(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetContext_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		Context context = new Context();

		fixture.setContext(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setMembers(List<PartyMember>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMembers_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		List<Party.PartyMember> members = new ArrayList();

		fixture.setMembers(members);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setSaveGame(SaveGame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetSaveGame_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		SaveGame saveGame = new SaveGame();

		fixture.setSaveGame(saveGame1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setTorchduration(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTorchduration_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int torchduration = 1;

		fixture.setTorchduration(torchduration);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setTransport(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTransport_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		Tile transport = new Tile();
		transport.setRule(ultima.Constants.TileRule.balloon);
		transport.setIndex(1);

		fixture.setTransport(transport);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setTransport(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTransport_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		Tile transport = new Tile();
		transport.setRule(ultima.Constants.TileRule.balloon);
		transport.setIndex(1);

		fixture.setTransport(transport);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setTransport(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTransport_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		Tile transport = new Tile();
		transport.setRule(ultima.Constants.TileRule.balloon);
		transport.setIndex(1);

		fixture.setTransport(transport);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void setTransport(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTransport_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		Tile transport = new Tile();
		transport.setRule(ultima.Constants.TileRule.balloon);
		transport.setIndex(1);

		fixture.setTransport(transport);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void swapPlayers(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSwapPlayers_1()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int p1 = 1;
		int p2 = 1;

		fixture.swapPlayers(p1, p2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void swapPlayers(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSwapPlayers_2()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int p1 = 1;
		int p2 = 1;

		fixture.swapPlayers(p1, p2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at objects.Party.<init>(Party.java:32)
	}

	/**
	 * Run the void swapPlayers(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSwapPlayers_3()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {null};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int p1 = 1;
		int p2 = 1;

		fixture.swapPlayers(p1, p2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void swapPlayers(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSwapPlayers_4()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {null};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int p1 = 1;
		int p2 = 1;

		fixture.swapPlayers(p1, p2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void swapPlayers(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSwapPlayers_5()
		throws Exception {
		SaveGame saveGame = new SaveGame();
		saveGame.players = new SaveGame.SaveGamePlayerRecord[] {null};
		saveGame.members = 1;
		Party fixture = new Party(saveGame);
		fixture.setContext(new Context());
		Tile tile = new Tile();
		tile.setRule(ultima.Constants.TileRule.balloon);
		tile.setIndex(1);
		fixture.setTransport(tile);
		fixture.setTorchduration(1);
		fixture.setMembers(new ArrayList());
		fixture.addObserver(new GameScreen(new Ultima4()));
		int p1 = 1;
		int p2 = 1;

		fixture.swapPlayers(p1, p2);

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
	 * @generatedBy CodePro at 11/06/19 12:58
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
	 * @generatedBy CodePro at 11/06/19 12:58
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
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PartyTest.class);
	}
}