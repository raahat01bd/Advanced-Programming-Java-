public class Circle {
    double x, y, r;

    public Circle(double centerX, double centerY, String radiusStr) throws InvalidRadiusException {
        double radius;

        try {

            radius = Double.parseDouble(radiusStr);
        } catch (NumberFormatException e) {

            throw new InvalidRadiusException(radiusStr);
        }


        if (radius <= 0) {
            throw new InvalidRadiusException(radiusStr);
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