package ultima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import objects.SaveGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class StartScreen implements Screen, InputProcessor, Constants {
	
	public static int[] beast1FrameIndexes = {1,1,1,0,0,1,1,1,0,0,1,1,2,2,3,3,4,4,1,2,3,4,1,2,5,6,7,8,5,6,7,8,5,6,7,8,5,6,7,8,5,6,7,8,5,6,7,8,9,10,9,10,9,10,11,11,11,11,12,12,13,13,12,13,12,13,12,11,11,11,0,0,1,2,3,4,1,2,5,6,7,8,5,6,7,8,9,10,11,11,11,0,0,14,14,14,15,16,16,16,17,17,17,16,16,16,17,17,17,16,16,16,15,14,14,0,0,11,11,11};
	public static int[] beast2FrameIndexes = {1,0,1,2,3,4,3,2,1,0,1,2,3,4,5,6,5,6,5,6,4,7,8,9,10,9,8,7,8,9,10,11,12,11,12,13,11,12,13,1,13,1,14,1,15,1,14,1,15,10,9,8,16,17,16,17,16,17,9,8,7,4,3,2,0};
	
	Animation beast1;
	Animation beast2;
	Animation whirlpool;

	Sprite title;
	BitmapFont font;
	TextureAtlas ta;
	TextureRegion storyTexture;

	StringBuilder nameBuffer = new StringBuilder();
	StringBuilder sexBuffer = new StringBuilder();
	
	NameInputAdapter nia = new NameInputAdapter();
	SexInputAdapter sia = new SexInputAdapter();
	StoryInputAdapter stia = new StoryInputAdapter();
	QuestionInputAdapter qia = new QuestionInputAdapter();
	DoneInputAdapter dia = new DoneInputAdapter();
	
	int storyInd = 0;
	
	int questionRound = 0;
    int answerInd = 0;
    boolean pauseFlag = true;
    String currentQuestion = null;
    int[] questionTree = new int[15];
    
    List<Sprite> whiteBeads = new ArrayList<Sprite>();
    List<Sprite> blackBeads = new ArrayList<Sprite>();
    
    int GYP_PLACES_FIRST = 0;
    int GYP_PLACES_TWOMORE = 1;
    int GYP_PLACES_LAST = 2;
    int GYP_UPON_TABLE = 3;
    int GYP_SEGUE1 = 13;
    int GYP_SEGUE2 = 14;
    
	float time = 0;
	Batch batch;
	
	Ultima4 mainGame;
	
	public enum State {
		INIT,
		ASK_NAME,
		ASK_SEX,
		TELL_STORY,
		ASK_QUESTIONS,
		DONE;
	}
	
	State state = State.INIT;
	
	public StartScreen(Ultima4 mainGame) {
		
		this.mainGame = mainGame;
	
		TextureAtlas ba = new TextureAtlas(Gdx.files.classpath("graphics/beasties-atlas.txt"));
		Array<AtlasRegion> anim1 = ba.findRegions("beast");
		Array<AtlasRegion> anim2 = ba.findRegions("dragon");
		Array<AtlasRegion> tmp1 = new Array<AtlasRegion>(beast1FrameIndexes.length);
		Array<AtlasRegion> tmp2 = new Array<AtlasRegion>(beast2FrameIndexes.length);
		for (int i=0;i<beast1FrameIndexes.length;i++) tmp1.add(anim1.get(beast1FrameIndexes[i]));
		for (int i=0;i<beast2FrameIndexes.length;i++) tmp2.add(anim2.get(beast2FrameIndexes[i]));
		beast1 = new Animation(0.25f, tmp1);
		beast2 = new Animation(0.25f, tmp2);
		
		ta = new TextureAtlas(Gdx.files.classpath("graphics/initial-atlas.txt"));
		title = ta.createSprite("title");
		
		TextureAtlas ua = new TextureAtlas(Gdx.files.classpath("tilemaps/ultima5-atlas.txt"));
		whirlpool = new Animation(0.50f, ua.findRegions("whirlpool"));
		
		font = new BitmapFont(Gdx.files.classpath("fonts/Calisto_24.fnt"));
		font.setColor(Color.WHITE);
		
		batch = new SpriteBatch();
		
		Gdx.input.setInputProcessor(this);

	}


	@Override
	public void render(float delta) {
		time += Gdx.graphics.getDeltaTime();

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
				
		batch.begin();
		
		batch.draw(beast1.getKeyFrame(time, true), 0, Ultima4.SCREEN_HEIGHT-31*2, 48*2, 31*2);
		batch.draw(beast2.getKeyFrame(time, true), Ultima4.SCREEN_WIDTH-48*2, Ultima4.SCREEN_HEIGHT-31*2, 48*2, 31*2);
		
		float x = Ultima4.SCREEN_WIDTH/2-320;
		float y = 100;
		float width = 640;
		float height = 50;
		
		if (state == State.INIT) {
			batch.draw(title,Ultima4.SCREEN_WIDTH/2-title.getWidth()/2,350);
			
			font.draw(batch, "In another world, in a time to come.", 215, 300);
			font.draw(batch, "Options:", 350, 260);
			batch.draw(whirlpool.getKeyFrame(time, true), 445, 240, 20, 20);
			font.draw(batch, "Initiate New Game", 300, 220);
			font.draw(batch, "Journey Onward", 300, 190);
			font.draw(batch, "Conversion by Paul Antinori", 250, 60);
			font.draw(batch, "Copyright 1987 Lord British", 250, 30);
			Gdx.input.setInputProcessor(this);
			
		} else if (state == State.ASK_NAME) {
			batch.draw(title,Ultima4.SCREEN_WIDTH/2-title.getWidth()/2,350);
						
			font.draw(batch, "By what name shalt thou be known in this world and time?", 100, 240);
			font.draw(batch, nameBuffer.toString(), 300, 210);
			Gdx.input.setInputProcessor(nia);
			
		} else if (state == State.ASK_SEX) {
			batch.draw(title,Ultima4.SCREEN_WIDTH/2-title.getWidth()/2,350);
			
			font.draw(batch, "Art thou Male or Female?", 250, 240);
			font.draw(batch, sexBuffer.toString(), 300, 210);
			Gdx.input.setInputProcessor(sia);
			
		} else if (state == State.TELL_STORY) {
									
	        if (storyInd == 0)
	        	storyTexture = ta.findRegion("tree");
	        else if (storyInd == 6)
	        	storyTexture = ta.findRegion("portal");
	        else if (storyInd == 11)
	        	storyTexture = ta.findRegion("tree");
	        else if (storyInd == 15)
	        	storyTexture = ta.findRegion("outside");
	        else if (storyInd == 17)
	        	storyTexture = ta.findRegion("inside");
	        else if (storyInd == 20)
	        	storyTexture = ta.findRegion("wagon");
	        else if (storyInd == 21)
	        	storyTexture = ta.findRegion("gypsy");
	        else if (storyInd == 23)
	        	storyTexture = ta.findRegion("abacus");
			
			batch.draw(storyTexture, Ultima4.SCREEN_WIDTH/2-320, 200, 640, 304);
			
			TextBounds bounds = font.getWrappedBounds(initScripts[storyInd], width);
			x += width / 2 - bounds.width / 2;
			y += height / 2 + bounds.height / 2;

			font.drawWrapped(batch, initScripts[storyInd], x, y, width);

			Gdx.input.setInputProcessor(stia);
			
		} else if (state == State.ASK_QUESTIONS || state == State.DONE) {
			
			batch.draw(storyTexture, Ultima4.SCREEN_WIDTH/2-320, 200, 640, 304);
			
			for (Sprite b : whiteBeads) {
				batch.draw(b, b.getX(), b.getY(), 16, 24);
			}
			
			for (Sprite b : blackBeads) {
				batch.draw(b, b.getX(), b.getY(), 16, 24);
			}
			
			if (questionRound > 6) {
				questionRound = 6;
			}
			
			String v1 = Virtue.get(questionTree[questionRound * 2]).toString().toLowerCase();
			String v2 = Virtue.get(questionTree[questionRound * 2 + 1]).toString().toLowerCase();
			batch.draw(ta.findRegion(v1), 110, 232, 178, 244);
			batch.draw(ta.findRegion(v2), 515, 232, 178, 244);
			
			if (state == State.ASK_QUESTIONS) {
							
				if (pauseFlag) {
					
					StringBuffer sb = new StringBuffer();
					sb.append(gypsyText[questionRound == 0 ? GYP_PLACES_FIRST : (questionRound == 6 ? GYP_PLACES_LAST : GYP_PLACES_TWOMORE)]);
					sb.append(gypsyText[GYP_UPON_TABLE]);
					sb.append(String.format("%s and %s.  She says", gypsyText[questionTree[questionRound * 2] + 4], gypsyText[questionTree[questionRound * 2 + 1] + 4]));
					sb.append("\nConsider this:");
					String text = sb.toString();
							
					TextBounds bounds = font.getWrappedBounds(text, width);
					x += width / 2 - bounds.width / 2;
					y += height / 2 + bounds.height / 2;
					font.drawWrapped(batch, text, x, y, width);
					
				} else {
					
					TextBounds bounds = font.getWrappedBounds(currentQuestion, width);
					x += width / 2 - bounds.width / 2;
					y += height / 2 + bounds.height / 2;
					font.drawWrapped(batch, currentQuestion, x, y, width);
					
				}
	
				Gdx.input.setInputProcessor(qia);
				
			} else {
				
				TextBounds bounds = font.getWrappedBounds(gypsyText[storyInd], width);
				x += width / 2 - bounds.width / 2;
				y += height / 2 + bounds.height / 2;
				font.drawWrapped(batch, gypsyText[storyInd], x, y, width);
				
				Gdx.input.setInputProcessor(dia);
			}

		}

		batch.end();
		
	}
	
	@Override
	public boolean keyUp(int keycode) {
		
		if (keycode == Keys.I) {
			state = State.ASK_NAME;	
		} else if (keycode == Keys.J) {
			if (!Gdx.files.internal(PARTY_SAV_BASE_FILENAME).file().exists()) {
				state = State.ASK_NAME;	
			} else {
				mainGame.setScreen(new GameScreen(mainGame));
			}
		}
		
		return false;
	}
	
	class NameInputAdapter extends InputAdapter {
		@Override
		public boolean keyUp(int keycode) {
			if (keycode == Keys.ENTER) {
				if (nameBuffer.length() < 1) return false;
				state = State.ASK_SEX;
			} else if (keycode == Keys.BACKSPACE) {
				if (nameBuffer.length() > 0)
					nameBuffer.deleteCharAt(nameBuffer.length() - 1);
			} else if (keycode >= 29 && keycode <= 54) {
				if (nameBuffer.length() < 1) {
					nameBuffer.append(Keys.toString(keycode));
				} else {
					nameBuffer.append(Keys.toString(keycode).toLowerCase());
				}
			}
			return false;
		}
	}

	class SexInputAdapter extends InputAdapter {
		@Override
		public boolean keyUp(int keycode) {
			if (keycode == Keys.ENTER) {
				if (sexBuffer.length() < 1) return false;
				state = State.TELL_STORY;
			} else if (keycode == Keys.BACKSPACE) {
				if (sexBuffer.length() > 0)
					sexBuffer.deleteCharAt(sexBuffer.length() - 1);
			} else if (keycode == Keys.M || keycode == Keys.F) {
				sexBuffer.append(Keys.toString(keycode));
			}
			return false;
		}
	}
	
	class StoryInputAdapter extends InputAdapter {
		@Override
		public boolean keyUp(int keycode) {
			if (keycode == Keys.ENTER || keycode == Keys.SPACE) {
				storyInd++;
				if (storyInd == 24) {
					state = State.ASK_QUESTIONS;
				    questionRound = 0;
				    initQuestionTree();
				}
			}
			return false;
		}
	}
	
	class QuestionInputAdapter extends InputAdapter {
		@Override
		public boolean keyUp(int keycode) {
			
			if (pauseFlag) {
				pauseFlag = false;
				currentQuestion = getQuestion(questionTree[questionRound * 2], questionTree[questionRound * 2 + 1]);
			} else {
				if (keycode == Keys.A || keycode == Keys.B) {
					boolean ret = doQuestion(keycode == Keys.A ? 0 : 1);
					if (ret) {
						state = State.DONE;
						storyInd = 12;
					}
					pauseFlag = true;
				}
			}
			return false;
		}
	}
	
	class DoneInputAdapter extends InputAdapter {
		@Override
		public boolean keyUp(int keycode) {
			if (keycode == Keys.ENTER || keycode == Keys.SPACE) {
				storyInd++;
				if (storyInd == 14) {
					
					SaveGame sg = new SaveGame();
					
					SaveGame.SaveGamePlayerRecord avatar = sg.new SaveGamePlayerRecord();
					avatar.name = nameBuffer.toString();
					avatar.sex = sexBuffer.toString().equals("M")?SexType.MALE:SexType.FEMALE;
					avatar.klass = ClassType.get(questionTree[14]);
					
					avatar.weapon = avatar.klass.getInitialWeapon();
				    avatar.armor = avatar.klass.getInitialArmor();
				    avatar.xp = avatar.klass.getInitialExp();
				    sg.x = avatar.klass.getStartX();
				    sg.y = avatar.klass.getStartY();

				    avatar.adjuestAttribsPerKarma(questionTree);
				    
				    avatar.hp = avatar.hpMax = avatar.getMaxLevel() * 100;
				    avatar.mp = avatar.getMaxMp();
				    
					sg.players[0] = avatar;
				    
				    int p = 1;
					for (int i = 0; i < 8; i++) {
				        /* Initial setup for party members that aren't in your group yet... */
				        if (i != avatar.klass.ordinal()) {
				        	sg.players[p] = sg.new SaveGamePlayerRecord();
				            sg.players[p].klass = ClassType.get(i);
				            sg.players[p].xp = sg.players[p].klass.getInitialExp();
				            sg.players[p].str = NpcDefaults.get(i).getStr();
				            sg.players[p].dex = NpcDefaults.get(i).getDex();
				            sg.players[p].intel = NpcDefaults.get(i).getIntell();
				            sg.players[p].weapon = sg.players[p].klass.getInitialWeapon();
				            sg.players[p].armor = sg.players[p].klass.getInitialArmor();
				            sg.players[p].name = NpcDefaults.get(i).toString();
				            sg.players[p].sex = NpcDefaults.get(i).getSex();
				            sg.players[p].hp = sg.players[p].hpMax = sg.players[p].getMaxLevel() * 100;
				            sg.players[p].mp = sg.players[p].getMaxMp();
				            p++;
				        }
					}
					
					try {
						sg.write(PARTY_SAV_BASE_FILENAME);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					mainGame.setScreen(new GameScreen(mainGame));
				}
			}
			return false;
		}
	}
	
	
	/**
	 * Initializes the question tree.  The tree starts off with the first
	 * eight entries set to the numbers 0-7 in a random order.
	 */
	public void initQuestionTree() {

		for (int i = 0; i < 8; i++) {
			questionTree[i] = i;
		}
		Random rand = new Random();
		for (int i = 0; i < 8; i++) {
			int r = rand.nextInt(8);
			int tmp = questionTree[r];
			questionTree[r] = questionTree[i];
			questionTree[i] = tmp;
		}
		answerInd = 8;

		if (questionTree[0] > questionTree[1]) {
			int tmp = questionTree[0];
			questionTree[0] = questionTree[1];
			questionTree[1] = tmp;
		}

	}
	
	public String getQuestion(int v1, int v2) {
		int i = 0;
		int d = 7;
		while (v1 > 0) {
			i += d;
			d--;
			v1--;
			v2--;
		}
		return Constants.karmaQuestions[i + v2 - 1];
	}
	
	/**
	 * Updates the question tree with the given answer, and advances to the next round.
	 * @return true if all questions have been answered, false otherwise
	 */
	public boolean doQuestion(int answer) {
		if (answer == 0) {
			questionTree[answerInd] = questionTree[questionRound * 2];
		}
		else {
			questionTree[answerInd] = questionTree[questionRound * 2 + 1];
		}
    
		setAbacusBeads(questionRound, questionTree[answerInd], questionTree[questionRound * 2 + ((answer) != 0 ? 0 : 1)]);
    
		answerInd++;
		questionRound++;
    
		if (questionRound > 6) {
			return true;
		}
    
		if (questionTree[questionRound * 2] > questionTree[questionRound * 2 + 1]) {
			int tmp = questionTree[questionRound * 2];
			questionTree[questionRound * 2] = questionTree[questionRound * 2 + 1];
			questionTree[questionRound * 2 + 1] = tmp;
		}
    
		return false;
	}
	
	public void setAbacusBeads(int row, int selectedVirtue, int rejectedVirtue) {
	    
	    Sprite wb = ta.createSprite("white-bead");
	    wb.setBounds(360 + (selectedVirtue * 11), Ultima4.SCREEN_HEIGHT - 166 - (row * 29), 16, 24);
	    whiteBeads.add(wb);
	    
	    Sprite bb = ta.createSprite("black-bead");
	    bb.setBounds(360 + (rejectedVirtue * 11), Ultima4.SCREEN_HEIGHT - 166 - (row * 29), 16, 24);
	    whiteBeads.add(bb);
	    
	}
	
		
	@Override
	public void show() {
		
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}


	@Override
	public void resume() {
		
	}


	@Override
	public void hide() {
		
	}


	@Override
	public void dispose() {
		
	}


	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}


	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}


	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}


	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}


	@Override
	public boolean scrolled(int amount) {
		return false;
	}
	

	
	

	

}
