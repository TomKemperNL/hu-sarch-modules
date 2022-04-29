package nl.hu.sarch.modules.billing;

@FunctionalInterface
public interface Discount {
    double apply(double amount);
}
