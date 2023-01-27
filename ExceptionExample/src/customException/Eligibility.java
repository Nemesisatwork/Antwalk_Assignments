package customException;

public class Eligibility {
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("You are not allowed to vote");
        else
            System.out.println("cast your vote");
    }
}
