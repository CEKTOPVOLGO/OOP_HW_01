public abstract class Product {
    protected String name;
    protected int price;

    
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public abstract String getName();
    public abstract void setName(String name);
    public abstract int getPrice();
    public abstract void setPrice(int price);
    
    
}
