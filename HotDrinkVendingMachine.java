import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine {

    private LinkedList<Product> hotDrink;    

    @Override
    public Product getProduct() {        
        return hotDrink.pollLast();
    }

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotDrink = item;        
    }

}
