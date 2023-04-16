public class ChocolateBar extends Product{
    
    private int calories;

    public int getCalories(){
        return this.calories;
    }

    public ChocolateBar (String name, double price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    @Override
     String displayInfo() {
       return String.format("%s - %.2f руб. - Калорийность: %d Ккал", name, price, calories);
    }

}
