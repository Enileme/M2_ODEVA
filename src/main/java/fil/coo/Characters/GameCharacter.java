package fil.coo.Characters;

import fil.coo.Room;
import fil.coo.Items.Gold;

/**
 * 
 * The class of characters of the game.
 *
 */
public abstract class GameCharacter {
	
	protected int lifePoints;
	protected int strenghtPoints;
	protected Gold gold;
	protected Room room;	 
	
	/**
	 * Constructor without parameters, permits to create a character with automatics attributes
	 */
	
	public GameCharacter() { 
		this.lifePoints = 1500;
		this.strenghtPoints = 7;
		this.gold = new Gold(50);
		this.room = new Room(Boolean.FALSE);
	}
	
	/***
	 * Constructor with attributes of a character of the game
	 * @param lifePoints number of character's life points
	 * @param strenghtPoints strength of the character
	 * @param gold the character's purse of gold
	 * @param room the actual room of the character
	 */
	
	public GameCharacter(int lifePoints, int strenghtPoints, Gold gold, Room room) {
		this.lifePoints = lifePoints;
		this.strenghtPoints = strenghtPoints;
		this.gold = gold; 
		this.room = room;
	}
	
	/**
	 * Permits to get the number of life points the character have at the moment
	 * @return the number of life points
	 */
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	/**
	 * Permits to set the number of life points of the character
	 * @param lifePoints the number of life points
	 */
	
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	
	/**
	 * Permits to get the strength of this character
	 * @return the number of strength points of the character
	 */
	
	public int getStrenghtPoints() {
		return strenghtPoints;
	}
	
	/**
	 * Permits to set the strength of this character
	 * @param strenghtPoints the number of strength points of the character
	 */
	
	public void setStrenghtPoints(int strenghtPoints) {
		this.strenghtPoints = strenghtPoints;
	}
	
	/**
	 * Permits to get the character's purse of gold
	 * @return the purse of gold of the character
	 */
	
	public Gold getGold() {
		return gold;
	}
	
	
	/**
	 * Permits to set the purse of gold of the character
	 * @param gold the purse of gold to give to the character
	 */
	
	public void setGold(Gold gold) {
		this.gold = gold;
	}
	
	/***
	 * Permits to get the room of the character
	 * @return the room of the character
	 */
	
	public Room getRoom() {
		return room;
	}
	
	/**
	 * Permits to give to the character a room
	 * @param room the room to give to the character
	 */
	
	public void setRoom(Room room) {
		this.room = room;
	}
	
	/***
	 * Permits to this character to attack another character
	 * @param c the opponent of this character
	 */
	
	public void attack(GameCharacter c){
		c.setLifePoints(c.getLifePoints()-this.getStrenghtPoints());
	}
	
	/**
	 * Permits to know if thhe player is dead 
	 * @return true if the character is dead
	 */
	
	public boolean isDead(){
		return this.lifePoints <= 0;
	}	
	public abstract void die();
	

}
