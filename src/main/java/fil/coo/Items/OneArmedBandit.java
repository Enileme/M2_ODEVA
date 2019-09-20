package fil.coo.Items;

import java.util.ArrayList;
import java.util.List;

import fil.coo.Characters.Player;

/**
 * 
 * Class of the OneArmedBandit
 * A OneArmedBandit can sell to a player some items.
 *
 */

public class OneArmedBandit implements Items {
	
	protected List<Items> items ;
	protected int goldValue;
	
	public OneArmedBandit() {
		items = new ArrayList<Items>();
		items.add(new Gold());
		items.add(new HealingPotion());
		items.add(new StrenghtPotion());
		this.goldValue=(int) (30+(Math.random() * 70));
	}

	/**
	 * Permits to get the Array of items the OneArmedBandit is carrying 
	 * @return A list of items
	 */
	public List<Items> getItems() {
		return items;
	}

	/**
	 * Permits to get the value of gold of the OneArmedBandit
	 * @return the value of gold
	 */
	public int getGoldValue() {
		return goldValue;
	}

	/**
	 * Permits to set the value of gold of this OneArmedBandit 
	 * @param goldValue the value of gold
	 */
	
	public void setGoldValue(int goldValue) {
		this.goldValue = goldValue;
	}

	/**
	 * Permits to a player to use an OneArmedBandit
	 * @param p
	 */
	public void isUsedBy(Player p) {
		if(p.getGold().getValue() < this.goldValue){
			System.out.println("You don't have enough gold coins.\nThe armed bandit disappears.\n");
		}else{
			p.setGold(new Gold(p.getGold().getValue()-this.goldValue));
			Items itemBandit = items.get((int) ((Math.random() * 3)));
			System.out.println("In exchange to "+this.goldValue+" gold coins, the armed bandit gives you something.");
			itemBandit.isUsedBy(p);
		}
		
	}

	/**
	 * Permits to have a small description of this item
	 */
	public String toString() {
		return "one armed bandit";
	}

}
