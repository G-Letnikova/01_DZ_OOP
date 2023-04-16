import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        BottleOfWater bottleW1 = new BottleOfWater("Вода 1L", 100, 1);
        BottleOfWater bottleW2 = new BottleOfWater("Вода 2L", 200, 2);

        Product bottleM1 = new BottleOfMilk("Молоко 1L", 200, 1, 10);
        Product bottleM2 = new BottleOfMilk("Молоко 2L", 200, 2, 10);

        Product chocoSnickers = new ChocolateBar("Snickers", 120, 498);
        Product chocoMars = new ChocolateBar("Mars", 100, 448);




        List<Product> products =  new ArrayList<>();
        products.add(bottleW1);
        products.add(bottleW2);
        products.add(bottleM1);
        products.add(bottleM2);
        products.add(chocoSnickers);
        products.add(chocoMars);

        WendingMachine machine = new WendingMachine(products);

        BottleOfWater bottleWaterRes = (BottleOfWater) machine.getBottleOfWater("Вода 1L", 1);
        if (bottleWaterRes !=null) {
            System.out.println("*** Вы купили: ");
            System.out.println(bottleWaterRes.displayInfo());

        } else 
            System.out.println("*** Такой бутылки с водой нет.");
        

        BottleOfMilk bottleMilkRes = (BottleOfMilk) machine.getBottleOfMilk("Молоко 12", 1, 10);
        if (bottleMilkRes !=null) {
            System.out.println("*** Вы купили: ");
            System.out.println(bottleMilkRes.displayInfo());

        } else 
            System.out.println("*** Такой бутылки с молоком нет.");

        ChocolateBar chocolateBarRes = (ChocolateBar) machine.getChocolateBar("Mars", 448);
        if (chocolateBarRes !=null) {
            System.out.println("*** Вы купили: ");
            System.out.println(chocolateBarRes.displayInfo());

        } else 
            System.out.println("*** Такого батончика нет.");
    

    }

}
