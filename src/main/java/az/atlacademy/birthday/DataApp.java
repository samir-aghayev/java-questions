package az.atlacademy.birthday;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter your birtday year: ");
            String year = scanner.next();
            int yearNumber = Integer.parseInt(year);
            System.out.print("Enter your birtday month: ");
            String month = scanner.next();
            int monthNumber = Integer.parseInt(month);
            System.out.print("Enter your birtday day: ");
            String day = scanner.next();
            int dayNumber = Integer.parseInt(day);
            LocalDate a = LocalDate.of(yearNumber, monthNumber, dayNumber);
            LocalDate b = LocalDate.now();
            if (a.isAfter(b)) {
                throw new InvalidBirthdayException("Invalid data");
            }
            System.out.println(a);

        } catch (InputMismatchException a) {
            System.out.println("Invalid input");
        } catch (DateTimeException b) {
            System.out.println("Invalid data");
        } catch (InvalidBirthdayException c) {
            System.out.println(c.getMessage());
        }

    }
}
