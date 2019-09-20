package fil.coo.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fil.coo.Directions;
import fil.coo.Room;
import fil.coo.Characters.Monster;
import fil.coo.Characters.Player;
import fil.coo.Items.Gold;
import fil.coo.Items.HealingPotion;
import fil.coo.Items.Items;

public class LookActionTest {
	
	private LookAction look ;
	private Room room;
	private Player p ;
	private List<Items> items ;

	@Test
	public void isPossibleTest() {
		look = new LookAction();
		room = new Room(Boolean.FALSE);
		p = new Player(room);
		
		assertTrue(look.isPossible(p));
	}
	
	@Test
	public void executeTest() {
		look = new LookAction();
		room = new Room(Boolean.FALSE);
		p = new Player(room);
		items = new ArrayList<Items>();
		
		assertEquals("You see :\n"
				+ "\t--> 0 items\n"
				+ "\t--> 0 monsters\n"
				+ "\t--> 0 doors",
				look.execute(p));
		
	}
	
	@Test
	public void executeWithElementsTest() {
		look = new LookAction();
		room = new Room(Boolean.FALSE);
		p = new Player(room);
		items = new ArrayList<Items>();
		
		items.add(new Gold(50));
		items.add(new HealingPotion());
		room.setItems(items);
		room.addMonster(new Monster());
		room.addMonster(new Monster());
		room.addNeighbour(Directions.DOWN, new Room(Boolean.FALSE));
		
		assertEquals("You see :\n"
				+ "\t--> 50 gold coins\n"
				+ "\t--> a healing potion\n"
				+ "\t--> 2 monsters\n"
				+ "\t--> 1 doors",
				look.execute(p));
	}
	
	@Test
	public void toStringTest(){
		look = new LookAction();
		assertEquals("Look", look.toString());
	}	

}
