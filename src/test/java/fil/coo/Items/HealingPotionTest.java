package fil.coo.Items;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Characters.Player;

public class HealingPotionTest {
	
	HealingPotion potion;
	Player p;

	@Test
	public void HealingPotionConstructorEmptyTest() {
		potion = new HealingPotion();
		assertTrue(potion.getValue()>=10); 
		assertTrue(potion.getValue()<=30);
	}
	
	@Test
	public void HealingPotionConstructorTest() {
		potion = new HealingPotion(50);
		assertEquals(50,potion.getValue());
	}
	
	@Test
	public void HealingPotionGetSetValueTest() {
		potion = new HealingPotion();
		potion.setValue(100);
		assertEquals(100, potion.getValue());
	}
	
	@Test
	public void HealingPotionAddLifeTest() {
		potion = new HealingPotion(50);
		HealingPotion potion2 = new HealingPotion(40);
		potion.addLife(potion2);
		assertEquals(90, potion.getValue());
	}
	
	@Test
	public void HealingPotionIsUsedByTest() {
		p = new Player();
		potion = new HealingPotion(50);
		potion.isUsedBy(p);
		assertEquals(1550, p.getLifePoints());
	}
	
	@Test
	public void HealingPotionToStringItemsTest() {
		potion = new HealingPotion();
		assertEquals("a healing potion", potion.toString());
	}

}
