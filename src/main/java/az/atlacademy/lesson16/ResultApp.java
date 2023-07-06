package az.atlacademy.lesson16;

public class ResultApp {
    public static void main(String[] args) {

    }

    public static <T> Result<T> method(T data) {
        if(data==null){
            return new Result<>();
        }
        return new Result<>(data, data.getClass().getName());
    }
}
