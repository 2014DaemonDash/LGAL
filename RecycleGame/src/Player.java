import java.util.ArrayList;


public class Player {
	Points points;
	String name;
	Stats stats;
	ArrayList <Item> rInventory;
	ArrayList <Weapon> wInventory;
	
	Player (String name) {
		this.name = name;
		points = new Points();
		stats = new Stats();
		
	}
	
	public String getName() {
		return name;
	} 
	
	/*
	 * Recycle an item. If the object is not present the method will return false
	 * If it is present the item will be removed from the inventory and the 
	 * player's exp points will increase
	 */
	boolean recycle (Item item) {
		if (rInventory.contains(item)) {
			rInventory.remove(item);
			points.addExp(item.getValue());
			return true;
		} else {
			return false;
		} 
	}
	
	/*
	 * If a player has enough exp they will level up which will increase
	 * their stats, and increases the amount of points necessary to reach the
	 * next level
	 */
	public void levelUp () {
		if (points.getExp() >= stats.nextLevel) {
			stats.nextLevel += 100;
			stats.addAttack(1);
			stats.addDefense(1);
			stats.addHp(5);
			stats.addSpeed(5);

			
		} else {
			
		}
	}
	
	
	
	
	
}
