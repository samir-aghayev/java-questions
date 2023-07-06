package az.atlacademy.lesson28.tet3;

public class Developer extends Employe {
    private double bonus;


    public Developer() {
        super(5,"Zafer");
    }

    public Developer(int id, String name) {
        super(id, name);
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        d.setBonus(43d);
        System.out.println(d.getBonus());

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
