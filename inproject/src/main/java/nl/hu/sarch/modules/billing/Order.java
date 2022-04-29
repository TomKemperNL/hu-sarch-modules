package nl.hu.sarch.modules.billing;

import nl.hu.sarch.modules.Product;
import nl.hu.sarch.modules.email.DummyMailService;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Customer customer;
    private final List<Discount> discounts = new ArrayList<>();
    private final List<Product> products;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    void applyDiscount(Discount d) {
        this.discounts.add(d);
    }

    public Bill finalizeBill(MailService service) {

        double a = this.products.stream().mapToDouble(Product::getPrice).sum();
        for (Discount d : this.discounts) {
            a = d.apply(a);
        }

        service.sendConfirmMessage(this);

        return new Bill(this.customer, a);
    }


}
