package by.nc.school.dev.exceptions;

public class UserException extends Exception {
    public UserException() {
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
        System.err.println(message + cause);
    }

    public UserException(String message) {
        super(message);
        System.err.println(message);
    }

    public UserException(Throwable cause) {
        super(cause);
        System.err.println(cause);
    }
}
