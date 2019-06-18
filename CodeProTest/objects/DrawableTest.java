package objects;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * The class <code>DrawableTest</code> contains tests for the class <code>{@link Drawable}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class DrawableTest {
	/**
	 * Run the Drawable(BaseMap,int,int,Tile,TextureAtlas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDrawable_1()
		throws Exception {
		BaseMap map = new BaseMap();
		int cx = 1;
		int cy = 1;
		Tile tile = new Tile();
		tile.setName("");
		TextureAtlas atlas = new TextureAtlas();

		Drawable result = new Drawable(map, cx, cy, tile, atlas);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getCy());
		assertEquals(50, result.getShipHull());
		assertEquals(1, result.getCx());
		assertEquals(0, result.getMapId());
		assertEquals(false, result.remove());
		assertEquals("Drawable", result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(true, result.getDebug());
		assertEquals(0.0f, result.getY(), 1.0f);
		assertEquals(null, result.getUserObject());
		assertEquals(0.0f, result.getRight(), 1.0f);
		assertEquals(true, result.isVisible());
		assertEquals(0.0f, result.getWidth(), 1.0f);
		assertEquals(0.0f, result.getX(), 1.0f);
		assertEquals(0.0f, result.getHeight(), 1.0f);
		assertEquals(0.0f, result.getTop(), 1.0f);
		assertEquals(-1, result.getZIndex());
		assertEquals(null, result.getStage());
		assertEquals(false, result.hasParent());
		assertEquals(0.0f, result.getOriginX(), 1.0f);
		assertEquals(0.0f, result.getOriginY(), 1.0f);
		assertEquals(true, result.isTouchable());
		assertEquals(false, result.hasActions());
		assertEquals(false, result.clipBegin());
		assertEquals(0.0f, result.getRotation(), 1.0f);
		assertEquals(1.0f, result.getScaleX(), 1.0f);
		assertEquals(1.0f, result.getScaleY(), 1.0f);
	}

	/**
	 * Run the int damageShip(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageShip_1()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);
		int minDamage = -1;
		int maxDamage = 1;

		int result = fixture.damageShip(minDamage, maxDamage);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int damageShip(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageShip_2()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);
		int minDamage = 1;
		int maxDamage = 1;

		int result = fixture.damageShip(minDamage, maxDamage);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int damageShip(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDamageShip_3()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);
		int minDamage = 1;
		int maxDamage = 1;

		int result = fixture.damageShip(minDamage, maxDamage);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void draw(Batch,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testDraw_1()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);
		Batch batch = new PolygonSpriteBatch();
		float parentAlpha = 1.0f;

		fixture.draw(batch, parentAlpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsatisfiedLinkError: com.badlogic.gdx.utils.BufferUtils.newDisposableByteBuffer(I)Ljava/nio/ByteBuffer;
		//       at com.badlogic.gdx.utils.BufferUtils.newDisposableByteBuffer(Native Method)
		//       at com.badlogic.gdx.utils.BufferUtils.newUnsafeByteBuffer(BufferUtils.java:517)
		//       at com.badlogic.gdx.graphics.glutils.VertexArray.<init>(VertexArray.java:57)
		//       at com.badlogic.gdx.graphics.Mesh.<init>(Mesh.java:182)
		//       at com.badlogic.gdx.graphics.Mesh.<init>(Mesh.java:153)
		//       at com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch.<init>(PolygonSpriteBatch.java:134)
		//       at com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch.<init>(PolygonSpriteBatch.java:112)
		//       at com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch.<init>(PolygonSpriteBatch.java:98)
	}

	/**
	 * Run the int getCx() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetCx_1()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);

		int result = fixture.getCx();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getCy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetCy_1()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);

		int result = fixture.getCy();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMapId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMapId_1()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);

		int result = fixture.getMapId();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getShipHull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetShipHull_1()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);

		int result = fixture.getShipHull();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);

		Tile result = fixture.getTile();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Tile [name=, idx=0]", result.toString());
		assertEquals("", result.getName());
		assertEquals(false, result.isOpaque());
		assertEquals(0, result.getIndex());
		assertEquals(null, result.getRule());
		assertEquals(false, result.getUsesReplacementTileAsBackground());
		assertEquals(false, result.getUsesWaterReplacementTileAsBackground());
		assertEquals(0, result.getRowtoswap());
		assertEquals(null, result.getAnimation());
		assertEquals(false, result.walkable());
		assertEquals(null, result.getDirections());
		assertEquals(0, result.getFrames());
		assertEquals(false, result.getTiledInDungeon());
	}

	/**
	 * Run the void setShipHull(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetShipHull_1()
		throws Exception {
		Tile tile = new Tile();
		tile.setName("");
		Drawable fixture = new Drawable(new BaseMap(), 1, 1, tile, new TextureAtlas());
		fixture.setShipHull(1);
		int shipHull = 1;

		fixture.setShipHull(shipHull);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DrawableTest.class);
	}
}