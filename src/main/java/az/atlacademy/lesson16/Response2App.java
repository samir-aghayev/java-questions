package az.atlacademy.lesson16;

public class Response2App {
    public static void main(String[] args) {
        System.out.println();
    }

    public static <T, U> Response2<T, U> method(T data1, U data2) {
        return new Response2<>(data1, data2);
    }
}
