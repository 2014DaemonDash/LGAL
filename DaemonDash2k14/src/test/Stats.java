package test;

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
		if (point.getExp() < 100)
			level = 1;
		else if (point.getExp() < 300)
			level = 2;
		else if (point.getExp() < 600)
			level = 3;
		else if (point.getExp() < 1000)
			level = 4;
		else if (point.getExp() < 1500)
			level = 5;
		else if (point.getExp() < 2100)
			level = 6;
		else if (point.getExp() < 2800)
			level = 7;
		else if (point.getExp() < 3600)
			level = 8;
		else if (point.getExp() < 4500)
			level = 9;
		else if (point.getExp() < 5500)
			level = 10;
		else if (point.getExp() < 6600)
			level = 11;
		else if (point.getExp() < 7800)
			level = 12;
		else if (point.getExp() < 9100)
			level = 13;
		else if (point.getExp() < 10500)
			level = 14;
		else if (point.getExp() < 12000)
			level = 15;
		else if (point.getExp() < 13600)
			level = 16;
		else if (point.getExp() < 15300)
			level = 17;
		else if (point.getExp() < 17100)
			level = 18;
		else if (point.getExp() < 19000)
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