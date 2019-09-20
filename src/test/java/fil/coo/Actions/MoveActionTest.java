package fil.coo.Actions;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Room;
import fil.coo.Characters.Monster;
import fil.coo.Characters.Player;

public class MoveActionTest {
	
	MoveAction moveAction;

	@Test
	public void MoveActionIsImpossibleTest() {
		moveAction = new MoveAction();
		Player p = new Player();
		Room r = new Room(Boolean.FALSE);
		r.addMonster(new Monster());
		p.setRoom(r);
		assertFalse(moveAction.isPossible(p));
	}
	
	@Test
	public void MoveActionIsPossibleTest() {
		moveAction = new MoveAction();
		Player p = new Player();
		Room r = new Room(Boolean.FALSE);
		p.setRoom(r);
		assertTrue(moveAction.isPossible(p));
	}

	@Test
	public void toStringTest(){
		moveAction = new MoveAction();
		assertEquals("Move", moveAction.toString());
	}
}
