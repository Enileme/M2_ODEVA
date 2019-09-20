package fil.coo.Actions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fil.coo.Room;
import fil.coo.Characters.Player;
import fil.coo.Items.Gold;
import fil.coo.Items.Items;

public class UseActionTest {
	
	UseAction use;

	@Test
	public void UseActionIsImpossibleTest(){
		use = new UseAction();
		Player p = new Player();
		Room r = new Room(Boolean.FALSE);
		p.setRoom(r);
		assertFalse(use.isPossible(p));
	}
	
	@Test
	public void UseActionIsPossibleTest(){
		use = new UseAction();
		Player p = new Player();
		Room r = new Room(Boolean.FALSE);
		Gold g = new Gold();
		List<Items> list = new ArrayList<Items>();
		list.add(g);
		r.setItems(list);
		
		p.setRoom(r);
		assertTrue(use.isPossible(p));
	}
	
	@Test
	public void toStringTest(){
		use = new UseAction();
		assertEquals("Use", use.toString());
	}

}
