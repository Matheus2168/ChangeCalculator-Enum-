import java.util.Scanner;

public abstract class Wallet {

private static Scanner sc = new Scanner(System.in);

    public static double payUntil(double price){
        double rest;
        double priceLeft = price;
        double paid = 0.0;
        while (paid < price){
            System.out.print("Place: ");
            String yourChoice = sc.nextLine();
            Money yourMoney = Money.valueOf(Money.currencyFormatNameToEnumName(yourChoice));
            double yourMoneyValue = yourMoney.getValue();
            priceLeft -= yourMoneyValue;
            paid +=yourMoneyValue;
            if (priceLeft>=0) {
                System.out.printf("Pozostalo do zaplaty: %.2f%n",priceLeft);
            }
        }
        rest = paid - price;
        rest = Math.ceil(rest*100)/100;
        System.out.println("Reszta do wydania wynosi: "+rest);
        return rest;
    }
}
