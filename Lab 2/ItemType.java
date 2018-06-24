
public class ItemType {
	String[] item = new String[100];
	int itemCount, itemUnitPrice;
	
	ItemType(){
		item = new String[] {};
	} 
	
	public void addItem(String Item, String itemToAdd){
		
	}
	public int totalCost(){// returning the total cost of the Item type
		return itemCount * itemUnitPrice;
	}
}
