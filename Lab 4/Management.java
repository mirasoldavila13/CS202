import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Management {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Item> Stationary = new ArrayList<Item>();
	static ArrayList<Item> Food = new ArrayList<Item>();
	static ArrayList<Item> Games = new ArrayList<Item>();
	static ArrayList<Item> Supplies = new ArrayList<Item>();
	static HashMap<String,ArrayList<Item>> item = new HashMap<String,ArrayList<Item>>();
	
	
	public static void main(String[] args) throws FileNotFoundException{
		item.put("Stationary", Stationary );
		item.put("Food", Food );
		item.put("Games", Games );
		item.put("Supplies", Supplies );
		
		//create an item object
		Item stationaryItem1 = new Item("Stationary", "Pencil", 2);
		Item stationaryItem2 = new Item("Stationary", "Folder", 4);
		Item stationaryItem3 = new Item("Stationary", "Notebook", 4);
		
		Item foodItem1 = new Item("Food", "Chips", 1);
		Item foodItem2 = new Item("Food", "Cookies", 3);
		Item foodItem3 = new Item("Food", "Cup Cakes", 12);
		
		Item gameItem1 = new Item("Games","Scooby-Doo The Cyber Chase", 25);
		Item gameItem2 = new Item("Games", "Crash Bandicoot", 34);
		Item gameItem3 = new Item("Games","Assassin's Creed", 59);
		
		Item suppliesItem1 = new Item("Supplies", "Toner", 59);
		Item suppliesItem2 = new Item("Supplies", "Paper", 25);
		Item suppliesItem3 = new Item("Supplies", "Staples", 15);
		
		Stationary.add(stationaryItem1);
		Stationary.add(stationaryItem2);
		Stationary.add(stationaryItem3);
		
		Food.add(foodItem1);
		Food.add(foodItem2);
		Food.add(foodItem3);
		Games.add(gameItem1);
		Games.add(gameItem2);
		Games.add(gameItem3);
		
		Supplies.add(suppliesItem1);
		Supplies.add(suppliesItem2);
		Supplies.add(suppliesItem3);
		System.out.println();
		
		while(true){
			displayMenu();
			int input = scan.nextInt();
			switch (input){
			case 1:
				showInventory();
					break;
			case 2: 
				updateInventory();
					break;
			case 3: 
				addItem();
					break;
			case 4:
				totalCost();
					break;
			case 5:
				loadItem();
					break;
			case 6: 
				saveItem();
					break;
			case 7: System.out.println("Program will now terminate!");
					System.exit(0);
			
			}
		
		
		

		}	
	
	
	
	}
	
	private static void totalCost() {
		// TODO Auto-generated method stub
		
	}

	private static void saveItem() throws FileNotFoundException {
		// ask the user for a path to save file
		System.out.print("What is the name of your path?:");
        String theFile = scan.nextLine();  //users file or path
        File fileIn = new File(theFile);

        
         while(!fileIn.exists()){ //just in case prompt the user for another path if the first one doesn't exist
        
           System.out.print("Invalid path name! Try again: ");
           theFile = scan.next();
           fileIn = new File(theFile);// exists and is readable
        }

        // have a valid file name, create obkject
        Scanner fileScan = new Scanner(fileIn);
        
        // process the file
        while(fileScan.hasNextLine())
        {
        	System.out.println(scan.nextLine());
         }
	}

	
	private static void loadItem() {
		// TODO Auto-generated method stub
		
	}

	public static void addItem() {
		System.out.println("What type of Item would you like to add?");
		String type = scan.next();
		System.out.println("What is the items name?");
		String name = scan.next();
		System.out.println("How much do you want to add?");
		int amount = scan.nextInt();
		
		Item addItem = new Item(type, name, amount);//don't worry 4 now
		ArrayList<Item> items = item.get(type);//this is getting the array list of this type
		if(items== null){
			items= new ArrayList<Item>();
		}
		
		items.add(addItem);	
		item.put(type, items);
	}
	
	public static void updateInventory() {
//		String type= getType();//should display prompt for type and return the type 
//		displayItemsByType(Stationary);// should display items of the specified type 
	}
	
	
	public static void showInventory() {
		Iterator it = item.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        ArrayList<Item> list = (ArrayList<Item>) pair.getValue();
	        for(Item l:  list){
	        	System.out.println(l);
	        }
	        it.remove(); // avoids a ConcurrentModificationException
	    }
		
	}
	public  static void displayMenu(){
		System.out.println("Welcome to the CS Inventory!!!");
		System.out.println("--------------------------------");
		System.out.println("1. Show Inventory");
		System.out.println("2. Update Inventory");
		System.out.println("3. Add Items");
		System.out.println("4. Calculate Total Cost");
		System.out.println("5. Load Inventory");
		System.out.println("6. Save Inventory");
		System.out.println("7. Quit Program");
	}
	
}
