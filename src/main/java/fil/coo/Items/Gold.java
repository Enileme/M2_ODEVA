package fil.coo.Items;

import fil.coo.Characters.Player;

/**
 * 
 * Class of the player's purse
 *
 */

public class Gold implements Items {
	
	protected int value;

	/**
	 * Constructor without parameters gives you a purse with a value of gold < 50 and > 30 
	 */
	public Gold() {
		this.value = (int)((Math.random()*30)+20); 
	}
	
	/***
	 * Constructor with the value of gold
	 * @param value the value of gold
	 */
	
	public Gold(int value) {
		this.value=value;
	}

	/**
	 * Permits to get the value of gold of the player's purse
	 * @return the value of gold
	 */
	
	public int getValue() {
		return value;
	}

	/**
	 * Permits to set the value of gold 
	 * @param value the value of gold
	 */
	
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Permits to add the value of another gold
	 * @param gold the gold's value will be add to this value of gold
	 */
	public void addGold(Gold gold){
		this.value+=gold.getValue();
	}

	/**
	 * Permits to collect the value of gold
	 * @param p The player who will get the value of gold
	 */
	public void isUsedBy(Player p) {
		System.out.println("You collect "+this.getValue()+" gold coins.");
		p.setGold(new Gold(p.getGold().getValue()+this.getValue()));
	}

	/**
	 * Permits to have a description of the amount of gold this gold has.
	 */
	
	public String toString() {
		return this.value+" gold coins";
	}
}
