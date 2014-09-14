
public class Item {
	Type type;
	
	public enum Type {
		BOTTLE, CAN, BOX, TECH, OTHER
	}
	
	public Item (Type objType) {
		type = objType;
	}
	
	public int getValue () {
		if (type == Type.BOTTLE){
			return 100;
		} else if (type == Type.CAN) {
			return 100;
		} else if (type == Type.BOX) {
			return 200;
		} else if (type == Type.TECH) {
			return 1500;
		} else {
			return 100;
		}
	}
	
}
