package fil.coo.Actions;


import java.util.ArrayList;
import java.util.List;

import fil.coo.Directions;
import fil.coo.ListChoser;
import fil.coo.Room;
import fil.coo.Characters.Player;

public class MoveAction implements Action {


	public boolean isPossible(Player p) {
		return p.getRoom().getMonsters().isEmpty();
	}

	public String execute(Player p) {
		ListChoser lc = new ListChoser();
		List<Directions> directions = new ArrayList<Directions>(p.getRoom().getPossibleDirections());
		Directions directionChose = lc.chose("Where do you want to go ?", directions);
		Room room = p.getRoom();
		p.setRoom(room.getNeighbour(directionChose));
		return "You goes to another room.\n"; 
	}

	public String toString() {
		return "Move";
	}

}
