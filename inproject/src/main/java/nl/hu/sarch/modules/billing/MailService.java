package nl.hu.sarch.modules.billing;

public interface MailService {
    void sendConfirmMessage(Order o);
}
