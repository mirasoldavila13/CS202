
public class Item {

	String type,name;
	int amount;
	public Item(String type, String name, int amount) {
		this.type = type;
		this.name = name;
		this.amount = amount;
	}
	
	public String toString(){
		
		return name+","+ type + "," + amount;
		
	}
	

}
