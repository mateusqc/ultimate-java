package vendor;

import org.junit.*;
import ultima.Constants;
import static org.junit.Assert.*;

/**
 * The class <code>ItemTest</code> contains tests for the class <code>{@link Item}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:21
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class ItemTest {
	/**
	 * Run the ultima.Constants.ArmorType getArmorType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetArmorType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		ultima.Constants.ArmorType result = fixture.getArmorType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getArmor());
		assertEquals("CHAIN", result.name());
		assertEquals("CHAIN", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the String getChoice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetChoice_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		String result = fixture.getChoice();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the ultima.Constants.GuildItemType getGuildItemType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetGuildItemType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		ultima.Constants.GuildItemType result = fixture.getGuildItemType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("gem", result.name());
		assertEquals("gem", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the ultima.Constants.HealType getHealType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetHealType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		ultima.Constants.HealType result = fixture.getHealType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CAMPHEAL", result.name());
		assertEquals("CAMPHEAL", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the boolean getHidden() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetHidden_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		boolean result = fixture.getHidden();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getHidden() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetHidden_2()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(false);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		boolean result = fixture.getHidden();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getQuantity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetQuantity_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		int result = fixture.getQuantity();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ultima.Constants.Reagent getReagentType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetReagentType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		ultima.Constants.Reagent result = fixture.getReagentType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getMask());
		assertEquals("Sulfurous Ash", result.getDesc());
		assertEquals("ASH", result.name());
		assertEquals("ASH", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the int getRoomX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetRoomX_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		int result = fixture.getRoomX();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getRoomY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetRoomY_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		int result = fixture.getRoomY();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ultima.Constants.InventoryType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		ultima.Constants.InventoryType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ARMOR", result.name());
		assertEquals("ARMOR", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the ultima.Constants.WeaponType getWeaponType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testGetWeaponType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		ultima.Constants.WeaponType result = fixture.getWeaponType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getWeapon());
		assertEquals("AXE", result.name());
		assertEquals("AXE", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the void setArmorType(ArmorType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetArmorType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		ultima.Constants.ArmorType armorType = ultima.Constants.ArmorType.CHAIN;

		fixture.setArmorType(armorType);

		// add additional test code here
	}

	/**
	 * Run the void setChoice(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetChoice_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		String choice = "";

		fixture.setChoice(choice);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setGuildItemType(GuildItemType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetGuildItemType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		ultima.Constants.GuildItemType guildItemType = ultima.Constants.GuildItemType.gem;

		fixture.setGuildItemType(guildItemType);

		// add additional test code here
	}

	/**
	 * Run the void setHealType(HealType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetHealType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		ultima.Constants.HealType healType = ultima.Constants.HealType.CAMPHEAL;

		fixture.setHealType(healType);

		// add additional test code here
	}

	/**
	 * Run the void setHidden(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetHidden_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		boolean hidden = true;

		fixture.setHidden(hidden);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setQuantity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetQuantity_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		int quantity = 1;

		fixture.setQuantity(quantity);

		// add additional test code here
	}

	/**
	 * Run the void setReagentType(Reagent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetReagentType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		ultima.Constants.Reagent reagentType = ultima.Constants.Reagent.ASH;

		fixture.setReagentType(reagentType);

		// add additional test code here
	}

	/**
	 * Run the void setRoomX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetRoomX_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		int roomX = 1;

		fixture.setRoomX(roomX);

		// add additional test code here
	}

	/**
	 * Run the void setRoomY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetRoomY_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		int roomY = 1;

		fixture.setRoomY(roomY);

		// add additional test code here
	}

	/**
	 * Run the void setType(InventoryType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		ultima.Constants.InventoryType type = ultima.Constants.InventoryType.ARMOR;

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setWeaponType(WeaponType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testSetWeaponType_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");
		ultima.Constants.WeaponType weaponType = ultima.Constants.WeaponType.AXE;

		fixture.setWeaponType(weaponType);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Item fixture = new Item();
		fixture.setHidden(true);
		fixture.setHealType(ultima.Constants.HealType.CAMPHEAL);
		fixture.setType(ultima.Constants.InventoryType.ARMOR);
		fixture.setGuildItemType(ultima.Constants.GuildItemType.gem);
		fixture.setPrice(1);
		fixture.setChoice("");
		fixture.setWeaponType(ultima.Constants.WeaponType.AXE);
		fixture.setDescription("");
		fixture.setQuantity(1);
		fixture.setReagentType(ultima.Constants.Reagent.ASH);
		fixture.setArmorType(ultima.Constants.ArmorType.CHAIN);
		fixture.setRoomY(1);
		fixture.setRoomX(1);
		fixture.setName("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Item [type=ARMOR, name=]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:21
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
	 * @generatedBy CodePro at 11/06/19 13:21
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
	 * @generatedBy CodePro at 11/06/19 13:21
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ItemTest.class);
	}
}