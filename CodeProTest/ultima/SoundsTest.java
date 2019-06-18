package ultima;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.audio.Music;

/**
 * The class <code>SoundsTest</code> contains tests for the class <code>{@link Sounds}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:07
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class SoundsTest {
	/**
	 * Run the Sounds() constructor test.
	 *
	 * @generatedBy CodePro at 11/06/19 13:07
	 */
	@Test
	public void testSounds_1()
		throws Exception {
		Sounds result = new Sounds();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Music play(Sound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:07
	 */
	@Test
	public void testPlay_1()
		throws Exception {
		Sound sound = Sound.ACID;

		Music result = Sounds.play(sound);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Sounds.play(Sounds.java:58)
		//       at ultima.Sounds.play(Sounds.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the Music play(Sound,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:07
	 */
	@Test
	public void testPlay_2()
		throws Exception {
		Sound sound = Sound.ACID;
		float volume = 1.0f;

		Music result = Sounds.play(sound, volume);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Sounds.play(Sounds.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the Music play(Sound,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:07
	 */
	@Test
	public void testPlay_3()
		throws Exception {
		Sound sound = Sound.ACID;
		float volume = 1.0f;

		Music result = Sounds.play(sound, volume);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Sounds.play(Sounds.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the Music play(Sound,OnCompletionListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:07
	 */
	@Test
	public void testPlay_4()
		throws Exception {
		Sound sound = Sound.ACID;
		com.badlogic.gdx.audio.Music.OnCompletionListener ocl = null;

		Music result = Sounds.play(sound, ocl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Sounds.play(Sounds.java:70)
		assertNotNull(result);
	}

	/**
	 * Run the Music play(Sound,OnCompletionListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:07
	 */
	@Test
	public void testPlay_5()
		throws Exception {
		Sound sound = Sound.ACID;
		com.badlogic.gdx.audio.Music.OnCompletionListener ocl = null;

		Music result = Sounds.play(sound, ocl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ultima.Sounds.play(Sounds.java:70)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/06/19 13:07
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
	 * @generatedBy CodePro at 11/06/19 13:07
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
	 * @generatedBy CodePro at 11/06/19 13:07
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SoundsTest.class);
	}
}