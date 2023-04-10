package az.atlacademy.aHappyFamilyMiniProject;

public class Main {
    public static void main(String[] args) {
        String[] habbits = new String[]{"jumping onto kitchen counters", "destructive behaviors",
                "attention seeking that drives owners crazy", "aggressive play",
                "nighttime activities that keep owners awake", "excessive meowing"};
        Pet cat = new Pet("British Shorthair", "Masi", 2, 96, habbits);
        Human mother = new Human("Tehmine", "Aliyeva", 40);
        Human father = new Human("Zaur", "Aliyeva", 42);
        String[][] schedule = fillSchedule();
        Human son = new Human("Veli", "Ahmedov", 96, 25, schedule);
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(son.toString());
    }

    public static String[][] fillSchedule() {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";

        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to the gym";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Travel or explore your city";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "Learn a new skill";

        schedule[5][0] = "Friday";
        schedule[5][1] = "Connect with friends and family, read a book";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "Attend a cultural event, spend time outdoors";
        return schedule;
    }
}
