import java.util.List;

public class WendingMachine {
    
    private final List<Product> products;

    public WendingMachine(List<Product> products){
        this.products = products;
    }

    /**
    * метод получения бутылки с водой
    */ 
    public Product getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater ){
               if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume) {
                    return (BottleOfWater)product;
                }
            }
        }
        return null;

    }

   /**
    * метод получения бутылки с молоком
    */ 
    public Product getBottleOfMilk(String name, int volume, int fat){

        for (Product product : products){
            if (product instanceof BottleOfMilk ){
               if (product.getName() == name 
               && ((BottleOfMilk)product).getVolume() == volume
               && ((BottleOfMilk)product).getFat() == fat) {
                    return (BottleOfMilk)product;
                }
            }
        }
        return null;

    }
   /**
    * метод получения шоколадного батончика
    */ 
    public Product getChocolateBar(String name, int calories){

        for (Product product : products){
            if (product instanceof ChocolateBar ){
               if (product.getName() == name 
                    && ((ChocolateBar)product).getCalories() == calories) {
                        return (ChocolateBar)product;
                }
            }
        }
        return null;

    }

}
