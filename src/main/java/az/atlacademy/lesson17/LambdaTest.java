package az.atlacademy.lesson17;

public class LambdaTest {
    public static void main(String[] args) {
        Interface1 a = (x, y) -> x * y;
        Interface1 b = (x, y) -> x * 2 + y;

        System.out.println(a.sum(5, 3));
        System.out.println(b.sum(5, 3));

    }
}