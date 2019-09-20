package fil.coo.Characters;

import java.util.ArrayList;
import java.util.List;

import fil.coo.Room;
import fil.coo.Actions.Action;
import fil.coo.Actions.AttackAction;
import fil.coo.Actions.LookAction;
import fil.coo.Actions.MoveAction;
import fil.coo.Actions.UseAction;
import fil.coo.Items.Gold;

/**
 * 
 * Class of the player of the game
 *
 */
public class Player extends GameCharacter{
	
	protected List<Action> actions ; 

	/***
	 * Constructor with a parameter which is the room of the player
	 * @param room the room of the player
	 */
	
	public Player(Room room){
		super();
		this.room=room; 
		actions = new ArrayList<Action>();
		actions.add(new LookAction());
		actions.add(new AttackAction());
		actions.add(new MoveAction());
		actions.add(new UseAction());
	}
	
	/***
	 * Constructor without parameters 
	 */
	
	public Player(){
		super(); 
		actions = new ArrayList<Action>();
		actions.add(new LookAction());
		actions.add(new AttackAction());
		actions.add(new MoveAction());
		actions.add(new UseAction());
	}
	
	/**
	 * Constructor with any parameters 
	 * @param lifePoints the player's life points
	 * @param strenghtPoints the player's strength points
	 * @param gold the player's purse of gold
	 * @param room the room where the player is
	 */
	public Player(int lifePoints, int strenghtPoints, Gold gold, Room room) {
		super(lifePoints, strenghtPoints, gold, room);
		actions = new ArrayList<Action>();
		actions.add(new LookAction());
		actions.add(new AttackAction());
		actions.add(new MoveAction());
		actions.add(new UseAction());
		
	}
	
	/**
	 * Permits to get any Actions of the player in an Array
	 * @return an array with any actions
	 */
	
	public List<Action> getActions() {
		return actions;
	}	
	
	/***
	 * Permits to add an action on the list of actions of the player
	 * @param a the action to add
	 */

	public void addAction(Action a){ 
		this.actions.add(a);
	}
	
	/**
	 * Permits to remove an action to the player's list of actions
	 * @param a the action to remove
	 */
	
	public void removeAction(Action a){
		if(this.actions.contains(a)){
			this.actions.remove(a);
		}
	}
	
	/**
	 * Permits to get an array which contains any possibles actions when the method is called
	 * @return an array of possibles actions
	 */
	
	public List<Action> possibleActions(){
		List<Action> possibleActions = new ArrayList<Action>();
		for (Action action : actions) {
			if(!action.isPossible(this)){
				possibleActions.remove(action);
			}else{
				possibleActions.add(action);
			}
		}
		return possibleActions;
	}


	@Override
	public void die() {
		System.out.println("You are dead");		
	}

}
