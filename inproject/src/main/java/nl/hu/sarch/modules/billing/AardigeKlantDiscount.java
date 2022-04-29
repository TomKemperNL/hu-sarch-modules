package nl.hu.sarch.modules.billing;

public class AardigeKlantDiscount implements Discount{
    @Override
    public double apply(double amount) {
        return amount / 2;
    }
}
