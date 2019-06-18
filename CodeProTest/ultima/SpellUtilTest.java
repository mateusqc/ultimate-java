package ultima;

import java.util.ArrayList;
import java.util.List;
import objects.Party;
import org.junit.*;
import objects.BaseMap;
import objects.SaveGame;
import objects.CreatureSet;
import util.DungeonTileModelInstance;
import objects.Creature;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * The class <code>SpellUtilTest</code> contains tests for the class <code>{@link SpellUtil}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:16
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class SpellUtilTest {
	/**
	 * Run the void destoryAllCreatures(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testDestoryAllCreatures_1()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		screen.context = context;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.destoryAllCreatures(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void destoryAllCreatures(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testDestoryAllCreatures_2()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		screen.context = context;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.destoryAllCreatures(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void destoryAllCreatures(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testDestoryAllCreatures_3()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.destoryAllCreatures(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellAwaken(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellAwaken_1()
		throws Exception {
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellAwaken(subject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_1()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Context context = new Context();
		Constants.Spell spell = null;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_2()
		throws Exception {
		BaseScreen screen = null;
		Context context = new Context();
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_3()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Context context = new Context();
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = null;
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_4()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Context context = new Context();
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = null;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_5()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Context context = new Context();
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_6()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_7()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_8()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_9()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_10()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_11()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_12()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_13()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_14()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_15()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean spellCast(BaseScreen,Context,Spell,PartyMember,PartyMember,Direction,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCast_16()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.stage = new Stage();
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Spell spell = Constants.Spell.AWAKEN;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;
		int phase = 1;

		boolean result = SpellUtil.spellCast(screen, context, spell, caster, subject, dir, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void spellCure(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellCure_1()
		throws Exception {
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellCure(subject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_1()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_2()
		throws Exception {
		Context context2 = new Context();
		context2.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context2, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Creature creature = new Creature();
		creature.currentY = 1;
		creature.currentX = 1;
		caster.combatCr = creature;
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_3()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.dungeonTiles = new Constants.DungeonTile[][][] {null};
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		screen.currentPos = vector3;
		screen.modelInstances = new ArrayList();
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_4()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		screen.currentPos = vector3;
		screen.modelInstances = new ArrayList();
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_5()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		screen.currentPos = vector3;
		screen.modelInstances = new ArrayList();
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_6()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		screen.currentPos = vector3;
		screen.modelInstances = new ArrayList();
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_7()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		screen.currentPos = vector3;
		screen.modelInstances = new ArrayList();
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_8()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		screen.currentPos = vector3;
		screen.modelInstances = new ArrayList();
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_9()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		screen.currentPos = vector3;
		screen.modelInstances = new ArrayList();
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_10()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_11()
		throws Exception {
		Context context2 = new Context();
		context2.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context2, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Creature creature = new Creature();
		creature.currentY = 1;
		creature.currentX = 1;
		caster.combatCr = creature;
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_12()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_13()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_14()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_15()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellDispel(BaseScreen,Context,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellDispel_16()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellDispel(screen, context, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellEnergyField(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellEnergyField_1()
		throws Exception {
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellEnergyField(dir);

		// add additional test code here
	}

	/**
	 * Run the void spellFireball(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellFireball_1()
		throws Exception {
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellFireball(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellFireball(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellFireball_2()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellFireball(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellGate(BaseScreen,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellGate_1()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		screen.context = context;
		int phase = 1;

		SpellUtil.spellGate(screen, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellGate(BaseScreen,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellGate_2()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		screen.context = context;
		int phase = 1;

		SpellUtil.spellGate(screen, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellGate(BaseScreen,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellGate_3()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		screen.newMapPixelCoords = new Vector3();
		Context context = new Context();
		context.setCurrentMap(new BaseMap());
		screen.context = context;
		int phase = 1;

		SpellUtil.spellGate(screen, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellGate(BaseScreen,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellGate_4()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		int phase = 1;

		SpellUtil.spellGate(screen, phase);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellHeal(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellHeal_1()
		throws Exception {
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellHeal(subject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
	}

	/**
	 * Run the void spellIceball(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellIceball_1()
		throws Exception {
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellIceball(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellIceball(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellIceball_2()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellIceball(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellJinx(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellJinx_1()
		throws Exception {
		Context context = new Context();

		SpellUtil.spellJinx(context);

		// add additional test code here
	}

	/**
	 * Run the void spellKill(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellKill_1()
		throws Exception {
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellKill(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellKill(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellKill_2()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellKill(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellLight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellLight_1()
		throws Exception {

		SpellUtil.spellLight();

		// add additional test code here
	}

	/**
	 * Run the void spellMMissle(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellMMissle_1()
		throws Exception {
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellMMissle(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellMMissle(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellMMissle_2()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellMMissle(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellNegate(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellNegate_1()
		throws Exception {
		Context context = new Context();

		SpellUtil.spellNegate(context);

		// add additional test code here
	}

	/**
	 * Run the void spellOpen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellOpen_1()
		throws Exception {

		SpellUtil.spellOpen();

		// add additional test code here
	}

	/**
	 * Run the void spellProtect(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellProtect_1()
		throws Exception {
		Context context = new Context();

		SpellUtil.spellProtect(context);

		// add additional test code here
	}

	/**
	 * Run the void spellQuick(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellQuick_1()
		throws Exception {
		Context context = new Context();

		SpellUtil.spellQuick(context);

		// add additional test code here
	}

	/**
	 * Run the void spellRez(PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellRez_1()
		throws Exception {
		objects.Party.PartyMember subject = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellRez(subject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
	}

	/**
	 * Run the void spellSleep(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellSleep_1()
		throws Exception {
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellSleep(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellSleep(BaseScreen,PartyMember,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellSleep_2()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());
		Constants.Direction dir = Constants.Direction.EAST;

		SpellUtil.spellSleep(screen, caster, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_9()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_10()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellTremor(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellTremor_11()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellTremor(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_9()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_10()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_11()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_12()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_13()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_14()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_15()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellUndead(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellUndead_16()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellUndead(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellView(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellView_1()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellView(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellView(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellView_2()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellView(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellWinds(BaseScreen,Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellWinds_1()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.context = new Context();
		Constants.Direction fromdir = Constants.Direction.EAST;

		SpellUtil.spellWinds(screen, fromdir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellXit(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellXit_1()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellXit(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellXit(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellXit_2()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellXit(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellXit(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellXit_3()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellXit(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellXit(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellXit_4()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellXit(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellXit(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellXit_5()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellXit(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_1()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_2()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_3()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_4()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_5()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_6()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_7()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_8()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_9()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_10()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellYup(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellYup_11()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellYup(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_1()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_2()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_3()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_4()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_5()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_6()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_7()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_8()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		screen.currentPos = new Vector3();
		screen.camera = new OrthographicCamera();
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_9()
		throws Exception {
		DungeonScreen screen = new DungeonScreen(new GameScreen(new Ultima4()), new Context(), Constants.Maps.ABYSS);
		screen.restoreSaveGameLocation(1, 1, 1, Constants.Direction.EAST);
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void spellZdown(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testSpellZdown_10()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.spellZdown(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useMaskOfMinax(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseMaskOfMinax_1()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useMaskOfMinax(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useMaskOfMinax(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseMaskOfMinax_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useMaskOfMinax(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useMaskOfMinax(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseMaskOfMinax_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useMaskOfMinax(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useMaskOfMinax(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseMaskOfMinax_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useMaskOfMinax(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useMaskOfMinax(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseMaskOfMinax_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useMaskOfMinax(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useMaskOfMinax(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseMaskOfMinax_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useMaskOfMinax(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useMaskOfMinax(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseMaskOfMinax_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useMaskOfMinax(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useMaskOfMinax(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseMaskOfMinax_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useMaskOfMinax(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_1()
		throws Exception {
		GameScreen screen = new GameScreen(new Ultima4());
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_9()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useRageOfGod(BaseScreen,PartyMember) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	@Test
	public void testUseRageOfGod_10()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen screen = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		screen.stage = new Stage();
		screen.scType = Constants.ScreenType.CODEX;
		objects.Party.PartyMember caster = new Party(new SaveGame()).new PartyMember(new Party(new SaveGame()), new SaveGame().new SaveGamePlayerRecord());

		SpellUtil.useRageOfGod(screen, caster);

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
	 * @generatedBy CodePro at 11/06/19 13:16
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
	 * @generatedBy CodePro at 11/06/19 13:16
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
	 * @generatedBy CodePro at 11/06/19 13:16
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SpellUtilTest.class);
	}
}