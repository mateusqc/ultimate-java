package objects;

import java.util.ArrayList;
import java.util.List;
import ultima.Constants;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WeaponTest</code> contains tests for the class <code>{@link Weapon}</code>.
 *
 * @generatedBy CodePro at 11/06/19 12:58
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class WeaponTest {
	/**
	 * Run the Weapon() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testWeapon_1()
		throws Exception {
		Weapon result = new Weapon();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testCanUse_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(null);
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testCanUse_2()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testCanUse_3()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testCanUse_4()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean canUse(ClassType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testCanUse_5()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		ultima.Constants.ClassType klazz = ultima.Constants.ClassType.BARD;

		boolean result = fixture.canUse(klazz);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String getAbbr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAbbr_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		String result = fixture.getAbbr();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getAbsolute_range() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAbsolute_range_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		int result = fixture.getAbsolute_range();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getAttackthroughobjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAttackthroughobjects_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getAttackthroughobjects();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getAttackthroughobjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetAttackthroughobjects_2()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(false);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getAttackthroughobjects();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getChoosedistance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetChoosedistance_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getChoosedistance();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getChoosedistance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetChoosedistance_2()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(false);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getChoosedistance();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the List<Constraint> getConstraints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetConstraints_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		List<Constraint> result = fixture.getConstraints();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getDamage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetDamage_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		int result = fixture.getDamage();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getDontshowtravel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetDontshowtravel_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getDontshowtravel();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getDontshowtravel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetDontshowtravel_2()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(false);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getDontshowtravel();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getHittile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetHittile_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		String result = fixture.getHittile();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getLeavetile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetLeavetile_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		String result = fixture.getLeavetile();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean getLose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetLose_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getLose();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getLose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetLose_2()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(false);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getLose();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getLosewhenranged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetLosewhenranged_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getLosewhenranged();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getLosewhenranged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetLosewhenranged_2()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(false);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getLosewhenranged();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean getMagic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMagic_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getMagic();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getMagic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMagic_2()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(false);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getMagic();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getMisstile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetMisstile_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		String result = fixture.getMisstile();

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
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getRange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetRange_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		int result = fixture.getRange();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getReturns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetReturns_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getReturns();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getReturns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetReturns_2()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(false);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		boolean result = fixture.getReturns();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the ultima.Constants.WeaponType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);

		ultima.Constants.WeaponType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getWeapon());
		assertEquals("AXE", result.name());
		assertEquals("AXE", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the void setAbbr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetAbbr_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		String abbr = "";

		fixture.setAbbr(abbr);

		// add additional test code here
	}

	/**
	 * Run the void setAbsolute_range(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetAbsolute_range_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		int absolute_range = 1;

		fixture.setAbsolute_range(absolute_range);

		// add additional test code here
	}

	/**
	 * Run the void setAttackthroughobjects(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetAttackthroughobjects_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		boolean attackthroughobjects = true;

		fixture.setAttackthroughobjects(attackthroughobjects);

		// add additional test code here
	}

	/**
	 * Run the void setChoosedistance(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetChoosedistance_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		boolean choosedistance = true;

		fixture.setChoosedistance(choosedistance);

		// add additional test code here
	}

	/**
	 * Run the void setConstraints(List<Constraint>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetConstraints_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		List<Constraint> constraints = new ArrayList();

		fixture.setConstraints(constraints);

		// add additional test code here
	}

	/**
	 * Run the void setDamage(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetDamage_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		int damage = 1;

		fixture.setDamage(damage);

		// add additional test code here
	}

	/**
	 * Run the void setDontshowtravel(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetDontshowtravel_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		boolean dontshowtravel = true;

		fixture.setDontshowtravel(dontshowtravel);

		// add additional test code here
	}

	/**
	 * Run the void setHittile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetHittile_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		String hittile = "";

		fixture.setHittile(hittile);

		// add additional test code here
	}

	/**
	 * Run the void setLeavetile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetLeavetile_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		String leavetile = "";

		fixture.setLeavetile(leavetile);

		// add additional test code here
	}

	/**
	 * Run the void setLose(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetLose_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		boolean lose = true;

		fixture.setLose(lose);

		// add additional test code here
	}

	/**
	 * Run the void setLosewhenranged(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetLosewhenranged_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		boolean losewhenranged = true;

		fixture.setLosewhenranged(losewhenranged);

		// add additional test code here
	}

	/**
	 * Run the void setMagic(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMagic_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		boolean magic = true;

		fixture.setMagic(magic);

		// add additional test code here
	}

	/**
	 * Run the void setMisstile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetMisstile_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		String misstile = "";

		fixture.setMisstile(misstile);

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
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setRange(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetRange_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		int range = 1;

		fixture.setRange(range);

		// add additional test code here
	}

	/**
	 * Run the void setReturns(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetReturns_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		boolean returns = true;

		fixture.setReturns(returns);

		// add additional test code here
	}

	/**
	 * Run the void setType(WeaponType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 12:58
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		Weapon fixture = new Weapon();
		fixture.setLosewhenranged(true);
		fixture.setAbbr("");
		fixture.setAttackthroughobjects(true);
		fixture.setMisstile("");
		fixture.setDamage(1);
		fixture.setLeavetile("");
		fixture.setName("");
		fixture.setConstraints(new ArrayList());
		fixture.setAbsolute_range(1);
		fixture.setLose(true);
		fixture.setHittile("");
		fixture.setRange(1);
		fixture.setReturns(true);
		fixture.setMagic(true);
		fixture.setChoosedistance(true);
		fixture.setDontshowtravel(true);
		fixture.setType(ultima.Constants.WeaponType.AXE);
		ultima.Constants.WeaponType type = ultima.Constants.WeaponType.AXE;

		fixture.setType(type);

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
		new org.junit.runner.JUnitCore().run(WeaponTest.class);
	}
}