package objects;

import java.util.ArrayList;
import java.util.List;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * The class <code>CreatureSetTest</code> contains tests for the class <code>{@link CreatureSet}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:57
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class CreatureSetTest {
	/**
	 * Run the List<Creature> getCreatures() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetCreatures_1()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		List<Creature> result = fixture.getCreatures();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Creature getInstance(CreatureType,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());
		ultima.Constants.CreatureType type = ultima.Constants.CreatureType.balron;
		TextureAtlas atlas1 = new TextureAtlas();

		Creature result = fixture.getInstance(type, atlas1);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature getInstance(CreatureType,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());
		ultima.Constants.CreatureType type = ultima.Constants.CreatureType.balron;
		TextureAtlas atlas1 = new TextureAtlas();

		Creature result = fixture.getInstance(type, atlas1);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature getInstance(CreatureType,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetInstance_3()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());
		ultima.Constants.CreatureType type = ultima.Constants.CreatureType.balron;
		TextureAtlas atlas1 = new TextureAtlas();

		Creature result = fixture.getInstance(type, atlas1);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature getInstance(CreatureType,TextureAtlas) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetInstance_4()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());
		ultima.Constants.CreatureType type = ultima.Constants.CreatureType.balron;
		TextureAtlas atlas1 = new TextureAtlas();

		Creature result = fixture.getInstance(type, atlas1);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ultima.Constants.CreatureType getRandomAmbushing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetRandomAmbushing_1()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		ultima.Constants.CreatureType result = fixture.getRandomAmbushing();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ultima.Constants.CreatureType getRandomAmbushing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetRandomAmbushing_2()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		ultima.Constants.CreatureType result = fixture.getRandomAmbushing();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ultima.Constants.CreatureType getRandomAmbushing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetRandomAmbushing_3()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		ultima.Constants.CreatureType result = fixture.getRandomAmbushing();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ultima.Constants.CreatureType getRandomAmbushing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetRandomAmbushing_4()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		ultima.Constants.CreatureType result = fixture.getRandomAmbushing();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ultima.Constants.CreatureType getRandomAmbushing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testGetRandomAmbushing_5()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		ultima.Constants.CreatureType result = fixture.getRandomAmbushing();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_1()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_2()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testInit_3()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void setCreatures(List<Creature>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	@Test
	public void testSetCreatures_1()
		throws Exception {
		CreatureSet fixture = new CreatureSet();
		fixture.setCreatures(new ArrayList());
		List<Creature> creatures = new ArrayList();

		fixture.setCreatures(creatures);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 12:57
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
	 * @generatedBy CodePro at 11/06/19 12:57
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
	 * @generatedBy CodePro at 11/06/19 12:57
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureSetTest.class);
	}
}