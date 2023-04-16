public class BottleOfMilk extends Product{
    private int volume;
    private int fat;

    public int getVolume(){
        return this.volume;
    }

    public int getFat(){
        return this.fat;
    }

    public BottleOfMilk(String name, double price, int volume, int fat) {
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
     String displayInfo() {
       return String.format("%s - %.2f руб. - объем: %dL - жирность:%d", name, price, volume, fat);
    }
}
