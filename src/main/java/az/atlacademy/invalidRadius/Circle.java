package az.atlacademy.invalidRadius;

public class Circle {
    private static int numberOfObject = 0;
    private double radius;


    public Circle() throws InvalidRadiusException {
        this(1.0);
    }

    public Circle(double radius) throws InvalidRadiusException {
        setRadius(radius);
        numberOfObject++;
    }

    public static int getNumberOfObject() {
        return numberOfObject;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0) {
            this.radius = radius;
        }else{
            throw new InvalidRadiusException(radius);
        }
    }
}
