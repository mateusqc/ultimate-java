package objects;

import org.junit.*;
import ultima.GameScreen;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import ultima.BaseScreen;
import ultima.Constants;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import ultima.Ultima4;

/**
 * The class <code>ProjectileActorTest</code> contains tests for the class <code>{@link ProjectileActor}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ProjectileActorTest {
	/**
	 * Run the ProjectileActor(BaseScreen,Color,int,int,AttackResult) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testProjectileActor_1()
		throws Exception {
		BaseScreen screen = new GameScreen(new Ultima4());
		Color color = new Color();
		int x = 1;
		int y = 1;
		ultima.Constants.AttackResult res = ultima.Constants.AttackResult.HIT;

		ProjectileActor result = new ProjectileActor(screen, color, x, y, res);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
		assertNotNull(result);
	}

	/**
	 * Run the void draw(Batch,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testDraw_1()
		throws Exception {
		ProjectileActor fixture = new ProjectileActor(new GameScreen(new Ultima4()), new Color(), 1, 1, ultima.Constants.AttackResult.HIT);
		fixture.resultTexture = new TextureRegion();
		Batch batch = new PolygonSpriteBatch();
		float parentAlpha = 1.0f;

		fixture.draw(batch, parentAlpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.GameScreen.initTransportAnimations(GameScreen.java:124)
		//       at ultima.GameScreen.<init>(GameScreen.java:90)
	}

	/**
	 * Run the void draw(Batch,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testDraw_2()
		throws Exception {
		ProjectileActor fixture = new ProjectileActor(new GameScreen(new Ultima4()), new Color(), 1, 1, ultima.Constants.AttackResult.HIT);
		fixture.resultTexture = null;
		Batch batch = new PolygonSpriteBatch();
		float parentAlpha = 1.0f;

		fixture.draw(batch, parentAlpha);

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
	 * @generatedBy CodePro at 11/06/19 12:59
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
	 * @generatedBy CodePro at 11/06/19 12:59
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
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProjectileActorTest.class);
	}
}