package fil.coo.Characters;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Room;
import fil.coo.Actions.Action;
import fil.coo.Items.Gold;

public class PlayerTest extends GameCharacterTest {
	
	private class MockAction implements Action{
		
		public MockAction() {}
		
		public boolean isPossible(Player p) {
			return true;
		}

		public String execute(Player p) {
			return "Done";
		} 
		
	}
	
	Player player;

	@Test()
	public void PlayerConstructorTest() {
		Room room = new Room(Boolean.FALSE);
		player = new Player(room);
		assertEquals(room, player.getRoom());
	}
	
	@Test
	public void playerSetGetActionsTest(){
		player = new Player();
		assertEquals(4, player.getActions().size());
	}
	
	@Test
	public void PlayerAddActionTest() {
		player = new Player();
		Action a = new MockAction();
		player.addAction(a);
		assertTrue(player.actions.contains(a));
	}
	
	@Test
	public void PlayerRemoveActionTest() { 
		player = new Player();
		Action a = new MockAction();
		player.addAction(a);
		
		player.removeAction(a);
		assertFalse(player.actions.contains(a));
	}
	
	@Test
	public void possibleActionsTest(){
		Room room = new Room(Boolean.FALSE);
		room.addMonster(new Monster(room));
		player = new Player();
		assertEquals(2, player.possibleActions().size());
		
	}

	@Override
	public GameCharacter createGameCharacter() {
		return new Player();
	}

	@Override
	public GameCharacter createGameCharacter(int lifePoints, int strenghtPoints, Gold gold, Room room) {
		return new Player(lifePoints, strenghtPoints, gold, room);
	}

	@Override
	public void GameCharacterDieTest() {
		System.out.println("You are dead");		
	}

	

}
