package fil.coo.Actions;

import fil.coo.Characters.Player;

/**
 * 
 * The interface of Actions.
 * A player have an Array of Actions which permits him to do some choices on the game.
 *
 */
public interface Action {
	
	/**
	 * Defines if the action is possible at the moment when this method is called
	 * @param p the player who wants to know if this action is possible or not
	 * @return if the action is possible
	 */
	
	public boolean isPossible(Player p);
	
	/**
	 * Permits to the player to execute the action
	 * @param p the player who executes this action
	 * @return A description of the progress of the action
	 */
	
	public String execute(Player p);
	
	/**
	 * 
	 * Permits to know which action it is with a small description
	 * @return A description of the action
	 */
	
	public String toString();

}
