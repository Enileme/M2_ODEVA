package fil.coo.Characters;

import java.util.List;

import fil.coo.Room;
import fil.coo.Items.Gold;
import fil.coo.Items.Items;

public class Monster extends GameCharacter{
	
	
	/**
	 * Constructor of the Monster with parameters 
	 * @param lifePoints number of lifePoints of the monster
	 * @param strenghtPoints the monsteer's strength
	 * @param gold the monster's purse of gold
	 * @param room the place where the monster is
	 */
	
	public Monster(int lifePoints, int strenghtPoints, Gold gold, Room room){
		super(lifePoints, strenghtPoints, gold, room);
	}
	
	/**
	 * Constructor of Monster with the parameter room
	 * @param room the room where the monster is
	 */
	
	public Monster(Room room){ 
		super();
		this.room = room;
	}
	
	/**
	 * Constructor of Monster without parameters
	 */
	
	public Monster(){
		super();
	}

	@Override
	public void die() {
		List<Monster> monstersTmp = this.room.getMonsters();
		List<Items> itemsTmp = this.room.getItems();
		
		monstersTmp.remove(this);
		this.room.setMonsters(monstersTmp);

		itemsTmp.add(this.getGold());
		this.room.setItems(itemsTmp);
	}

}
