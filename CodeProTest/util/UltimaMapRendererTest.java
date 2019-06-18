package util;

import org.junit.*;
import objects.BaseMap;
import ultima.Context;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import ultima.Constants;

/**
 * The class <code>UltimaMapRendererTest</code> contains tests for the class <code>{@link UltimaMapRenderer}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class UltimaMapRendererTest {
	/**
	 * Run the UltimaMapRenderer(Context,TextureAtlas,BaseMap,TiledMap,float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testUltimaMapRenderer_1()
		throws Exception {
		Context context = new Context();
		TextureAtlas atlas = new TextureAtlas();
		BaseMap bm = new BaseMap();
		bm.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		bm.setWidth(1);
		bm.setHeight(1);
		TiledMap map = new TiledMap();
		float unitScale = 1.0f;

		UltimaMapRenderer result = new UltimaMapRenderer(context, atlas, bm, map, unitScale);

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
		//       at util.UltimaMapRenderer.<init>(UltimaMapRenderer.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the UltimaMapRenderer(Context,TextureAtlas,BaseMap,TiledMap,float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testUltimaMapRenderer_2()
		throws Exception {
		Context context = new Context();
		TextureAtlas atlas = null;
		BaseMap bm = new BaseMap();
		bm.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		bm.setWidth(1);
		bm.setHeight(1);
		TiledMap map = new TiledMap();
		float unitScale = 1.0f;

		UltimaMapRenderer result = new UltimaMapRenderer(context, atlas, bm, map, unitScale);

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
		//       at util.UltimaMapRenderer.<init>(UltimaMapRenderer.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the SpreadFOV getFOV() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetFOV_1()
		throws Exception {
		BaseMap baseMap = new BaseMap();
		baseMap.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		baseMap.setWidth(1);
		baseMap.setHeight(1);
		UltimaMapRenderer fixture = new UltimaMapRenderer(new Context(), new TextureAtlas(), baseMap, new TiledMap(), 1.0f);
		fixture.door = new TextureRegion();
		fixture.stateTime = 1.0f;
		fixture.locked_door = new TextureRegion();
		fixture.brick_floor = new TextureRegion();

		SpreadFOV result = fixture.getFOV();

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
		//       at util.UltimaMapRenderer.<init>(UltimaMapRenderer.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the void render() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_1()
		throws Exception {
		BaseMap baseMap = new BaseMap();
		baseMap.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		baseMap.setWidth(1);
		baseMap.setHeight(1);
		UltimaMapRenderer fixture = new UltimaMapRenderer(new Context(), new TextureAtlas(), baseMap, new TiledMap(), 1.0f);
		fixture.door = new TextureRegion();
		fixture.stateTime = 1.0f;
		fixture.locked_door = new TextureRegion();
		fixture.brick_floor = new TextureRegion();

		fixture.render();

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
		//       at util.UltimaMapRenderer.<init>(UltimaMapRenderer.java:57)
	}

	/**
	 * Run the void render() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_2()
		throws Exception {
		BaseMap baseMap = new BaseMap();
		baseMap.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		baseMap.setWidth(1);
		baseMap.setHeight(1);
		UltimaMapRenderer fixture = new UltimaMapRenderer(new Context(), new TextureAtlas(), baseMap, new TiledMap(), 1.0f);
		fixture.door = new TextureRegion();
		fixture.stateTime = 1.0f;
		fixture.locked_door = new TextureRegion();
		fixture.brick_floor = new TextureRegion();

		fixture.render();

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
		//       at util.UltimaMapRenderer.<init>(UltimaMapRenderer.java:57)
	}

	/**
	 * Run the void render() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testRender_3()
		throws Exception {
		BaseMap baseMap = new BaseMap();
		baseMap.setBorderbehavior(ultima.Constants.MapBorderBehavior.exit);
		baseMap.setWidth(1);
		baseMap.setHeight(1);
		UltimaMapRenderer fixture = new UltimaMapRenderer(new Context(), new TextureAtlas(), baseMap, new TiledMap(), 1.0f);
		fixture.door = new TextureRegion();
		fixture.stateTime = 1.0f;
		fixture.locked_door = new TextureRegion();
		fixture.brick_floor = new TextureRegion();

		fixture.render();

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
		//       at util.UltimaMapRenderer.<init>(UltimaMapRenderer.java:57)
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
		new org.junit.runner.JUnitCore().run(UltimaMapRendererTest.class);
	}
}