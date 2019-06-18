package objects;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>TileTest</code> contains tests for the class <code>{@link Tile}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:59
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class TileTest {
	/**
	 * Run the Tile() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testTile_1()
		throws Exception {
		Tile result = new Tile();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getAnimation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetAnimation_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		String result = fixture.getAnimation();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the ultima.Constants.Maps getCombatMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetCombatMap_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		ultima.Constants.Maps result = fixture.getCombatMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(24, result.getId());
		assertEquals(null, result.getMap());
		assertEquals("The Abyss", result.getLabel());
		assertEquals("ABYSS", result.name());
		assertEquals("ABYSS", result.toString());
		assertEquals(26, result.ordinal());
	}

	/**
	 * Run the String getDirections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetDirections_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		String result = fixture.getDirections();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getFrames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetFrames_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		int result = fixture.getFrames();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetIndex_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getRowtoswap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetRowtoswap_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		int result = fixture.getRowtoswap();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ultima.Constants.TileRule getRule() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetRule_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		ultima.Constants.TileRule result = fixture.getRule();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4098, result.getAttribs());
		assertEquals("balloon", result.name());
		assertEquals("balloon", result.toString());
		assertEquals(13, result.ordinal());
	}

	/**
	 * Run the boolean getTiledInDungeon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetTiledInDungeon_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.getTiledInDungeon();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getTiledInDungeon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetTiledInDungeon_2()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(false);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.getTiledInDungeon();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getUsesReplacementTileAsBackground() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetUsesReplacementTileAsBackground_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.getUsesReplacementTileAsBackground();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getUsesReplacementTileAsBackground() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetUsesReplacementTileAsBackground_2()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(false);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.getUsesReplacementTileAsBackground();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getUsesWaterReplacementTileAsBackground() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetUsesWaterReplacementTileAsBackground_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.getUsesWaterReplacementTileAsBackground();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getUsesWaterReplacementTileAsBackground() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testGetUsesWaterReplacementTileAsBackground_2()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(false);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.getUsesWaterReplacementTileAsBackground();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOpaque() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testIsOpaque_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.isOpaque();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isOpaque() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testIsOpaque_2()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(false);

		boolean result = fixture.isOpaque();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setAnimation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetAnimation_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		String animation = "";

		fixture.setAnimation(animation);

		// add additional test code here
	}

	/**
	 * Run the void setCombatMap(Maps) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetCombatMap_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		ultima.Constants.Maps combatMap = ultima.Constants.Maps.ABYSS;

		fixture.setCombatMap(combatMap);

		// add additional test code here
	}

	/**
	 * Run the void setDirections(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetDirections_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		String directions = "";

		fixture.setDirections(directions);

		// add additional test code here
	}

	/**
	 * Run the void setFrames(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetFrames_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		int frames = 1;

		fixture.setFrames(frames);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetIndex_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		int index = 1;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setOpaque(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetOpaque_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		boolean opaque = true;

		fixture.setOpaque(opaque);

		// add additional test code here
	}

	/**
	 * Run the void setRowtoswap(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetRowtoswap_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		int rowtoswap = 1;

		fixture.setRowtoswap(rowtoswap);

		// add additional test code here
	}

	/**
	 * Run the void setRule(TileRule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetRule_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		ultima.Constants.TileRule rule = ultima.Constants.TileRule.balloon;

		fixture.setRule(rule);

		// add additional test code here
	}

	/**
	 * Run the void setTiledInDungeon(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetTiledInDungeon_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		boolean tiledInDungeon = true;

		fixture.setTiledInDungeon(tiledInDungeon);

		// add additional test code here
	}

	/**
	 * Run the void setUsesReplacementTileAsBackground(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetUsesReplacementTileAsBackground_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		boolean usesReplacementTileAsBackground = true;

		fixture.setUsesReplacementTileAsBackground(usesReplacementTileAsBackground);

		// add additional test code here
	}

	/**
	 * Run the void setUsesWaterReplacementTileAsBackground(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testSetUsesWaterReplacementTileAsBackground_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);
		boolean usesWaterReplacementTileAsBackground = true;

		fixture.setUsesWaterReplacementTileAsBackground(usesWaterReplacementTileAsBackground);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Tile [name=, idx=1]", result);
	}

	/**
	 * Run the boolean walkable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testWalkable_1()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.walkable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean walkable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testWalkable_2()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule((ultima.Constants.TileRule) null);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.walkable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean walkable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:59
	 */
	@Test
	public void testWalkable_3()
		throws Exception {
		Tile fixture = new Tile();
		fixture.setUsesReplacementTileAsBackground(true);
		fixture.setRowtoswap(1);
		fixture.setCombatMap(ultima.Constants.Maps.ABYSS);
		fixture.setName("");
		fixture.setRule(ultima.Constants.TileRule.balloon);
		fixture.setIndex(1);
		fixture.setFrames(1);
		fixture.setUsesWaterReplacementTileAsBackground(true);
		fixture.setTiledInDungeon(true);
		fixture.setAnimation("");
		fixture.setDirections("");
		fixture.setOpaque(true);

		boolean result = fixture.walkable();

		// add additional test code here
		assertEquals(true, result);
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
		new org.junit.runner.JUnitCore().run(TileTest.class);
	}
}