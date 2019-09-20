package fil.coo.Items;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Characters.Player;

public class StrenghtPotionTest {
	
	StrenghtPotion potion;
	Player p;

	@Test
	public void StrenghtPotionConstructorEmptyTest() {
		potion = new StrenghtPotion();
		assertTrue(potion.getValue() >=5 && potion.getValue() <= 10);
	}
	
	@Test
	public void StrenghtPotionConstructorTest() {
		potion = new StrenghtPotion(20);
		assertEquals(20, potion.getValue());
	}
	
	@Test
	public void StrenghtPotionGetSetValueTest() {
		potion = new StrenghtPotion();
		potion.setValue(50);
		assertEquals(50, potion.getValue());
	}
	
	@Test
	public void StrenghtPotionAddStenghtTest() {
		potion = new StrenghtPotion(40);
		StrenghtPotion potion2 = new StrenghtPotion(30);
		potion.addStrenght(potion2);
		assertEquals(70, potion.getValue());
	}
	
	@Test
	public void StrenghtPotionIsUsedByTest() {
		p = new Player();
		potion = new StrenghtPotion(50);
		potion.isUsedBy(p);
		assertEquals(57, p.getStrenghtPoints());
	} 
	
	@Test
	public void StrenghtPotionToStringItemsTest() {
		potion = new StrenghtPotion();
		assertEquals("a strenght potion", potion.toString());
	}
	

}
