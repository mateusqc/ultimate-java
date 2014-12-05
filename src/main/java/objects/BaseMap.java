package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ultima.Constants;
import ultima.GameScreen;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

@XmlRootElement(name = "map")
public class BaseMap implements Constants {
	
	private boolean initialized = false;

	private int id;
	private String fname;
	private MapType type;
	private int width;
	private int height;
	private int levels;
	private int chunkwidth;
	private int chunkheight;
	private int offset;
	private boolean showavatar;
	private boolean nolineofsight;
	private boolean firstperson;
	private boolean contextual;
	private String music;
	private MapBorderBehavior borderbehavior;
	private String tileset;
	private String tilemap;
	
	private List<Portal> portals;
	private List<Label> labels;
	private City city;
	private Dungeon dungeon;
	private Shrine shrine;
	
	private List<Creature> creatures = new ArrayList<Creature>();
	private List<Moongate> moongates;
	private Tile[] tiles;
	private float[][] shadownMap;
	
	//used to keep the pace of wandering to every 2 moves instead of every move, 
	//otherwise cannot catch up and talk to the character
	private long wanderFlag = 0;
	
	private List<DoorStatus> doors = new ArrayList<DoorStatus>();
	
	public Moongate getMoongate(int phase) {
		if (moongates == null) return null;
		for (Moongate m : moongates) {
			if (m.getPhase() == phase) 
				return m;
		}
		return null;
	}
	
	public Portal getPortal(int id) {
		if (portals == null) return null;
		for (Portal p : portals) {
			if (p.getDestmapid() == id) 
				return p;
		}
		return null;
	}
	
	public Portal getPortal(float x, float y) {
		if (portals == null) return null;
		for (Portal p : portals) {
			if (p.getX() == x && p.getY() == y) 
				return p;
		}
		return null;
	}
	
	@XmlAttribute
	public int getId() {
		return id;
	}
	@XmlAttribute
	public String getFname() {
		return fname;
	}
	@XmlAttribute(name="type")
	@XmlJavaTypeAdapter(MapTypeAdapter.class)
	public MapType getType() {
		return type;
	}
	@XmlAttribute
	public int getWidth() {
		return width;
	}
	@XmlAttribute
	public int getHeight() {
		return height;
	}
	@XmlAttribute
	public int getLevels() {
		return levels;
	}
	@XmlAttribute
	public int getOffset() {
		return offset;
	}
	@XmlAttribute
	public boolean getShowavatar() {
		return showavatar;
	}
	@XmlAttribute
	public boolean getNolineofsight() {
		return nolineofsight;
	}
	@XmlAttribute
	public boolean getFirstperson() {
		return firstperson;
	}
	@XmlAttribute
	public boolean getContextual() {
		return contextual;
	}
	@XmlAttribute
	public String getMusic() {
		return music;
	}
	@XmlAttribute
	public String getTileset() {
		return tileset;
	}
	@XmlAttribute
	public String getTilemap() {
		return tilemap;
	}
	@XmlAttribute
	public int getChunkwidth() {
		return chunkwidth;
	}
	@XmlAttribute
	public int getChunkheight() {
		return chunkheight;
	}
	@XmlAttribute(name="borderbehavior")
	@XmlJavaTypeAdapter(BorderTypeAdapter.class)
	public MapBorderBehavior getBorderbehavior() {
		return borderbehavior;
	}
	@XmlElement(name = "portal")
	public List<Portal> getPortals() {
		return portals;
	}
	@XmlElement(name = "label")
	public List<Label> getLabels() {
		return labels;
	}
	@XmlElement
	public City getCity() {
		return city;
	}


	@XmlElement
	public Shrine getShrine() {
		return shrine;
	}
	@XmlElement(name="moongate")
	public List<Moongate> getMoongates() {
		return moongates;
	}

