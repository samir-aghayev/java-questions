package az.atlacademy.lesson16;

public class ResponseTest {
    public static void main(String[] args) {
        Response<String, Integer> a = method("Java", 5);
        System.out.println(a);
    }

    public static <T, U> Response<T, U> method(T t, U u) {
        return new Response<>(t, u);
    }
}
