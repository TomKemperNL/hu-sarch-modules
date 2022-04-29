package nl.hu.sarch.modules.email;

import nl.hu.sarch.modules.billing.MailService;
import nl.hu.sarch.modules.billing.Order;

public class DummyMailService implements MailService {
    public void sendMailMessage(MailMessage m) {
        //.... en dan het technische geneuzel
    }

    public void sendConfirmMessage(Order o) {
        //.... of juist met een 'sterk domein'
    }
}
