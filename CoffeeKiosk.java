import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu = null;
    private ArrayList<Order> orders = null;

    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    public void addMenuItem(String givenName,double price) {
        Item newItem = new Item(givenName, price);
        menu.add(newItem);
        newItem.setIndex(menu.indexOf(newItem));
    }
    public void displayMenu(){
        for(Item menuItem : menu) {
            System.out.println(menuItem.getIndex()+ " "+menuItem.getItemName()+" -- $"+menuItem.getItemPrice());
        }
    }
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order newOrder = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
            try {
                newOrder.addItem(menu.get(Integer.parseInt(itemNumber)));
            }catch(IndexOutOfBoundsException i) { System.out.println("Invalid Selection");
            }catch(NumberFormatException n) { System.out.println("Invalid Selection");
            }
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        newOrder.display();
        
    }

}
