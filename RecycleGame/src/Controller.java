import java.util.ArrayList;

/*
 * This class allows management of the players and can determine the leader board
 */
public class Controller {

	ArrayList <Player> players;
	
	/*
	 * This adds a Player to the players list
	 */
	public void addPlayer (String username) {
		players.add(new Player (username));
	}
	
	/*
	 * This method assigns each player a rank by sorting them first by level, 
	 * and then differentiating level ties with win ratio. After creating a sorted 
	 * ArrayList of Players, the method uses that list to update the rank field 
	 * in the Player class
	 */
	public void rankPlayers () {
		int high = 20;
		ArrayList <Player> temp = new ArrayList <Player>();
		ArrayList <Player> ranked = new ArrayList<Player>();
		for (int i = high; i >0; i--) {
			for (Player p: players) {
				if (p.stats.getLevel() == i) {
					temp.add(p);
				}
			}
		} 
		for (Player p: temp) {
			if (ranked.isEmpty()) {
				ranked.add(p);
			} else {
				boolean added = false;
				int pos = ranked.size() - 1;
				while (!added && pos >= 0) {
					if ((p.getRatio() >= ranked.get(pos).getRatio())
						&& (p.stats.getLevel() >= ranked.get(pos).stats.getLevel())) {
						ranked.add(pos, p);
						added = true;
					} else {
						pos --;
					}
				}
				if (!added) {
					ranked.add(p);
				}
			}
		}
		int counter = 1;
		for (Player p: ranked) {
			p.setRank(counter);
			counter++;
		}
		
		
	}

	public static void main(String[] args) {

	} 



}
