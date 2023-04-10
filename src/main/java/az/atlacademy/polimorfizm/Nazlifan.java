package az.atlacademy.polimorfizm;

public class Nazlifan extends Car{
    public Nazlifan() {
    }

    @Override
    public void start() {
        System.out.println(Nazlifan.class.getName());
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
