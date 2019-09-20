package fil.coo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fil.coo.Characters.Monster;
import fil.coo.Items.Gold;
import fil.coo.Items.HealingPotion;
import fil.coo.Items.Items;
import fil.coo.Items.OneArmedBandit;
import fil.coo.Items.StrenghtPotion;

/**
 * 
 * The class of Rooms, used in the dungeon.
 *
 */

public class Room {
	
	protected List<Monster> monsters;
	protected List<Items> items;
	protected Map<Directions,Room> neighbours;
	protected boolean exit;
	boolean dungeonHasEnd = false;
	
	/**
	 * Constructor with the parameter which defines if the room is the next room of the dungeon
	 * @param exit Defines if this room is an exit or not
	 */
	
	public Room(boolean exit) {
		this.monsters = new ArrayList<Monster>();
		this.items = new ArrayList<Items>();
		this.neighbours = new HashMap<Directions, Room>();
		this.exit = exit;
	}
	
	/**
	 * Method which permits to get the room's array of Monsters
	 * @return the Array of Monsters in this room
	 */
	
	public List<Monster> getMonsters() {
		return monsters;
	}

	/**
	 * Permits to set the List of Monsters of this room
	 * @param monsters the list of monsters
	 */
	
	public void setMonsters(List<Monster> monsters) {
		this.monsters = monsters;
	}

	/**
	 * Permits to get the List of Items in this room
	 * @return the room's list of items
	 */
	
	public List<Items> getItems() {
		return items;
	}
	
	/**
	 * Permits to set the room's list of items
	 * @param items the list of items
	 */

	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	/**
	 * Permits to add an item on the list of items
	 * @param i the item to add
	 */
	
	public void addItems(Items i){
		this.items.add(i);
	}

	/**
	 * Permits to add a Monster on the room's monster's list
	 * @param m the monster to add on the list
	 */
	
	public void addMonster(Monster m){
		this.monsters.add(m);
	}
	
	/**
	 * Permits to get possible directions you can go to 
	 * @return a Set of Directions
	 */
	
	public Set<Directions> getPossibleDirections(){
		return this.neighbours.keySet();
	}

	/**
	 * Permits to know if this room is an exit
	 * @return true if this room is an exit
	 */
	
	public boolean isExit(){
		return this.exit;
	}
	
	/**
	 * 
	 * Permits to add a neighbor to this room
	 * @param d The direction of this neighbor
	 * @param r The neighbor
	 */

	public void addNeighbour(Directions d, Room r){
		this.neighbours.put(d, r);
	}
	
	/**
	 * Permits to get a neighbor of this room with a direction
	 * @param d the direction of the neighbor
	 * @return the neighbor
	 */

	public Room getNeighbour(Directions d){
		return this.neighbours.get(d);
	}
	
	/**
	 * Permits to fill the dungeon with random monsters, gold, potions or oneArmedBandit
	 */
	
	public void fillDungeon(){
		for(int i=0;i<(int) (Math.random() * 6 );i++){
			this.addMonster(new Monster(this));
		}
		for(int i=0;i<(int) (Math.random() * 3 );i++){
			this.addItems(new Gold());
		}
		for(int i=0;i<(int) (Math.random() * 2);i++){
			this.addItems(new HealingPotion());
		}
		for(int i=0;i<(int) (Math.random() * 2);i++){
			this.addItems(new StrenghtPotion());
		}
		for(int i=0;i<(int) (Math.random() * 2);i++){
			this.addItems(new OneArmedBandit());
		}
		
	}
	
	/**
	 * Permits to create a Dungeon with random Directions 
	 * @return the room of the beginning 
	 */
		
	public Room createDungeon() {
		for(Directions d : Directions.values()) {
			if(this.getNeighbour(d) == null) {
				this.addNeighbour(d, new Room(Math.random()>=0.95));
				
				this.getNeighbour(d).addNeighbour(d.getOpposite(), this);
				if(this.getNeighbour(d).isExit()) {
					dungeonHasEnd = true;

				}
				this.fillDungeon();
			}
		}
		
		if(!dungeonHasEnd) {
			Directions randomDirection = Directions.UP;
			Directions dir = randomDirection.getRandomDirections();
			return this.getNeighbour(dir).createDungeon();	
		}
		return this;	
	}
}
