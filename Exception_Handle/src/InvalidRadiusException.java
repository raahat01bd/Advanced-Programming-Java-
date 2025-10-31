import java.lang.Exception;

public class InvalidRadiusException extends Exception {
    private double r;

    public InvalidRadiusException(double radius) {
        r = radius;
    }

    public void printError() {
        System.out.println("Radius [" + r + "] is not valid");
    }
}


