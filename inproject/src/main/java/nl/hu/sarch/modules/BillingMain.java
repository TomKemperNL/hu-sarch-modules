package nl.hu.sarch.modules;

import nl.hu.sarch.modules.billing.Bill;
import nl.hu.sarch.modules.billing.Customer;
import nl.hu.sarch.modules.billing.MailService;
import nl.hu.sarch.modules.email.DummyMailService;

import java.util.List;

public class BillingMain {
    public static void main(String[] args) {
        MailService mailService = new DummyMailService();

        Customer c = new Customer("Sjaak");
        Product kopjeKoffie = new Product("Koffie", 2);

        Bill b = c.createPreferentialOrder(List.of(kopjeKoffie)).finalizeBill(mailService);

        System.out.println("Dat wordt dan " + b.getAmountDue());
    }
}
