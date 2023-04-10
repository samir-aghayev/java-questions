package az.atlacademy.polimorfizm;

public class Vaz extends Car{
    public Vaz() {
    }

    @Override
    public void start() {
        System.out.println(Vaz.class.getName());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
