/*
 * This class keeps track of a player's attack, defense, speed, and hp statistics.
 * It also keeps track of what weapons are equipped and what level the player is.
 */

public class Stats {
	private int attack, defense, speed, hp;
	private int experience;
	private double win, loss;
	private boolean attackEquipped, defenseEquipped, speedEquipped, hpEquipped;
	private int nextLevel = 100;
	private Points point;

	int weaponLevel;
	String weaponType;

	/*
	 * This constructor takes in no parameters and initializes 
	 * 
	 */
	public Stats(Points point) {
		attack = 5;
		defense = 0;
		speed = 0;
		hp = 30;

		attackEquipped = false;
		defenseEquipped = false;
		speedEquipped = false;
		hpEquipped = false;

		this.point = point;

	}

	/*
	 * returns a boolean that indicated whether the player has an attack item 
	 * equipped
	 */
	public boolean attackEquipped() {
		return attackEquipped;
	}

	/*
	 * equip or remove an attack item 
	 */
	public void equipAttack(boolean onOff){
		attackEquipped = onOff;
	}

	/*
	 * returns a boolean that indicated whether the player has a defense item 
	 * equipped
	 */
	public boolean defenseEquipped() {
		return defenseEquipped;
	}

	/*
	 * equip or remove a defense item
	 */
	public void equipDefense(boolean onOff) {
		defenseEquipped = onOff;
	}

	/*
	 * returns a boolean that indicated whether the player has a speed item 
	 * equipped
	 */
	public boolean speedEquipped() {
		return speedEquipped;
	}

	/*
	 * equip or remove speed item
	 */
	public void equipSpeed(boolean onOff) {
		speedEquipped = onOff;
	}

	/*
	 * returns a boolean that indicated whether the player has an attack item 
	 * equipped
	 */
	public boolean hpEquipped() {
		return hpEquipped;
	}

	/*
	 * equips or removes hp item 
	 */
	public void equipHp(boolean onOff) {
		hpEquipped = onOff;
	}

	/*
	 * Checks and returns what level a person is 
	 */
	public int getLevel() {
		int level;
		if (experience < 100)
			level = 1;
		else if (experience < 300)
			level = 2;
		else if (experience < 600)
			level = 3;
		else if (experience < 1000)
			level = 4;
		else if (experience < 1500)
			level = 5;
		else if (experience < 2100)
			level = 6;
		else if (experience < 2800)
			level = 7;
		else if (experience < 3600)
			level = 8;
		else if (experience < 4500)
			level = 9;
		else if (experience < 5500)
			level = 10;
		else if (experience < 6600)
			level = 11;
		else if (experience < 7800)
			level = 12;
		else if (experience < 9100)
			level = 13;
		else if (experience < 10500)
			level = 14;
		else if (experience < 12000)
			level = 15;
		else if (experience < 13600)
			level = 16;
		else if (experience < 15300)
			level = 17;
		else if (experience < 17100)
			level = 18;
		else if (experience < 19000)
			level = 19;
		else 
			level = 20;

		return level;
	}


	public int getAttack() {
		return attack;
	}

	public void addAttack(int increase) {
		attack +=  increase;
	}

	public int getDefense() {
		return defense;
	}

	public void addDefense(int increase) {
		defense += increase;
	}

	public int getSpeed() {
		return speed;
	}

	public void addSpeed(int increase) {
		speed += increase;
	}

	public int getHp() {
		return hp;
	}

	public void addHp(int increase) {
		hp += increase;
	}

	public void addWin() {
		win++;
	}

	public void addLoss() {
		loss++;
	}

	public double getWin() {
		return win;
	}

	public double getLoss() {
		return loss;
	}

	public int getNext() {
		return nextLevel;
	}

	public void setNext(int in) {
		nextLevel = in;
	}


}