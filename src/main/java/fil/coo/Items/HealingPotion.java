package fil.coo.Items;

import fil.coo.Characters.Player;

/**
 * 
 * The class of Healing Potion
 *
 */
public class HealingPotion implements Items {
	
	protected int value;
	
	/**
	 * Constructor which create a potion with a value of heal <30 and >20
	 */
	public HealingPotion(){
		this.value = (int)((Math.random()*20)+10); 
	}
	
	/***
	 * Constructor which create a healing potion with the value in parameters
	 * @param value the value of the potion
	 */
	public HealingPotion(int value){
		this.value=value;
	}

	/**
	 * Permits to get the value of the potion
	 * @return the value of the potion
	 */
	
	
	public int getValue() {
		return value;
	}

	/**
	 * Permits to set the value of the potion
	 * @param value the number of lifepoints a player can win with this potion
	 */
	
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Permits to add the effect of another potion to this potion
	 * @param hp the other healing potion
	 */
	
	public void addLife(HealingPotion hp){
		this.value+=hp.getValue();
	}
	
	/**
	 * Permits to a player to use this potion and gain bonus life points
	 * @param p the player who use this potion
	 */
	
	public void isUsedBy(Player p) {
		System.out.println("You get "+this.getValue()+" life points.");
		p.setLifePoints(p.getLifePoints()+this.value);
	}

	/**
	 * Give a small description of this object
	 */
	
	public String toString() {
		return "a healing potion";
	}

}
