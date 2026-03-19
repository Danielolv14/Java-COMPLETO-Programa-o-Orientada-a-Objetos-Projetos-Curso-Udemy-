package Estatico;
public class CurrencyConverter {

    public static double IOF(double QuantityDollar) {
        return QuantityDollar * 0.06;
    }

    public static double Price(double QuantityDollar,double priceDollar){
        double temp = QuantityDollar + IOF(QuantityDollar);
        return temp * priceDollar;
    }
}