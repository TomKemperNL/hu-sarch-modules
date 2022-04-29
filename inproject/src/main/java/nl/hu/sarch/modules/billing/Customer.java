package nl.hu.sarch.modules.billing;

import nl.hu.sarch.modules.Product;

import java.util.List;

public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Order createPreferentialOrder(List<Product> products) {
        Order o = new Order(this, products);
        o.applyDiscount(new AardigeKlantDiscount());

        return o;
    }
}
