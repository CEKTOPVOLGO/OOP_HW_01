public class HotDrink extends Product {

    private int temp;

    public HotDrink(String name, int volume, int temp) {
        super(name, volume);
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
        return "HotDrink {" + "name='" + name + "\'" + ", volume =" + volume + ", temp =" + temp + "}";
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public int getVolume() {
        return super.volume;
    }

    @Override
    public void setName(String name) {
        super.name = name;

    }

    @Override
    public void setVolume(int price) {
        super.volume = volume;

    }

}
