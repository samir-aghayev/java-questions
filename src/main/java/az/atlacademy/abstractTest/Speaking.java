package az.atlacademy.abstractTest;

@FunctionalInterface
public interface Speaking {
    default void foo() {
        System.out.println("afafd");
    }

    default void foo2() {
        System.out.println("afafd");
    }

    void speakin();
}
