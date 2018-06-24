package homework;
import java.util.Scanner;
public class Inventory {
	// add items and allow the user to select the item type.
		public static void addItems(String[] food, String[] videogames, String[] stationary){

		}
		
		//update inventory. allow user to increase or decrease the item count.
		public static void updateInventory(String[] food, String[] videogames, String[] stationary){
			for(String f: food){
				System.out.println(f);
			}
			
			for(String v: videogames){
				System.out.print(v);
			}
			
			for(String s: stationary){
				System.out.print(s);
			}
		}
		
		//Show current inventory by printing each array
		public static void currentInventory(String[] food, String[] videogames, String[] stationary){

		}

		//display the menu to user
		public static void displayMenu(){
			Scanner input = new Scanner(System.in);
			System.out.println("Select one of the following!");
			System.out.println("CS Deparment Inventory");
			System.out.println("1. Show Current Inventory");
			System.out.println("2. Update Inventory");
			System.out.println("3. Add Items");
			System.out.println("4.  Quit");

			int choice = input.nextInt();

			switch(choice){
			case 1: currentInventory();
					break;
			case 2: updateInventory();
					break;
			case 3: addItems();
					break;
			case 4: System.exit(0);
					break;
			}

		}
		public static void main(String[] args) {
			// 4 types of cabinet
			String Stationary[] = {"Pen", "Folder", "notebook"};
			String Food[] = {"Cookies", "Chips", "Cereal"};
			String VideoGames[] = {"Crash Bandicoop", "Donkey Kong", "Super Mario"};
			//keep count for each individual item
			displayMenu();
		}	
}
