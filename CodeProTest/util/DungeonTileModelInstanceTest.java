package util;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import ultima.Constants;

/**
 * The class <code>DungeonTileModelInstanceTest</code> contains tests for the class <code>{@link DungeonTileModelInstance}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class DungeonTileModelInstanceTest {
	/**
	 * Run the DungeonTileModelInstance(ModelInstance,DungeonTile,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testDungeonTileModelInstance_1()
		throws Exception {
		ModelInstance instance = new ModelInstance(new Model());
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;
		int level = 1;

		DungeonTileModelInstance result = new DungeonTileModelInstance(instance, tile, level);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLevel());
	}

	/**
	 * Run the ModelInstance getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {
		DungeonTileModelInstance fixture = new DungeonTileModelInstance(new ModelInstance(new Model()), ultima.Constants.DungeonTile.ALTAR, 1);
		fixture.x = 1;
		fixture.y = 1;

		ModelInstance result = fixture.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetLevel_1()
		throws Exception {
		DungeonTileModelInstance fixture = new DungeonTileModelInstance(new ModelInstance(new Model()), ultima.Constants.DungeonTile.ALTAR, 1);
		fixture.x = 1;
		fixture.y = 1;

		int result = fixture.getLevel();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ultima.Constants.DungeonTile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		DungeonTileModelInstance fixture = new DungeonTileModelInstance(new ModelInstance(new Model()), ultima.Constants.DungeonTile.ALTAR, 1);
		fixture.x = 1;
		fixture.y = 1;

		ultima.Constants.DungeonTile result = fixture.getTile();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getValue());
		assertEquals("Altar", result.getType());
		assertEquals("altar", result.getTileName());
		assertEquals(true, result.getCreatureWalkable());
		assertEquals("ALTAR", result.name());
		assertEquals("ALTAR", result.toString());
		assertEquals(12, result.ordinal());
	}

	/**
	 * Run the void setInstance(ModelInstance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetInstance_1()
		throws Exception {
		DungeonTileModelInstance fixture = new DungeonTileModelInstance(new ModelInstance(new Model()), ultima.Constants.DungeonTile.ALTAR, 1);
		fixture.x = 1;
		fixture.y = 1;
		ModelInstance instance = new ModelInstance(new Model());

		fixture.setInstance(instance);

		// add additional test code here
	}

	/**
	 * Run the void setLevel(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetLevel_1()
		throws Exception {
		DungeonTileModelInstance fixture = new DungeonTileModelInstance(new ModelInstance(new Model()), ultima.Constants.DungeonTile.ALTAR, 1);
		fixture.x = 1;
		fixture.y = 1;
		int level = 1;

		fixture.setLevel(level);

		// add additional test code here
	}

	/**
	 * Run the void setTile(DungeonTile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetTile_1()
		throws Exception {
		DungeonTileModelInstance fixture = new DungeonTileModelInstance(new ModelInstance(new Model()), ultima.Constants.DungeonTile.ALTAR, 1);
		fixture.x = 1;
		fixture.y = 1;
		ultima.Constants.DungeonTile tile = ultima.Constants.DungeonTile.ALTAR;

		fixture.setTile(tile);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
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
	 * @generatedBy CodePro at 11/06/19 13:17
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
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DungeonTileModelInstanceTest.class);
	}
}