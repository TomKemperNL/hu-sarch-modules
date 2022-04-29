package nl.hu.sarch.modules.billing;

public class Bill {
    private Customer customer;
    private double amountDue;

    public Bill(Customer customer, double amountDue) {
        this.customer = customer;
        this.amountDue = amountDue;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public Customer getCustomer() {
        return customer;
    }
}
