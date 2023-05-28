import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();
        Product tea = new HotDrink ("Tea", 50, 60);
        Product coffee = new HotDrink("Coffee", 60, 90);
        Product cocoa = new HotDrink("Cocoa", 80, 80);
        LinkedList<Product> l = new LinkedList<>();
        l.add(tea);
        l.add(coffee);
        l.add(cocoa);

        hdvm.putProduct(l);
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
    }
}