public class BottleOfWater extends Product{
    private int volume;

    public int getVolume(){
        return this.volume;
    }

    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
     String displayInfo() {
       return String.format("%s - %.2f руб. - объем: %dL", name, price, volume);
    }
}
