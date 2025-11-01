// Define an interface
interface Vehicle {
    // Abstract methods (no body)
    void start();
    void stop();
}

// Implementing the Vehicle interface in Car class
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }
}

// Implementing the Vehicle interface in Bike class
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }

    public void stop() {
        System.out.println("Bike has stopped.");
    }
}

// Main class to test the interface
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();
    }
}
