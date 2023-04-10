package az.atlacademy.polimorfizm;

public class CarApp {
    public static void main(String[] args) {
        Bmv bmv = new Bmv();
        Vaz vaz = new Vaz();
        Nazlifan nazlifan = new Nazlifan();
        Xazar xazar = new Xazar();
        Skuter skuter=new Skuter();
        start(skuter);
        start(bmv);
        start(vaz);
        start(nazlifan);
        start(xazar);
    }

    private static void start(Car car) {
        System.out.println(car.getClass().getName() + " is starter");
    }
}
