public enum Money {

    zl_200("200zl",200.0),
    zl_100("100zl",100.0),
    zl_50("50zl",50.0),
    zl_20("20zl",20.0),
    zl_10("10zl",10.0),
    zl_5("5zl",5.0),
    zl_2("2zl",2.0),
    zl_1("1zl",1.0),
    gr_50("50gr",0.5),
    gr_20("20gr",0.2),
    gr_10("10gr",0.1),
    gr_5("5gr",0.05),
    gr_2("2gr",0.02),
    gr_1("1gr",0.01);

    private final String currencyFormatName;
    private final double value;

    Money(String currencyFormatName, double value) {
        this.currencyFormatName = currencyFormatName;
        this.value = value;
    }

    public static String currencyFormatNameToEnumName(String currencyName){
        String scanned = currencyName;
        char c1 = scanned.charAt(scanned.length()-2);
        char c2 = scanned.charAt(scanned.length()-1);
        scanned = scanned.replaceAll("z","").replaceAll("l","");
        scanned = scanned.replaceAll("g","").replaceAll("r","");
        String result = c1+""+c2+"_"+scanned;
        return result;
    }

    public String getCurrencyFormatName() {
        return currencyFormatName;
    }

    public double getValue() {
        return value;
    }



    public static String getAllNames() {
        String result = "Mozliwe nominaly: { ";
        Money[]currencies = Money.values();
        for (Money currency : currencies) {
            result+= currency.getCurrencyFormatName()+", ";
        }
        return result +"}";
    }
}
