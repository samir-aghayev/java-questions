package az.atlacademy.games;

import java.util.Scanner;

public class WeekPlannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] scedule = new String[7][2];
        fillPLanner(scedule);
        String choice;
        String newTask;
        while (true) {
            System.out.println("Please, input the day of the week: ");
            choice = scanner.next().toLowerCase();
            if (choice.equals("exit")) {
                break;
            }
            answer(scedule, choice);
            System.out.println("do you want to change the task? (yes or no)");
            newTask = scanner.next().toLowerCase();
            if (newTask.equals("no")) {
                break;
            } else if (newTask.equals("yes")) {
                System.out.println("input new tasks for " + choice);
                newTask = scanner.next();
                for (int i = 0; i < scedule.length; i++) {
                    if (scedule[i][0].toLowerCase().equals(choice)) {
                        scedule[i][1] = newTask;
                        answer(scedule, choice);
                        break;
                    }
                }
            }
        }
    }

    private static void answer(String[][] scedule, String choice) {
        boolean check = false;
        for (String[] strings : scedule) {
            if (strings[0].toLowerCase().equals(choice)) {
                System.out.println("Your tasks for " + strings[0] + ": " + strings[1]);
                check = true;
                break;
            }
        }
        if (!check && !choice.equals("exit")) {
            System.out.println("Sorry, I don't understand you, please try again.");
        }
    }

    public static void fillPLanner(String[][] scedule) {
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";

        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";

        scedule[2][0] = "Tuesday";
        scedule[2][1] = "go to the gym";

        scedule[3][0] = "Wednesday";
        scedule[3][1] = "Travel or explore your city";

        scedule[4][0] = "Thursday";
        scedule[4][1] = "Learn a new skill";

        scedule[5][0] = "Friday";
        scedule[5][1] = "Connect with friends and family, read a book";

        scedule[6][0] = "Saturday";
        scedule[6][1] = "Attend a cultural event, spend time outdoors";
    }
}
