package fil.coo.Actions;

import java.util.List;

import fil.coo.Characters.Monster;
import fil.coo.Characters.Player;

/**
 * 
 * The Attack Action class
 * This class contains methods who permits to a player to know if he is able to attack and the effect of the attack
 *
 */

public class AttackAction implements Action {

	public boolean isPossible(Player p) {
		return p.getRoom().getMonsters().size() > 0;
	} 
	
	public String execute(Player p) {
		List<Monster> monsters = p.getRoom().getMonsters();
		String res = "";
		if(isPossible(p)){
			p.attack(monsters.get(0));
			if(!monsters.get(0).isDead()){
				monsters.get(0).attack(p);
				if(p.isDead()){
					p.die(); 
					res="You are dead.";
				}else{
					res= "You attacked a monster.\nThe monster fired back !\nLife points = "+p.getLifePoints();
				}
			}else{
				res= "You killed a monster. He drops "+monsters.get(0).getGold().getValue()+" gold coins.";
				monsters.get(0).die();
			}
		}
		return res;
	}
 
	public String toString() {
		return "Attack";
	}


}
