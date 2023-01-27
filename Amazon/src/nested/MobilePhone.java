package nested;

import javax.naming.ldap.LdapName;

public class MobilePhone {
    private int ram = 12;
    private int storage = 256;
    private int simSlot = 1;

    class SimCard {
        long phoneNumber = 123456;
        String serviceProvider;
        int simInSlot = simSlot;
    }
}
