package az.atlacademy.lesson25;

public class DataNotFoundException extends RuntimeException{
    public DataNotFoundException(String message) {
        System.out.println("Date not found");
    }
}
