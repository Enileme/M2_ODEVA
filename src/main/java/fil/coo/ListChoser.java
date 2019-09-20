package fil.coo;

import java.util.*;

/**
 * 
 * The class which permits to the player to choose an object in an Array.
 *
 */

public class ListChoser {
	
	/**
	 * Returns an Object from an Array.
	 * This method is using a Scanner to returns the object which is chosen by the player.
	 * This method is generic.
	 * @param message The message which comes before the choice of the object
	 * @param list The array of Objects 
	 * @return The object chosen by the player.
	 */
		
		public <T> T chose(String message, List<T> list){
			System.out.println(message);
			//System.out.println("0 - None");
			for(int i=0; i<list.size(); i++){
				System.out.println(i+1+" - "+list.get(i));
			}
			int choosen = ScannerInt.readInt(list.size()+1);
			if(choosen ==0) 
				return null;
			else{
				return list.get(choosen-1);
			}
		}


}
