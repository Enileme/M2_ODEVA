package fil.coo.Items;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.Characters.Player;

public class OneArmedBanditTest {

	OneArmedBandit bandit;
	Player p;
	
	@Test
	public void OneArmedBanditConstructorTest() {
		bandit = new OneArmedBandit();
		assertEquals(3, bandit.getItems().size());
	}
	
	@Test
	public void OneArmedBanditGetSetGoldValueTest() {
		bandit = new OneArmedBandit();
		bandit.setGoldValue(50);
		assertEquals(50, bandit.getGoldValue());
	}
	
	@Test
	public void OneArmedBanditToStringItemsTest() {
		bandit = new OneArmedBandit();
		assertEquals("one armed bandit", bandit.toString());
	}

}
