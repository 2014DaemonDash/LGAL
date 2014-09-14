
public class Points {
	private int expPoints;
	private int equipPoints;
	
	public Points () {
		expPoints = 0;
		equipPoints = 0;
	}
	
	void addExp (int pointIn) {
		expPoints += pointIn;
	}
	
	void addEquip (int pointIn) {
		equipPoints += pointIn;
	}
	
	void dailyBonus () {
		addEquip(2);
	} 
	
	public int getExp () {
		return expPoints;
	} 
	
	public int getEquip () {
		return equipPoints;
	}

}
