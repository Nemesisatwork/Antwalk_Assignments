package customException;

public class Election {
    public static void main(String[] args) {
        Eligibility obj = new Eligibility();
        try {
            obj.checkAge(14);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
