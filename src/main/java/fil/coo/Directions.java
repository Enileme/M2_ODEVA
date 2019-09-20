package fil.coo;

/**
 * 
 * The enumeration of Directions used by Rooms to create neighbors.
 *
 */

public enum Directions {
	
	UP("up"),
	DOWN("down"), 
	LEFT("left"),
	RIGHT("right");
	
	private String direction="";

	/**
	 * Constructor of this enumeration with a direction in arguments
	 * @param direction the direction 
	 */
	private Directions(String direction) {
		this.direction = direction; 
	}
	
	/**
	 * Function returns a String which gives the direction
	 */
	
	public String toString(){
		return direction;
	}
	
	/**
	 * Function which gives a random Direction. 
	 * This method is use to create the dungeon 
	 * @return a random Direction
	 */
	public Directions getRandomDirections() {
		double random = Math.random();
		Directions dRandom = null;
		if(random <0.25) {
			dRandom = Directions.UP;
		}else if(random > 0.25 && random <=0.5) {
			dRandom = Directions.RIGHT;
		}else if(random > 0.5 && random <=0.75) {
			dRandom = Directions.DOWN;
		}else { 
			dRandom = Directions.LEFT;
		}
		return dRandom;
	}
	
	/**
	 * Method which returns the opposite of a Direction
	 * @return the opposite of a Direction
	 */
	
	public Directions getOpposite() {
				
		Directions opposite = null;
		if(this.equals(Directions.UP)) {
			opposite = Directions.DOWN;
		}
		else if(this.equals(Directions.DOWN)) {
			opposite = Directions.UP;
		}
		if(this.equals(Directions.RIGHT)) {
			opposite = Directions.LEFT;
		}
		if(this.equals(Directions.LEFT)) {
			opposite = Directions.RIGHT;
		}
		return opposite;
	}

}
