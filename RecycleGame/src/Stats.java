/*
 * This class keeps track of a player's attack, defense, speed, and hp statistics.
 * It also keeps track of what weapons are equipped and what level the player is.
 */

public class Stats {
	int attack, defense, speed, hp;
	int points, experience, level;
	double win, loss;
	boolean attackEquipped, defenseEquipped, speedEquipped, hpEquipped;
	int nextLevel = 100;

	int weaponLevel;
	String weaponType;

	public Stats() {
		attack = 0;
		defense = 0;
		speed = 0;
		hp = 0;

		attackEquipped = false;
		defenseEquipped = false;
		speedEquipped = false;
		hpEquipped = false;

		Points point = new Points();
		points = point.getEquip();
		experience = point.getExp();

		level = getLevel();
	}

	public void addWeapon(int weaponLevel, String weaponType) {
		if (weaponType == "Attack" && attackEquipped == false) {
			if (weaponLevel == 1)
				attack += 5;
			else if (weaponLevel == 2)
				attack += 10;
			else if (weaponLevel == 3)
				attack += 15;
			else if (weaponLevel == 4)
				attack += 20;
			else if (weaponLevel == 5)
				attack += 25;
			
			attackEquipped = true;
		} else if (weaponType == "Defense" && defenseEquipped == false) {
			if (weaponLevel == 1)
				defense += 5;
			else if (weaponLevel == 2)
				defense += 10;
			else if (weaponLevel == 3)
				defense += 15;
			else if (weaponLevel == 4)
				defense += 20;
			else if (weaponLevel == 5)
				defense += 25;
			
			defenseEquipped = true;
		} else if (weaponType == "Speed" && speedEquipped == false) {
			if (weaponLevel == 1)
				speed += 5;
			else if (weaponLevel == 2)
				speed += 10;
			else if (weaponLevel == 3)
				speed += 15;
			else if (weaponLevel == 4)
				speed += 20;
			else if (weaponLevel == 5)
				speed += 25;
			
			speedEquipped = true;
		} else if (weaponType == "Hp" && hpEquipped == false) {
			if (weaponLevel == 1)
				hp += 5;
			else if (weaponLevel == 2)
				hp += 10;
			else if (weaponLevel == 3)
				hp += 15;
			else if (weaponLevel == 4)
				hp += 20;
			else if (weaponLevel == 5)
				hp += 25;
			
			hpEquipped = true;
		}
	}

	public int getLevel() {
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
		else if (experience < 21000)
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
	

}