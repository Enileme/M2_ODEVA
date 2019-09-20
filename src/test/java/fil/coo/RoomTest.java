
package fil.coo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import fil.coo.Characters.Monster;
import fil.coo.Items.Gold;
import fil.coo.Items.Items;

public class RoomTest {
	
	private Room room;
	private Monster m;

	@Test
	public void RoomConstructorTest() {
		room = new Room(Boolean.FALSE);
		assertEquals(false, room.isExit());
		assertEquals(0,room.monsters.size());
		assertEquals(0,room.items.size());
		assertEquals(0,room.neighbours.size());
	}
	
	@Test
	public void RoomGetSetMonstersTest() {
		room = new Room(Boolean.FALSE);
		m = new Monster(room);
		List<Monster> listMonsters = new ArrayList<Monster>();
		listMonsters.add(m);
		room.setMonsters(listMonsters);
		assertEquals(listMonsters, room.getMonsters());
	}
	
	@Test
	public void RoomGetSetItemsTest() {
		room = new Room(Boolean.FALSE);
		List<Items> listItems = new ArrayList<Items>();
		Gold gold = new Gold();
		listItems.add(gold);
		room.setItems(listItems);
		assertEquals(listItems, room.getItems());
	}
	
	@Test
	public void RoomAddMonsterTest(){
		room = new Room(Boolean.FALSE);
		assertEquals(0, room.getMonsters().size());
		m = new Monster(room);
		room.addMonster(m);
		assertEquals(1,room.getMonsters().size());
	}
	
	@Test
	public void RoomGetPossibleDirectionsTest(){
		room = new Room(Boolean.FALSE);
		room.addNeighbour(Directions.UP, new Room(Boolean.FALSE));
		Set<Directions> directionsPossibles = new HashSet<Directions>();
		directionsPossibles.add(Directions.UP);
		assertEquals(directionsPossibles, room.getPossibleDirections());
	}
	
	@Test
	public void RoomIsExitTest(){
		room = new Room(Boolean.FALSE);
		assertEquals(Boolean.FALSE, room.isExit());
		Room room2 = new Room(Boolean.TRUE);
		assertEquals(Boolean.TRUE,  room2.isExit());
	}
	
	@Test
	public void RoomAddGetNeighbourTest(){
		room = new Room(Boolean.FALSE);
		Room room2 = new Room(Boolean.FALSE);
		room.addNeighbour(Directions.UP,  room2);
		assertEquals(room2,room.getNeighbour(Directions.UP));
	}
	
	
	
	
	
}
