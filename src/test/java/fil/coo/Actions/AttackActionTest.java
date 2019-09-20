package fil.coo.Actions;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Room;
import fil.coo.Characters.Monster;
import fil.coo.Characters.Player;
import fil.coo.Items.Gold;

public class AttackActionTest {
	
	private AttackAction attack;
	private Room room;
	private Player p ;

	@Test
	public void isPossibleTest() {
		attack = new AttackAction();
		room = new Room(Boolean.FALSE);
		p = new Player(room);
		
		room.addMonster(new Monster());
		
		assertTrue(attack.isPossible(p));
	}
	
	@Test
	public void isNotPossibleTest() {
		attack = new AttackAction();
		room = new Room(Boolean.FALSE);
		p = new Player(room);
		
		assertFalse(attack.isPossible(p));
	}
	
	@Test
	public void executePlayerDeadTest() {
		attack = new AttackAction();
		room = new Room(Boolean.FALSE);
		p = new Player(room);
		 
		room.addMonster(new Monster(10000,80000,new Gold(500),room));
		
		assertEquals("You are dead.",attack.execute(p));
	}

	@Test
	public void executePlayerAttackedTest() {
		attack = new AttackAction();
		room = new Room(Boolean.FALSE);
		p = new Player(room);
		
		room.addMonster(new Monster());
		
		assertEquals("You attacked a monster.\nThe monster fired back !\nLife points = 1493",attack.execute(p));
	}
	
	@Test
	public void executeMonsterDeadTest() {
		attack = new AttackAction();
		room = new Room(Boolean.FALSE);
		p = new Player(room);
		
		p.setStrenghtPoints(2000);
		room.addMonster(new Monster());
		
		assertEquals("You killed a monster. He drops 50 gold coins.",attack.execute(p));
	}

	@Test
	public void toStringTest(){
		attack = new AttackAction();
		assertEquals("Attack", attack.toString());
	}
}
