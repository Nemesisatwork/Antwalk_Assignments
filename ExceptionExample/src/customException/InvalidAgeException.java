package customException;

public class InvalidAgeException extends Exception {
    String msg;

    public InvalidAgeException(String msg) {
        super(msg);
    }

    public InvalidAgeException() {
        super();
    }
}
