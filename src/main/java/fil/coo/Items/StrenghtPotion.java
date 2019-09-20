package fil.coo.Items;

import fil.coo.Characters.Player;

/**
 * The class of a Strength Potion
 * A Strength potion permits to a player to get a bonus of strength
 *
 */

public class StrenghtPotion implements Items {
	
protected int value; 
	
	public StrenghtPotion(){
		this.value = (int)((Math.random()*5)+5);
	}
	
	public StrenghtPotion(int value){
		this.value=value;
	}

	/**
	 * Permits to get the number of strength points the potion is giving to a player
	 * @return the value of this potion
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Permits to set the value of this potion
	 * @param value the value of the potion
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Permits to add the effect of this potion to another potion
	 * @param sp the other potion
	 */
	
	public void addStrenght(StrenghtPotion sp){
		this.value+=sp.getValue();
	}
	

	public void isUsedBy(Player p) {
		System.out.println("You get "+this.getValue()+" strength points.");
		p.setStrenghtPoints(p.getStrenghtPoints()+this.value);
	}

	public String toString() {
		return "a strenght potion";
	}

}
