package fil.coo.Actions;

import java.util.List;
import java.util.Set;

import fil.coo.Directions;
import fil.coo.Characters.Monster;
import fil.coo.Characters.Player;
import fil.coo.Items.Items;

public class LookAction implements Action {

	public boolean isPossible(Player p) {
		return true;
	}

	public String execute(Player p) {
		StringBuilder res = new StringBuilder();
		List<Items> items = p.getRoom().getItems();
		List<Monster> monsters = p.getRoom().getMonsters();
		Set<Directions> directions = p.getRoom().getPossibleDirections();
		res.append("You see :\n"); 
		if(!items.isEmpty()){
			for (Items item : items) { 
				res.append("\t--> "+item.toString()+"\n");
			}
		}else{
			res.append("\t--> 0 items\n");
		}
		res.append("\t--> "+monsters.size()+ " monsters\n");
		res.append("\t--> "+directions.size()+" doors");
		
		return res.toString();
	}

	public String toString() {
		return "Look";
	}

	
}
