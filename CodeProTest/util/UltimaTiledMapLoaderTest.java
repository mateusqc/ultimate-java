package util;

import org.junit.*;
import objects.TileSet;
import ultima.Constants;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;

/**
 * The class <code>UltimaTiledMapLoaderTest</code> contains tests for the class <code>{@link UltimaTiledMapLoader}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class UltimaTiledMapLoaderTest {
	/**
	 * Run the UltimaTiledMapLoader(Maps,TextureAtlas,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testUltimaTiledMapLoader_1()
		throws Exception {
		ultima.Constants.Maps gameMap = ultima.Constants.Maps.ABYSS;
		TextureAtlas atlas = new TextureAtlas();
		int mapWidth = 1;
		int mapHeight = 1;
		int tileWidth = 1;
		int tileHeight = 1;

		UltimaTiledMapLoader result = new UltimaTiledMapLoader(gameMap, atlas, mapWidth, mapHeight, tileWidth, tileHeight);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 1, 1, 1, 1);

		TiledMap result = fixture.load();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at util.UltimaTiledMapLoader.load(UltimaTiledMapLoader.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_2()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 1, 1, 1, 1);

		TiledMap result = fixture.load();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at util.UltimaTiledMapLoader.load(UltimaTiledMapLoader.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_3()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 0, 1, 1, 1);

		TiledMap result = fixture.load();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at util.UltimaTiledMapLoader.load(UltimaTiledMapLoader.java:92)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_4()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 1, 0, 1, 1);

		TiledMap result = fixture.load();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at util.UltimaTiledMapLoader.load(UltimaTiledMapLoader.java:92)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load(byte[],int,int,TileSet,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_5()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 1, 1, 1, 1);
		byte[] bytes = new byte[] {};
		int width = 1;
		int height = 1;
		TileSet ts = new TileSet();
		int tileDim = 1;

		TiledMap result = fixture.load(bytes, width, height, ts, tileDim);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at util.UltimaTiledMapLoader.load(UltimaTiledMapLoader.java:176)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load(byte[],int,int,TileSet,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_6()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 1, 1, 1, 1);
		byte[] bytes = new byte[] {};
		int width = 0;
		int height = 1;
		TileSet ts = new TileSet();
		int tileDim = 1;

		TiledMap result = fixture.load(bytes, width, height, ts, tileDim);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load(byte[],int,int,TileSet,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_7()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 1, 1, 1, 1);
		byte[] bytes = new byte[] {};
		int width = 0;
		int height = 1;
		TileSet ts = new TileSet();
		int tileDim = 1;

		TiledMap result = fixture.load(bytes, width, height, ts, tileDim);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load(byte[],int,int,TileSet,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_8()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 1, 1, 1, 1);
		byte[] bytes = new byte[] {};
		int width = 1;
		int height = 1;
		TileSet ts = new TileSet();
		int tileDim = 1;

		TiledMap result = fixture.load(bytes, width, height, ts, tileDim);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at util.UltimaTiledMapLoader.load(UltimaTiledMapLoader.java:176)
		assertNotNull(result);
	}

	/**
	 * Run the TiledMap load(byte[],int,int,TileSet,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLoad_9()
		throws Exception {
		UltimaTiledMapLoader fixture = new UltimaTiledMapLoader(ultima.Constants.Maps.ABYSS, new TextureAtlas(), 1, 1, 1, 1);
		byte[] bytes = new byte[] {};
		int width = 1;
		int height = 0;
		TileSet ts = new TileSet();
		int tileDim = 1;

		TiledMap result = fixture.load(bytes, width, height, ts, tileDim);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(UltimaTiledMapLoaderTest.class);
	}
}