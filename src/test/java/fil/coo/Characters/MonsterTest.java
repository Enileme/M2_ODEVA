package fil.coo.Characters;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Room;
import fil.coo.Items.Gold;

public class MonsterTest extends GameCharacterTest {
	
	Monster monster;
	Room room = new Room(Boolean.FALSE);

	@Test
	public void MonsterConstructorTest() {
		monster = new Monster(room);
		assertEquals(room, monster.getRoom());
	}
	
	
	
	@Test
	public void GameCharacterDieTest() {
		monster = new Monster();
		monster.die();
		assertFalse(monster.getRoom().getMonsters().contains(monster));
		assertTrue(monster.getRoom().getItems().contains(monster.getGold()));
	} 

	@Override
	public GameCharacter createGameCharacter() {
		return new Monster(); 
	}

	@Override
	public GameCharacter createGameCharacter(int lifePoints, int strenghtPoints, Gold gold, Room room) {
		return new Monster(lifePoints, strenghtPoints, gold, room);
	} 
	
	
	
	
	
	

}
