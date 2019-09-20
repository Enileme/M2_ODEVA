package fil.coo.Actions;

import java.util.List;

import fil.coo.ListChoser;
import fil.coo.Characters.Player;
import fil.coo.Items.Items;

public class UseAction implements Action {

	public boolean isPossible(Player p) {
		return p.getRoom().getItems().size() > 0;
	}

	public String execute(Player p) {
		ListChoser lc = new ListChoser();
		List<Items> itemsTmp = p.getRoom().getItems();
		Items item = lc.chose("What do you want to use ?", itemsTmp);
		item.isUsedBy(p);
		itemsTmp.remove(item);
		p.getRoom().setItems(itemsTmp); 
		return "";
	}

	public String toString() {
		return "Use";
	}

}
