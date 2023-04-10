package az.atlacademy.polimorfizm;

public class Bmv extends Car{
    public Bmv() {
    }

    @Override
    public void start() {
        System.out.println(Bmv.class.getName());
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
