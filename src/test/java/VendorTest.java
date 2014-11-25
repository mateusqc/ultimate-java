import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import objects.BaseMap;
import objects.MapSet;
import objects.Party;
import objects.Person;
import objects.SaveGame;
import objects.TileSet;

import org.testng.annotations.Test;

import ultima.Constants.InventoryType;
import ultima.Constants.Maps;
import ultima.Constants.WeaponType;
import vendor.BaseVendor;
import vendor.VendorClassSet;
import vendor.WeaponVendor;

public class VendorTest {

	//@Test
	public void testWeaponVendor() throws Exception {
		
		File file = new File("target/classes/xml/vendor.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(VendorClassSet.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		VendorClassSet vcs = (VendorClassSet) jaxbUnmarshaller.unmarshal(file);
		vcs.init();
		
		SaveGame sg = new SaveGame();
		
		SaveGame.SaveGamePlayerRecord rec = sg.new SaveGamePlayerRecord();
		rec.name = "avatar";
		rec.hp=200;
		
		Party party = new Party(sg);
		party.addMember(rec);

		sg.gold = 25;
		sg.food = 200;
		
		party.getSaveGame().weapons[WeaponType.SLING.ordinal()] = 5;
		party.getSaveGame().weapons[WeaponType.MAGICAXE.ordinal()] = 5;

		
		BaseVendor v = new WeaponVendor(vcs.getVendor(InventoryType.WEAPON, Maps.BRITAIN), party);

		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			if (!v.nextDialog()) {
				break;
			}
			
			String input = br.readLine();
			
			if (input != null && input.equals("bye")) {
				break;
			}
			
			v.setResponse(input);
			
		}
		
		System.err.println("sg gold = " + sg.gold);
		for (WeaponType wt : WeaponType.values()) {
			System.err.println(wt.toString() + " count=" + sg.weapons[wt.ordinal()] );
		}


	}
	
	@Test
	public void printVendors() throws Exception {
		
		
		
		File file2 = new File("target/classes/xml/tileset-base.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(TileSet.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		TileSet ts = (TileSet) jaxbUnmarshaller.unmarshal(file2);
		ts.setMaps();

		File file3 = new File("target/classes/xml/maps.xml");
		jaxbContext = JAXBContext.newInstance(MapSet.class);
		jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		MapSet ms = (MapSet) jaxbUnmarshaller.unmarshal(file3);
		ms.init(ts);
		
		ArrayList<Holder> tm = new ArrayList<Holder>();
				
		for (BaseMap map : ms.getMaps()) {
			
			if (map.getCity() == null) {
				continue;
			}

			//System.out.println(Maps.convert(map.getId()));

			for (int i=0;i<map.getCity().getPeople().length;i++) {
				Person p = map.getCity().getPeople()[i];
				if (p != null && p.getRole() != null && p.getRole().getInventoryType() != null) {
					tm.add(new Holder(p.getRole().getInventoryType(), p, Maps.convert(map.getId())));
					System.out.println("type=\"" +p.getRole().getInventoryType()+ "\" personId=\"" + p.getId() + "\" " + Maps.convert(map.getId()));

				}
			}
						


			
			
		}
		
		Collections.sort(tm, new MyComparator());
		
		for (Holder h : tm) {
			//System.out.println("type=\"" +h.t+ "\" personId=\"" + h.p.getId() + "\" " + h.map);
		}
		
		
		
	}
	
	public class MyComparator implements Comparator<Holder> {
	    public int compare(Holder h1, Holder h2){
	        return h1.t.ordinal() - h2.t.ordinal();
	    }
	}
	
	public class Holder implements Comparable<Holder> {
		InventoryType t;
		Person p;
		Maps map;
		public Holder(InventoryType t, Person p, Maps map) {
			this.t = t;
			this.p = p;
			this.map = map;
		}
		@Override
		public int compareTo(Holder o) {
	        return t.ordinal() - o.t.ordinal();
		}
	}
	


}
