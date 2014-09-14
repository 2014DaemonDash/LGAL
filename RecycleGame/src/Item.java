/*
 * This class represents the items that a Player can recycle. Each item 
 * has a type that can be a bottle, can, box, piece of technology, or other
 */
public class Item {
	Type type;
	
	public enum Type {
		BOTTLE, CAN, BOX, TECH, OTHER
	}
	
	/*
	 * When an Item is created its type is stored as a field
	 */
	public Item (Type objType) {
		type = objType;
	}
	
	/*
	 * This method will determine and return how many exp points each item is
	 * worth
	 */
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
