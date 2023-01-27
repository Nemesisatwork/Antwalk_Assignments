package nested;

public class TestMobilePhone {
    public static void main(String[] args) {
        MobilePhone obj = new MobilePhone();

        MobilePhone.SimCard sim = obj.new SimCard();

        System.out.println("The phone number is " + sim.phoneNumber);
    }
}
