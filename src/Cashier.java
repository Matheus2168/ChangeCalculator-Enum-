public class Cashier {


    public void giveChange(double moneyAmount){
        double rest = moneyAmount;
        Money[] currencies = Money.values();
        for (Money currency : currencies) {
            double enumCurrency = rest / currency.getValue();
            if (enumCurrency >= 1){
                enumCurrency = (int)enumCurrency;
                rest = rest - enumCurrency*currency.getValue();

            }
            else enumCurrency = 0;
            if (currency.getValue() == 0.05 || currency.getValue() == 0.02){ //z tym if'em lepiej liczy końcowke
                rest = Math.ceil(rest*100)/100;
            }
            if (enumCurrency!=0){
                System.out.printf("%d * %s  |  ",(int)enumCurrency,currency.getCurrencyFormatName());
            }


        }

    }
}

