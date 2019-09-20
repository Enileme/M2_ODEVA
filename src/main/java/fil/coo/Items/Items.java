package fil.coo.Items;

import fil.coo.Characters.Player;

/**
 * 
 * The interface of Items
 * Player can get items on rooms and use them to have bonus or buy objects
 *
 */

public interface Items {
	
	/**
	 * Permits to a player to use an item
	 * @param p the player 
	 */
	public void isUsedBy(Player p);
	
	/***
	 * Give a small description of the item
	 * @return a small description of the item
	 */
	public String toString();

}
