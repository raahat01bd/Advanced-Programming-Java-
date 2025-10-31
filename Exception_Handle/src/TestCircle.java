public class TestCircle {
    public static void main(String[] args) {
        try {

            Circle c1 = new Circle(5, 5, 10);
            c1.display();


            Circle c2 = new Circle(0, 0, -3);
            c2.display();
        }
        catch (InvalidRadiusException e) {
            e.printError();
        }
    }
}
