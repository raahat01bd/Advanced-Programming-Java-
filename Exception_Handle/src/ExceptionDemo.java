// Full Example: Demonstrating try, catch, throw, throws, finally

// Step 1: Custom Exception Class
class InvalidAgeException extends Exception {
    // Constructor to send custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Main Class
public class ExceptionDemo {

    // Step 3: Method that can throw an exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Manually throw exception
            throw new InvalidAgeException("Age must be 18 or above to vote!");
        } else {
            System.out.println("✅ You are eligible to vote.");
        }
    }

    // Step 4: Main method — program starts here
    public static void main(String[] args) {
        try {
            // try block: where error might occur
            int userAge = 15; // Change this value to test different cases
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
