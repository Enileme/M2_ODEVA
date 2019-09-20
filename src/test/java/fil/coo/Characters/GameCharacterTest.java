package fil.coo.Characters;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Room;
import fil.coo.Items.Gold;

public abstract class GameCharacterTest {
	
	public abstract GameCharacter createGameCharacter();
	public abstract GameCharacter createGameCharacter(int lifePoints, int strenghtPoints, Gold gold, Room room);
	
	public GameCharacter gameCharacter; 

	@Test
	public abstract void GameCharacterDieTest();
	
	@Test
	public void GameCharacterConstructorEmptyTest() {
		gameCharacter = this.createGameCharacter();
		assertEquals(1500,  gameCharacter.getLifePoints()); 
		assertEquals(7,  gameCharacter.getStrenghtPoints());
		assertEquals(50,  gameCharacter.getGold().getValue());
		assertEquals(Boolean.FALSE, gameCharacter.getRoom().isExit());
		
	}
	
	@Test
	public void GameCharacterConstructorTest() {
		Room room = new Room(Boolean.TRUE);
		Gold gold = new Gold();
		gameCharacter = this.createGameCharacter(200, 60, gold, room);
		assertEquals(200,  gameCharacter.getLifePoints());
		assertEquals(60,  gameCharacter.getStrenghtPoints());
		assertEquals(gold, gameCharacter.getGold());
		assertEquals(room, gameCharacter.getRoom());
		
	}
	
	
	@Test
	public void GameCharacterGetSetLifePointsTest() {
		gameCharacter = this.createGameCharacter();
		gameCharacter.setLifePoints(1000);
		assertEquals(1000, gameCharacter.getLifePoints());
	}
	
	@Test
	public void GameCharacterGetSetStrenghtPointsTest() {
		gameCharacter = this.createGameCharacter();
		gameCharacter.setStrenghtPoints(300);
		assertEquals(300, gameCharacter.getStrenghtPoints());
	}
	
	@Test
	public void GameCharacterGetSetGoldTest() {
		gameCharacter = this.createGameCharacter();
		Gold gold = new Gold();
		gameCharacter.setGold(gold);
		assertEquals(gold, gameCharacter.getGold());
	}
	
	@Test
	public void GameCharacterGetSetRoomTest() {
		gameCharacter = this.createGameCharacter();
		Room room = new Room(Boolean.FALSE);
		gameCharacter.setRoom(room);
		assertEquals(room, gameCharacter.getRoom());
	}
	
	@Test
	public void GameCharacterAttackTest() {
		gameCharacter = this.createGameCharacter();
		GameCharacter g2 = this.createGameCharacter();
		Integer lifePointsBeforeAttack = g2.getLifePoints();
		gameCharacter.attack(g2);
		assertEquals(g2.getLifePoints(), lifePointsBeforeAttack - gameCharacter.getStrenghtPoints());
	}
	
	@Test
	public void GameCharacterIsDeadTest() {
		gameCharacter = this.createGameCharacter();
		gameCharacter.setLifePoints(10);
		assertFalse(gameCharacter.isDead());
		gameCharacter.setLifePoints(0);
		assertTrue(gameCharacter.isDead());
	}
	
	
	
	
	
}
