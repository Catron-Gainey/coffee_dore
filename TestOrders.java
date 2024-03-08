public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
        coffeeKiosk.addMenuItem("Banana", 2.00);
        coffeeKiosk.addMenuItem("Coffee", 1.50);
        coffeeKiosk.addMenuItem("Latte", 4.50);
        coffeeKiosk.addMenuItem("Capuchino", 3.00);
        coffeeKiosk.addMenuItem("Muffin", 4.00);
        coffeeKiosk.newOrder();

        // Item mocha = new Item("mocha", 5.50);
        // Item latte = new Item("latte", 4.50);
        // Item dripCoffee = new Item("drip coffee", 3.25);
        // Item capuchino = new Item("capuchino", 6.50);

        // Order order1 = new Order();
        // order1.addItem(mocha);
        // order1.addItem(capuchino);
        // Order order2 = new Order();
        // order2.addItem(latte);
        // order2.addItem(dripCoffee);

        // Order order3 = new Order("order3");
        // order3.addItem(mocha);
        // order3.addItem(dripCoffee);
        // Order order4 = new Order("order4");
        // order4.addItem(capuchino);
        // order4.addItem(dripCoffee);
        // Order order5 = new Order("order5");
        // order5.addItem(mocha);
        // order5.addItem(capuchino);

        // order4.setReadyStatus(true); 
        // order2.setReadyStatus(true); 
        // System.out.println(order2.getOrderReadyStatus());
        // System.out.println(order3.getOrderReadyStatus());

        // System.out.println(order1.getOrderTotal());
        // order1.display();
        // order2.display();
        // order3.display();
        // order4.display();
        // order5.display();
    }
}
