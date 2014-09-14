/*
 * This class keeps track of a player's attack, defense, speed, and hp statistics.
 * It also keeps track of what weapons are equipped and what level the player is.
 */

public class Stats {
	private int attack, defense, speed, hp;
	private int experience, level;
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

		level = 1;
	}
	
	public boolean attackEquipped() {
		return attackEquipped;
	}
	
	public void equipAttack(boolean onOff){
		attackEquipped = onOff;
	}
	
	public boolean defenseEquipped() {
		return defenseEquipped;
	}
	
	public void equipDefense(boolean onOff) {
		defenseEquipped = onOff;
	}
	
	public boolean speedEquipped() {
		return speedEquipped;
	}
	
	public void equipSpeed(boolean onOff) {
		speedEquipped = onOff;
	}
	
	public boolean hpEquipped() {
		return hpEquipped;
	}
	
	public void equipHp(boolean onOff) {
		hpEquipped = onOff;
	}

	
	public int getLevel() {
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