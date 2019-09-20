package fil.coo.Items;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Characters.Player;

public class GoldTest {

	Gold gold;
	Player p;
	
	@Test
	public void GoldConstructorEmptyTest() {
		gold = new Gold();
		assertTrue(gold.getValue() <= 50);
		assertTrue(gold.getValue() >= 20);
	}
	
	@Test
	public void GoldConstructorTest() {
		gold = new Gold(10);
		assertEquals(10,gold.getValue());
	}
	
	@Test
	public void GoldGetSetValueTest() {
		gold = new Gold();
		gold.setValue(200);
		assertEquals(200, gold.getValue());
	}
	
	@Test
	public void GoldAddGoldTest() {
		gold = new Gold(20);
		Gold gold2 = new Gold(30);
		gold.addGold(gold2);
		assertEquals(50,gold.getValue());
	}
	
	@Test
	public void GoldIsUsedByTest() {
		p= new Player();
		gold = new Gold(50);
		gold.isUsedBy(p);
		assertEquals(100, p.getGold().getValue());
	}
	
	@Test
	public void GoldToStringItemsTest() {
		gold = new Gold(50);
		assertEquals("50 gold coins", gold.toString());
	}
	

}
