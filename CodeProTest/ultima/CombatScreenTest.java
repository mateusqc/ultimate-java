package ultima;

import java.util.ArrayList;
import java.util.List;
import objects.Party;
import java.util.Random;
import org.junit.*;
import objects.BaseMap;
import objects.SaveGame;
import objects.CreatureSet;
import objects.Creature;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * The class <code>CombatScreenTest</code> contains tests for the class <code>{@link CombatScreen}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:04
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class CombatScreenTest {
	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_1()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = Constants.CreatureType.balron;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_2()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = null;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_3()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = Constants.CreatureType.balron;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_4()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = null;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_5()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = Constants.CreatureType.balron;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_6()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = null;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_7()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = Constants.CreatureType.balron;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_8()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = null;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_9()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = Constants.CreatureType.balron;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_10()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = null;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_11()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = Constants.CreatureType.balron;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_12()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = null;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_13()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = Constants.CreatureType.balron;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_14()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = null;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_15()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = Constants.CreatureType.balron;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the CombatScreen(BaseScreen,Context,Maps,BaseMap,TiledMap,CreatureType,CreatureSet,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testCombatScreen_16()
		throws Exception {
		BaseScreen returnScreen = new GameScreen(new Ultima4());
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		Constants.Maps contextMap = Constants.Maps.ABYSS;
		BaseMap combatMap = new BaseMap();
		TiledMap tmap = new TiledMap();
		Constants.CreatureType cr = null;
		CreatureSet cs = new CreatureSet();
		TextureAtlas a1 = new TextureAtlas();

		CombatScreen result = new CombatScreen(returnScreen, context, contextMap, combatMap, tmap, cr, cs, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void end() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testEnd_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.end();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void end() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testEnd_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen((BaseScreen) null, context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.end();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsatisfiedLinkError: com.badlogic.gdx.utils.BufferUtils.newDisposableByteBuffer(I)Ljava/nio/ByteBuffer;
		//       at com.badlogic.gdx.utils.BufferUtils.newDisposableByteBuffer(Native Method)
		//       at com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(BufferUtils.java:517)
		//       at com.badlogic.gdx.graphics.glutils.VertexArray.<init>(VertexArray.java:57)
		//       at com.badlogic.gdx.graphics.Mesh.<init>(Mesh.java:182)
		//       at com.badlogic.gdx.graphics.Mesh.<init>(Mesh.java:153)
		//       at com.badlogic.gdx.graphics.g2d.SpriteBatch.<init>(SpriteBatch.java:103)
		//       at com.badlogic.gdx.graphics.g2d.SpriteBatch.<init>(SpriteBatch.java:80)
		//       at com.badlogic.gdx.maps.tiled.renderers.BatchTiledMapRenderer.<init>(BatchTiledMapRenderer.java:104)
		//       at com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer.<init>(OrthogonalTiledMapRenderer.java:59)
		//       at ultima.CombatScreen.<init>(CombatScreen.java:106)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_9()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_10()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_11()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_12()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_13()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_14()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_15()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishPlayerTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishPlayerTurn_16()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.finishPlayerTurn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_9()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_10()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_11()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_12()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_13()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void finishTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testFinishTurn_14()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int currentX = 1;
		int currentY = 1;

		fixture.finishTurn(currentX, currentY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testGetChest_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testGetChest_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testGetChest_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void getChest(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testGetChest_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int index = 1;
		int x = 1;
		int y = 1;

		fixture.getChest(index, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the Vector3 getCurrentMapCoords() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testGetCurrentMapCoords_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		Vector3 result = fixture.getCurrentMapCoords();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the Vector3 getMapPixelCoords(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testGetMapPixelCoords_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int x = 1;
		int y = 1;

		Vector3 result = fixture.getMapPixelCoords(x, y);

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
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testHide_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.hide();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the boolean hideOrShow(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testHideOrShow_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Creature cr = new Creature();
		cr.setVisible(true);
		cr.currentX = 1;
		cr.currentY = 1;

		boolean result = fixture.hideOrShow(cr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean hideOrShow(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testHideOrShow_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Creature cr = new Creature();
		cr.setVisible(false);
		cr.currentX = 1;
		cr.currentY = 1;

		boolean result = fixture.hideOrShow(cr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean hideOrShow(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testHideOrShow_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Creature cr = new Creature();
		cr.setVisible(false);
		cr.currentX = 1;
		cr.currentY = 1;

		boolean result = fixture.hideOrShow(cr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testKeyUp_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		int keycode = 49;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testKeyUp_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int keycode = 35;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testKeyUp_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int keycode = 1;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testKeyUp_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int keycode = 19;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testKeyUp_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int keycode = 20;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testKeyUp_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int keycode = 22;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyUp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testKeyUp_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int keycode = 21;

		boolean result = fixture.keyUp(keycode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean moveCreature(CombatAction,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testMoveCreature_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.CombatAction action = Constants.CombatAction.ADVANCE;
		Creature cr = new Creature();
		cr.currentX = 0;
		cr.currentY = 1;
		int targetX = 1;
		int targetY = 1;

		boolean result = fixture.moveCreature(action, cr, targetX, targetY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean moveCreature(CombatAction,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testMoveCreature_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.CombatAction action = Constants.CombatAction.ADVANCE;
		Creature cr = new Creature();
		cr.currentX = 1;
		cr.currentY = 0;
		int targetX = 1;
		int targetY = 1;

		boolean result = fixture.moveCreature(action, cr, targetX, targetY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean moveCreature(CombatAction,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testMoveCreature_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.CombatAction action = Constants.CombatAction.ADVANCE;
		Creature cr = new Creature();
		cr.currentX = 1;
		cr.currentY = 1;
		int targetX = 1;
		int targetY = 1;

		boolean result = fixture.moveCreature(action, cr, targetX, targetY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean moveCreature(CombatAction,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testMoveCreature_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.CombatAction action = Constants.CombatAction.ADVANCE;
		Creature cr = new Creature();
		cr.setSwims(false);
		cr.setFlies(true);
		cr.setSails(false);
		cr.currentX = 1;
		cr.currentY = 1;
		cr.currentPos = new Vector3();
		int targetX = 1;
		int targetY = 1;

		boolean result = fixture.moveCreature(action, cr, targetX, targetY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean moveCreature(CombatAction,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testMoveCreature_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.CombatAction action = Constants.CombatAction.ADVANCE;
		Creature cr = new Creature();
		cr.setSwims(false);
		cr.setSails(true);
		cr.currentX = 1;
		cr.currentY = 1;
		int targetX = 1;
		int targetY = 1;

		boolean result = fixture.moveCreature(action, cr, targetX, targetY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean moveCreature(CombatAction,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testMoveCreature_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.CombatAction action = Constants.CombatAction.ADVANCE;
		Creature cr = new Creature();
		cr.setSwims(false);
		cr.setFlies(false);
		cr.setSails(false);
		cr.currentX = 1;
		cr.currentY = 1;
		int targetX = 1;
		int targetY = 1;

		boolean result = fixture.moveCreature(action, cr, targetX, targetY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean moveCreature(CombatAction,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testMoveCreature_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.CombatAction action = Constants.CombatAction.ADVANCE;
		Creature cr = new Creature();
		cr.setSwims(true);
		cr.currentX = 1;
		cr.currentY = 1;
		int targetX = 1;
		int targetY = 1;

		boolean result = fixture.moveCreature(action, cr, targetX, targetY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the boolean moveCreature(CombatAction,Creature,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testMoveCreature_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.CombatAction action = Constants.CombatAction.ADVANCE;
		Creature cr = new Creature();
		cr.setSwims(false);
		cr.setSails(true);
		cr.currentX = 1;
		cr.currentY = 1;
		int targetX = 1;
		int targetY = 1;

		boolean result = fixture.moveCreature(action, cr, targetX, targetY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertTrue(result);
	}

	/**
	 * Run the void partyDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testPartyDeath_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.partyDeath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		Party party = new Party(saveGame);
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_9()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_10()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_11()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_12()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_13()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_14()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_15()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void render(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testRender_16()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		Vector3 vector3 = new Vector3();
		vector3.set(1.0f, 1.0f, 1.0f);
		fixture.newMapPixelCoords = vector3;
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 0;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		Party party = new Party(new SaveGame());
		party.setMembers(new ArrayList());
		fixture.party = party;
		float delta = 1.0f;

		fixture.render(delta);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void replaceTile(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testReplaceTile_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		String name = null;
		int x = 1;
		int y = 1;

		fixture.replaceTile(name, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void replaceTile(String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testReplaceTile_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		String name = "";
		int x = 1;
		int y = 1;

		fixture.replaceTile(name, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void resize(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testResize_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		int width = 1;
		int height = 1;

		fixture.resize(width, height);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setAmbushingMonsters(BaseScreen,int,int,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testSetAmbushingMonsters_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		GameScreen returnScreen = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		returnScreen.attackAt(Constants.Maps.ABYSS, creature);
		int x = 1;
		int y = 1;
		TextureAtlas a1 = new TextureAtlas();

		fixture.setAmbushingMonsters(returnScreen, x, y, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setAmbushingMonsters(BaseScreen,int,int,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testSetAmbushingMonsters_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		GameScreen returnScreen = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		returnScreen.attackAt(Constants.Maps.ABYSS, creature);
		int x = 1;
		int y = 1;
		TextureAtlas a1 = new TextureAtlas();

		fixture.setAmbushingMonsters(returnScreen, x, y, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void setAmbushingMonsters(BaseScreen,int,int,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testSetAmbushingMonsters_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		GameScreen returnScreen = new GameScreen(new Ultima4());
		Creature creature = new Creature();
		creature.setTile(Constants.CreatureType.balron);
		returnScreen.attackAt(Constants.Maps.ABYSS, creature);
		int x = 1;
		int y = 1;
		TextureAtlas a1 = new TextureAtlas();

		fixture.setAmbushingMonsters(returnScreen, x, y, a1);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void show() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testShow_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());

		fixture.show();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_1()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_2()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_3()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_4()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_5()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_6()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_7()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_8()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_9()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		SaveGame saveGame = new SaveGame();
		saveGame.members = 1;
		saveGame.players = new objects.SaveGame.SaveGamePlayerRecord[] {};
		fixture.party = new Party(saveGame);
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void useStones(Stone,Stone,Stone,Stone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	@Test
	public void testUseStones_10()
		throws Exception {
		Context context = new Context();
		context.setParty(new Party(new SaveGame()));
		CombatScreen fixture = new CombatScreen(new GameScreen(new Ultima4()), context, Constants.Maps.ABYSS, new BaseMap(), new TiledMap(), Constants.CreatureType.balron, new CreatureSet(), new TextureAtlas());
		fixture.currentMousePos = new Vector2();
		fixture.camera = new OrthographicCamera();
		fixture.currentEncounter = new Creature();
		fixture.scType = Constants.ScreenType.CODEX;
		fixture.newMapPixelCoords = new Vector3();
		fixture.mapPixelHeight = 1;
		fixture.viewport = new ScreenViewport();
		fixture.rand = new Random();
		fixture.showZstats = 1;
		fixture.time = 1.0f;
		fixture.stage = new Stage();
		fixture.party = new Party(new SaveGame());
		Constants.Stone c1 = Constants.Stone.BLACK;
		Constants.Stone c2 = Constants.Stone.BLACK;
		Constants.Stone c3 = Constants.Stone.BLACK;
		Constants.Stone c4 = Constants.Stone.BLACK;

		fixture.useStones(c1, c2, c3, c4);

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
	 * @generatedBy CodePro at 11/06/19 13:04
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
	 * @generatedBy CodePro at 11/06/19 13:04
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
	 * @generatedBy CodePro at 11/06/19 13:04
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CombatScreenTest.class);
	}
}