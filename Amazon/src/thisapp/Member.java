package thisapp;

public class Member {
    public void chat() {

        System.out.println("This is my chat");
    }

    public Admin getAdmin() {
        return new Admin();
    }

}
