package objects;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>PortalTest</code> contains tests for the class <code>{@link Portal}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class PortalTest {
	/**
	 * Run the String getCondition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetCondition_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		String result = fixture.getCondition();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getDestmapid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetDestmapid_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		int result = fixture.getDestmapid();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ultima.Constants.Direction getExitDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetExitDirection_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		ultima.Constants.Direction result = fixture.getExitDirection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getMask());
		assertEquals(3, result.getVal());
		assertEquals("EAST", result.name());
		assertEquals("EAST", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the int getMapTileId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMapTileId_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		int result = fixture.getMapTileId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMessage_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		String result = fixture.getMessage();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the RetroActiveDest getRetroActiveDest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetRetroActiveDest_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		RetroActiveDest result = fixture.getRetroActiveDest();

		// add additional test code here
		assertNotNull(result);
		assertEquals("RetroActiveDest [x=0, y=0, mapid=0]", result.toString());
		assertEquals(0, result.getY());
		assertEquals(0, result.getX());
		assertEquals(0, result.getMapid());
	}

	/**
	 * Run the int getStartlevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetStartlevel_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		int result = fixture.getStartlevel();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getStartx() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetStartx_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		int result = fixture.getStartx();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getStarty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetStarty_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		int result = fixture.getStarty();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getTransport() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetTransport_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		String result = fixture.getTransport();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetX_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		int result = fixture.getX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetY_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		int result = fixture.getY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getZ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetZ_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		int result = fixture.getZ();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isSavelocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsSavelocation_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		boolean result = fixture.isSavelocation();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSavelocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testIsSavelocation_2()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(false);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		boolean result = fixture.isSavelocation();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setCondition(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetCondition_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		String condition = "";

		fixture.setCondition(condition);

		// add additional test code here
	}

	/**
	 * Run the void setDestmapid(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetDestmapid_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		int destmapid = 1;

		fixture.setDestmapid(destmapid);

		// add additional test code here
	}

	/**
	 * Run the void setExitDirection(Direction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetExitDirection_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		ultima.Constants.Direction dir = ultima.Constants.Direction.EAST;

		fixture.setExitDirection(dir);

		// add additional test code here
	}

	/**
	 * Run the void setMapTileId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMapTileId_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		int mapTileId = 1;

		fixture.setMapTileId(mapTileId);

		// add additional test code here
	}

	/**
	 * Run the void setMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMessage_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		String message = "";

		fixture.setMessage(message);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setRetroActiveDest(RetroActiveDest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetRetroActiveDest_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		RetroActiveDest retroActiveDest = new RetroActiveDest();

		fixture.setRetroActiveDest(retroActiveDest);

		// add additional test code here
	}

	/**
	 * Run the void setSavelocation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetSavelocation_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		boolean savelocation = true;

		fixture.setSavelocation(savelocation);

		// add additional test code here
	}

	/**
	 * Run the void setStartlevel(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetStartlevel_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		int startlevel = 1;

		fixture.setStartlevel(startlevel);

		// add additional test code here
	}

	/**
	 * Run the void setStartx(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetStartx_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		int startx = 1;

		fixture.setStartx(startx);

		// add additional test code here
	}

	/**
	 * Run the void setStarty(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetStarty_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		int starty = 1;

		fixture.setStarty(starty);

		// add additional test code here
	}

	/**
	 * Run the void setTransport(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetTransport_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		String transport = "";

		fixture.setTransport(transport);

		// add additional test code here
	}

	/**
	 * Run the void setX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetX_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		int x = 1;

		fixture.setX(x);

		// add additional test code here
	}

	/**
	 * Run the void setY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetY_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		int y = 1;

		fixture.setY(y);

		// add additional test code here
	}

	/**
	 * Run the void setZ(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetZ_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);
		int z = 1;

		fixture.setZ(z);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage("");
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition((String) null);
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("<object name=\"\" type=\"portal\" x=\"32\" y=\"32\" width=\"32\" height=\"32\">\r\n<properties>\r\n<property name=\"condition\" value=\"\"/>\r\n<property name=\"x\" value=\"1\"/>\r\n<property name=\"y\" value=\"1\"/>\r\n<property name=\"destination\" value=\"1\"/>\r\n<property name=\"message\" value=\"\"/>\r\n</properties>\r\n</object>\r\n", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Portal fixture = new Portal();
		fixture.setMessage((String) null);
		fixture.setStartlevel(1);
		fixture.setName("");
		fixture.setCondition("");
		fixture.setDestmapid(1);
		fixture.setY(1);
		fixture.setSavelocation(true);
		fixture.setMapTileId(1);
		fixture.setExitDirection(ultima.Constants.Direction.EAST);
		fixture.setStartx(1);
		fixture.setZ(1);
		fixture.setTransport("");
		fixture.setRetroActiveDest(new RetroActiveDest());
		fixture.setX(1);
		fixture.setStarty(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("<object name=\"\" type=\"portal\" x=\"32\" y=\"32\" width=\"32\" height=\"32\">\r\n<properties>\r\n<property name=\"condition\" value=\"\"/>\r\n<property name=\"x\" value=\"1\"/>\r\n<property name=\"y\" value=\"1\"/>\r\n<property name=\"destination\" value=\"1\"/>\r\n<property name=\"message\" value=\"\"/>\r\n</properties>\r\n</object>\r\n", result);
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
		new org.junit.runner.JUnitCore().run(PortalTest.class);
	}
}