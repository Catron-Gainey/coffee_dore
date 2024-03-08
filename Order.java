import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name = null; // default value of null
    private boolean ready = false; // default value false
    private ArrayList<Item> items = null; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS
    
    // Most of your code will go here, 
    // so implement the getters and setters first!
    public void addItem(Item orderItem) {
        items.add(orderItem);
    }
    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready";
        }else {
            return "Thank you for waiting.  Your order will be ready soon";
        }
    }
    public double getOrderTotal() {
        double totalOrderPrice = 0;
        for(Item item : items){
            totalOrderPrice += item.getItemPrice();
        }
        return totalOrderPrice;
    }
    public void display() {
        System.out.println("Customer Name: "+this.name);
        for(Item orderOverView : items){
            System.out.println(orderOverView.getItemName()+" - "+orderOverView.getItemPrice());
        }
        System.out.println("Total: " + getOrderTotal());
    }
    
    // GETTERS & SETTERS
    public String getOrderName() {
        return name;}
    public Boolean getOrderReadyStatus(){
        return ready;}
    public ArrayList<Item> getOrderList(){
        return items;}
    //setter
    public void setOrderName(String givenOrderName) {
        this.name = givenOrderName;}
    public void setReadyStatus(boolean givenReadyStatus) {
        this.ready = givenReadyStatus;}
    public void setItemList(ArrayList<Item> listItems){
        this.items = listItems;}
}

