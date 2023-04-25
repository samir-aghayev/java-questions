package az.atlacademy.polimorfizm;

public class Skuter extends Car{
    public Skuter() {
    }


    public void start() {
        System.out.println(Skuter.class.getName());
    }


    public int hashCode() {
        return super.hashCode();
    }


    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return super.toString();
    }
}
