import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class InventoryManagement {
	
//	static Scanner scan = new Scanner(System.in);
//	static ArrayList<String> Stationary = new ArrayList<String>();
//	static ArrayList<String> Food = new ArrayList<String>();
//	static ArrayList<String> Games = new ArrayList<String>();
//	static ArrayList<String> Supplies = new ArrayList<String>();
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Item> Stationary = new ArrayList<Item>();
	static ArrayList<Item> Food = new ArrayList<Item>();
	static ArrayList<Item> Games = new ArrayList<Item>();
	static ArrayList<Item> Supplies = new ArrayList<Item>();
	public static void main(String[] args) {
		HashMap<String,ArrayList<Item>> Map = new HashMap<String,ArrayList<Item>>();
		Map.put("Stationary", Stationary );
		Map.put("Food", Food );
		Map.put("Games", Games );
		Map.put("Supplies", Supplies );
		
//		Stationary.add("Pencils");
//		Stationary.add("Folder");
//		Stationary.add("notebook");
//		Food.add("Chips");
//		Food.add("Cookies");
//		Food.add("Cup Cakes");
//		Games.add("Scooby-Doo The Cyber Chase");
//		Games.add("Crash Bandicoot");
//		Games.add("Assassin's Creed");
//		Supplies.add("Toner");
//		Supplies.add("Paper");
//		Supplies.add("Staples");

		while(true){
			System.out.println("Welcome to the CS Deparment Inventory Management Program");
			System.out.println("--------------------------------------------------------");
			System.out.println("1. Show Current Inventory");
			System.out.println("2. Update Inventory");
			System.out.println("3. Add Items");
			System.out.println("4. Calculate Total Cost");
			System.out.println("5. Quit Program");


			int option = scan.nextInt();

			switch(option) {
			case 1: printInventory();
					break;
			case 2: 
					break;
			case 3: addItem();
					break;
			case 4: 
					break;
			case 5:	System.out.println("Program will now terminate!");
			System.exit(0);
			break;
			}

		}

	}

	public static void printInventory(){
		//print them out in order
		System.out.println("--------------------------------------------------------");
		System.out.println("Stationary Cabinets contain:" + Stationary.toString());
		System.out.println("Food Cabinets contain:" + Food.toString());
		System.out.println("Video Game Cabinets contain:" + Games.toString());
		System.out.println("Printer Supplies Cabinets contain:" + Supplies.toString());
		System.out.println();
	}
	
	public  void updateInventory(){
		
	}
	public static  void addItem(){//where the user can add items if neccesary
		ArrayList<String> inputs = new ArrayList<String>();
		System.out.print("Enter a new item:");
		
			inputs.add(scan.nextLine());
		
			System.out.println(inputs);
		
		
		
	}
}
