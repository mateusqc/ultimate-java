package util;

import org.junit.*;
import static org.junit.Assert.*;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import objects.JournalEntry;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ArraySelection;
import com.badlogic.gdx.utils.Array;

/**
 * The class <code>JournalListTest</code> contains tests for the class <code>{@link JournalList}</code>.
 *
 * @generatedBy CodePro at 11/06/19 13:17
 * @author Arthur Ferrão
 * @version $Revision: 1.0 $
 */
public class JournalListTest {
	/**
	 * Run the JournalList(Skin,TextField,Array<JournalEntry>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testJournalList_1()
		throws Exception {
		Skin skin = new Skin();
		TextField filterField = new TextField("", new Skin());
		Array<JournalEntry> items = new Array(true, new Object[] {}, 1, 1);

		JournalList result = new JournalList(skin, filterField, items);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertNotNull(result);
	}

	/**
	 * Run the JournalList(Skin,TextField,Array<JournalEntry>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testJournalList_2()
		throws Exception {
		Skin skin = new Skin();
		TextField filterField = new TextField("", new Skin());
		Array<JournalEntry> items = new Array(true, new Object[] {}, 1, 1);

		JournalList result = new JournalList(skin, filterField, items);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertNotNull(result);
	}

	/**
	 * Run the void draw(Batch,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testDraw_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea((Rectangle) null);
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		Batch batch = new PolygonSpriteBatch();
		float parentAlpha = 1.0f;

		fixture.draw(batch, parentAlpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void draw(Batch,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testDraw_2()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		Batch batch = new PolygonSpriteBatch();
		float parentAlpha = 1.0f;

		fixture.draw(batch, parentAlpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void draw(Batch,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testDraw_3()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		Batch batch = new PolygonSpriteBatch();
		float parentAlpha = 1.0f;

		fixture.draw(batch, parentAlpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void draw(Batch,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testDraw_4()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		Batch batch = new PolygonSpriteBatch();
		float parentAlpha = 1.0f;

		fixture.draw(batch, parentAlpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void draw(Batch,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testDraw_5()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		Batch batch = new PolygonSpriteBatch();
		float parentAlpha = 1.0f;

		fixture.draw(batch, parentAlpha);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the float getItemHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetItemHeight_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		float result = fixture.getItemHeight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the Array<JournalEntry> getItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetItems_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		Array<JournalEntry> result = fixture.getItems();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertNotNull(result);
	}

	/**
	 * Run the float getPrefHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetPrefHeight_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		float result = fixture.getPrefHeight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getPrefWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetPrefWidth_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		float result = fixture.getPrefWidth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the JournalEntry getSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetSelected_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		JournalEntry result = fixture.getSelected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertNotNull(result);
	}

	/**
	 * Run the int getSelectedIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetSelectedIndex_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		int result = fixture.getSelectedIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertEquals(0, result);
	}

	/**
	 * Run the int getSelectedIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetSelectedIndex_2()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		int result = fixture.getSelectedIndex();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertEquals(0, result);
	}

	/**
	 * Run the ArraySelection<JournalEntry> getSelection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetSelection_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		ArraySelection<JournalEntry> result = fixture.getSelection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertNotNull(result);
	}

	/**
	 * Run the com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle getStyle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testGetStyle_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle result = fixture.getStyle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
		assertNotNull(result);
	}

	/**
	 * Run the void layout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testLayout_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());

		fixture.layout();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setCullingArea(Rectangle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetCullingArea_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		Rectangle cullingArea = new Rectangle();

		fixture.setCullingArea(cullingArea);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setSelected(JournalEntry) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetSelected_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		JournalEntry item = new JournalEntry();

		fixture.setSelected(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setSelected(JournalEntry) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetSelected_2()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 0));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		JournalEntry item = new JournalEntry();

		fixture.setSelected(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setSelected(JournalEntry) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetSelected_3()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		JournalEntry item = new JournalEntry();

		fixture.setSelected(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setSelected(JournalEntry) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetSelected_4()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		JournalEntry item = new JournalEntry();

		fixture.setSelected(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setSelectedIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetSelectedIndex_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		int index = -2;

		fixture.setSelectedIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setSelectedIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetSelectedIndex_2()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		int index = 1;

		fixture.setSelectedIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setSelectedIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetSelectedIndex_3()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		int index = 1;

		fixture.setSelectedIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setSelectedIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetSelectedIndex_4()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		int index = -1;

		fixture.setSelectedIndex(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setStyle(ListStyle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetStyle_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle style = null;

		fixture.setStyle(style);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void setStyle(ListStyle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testSetStyle_2()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle style = new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle();

		fixture.setStyle(style);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void touchDown(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testTouchDown_1()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 0));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		float x = 1.0f;
		float y = 1.0f;

		fixture.touchDown(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void touchDown(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testTouchDown_2()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		float x = 1.0f;
		float y = 1.0f;

		fixture.touchDown(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void touchDown(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testTouchDown_3()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		float x = 1.0f;
		float y = 1.0f;

		fixture.touchDown(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void touchDown(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testTouchDown_4()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		float x = 1.0f;
		float y = 1.0f;

		fixture.touchDown(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
	}

	/**
	 * Run the void touchDown(float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/06/19 13:17
	 */
	@Test
	public void testTouchDown_5()
		throws Exception {
		JournalList fixture = new JournalList(new Skin(), new TextField("", new Skin()), new Array(true, new Object[] {}, 1, 1));
		fixture.setCullingArea(new Rectangle());
		fixture.setStyle(new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle());
		float x = 1.0f;
		float y = 1.0f;

		fixture.touchDown(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    com.badlogic.gdx.utils.GdxRuntimeException: No com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle registered with name: default
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:154)
		//       at com.badlogic.gdx.scenes.scene2d.ui.Skin.get(Skin.java:139)
		//       at com.badlogic.gdx.scenes.scene2d.ui.TextField.<init>(TextField.java:119)
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
		new org.junit.runner.JUnitCore().run(JournalListTest.class);
	}
}