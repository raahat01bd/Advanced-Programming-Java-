public class Circle {
    double x, y, r;

    public Circle(double centerX, double centerY, double radius) throws InvalidRadiusException {
        if (radius <= 0) {
            throw new InvalidRadiusException(radius);
        } else {
            x = centerX;
            y = centerY;
            r = radius;
        }
    }

    public void display() {
        System.out.println("Circle center: (" + x + ", " + y + "), radius: " + r);
    }
}