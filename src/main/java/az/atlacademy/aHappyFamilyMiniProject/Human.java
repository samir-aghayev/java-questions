package az.atlacademy.aHappyFamilyMiniProject;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq; //1-100
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet);
    }

    public void describePet() {
        System.out.println("I have a" + pet.getSpecies() + ", he is " + pet.getAge() +
                " years old, he is" + ((pet.getTrickLevel() > 50) ? "very sly" : "almost not sly"));
    }

    public String toString() {
        return "Human{name = '" + name + "', surname = '" + surname + "', year = " + year + ", " +
                "iq = " + iq + ", mother = " + mother + ", father = " + father +
                ((pet != null) ? (",\npet = " + pet.toString()) : "}");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getSchedule() {
        return schedule;
    }
}
