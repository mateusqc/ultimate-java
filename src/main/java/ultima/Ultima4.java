package ultima;

import util.LogDisplay;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import objects.ArmorSet;
import objects.CreatureSet;
import objects.Drawable;
import objects.MapSet;
import objects.TileSet;
import objects.WeaponSet;
import util.Utils;
import vendor.VendorClassSet;

public class Ultima4 extends Game {

    public static int SCREEN_WIDTH = 1024;
    public static int SCREEN_HEIGHT = 768;

    public static int MAP_WIDTH = 672;
    public static int MAP_HEIGHT = 672;

    public static LogDisplay hud;
    public static Texture backGround;
    public static BitmapFont font;
    public static StartScreen startScreen;
    public static Skin skin;

    public static boolean playMusic = true;
    public static float musicVolume = 0.1f;
    public static Music music;

    public static MapSet maps;
    public static TileSet baseTileSet;
    public static WeaponSet weapons;
    public static ArmorSet armors;
    public static CreatureSet creatures;
    public static VendorClassSet vendorClassSet;
    public static TextureAtlas standardAtlas;
    
    public static TextureRegion hitTile;
    public static TextureRegion missTile;
    public static TextureRegion corpse;
    
    public static Drawable balloon;

    public static void main(String[] args) {

        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "Ultima 4 - Quest of the Avatar";
        cfg.width = SCREEN_WIDTH;
        cfg.height = SCREEN_HEIGHT;
        cfg.addIcon("assets/graphics/ankh.png", FileType.Internal);
        new LwjglApplication(new Ultima4(), cfg);

    }

    @Override
    public void create() {

        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("assets/fonts/lindberg.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 16;
        font = generator.generateFont(parameter);

        parameter.size = 24;
        BitmapFont fontLarger = generator.generateFont(parameter);

        generator.dispose();

        skin = new Skin(Gdx.files.internal("assets/skin/uiskin.json"));
        skin.remove("default-font", BitmapFont.class);
        skin.add("default-font", font, BitmapFont.class);
        skin.add("journal", font, BitmapFont.class);
        skin.add("death-screen", fontLarger, BitmapFont.class);

        Label.LabelStyle ls = Ultima4.skin.get("default", Label.LabelStyle.class);
        ls.font = font;
        TextButton.TextButtonStyle tbs = Ultima4.skin.get("default", TextButton.TextButtonStyle.class);
        tbs.font = font;
        TextButton.TextButtonStyle tbswood = Ultima4.skin.get("wood", TextButton.TextButtonStyle.class);
        tbswood.font = font;
        SelectBox.SelectBoxStyle sbs = Ultima4.skin.get("default", SelectBox.SelectBoxStyle.class);
        sbs.font = font;
        sbs.listStyle.font = font;
        CheckBox.CheckBoxStyle cbs = Ultima4.skin.get("default", CheckBox.CheckBoxStyle.class);
        cbs.font = font;
        List.ListStyle lis = Ultima4.skin.get("default", List.ListStyle.class);
        lis.font = font;
        TextField.TextFieldStyle tfs = Ultima4.skin.get("default", TextField.TextFieldStyle.class);
        tfs.font = font;

        hud = new LogDisplay(font);

        try {

            backGround = new Texture(Gdx.files.internal("assets/graphics/frame.png"));

            standardAtlas = new TextureAtlas(Gdx.files.internal("assets/tilemaps/tiles-enhanced-vga-atlas.txt"));

            hitTile = Ultima4.standardAtlas.findRegion("hit_flash");
            missTile = Ultima4.standardAtlas.findRegion("miss_flash");
            corpse = Ultima4.standardAtlas.findRegion("corpse");

            baseTileSet = (TileSet) Utils.loadXml("tileset-base.xml", TileSet.class);
            baseTileSet.setMaps();

            maps = (MapSet) Utils.loadXml("maps.xml", MapSet.class);
            maps.init(baseTileSet);

            vendorClassSet = (VendorClassSet) Utils.loadXml("vendor.xml", VendorClassSet.class);
            vendorClassSet.init();

            weapons = (WeaponSet) Utils.loadXml("weapons.xml", WeaponSet.class);
            armors = (ArmorSet) Utils.loadXml("armors.xml", ArmorSet.class);
            creatures = (CreatureSet) Utils.loadXml("creatures.xml", CreatureSet.class);
            creatures.init();
            weapons.init();
            armors.init();

        } catch (Exception e) {
            e.printStackTrace();
        }

        startScreen = new StartScreen(this);

        setScreen(startScreen);

    }

}
