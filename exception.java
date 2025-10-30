// Full Example: Demonstrating try, catch, throw, throws, finally
class InvalidAgeException extends Exception {
    // Constructor to send custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Method that can throw an exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Manually throw exception
            throw new InvalidAgeException("Age must be 18 or above to vote!");
        } else {
            System.out.println("✅ You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            // try block: where error might occur
            int userAge = 15; // You can change this value to test
            checkAge(userAge); // calling method that may throw exception
        }
        catch (InvalidAgeException e) {
            // catch block: handle the exception
            System.out.println("⚠ Exception Caught: " + e.getMessage());
        }
        finally {
            // finally block: always executed
            System.out.println("🧩 Program finished checking eligibility.");
        }
    }
}
