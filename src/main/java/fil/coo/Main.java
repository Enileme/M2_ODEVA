package fil.coo;

import fil.coo.Actions.Action;

import fil.coo.Characters.Monster;
import fil.coo.Characters.Player;
import fil.coo.Items.Gold;
import fil.coo.Items.OneArmedBandit;


/**
 * 
 * The main class of this project.
 *
 */


public class Main {

	public static void main(String[] args) {
		
		Room room = new Room(Boolean.FALSE);
		Player player = new Player(room);
		ListChoser lc = new ListChoser();
		
		room.createDungeon();
		player.setGold(new Gold(100));
		player.setStrenghtPoints(1000);
		player.setLifePoints(500);
		
		System.out.println("Welcome to the Dungeon game ! When you want, enter 'surrender' to stop the game. Good luck !\n");
		while(!player.getRoom().isExit() && !player.isDead()){
				
			System.out.println("Life points = "+player.getLifePoints()+"\tStrength points = "+player.getStrenghtPoints()+"\t\tGold coins = "+player.getGold().getValue()+"\n");
			Action action = lc.chose("What do you want to do ?\n", player.possibleActions());
			System.out.println("\n"+action.execute(player)); 
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------\n");

		}

		if(player.isDead()){
			System.out.println("You lose !");
		}else if(player.getRoom().isExit()){
			System.out.println("You won !");
			System.out.println("Game Over !");
		}
	}

}
