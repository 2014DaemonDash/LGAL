import java.util.ArrayList;


public class Controller {

	ArrayList <Player> players;

	public void addPlayer (String username) {
		players.add(new Player (username));
	}

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
		
		
	}

	public static void main(String[] args) {

	} 



}
