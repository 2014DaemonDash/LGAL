import java.util.ArrayList;



/*
 * This class stores information about the Players of the game, including their
 * stats, points, and inventory
 */

public class Player {
	Points points;
	private String name;
	Stats stats;
	private ArrayList <Item> rInventory;
	private ArrayList <Weapon> wInventory;
	int rank;


	/*
	 * A player must have a name when it is created. This constructor stores the 
	 * name as a field and calls the constructor for the Points and Stats 
	 * classes, which should initialize all the Player's information. The 
	 * constructor will also initialize the item and weapon inventories
	 */
	Player (String name) {
		this.name = name;
		points = new Points();
		stats = new Stats(points);
		rInventory = new ArrayList <Item> ();
		wInventory = new ArrayList <Weapon> ();
		
		
	}
	
	/*
	 * Returns the Player's name
	 */
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
			levelUp();
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
		if (points.getExp() >= stats.getNext()) {
			stats.setNext(stats.getNext() +100);
			stats.addAttack(1);
			stats.addDefense(1);
			stats.addHp(5);
			stats.addSpeed(5);
			
		} else {
			
		}
	}
	
	/*
	 * If the player has enough equipment points to upgrade their weapon to the
	 * next level they will spend the points and the level of the weapon will 
	 * increase. Otherwise nothing will happen
	 */
	public void levelWeapon(Weapon weapon) {
		if (points.getEquip() >= weapon.getNext()) {
			points.spendEquip(weapon.getNext());
			weapon.upgrade();
		} else {
			
		}
	}
	
	/*
	 * Returns a double representing the ratio of games won over games played
	 */
	public double getRatio () {
		double ratio = (stats.getWin()/ (stats.getWin()+ stats.getLoss()));
		return ratio;
	}
	
	/*
	 * This method allows the Controller's rankPlayers method to assign the 
	 * rank determined in that method 
	 */
	public void setRank(int rankIn){
		rank = rankIn;
	}
	
	/*
	 * Returns the Player's rank
	 */
	public int getRank() {
		return rank;
	}
	

	/*
	 * equips a weapon and alters stats
	 */
	public void addWeapon(Weapon weapon) {
		if (weapon.type == Weapon.Type.SWORD && stats.attackEquipped() == false) {
			if (weapon.getLevel() == 1)
				stats.addAttack(5);
			else if (weapon.getLevel() == 2)
				stats.addAttack(10);
			else if (weapon.getLevel() == 3)
				stats.addAttack(15);
			else if (weapon.getLevel() == 4)
				stats.addAttack(20);
			else if (weapon.getLevel() == 5)
				stats.addAttack(25);
			
			stats.equipAttack(true);
		} else if (weapon.type == Weapon.Type.BOOTS && stats.defenseEquipped() == false) {
			if (weapon.getLevel() == 1)
				stats.addDefense(5);
			else if (weapon.getLevel() == 2)
				stats.addDefense(10);
			else if (weapon.getLevel() == 3)
				stats.addDefense(15);
			else if (weapon.getLevel() == 4)
				stats.addDefense(20);
			else if (weapon.getLevel() == 5)
				stats.addDefense(25);
			stats.equipDefense(true);
		} else if (weapon.type == Weapon.Type.BOOTS && stats.speedEquipped() == false) {
			if (weapon.getLevel() == 1)
				stats.addSpeed(5);
			else if (weapon.getLevel() == 2)
				stats.addSpeed(10);
			else if (weapon.getLevel() == 3)
				stats.addSpeed(15);
			else if (weapon.getLevel() == 4)
				stats.addSpeed(20);
			else if (weapon.getLevel() == 5)
				stats.addSpeed(25);
			stats.equipSpeed(true);
		} else if (weapon.type == Weapon.Type.HP && stats.hpEquipped() == false) {
			if (weapon.getLevel() == 1)
				stats.addHp(5);
			else if (weapon.getLevel() == 2)
				stats.addHp(10);
			else if (weapon.getLevel() == 3)
				stats.addHp(15);
			else if (weapon.getLevel() == 4)
				stats.addHp(20);
			else if (weapon.getLevel() == 5)
				stats.addHp(25);

			stats.equipHp(true);
		}
	}
	
	
	
	
	
}
