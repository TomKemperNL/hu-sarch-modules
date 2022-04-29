package nl.hu.sarch.modules.email;

import java.util.regex.Pattern;

public class EmailAddress {
    private String value;

    public EmailAddress(String value) {
        if (Pattern.matches("^(.+)@(.+)$", value)) {
            this.value = value;
        } else {
            throw new RuntimeException("Invalid Emailaddress");
        }
    }

    public String toString() {
        return value;
    }

}
