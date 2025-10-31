import java.lang.Exception;

public class InvalidRadiusException extends Exception {
    private String r;

    public InvalidRadiusException(String radius) {
        r = radius;
    }

    public void printError() {
        System.out.println("Radius [" + r + "] is not valid");
    }
}


