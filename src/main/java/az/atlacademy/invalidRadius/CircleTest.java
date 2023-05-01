package az.atlacademy.invalidRadius;

public class CircleTest {
    public static void main(String[] args) {
        try {
            Circle a1 = new Circle(5);
            Circle a2 = new Circle(-1);
            Circle a3 = new Circle(3);
            Circle a4 = new Circle(3);
        }catch (Exception a){
            a.printStackTrace();
            System.out.println(a.getMessage());
        }
        System.out.println(Circle.getObjectCounter());
    }
}
