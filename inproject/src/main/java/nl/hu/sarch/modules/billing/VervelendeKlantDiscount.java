package nl.hu.sarch.modules.billing;

public class VervelendeKlantDiscount implements Discount{
    @Override
    public double apply(double amount) {
        return amount * 1.5;
    }
}
