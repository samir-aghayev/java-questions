package az.atlacademy.polimorfizm;

public class Xazar extends Car{
    public Xazar() {
    }

    @Override
    public void start() {
        System.out.println(Xazar.class.getName());
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
