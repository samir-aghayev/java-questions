package az.atlacademy.lesson29;

public class ThreadApp {
    public static void main(String[] args) {
        new Threading().start();

        new Thread(new ThreadWithRuunable()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread with anonymous class");
            }
        }).start();

        new Thread(() -> System.out.println("Thread with lambda")).start();
    }
}
