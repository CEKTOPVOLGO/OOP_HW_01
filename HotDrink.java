public class HotDrink extends Product {

    private int temp;

    public HotDrink(String name, int price, int temp) {
        super(name, price);
        this.temp = temp;

    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink {" + "name='" + name + "\'" + ", price =" + price + ", temp =" + temp + "}";
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void setName(String name) {
        super.name = name;

    }

    @Override
    public void setPrice(int price) {
        super.price = price;

    }

}
