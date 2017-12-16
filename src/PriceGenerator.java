import java.util.Random;

public abstract class PriceGenerator {

    private static Random r = new Random();
    public static double generatePrice(){
        double price = 0 + (500 - 0) * r.nextDouble();
        price = Math.ceil(price*100)/100;
        return price;
    }
}