	@XmlElement
	public Dungeon getDungeon() {
		return dungeon;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setType(MapType type) {
		this.type = type;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setLevels(int levels) {
		this.levels = levels;
	}
	public void setChunkWidth(int chunk_width) {
		this.chunkwidth = chunk_width;
	}
	public void setChunkHeight(int chunk_height) {
		this.chunkheight = chunk_height;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public void setShowavatar(boolean showavatar) {
		this.showavatar = showavatar;
	}
	public void setNolineofsight(boolean nolineofsight) {
		this.nolineofsight = nolineofsight;
	}
	public void setFirstperson(boolean firstperson) {
		this.firstperson = firstperson;
	}
	public void setContextual(boolean contextual) {
		this.contextual = contextual;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	public void setTileset(String tileset) {
		this.tileset = tileset;
	}
	public void setTilemap(String tilemap) {
		this.tilemap = tilemap;
	}
	public void setChunkwidth(int chunkwidth) {
		this.chunkwidth = chunkwidth;
	}
	public void setChunkheight(int chunkheight) {
		this.chunkheight = chunkheight;
	}
	public void setBorderbehavior(MapBorderBehavior borderbehavior) {
		this.borderbehavior = borderbehavior;
	}
	public void setPortals(List<Portal> portals) {
		this.portals = portals;
	}
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	public void setCity(City city) {
		this.city = city;
	}

	public void setShrine(Shrine shrine) {
		this.shrine = shrine;
	}
	
	public List<Creature> getCreatures() {
		return creatures;
	}
	public void addCreature(Creature cr) {
		creatures.add(cr);
	}
	public void removeCreature(Creature cr) {
		creatures.remove(cr);
	}
	public void clearCreatures() {
		creatures.clear();
	}
	
	public void setMoongates(List<Moongate> moongate) {
		this.moongates = moongate;
	}

	public void setDungeon(Dungeon dungeon) {
		this.dungeon = dungeon;
	}
	@Override
	public String toString() {
		return String.format("BaseMap [id=%s, fname=%s, portals=%s]", id, fname, portals);
	}

	public Tile[] getTiles() {
		return tiles;
	}

	public void setTiles(Tile[] tiles) {
		this.tiles = tiles;
	}

	public synchronized Tile getTile(int x, int y) {
		if (x < 0 || y < 0) {
			return null;
		}
		if (x + (y * width) >= tiles.length) {
			return null;
		}
		return tiles[x + (y * width)];
	}
	
	public synchronized Tile getTile(Vector3 v) {
		if (v.x < 0 || v.y < 0) { 
			return null;
		}
		if ((int)v.x + ((int)v.y * width) >= tiles.length) {
			return null;
		}
		return tiles[(int)v.x + ((int)v.y * width)];
	}
	
	public float[][] getShadownMap() {
		return shadownMap;
	}

	public void setShadownMap(float[][] shadownMap) {
		this.shadownMap = shadownMap;
	}


	
	public void initObjects(GameScreen mainGame, TextureAtlas atlas1, TextureAtlas atlas2) {
		
		if (initialized) return;
		
		if (city != null) {
			
			for(Person p : city.getPeople()) {
				if (p == null) continue;
				String tname = p.getTile().getName();
				
				Array<AtlasRegion> tr = atlas1.findRegions(tname);
				if (tr == null || tr.size == 0) {
					tr = atlas2.findRegions(tname);
				}
				
				//give some randomness to the animations
				//tr.shuffle();
				
				//random rate between 1 and 4
				int frameRate = ThreadLocalRandom.current().nextInt(1,4);
				p.setAnim(new Animation(frameRate, tr));
				
				Vector3 pixelPos = mainGame.getMapPixelCoords(p.getStart_x(), p.getStart_y());
				p.setCurrentPos(pixelPos);
				p.setX(p.getStart_x());
				p.setY(p.getStart_y());
				
				CreatureType ct = CreatureType.get(tname);
				if (ct != null) {
					p.setEmulatingCreature(ct.getCreature());
				}
				
			}
			
		}
		
		//set doors
		for (int x=0;x<getWidth();x++) {
			for (int y=0;y<getHeight();y++) {
				Tile t = getTile(x, y);
				if (t.getName().equals("door")) {
					doors.add(new DoorStatus(x,y,false,0));
				} else if (t.getName().equals("locked_door")) {
					doors.add(new DoorStatus(x,y,true,0));
				}
			}
		}
		
		initialized = true;
	}
	

	public void moveObjects(GameScreen mainGame, int avatarX, int avatarY) {
		
		if (city != null) {
			
			wanderFlag++;
			
			for(Person p : city.getPeople()) {
				if (p == null) continue;
				
				Vector3 pos = null;
				Vector3 pixelPos = null;
				Direction dir = null;
				
				switch (p.getMovement()) {
				case ATTACK_AVATAR:
				case FOLLOW_AVATAR:
			        int mask = getValidMovesMask(p.getX(), p.getY(), p.getEmulatingCreature(), avatarX, avatarY);
			        dir = findPathTo(avatarX, avatarY, mask, true, p.getX(), p.getY());
					break;
				case FIXED:
					break;
				case WANDER:
					if (wanderFlag % 2 == 0) continue; 
					if (p.isTalking()) continue; 
					dir = Direction.getRandomValidDirection(getValidMovesMask(p.getX(), p.getY(), p.getEmulatingCreature(), avatarX, avatarY));
					break;
				default:
					break;
				
				}
				
				if (dir == null) continue; 
				if (dir == Direction.NORTH) pos = new Vector3(p.getX(), p.getY()-1, 0);
				if (dir == Direction.SOUTH) pos = new Vector3(p.getX(), p.getY()+1, 0);
				if (dir == Direction.EAST) pos = new Vector3(p.getX()+1, p.getY(), 0);
				if (dir == Direction.WEST) pos = new Vector3(p.getX()-1, p.getY(), 0);
				pixelPos = mainGame.getMapPixelCoords((int)pos.x, (int)pos.y);
				p.setCurrentPos(pixelPos);
				p.setX((int)pos.x);
				p.setY((int)pos.y);
				
			}
			
		}
		
		for (Creature cr : creatures) {
	        int mask = getValidMovesMask(cr.currentX, cr.currentY, cr, avatarX, avatarY);
	        Direction dir = findPathTo(avatarX, avatarY, mask, true, cr.currentX, cr.currentY);
			if (dir == null) continue;
			Vector3 pos = null;
			if (dir == Direction.NORTH) pos = new Vector3(cr.currentX, cr.currentY-1, 0);
			if (dir == Direction.SOUTH) pos = new Vector3(cr.currentX, cr.currentY+1, 0);
			if (dir == Direction.EAST) pos = new Vector3(cr.currentX+1, cr.currentY, 0);
			if (dir == Direction.WEST) pos = new Vector3(cr.currentX-1, cr.currentY, 0);
			Vector3 pixelPos = mainGame.getMapPixelCoords((int)pos.x, (int)pos.y);
			cr.currentPos = pixelPos;
			cr.currentX = (int)pos.x;
			cr.currentY = (int)pos.y;  
		}
		
	}
	
	public Direction findPathTo(int avatarX, int avatarY, int validMovesMask, boolean towards, int objX, int objY) {
	    /* find the directions that lead [to/away from] our target */
	    int directionsToObject = towards ? getRelativeDirection(avatarX,avatarY,objX,objY) : getRelativeDirection(avatarX,avatarY,objX,objY);

	    /* make sure we eliminate impossible options */
	    directionsToObject &= validMovesMask;
	    
	    /* get the new direction to move */
	    if (directionsToObject > 0)
	        return Direction.getRandomValidDirection(directionsToObject);

	    /* there are no valid directions that lead to our target, just move wherever we can! */
	    else return Direction.getRandomValidDirection(validMovesMask);
	}
	
	public int getValidMovesMask(int x, int y) {
		return getValidMovesMask(x, y, null, 0, 0);
	}
	
	public int getValidMovesMask(int x, int y, Creature cr, int avatarX, int avatarY) {
		
		int mask = 0;
		
		Tile north = getTile(x,y-1);
		Tile south = getTile(x,y+1);
		Tile east = getTile(x+1,y);
		Tile west = getTile(x-1,y);
		
		mask = addToMask(Direction.NORTH, mask, north, x, y-1, cr, avatarX, avatarY);
		mask = addToMask(Direction.SOUTH, mask, south, x, y+1, cr, avatarX, avatarY);
		mask = addToMask(Direction.EAST, mask, east, x+1, y, cr, avatarX, avatarY);
		mask = addToMask(Direction.WEST, mask, west, x-1, y, cr, avatarX, avatarY);

		return mask;
		
	}
	
	private int addToMask(Direction dir, int mask, Tile tile, int x, int y, Creature cr, int avatarX, int avatarY) {
		if (tile != null) {
			
			TileRule rule = tile.getRule();
			boolean canmove = false;
			if (rule != null) {
				canmove = !rule.has(TileAttrib.unwalkable);
				if (cr != null) {
	                if (cr.getSails() && rule.has(TileAttrib.sailable)) canmove = true;
	                else if (cr.getSails() && !rule.has(TileAttrib.unwalkable)) canmove = false;
	                else if (cr.getSwims() && rule.has(TileAttrib.swimmable)) canmove = true;
	                else if (cr.getSwims() && !rule.has(TileAttrib.unwalkable)) canmove = false;
	                else if (cr.getFlies() && !rule.has(TileAttrib.unflyable)) canmove = true;		
	                else if (rule.has(TileAttrib.creatureunwalkable)) canmove = false;					                	
				}
			} else {
				canmove = false; 
			}
			
		    //System.out.println(String.format("addToMask: %s %s",tile,cr));

			
			//NPCs cannot go thru the secret doors or walk where the avatar is
			if (cr != null) {
				if (tile.getIndex() == 73 || (avatarX == x && avatarY == y)) {
					canmove = false;
				}
			}
			
			//see if another person is there
			if (city != null) {
				for(Person p : city.getPeople()) {
					if (p == null) continue;
					if (p.getX() == x && p.getY() == y) {
						canmove = false;
						break;
					}
				}
			}
			
			for(Creature cre : creatures) {
				if (cre.currentX == x && cre.currentY == y) {
					canmove = false;
					break;
				}
			}
			
			
			if (rule == null || canmove || isDoorOpen(x, y)) {
				mask = Direction.addToMask(dir, mask);
			}
		}
		return mask;
	}
	
	/**
	 * Returns a mask of directions that indicate where one point is relative
	 * to another.  For instance, if the object at (x, y) is
	 * northeast of (c.x, c.y), then this function returns
	 * (MASK_DIR(DIR_NORTH) | MASK_DIR(DIR_EAST))
	 * This function also takes into account map boundaries and adjusts
	 * itself accordingly. If the two coordinates are not on the same z-plane,
	 * then this function return DIR_NONE.
	 */
	public int getRelativeDirection(int cx, int cy, int ax, int ay)  {
	    int dx=0, dy=0;        
	    int dirmask = 0;
	    
	    /* adjust our coordinates to find the closest path */
		if (borderbehavior == MapBorderBehavior.wrap) {

			if (Math.abs(ax - cx) > Math.abs(ax + width - cx))
				ax += width;
			else if (Math.abs(ax - cx) > Math.abs(ax - width - cx))
				ax -= width;

			if (Math.abs(ay - cy) > Math.abs(ay + width - cy))
				ay += height;
			else if (Math.abs(ay - cy) > Math.abs(ay - width - cy))
				ay -= height;

			dx = ax - cx;
			dy = ay - cy;
		} else {
			dx = ax - cx;
			dy = ay - cy;
		}

	    /* add x directions that lead towards to_x to the mask */
	    if (dx < 0)         dirmask |= Direction.getMask(Direction.EAST);
	    else if (dx > 0)    dirmask |= Direction.getMask(Direction.WEST);

	    /* add y directions that lead towards to_y to the mask */
	    if (dy < 0)         dirmask |= Direction.getMask(Direction.SOUTH);
	    else if (dy > 0)    dirmask |= Direction.getMask(Direction.NORTH);

	    /* return the result */
	    return dirmask;
	}
	
	public DoorStatus getDoor(int x, int y) {
		for (DoorStatus ds : doors) {
			if (ds.x == x && ds.y == y) return ds;
		}
		return null;
	}
	public boolean unlockDoor(int x, int y) {
		DoorStatus ds = getDoor(x,y);
		if (ds != null) {
			ds.locked = false;
			return true;
		}
		return false;
	}
	public boolean openDoor(int x, int y) {
		DoorStatus ds = getDoor(x,y);
		if (ds != null && !ds.locked) {
			ds.openedTime = System.currentTimeMillis();
			return true;
		}
		return false;
	}
	
	/**
	 * Door will stay open for 10 seconds and then close
	 */
	public boolean isDoorOpen(int x, int y) {
		DoorStatus ds = getDoor(x,y);
		if (ds != null && System.currentTimeMillis()-ds.openedTime < 10000) {
			return true;
		}
		return false;
	}
	public boolean isDoorOpen(DoorStatus ds) {
		if (ds != null && System.currentTimeMillis()-ds.openedTime < 10000) {
			return true;
		}
		return false;
	}
	
	public class DoorStatus {
		public int x;
		public int y;
		public long openedTime;
		public boolean locked = false;
		private DoorStatus(int x, int y, boolean locked, long openedTime) {
			this.x = x;
			this.y = y;
			this.openedTime = openedTime;
			this.locked = locked;
		}
	}
	
	/**
	 * Add item to inventory and add experience etc for a found item
	 */
	public ItemMapLabels searchLocation(Party p, int x, int y) {
		SaveGame sg = p.getSaveGame();
		
		if (labels == null)	return null;
		
		Label tmp = null;
		for (Label l : labels) {
			if (l.getX() == x && l.getY() == y)
				tmp = l;
		}
		if (tmp == null) return null;

		int expPoints = 0;
		ItemMapLabels label = ItemMapLabels.valueOf(tmp.getName());
		boolean added = false;

		switch (label) {

		case bell:
			if ((sg.items & Item.BELL.getLoc()) > 0)
				break;
			sg.items |= Item.BELL.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 400;
			added = true;
			break;
		case blackstone:
			if ((sg.stones & Stone.BLACK.getLoc()) > 0)
				break;
			sg.stones |= Stone.BLACK.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 200;
			added = true;
			break;
		case bluestone:
			if ((sg.stones & Stone.BLUE.getLoc()) > 0)
				break;
			sg.stones |= Stone.BLUE.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 200;
			added = true;
			break;
		case book:
			if ((sg.items & Item.BOOK.getLoc()) > 0)
				break;
			sg.items |= Item.BOOK.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 400;
			added = true;
			break;
		case candle:
			if ((sg.items & Item.CANDLE.getLoc()) > 0)
				break;
			sg.items |= Item.CANDLE.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 400;
			added = true;
			break;
		case compassionrune:
			if ((sg.runes & Virtue.COMPASSION.getLoc()) > 0)
				break;
			sg.runes |= Virtue.COMPASSION.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 100;
			added = true;
			break;
		case greenstone:
			if ((sg.stones & Stone.GREEN.getLoc()) > 0)
				break;
			sg.stones |= Stone.GREEN.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 200;
			added = true;
			break;
		case honestyrune:
			if ((sg.runes & Virtue.HONESTY.getLoc()) > 0)
				break;
			sg.runes |= Virtue.HONESTY.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 100;
			added = true;
			break;
		case honorrune:
			if ((sg.runes & Virtue.HONOR.getLoc()) > 0)
				break;
			sg.runes |= Virtue.HONOR.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 100;
			added = true;
			break;
		case horn:
			if ((sg.items & Item.HORN.getLoc()) > 0)
				break;
			sg.items |= Item.HORN.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 400;
			added = true;
			break;
		case humilityrune:
			if ((sg.runes & Virtue.HUMILITY.getLoc()) > 0)
				break;
			sg.runes |= Virtue.HUMILITY.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 100;
			added = true;
			break;
		case justicerune:
			if ((sg.runes & Virtue.JUSTICE.getLoc()) > 0)
				break;
			sg.runes |= Virtue.JUSTICE.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 100;
			added = true;
			break;
		case orangestone:
			if ((sg.stones & Stone.ORANGE.getLoc()) > 0)
				break;
			sg.stones |= Stone.ORANGE.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 200;
			added = true;
			break;
		case purplestone:
			if ((sg.stones & Stone.PURPLE.getLoc()) > 0)
				break;
			sg.stones |= Stone.PURPLE.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 200;
			added = true;
			break;
		case redstone:
			if ((sg.stones & Stone.RED.getLoc()) > 0)
				break;
			sg.stones |= Stone.RED.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 200;
			added = true;
			break;
		case sacrificerune:
			if ((sg.runes & Virtue.SACRIFICE.getLoc()) > 0)
				break;
			sg.runes |= Virtue.SACRIFICE.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 100;
			added = true;
			break;
		case skull:
			if ((sg.items & Item.SKULL.getLoc()) > 0)
				break;
			sg.items |= Item.SKULL.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 400;
			added = true;
			break;
		case spiritualityrune:
			if ((sg.runes & Virtue.SPIRITUALITY.getLoc()) > 0)
				break;
			sg.runes |= Virtue.SPIRITUALITY.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 100;
			added = true;
			break;
		case valorrune:
			if ((sg.runes & Virtue.VALOR.getLoc()) > 0)
				break;
			sg.runes |= Virtue.VALOR.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 100;
			added = true;
			break;
		case wheel:
			if ((sg.items & Item.WHEEL.getLoc()) > 0)
				break;
			sg.items |= Item.WHEEL.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 400;
			added = true;
			break;
		case whitestone:
			if ((sg.stones & Stone.WHITE.getLoc()) > 0)
				break;
			sg.stones |= Stone.WHITE.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 200;
			added = true;
			break;
		case yellowstone:
			if ((sg.stones & Stone.YELLOW.getLoc()) > 0)
				break;
			sg.stones |= Stone.YELLOW.getLoc();
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 200;
			added = true;
			break;

		case mysticarmor:
			if (sg.armor[ArmorType.MYSTICROBE.ordinal()] > 0)
				break;
			sg.armor[ArmorType.MYSTICROBE.ordinal()] = 8;
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 400;
			added = true;
			break;
		case mysticswords:
			if (sg.weapons[WeaponType.MYSTICSWORD.ordinal()] > 0)
				break;
			sg.weapons[WeaponType.MYSTICSWORD.ordinal()] = 8;
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			expPoints = 400;
			added = true;
			break;

		case mandrake1:
		case mandrake2:
			sg.reagents[Reagent.MANDRAKE.ordinal()] += new Random().nextInt(8) + 2;
			if (sg.reagents[Reagent.MANDRAKE.ordinal()] > 99)
				sg.reagents[Reagent.MANDRAKE.ordinal()] = 99;
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			sg.lastreagent = sg.moves & 0xF0;
			added = true;
			break;
		case nightshade1:
		case nightshade2:
			sg.reagents[Reagent.NIGHTSHADE.ordinal()] += new Random().nextInt(8) + 2;
			if (sg.reagents[Reagent.NIGHTSHADE.ordinal()] > 99)
				sg.reagents[Reagent.NIGHTSHADE.ordinal()] = 99;
			p.adjustKarma(KarmaAction.FOUND_ITEM);
			sg.lastreagent = sg.moves & 0xF0;
			added = true;
			break;

		case telescope:
			break;
		case balloon:
			break;
		case lockelake:
			break;

		default:
			break;

		}

		if (expPoints > 0) {
			p.getMember(0).awardXP(expPoints);
		}

		if (added) {
			return label;
		}

		return null;
	}
	


}
