

public class TestMoney {

    public static void main(String[] args) {

        double price = PriceGenerator.generatePrice();

        System.out.println("Do zapłaty: " + price);
        System.out.println(Money.getAllNames());

        double rest = Wallet.payUntil(price);

        Cashier kasjer = new Cashier();
        kasjer.giveChange(rest);

        System.out.println();
    }
}
