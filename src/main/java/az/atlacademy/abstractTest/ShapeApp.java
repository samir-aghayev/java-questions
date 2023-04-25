package az.atlacademy.abstractTest;

public class ShapeApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        call(circle);
        call(rectangle);
        call(square);
    }

    public static void call(Shape shape) {
        shape.print();
    }
}
