package az.atlacademy.lesson29;

public class Threding extends Thread {
    @Override
    public synchronized void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Threding.class.getName());
        }
    }
}
