package az.atlacademy.games;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let the game begin!");

        String[][] eventsList = eventsFill();
        int randomNumber = (int) (Math.random() * eventsList.length);
        String event = eventsList[randomNumber][0];
        int eventYear = Integer.parseInt(eventsList[randomNumber][1]);
        String name;
        do {
            System.out.print("Enter your name: ");
            name = scanner.next();
        } while (name.isEmpty());
        int[] userGuesses = new int[100];
        int count = 0;
        while (true) {
            System.out.print("When did the "+event+": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            int gamer = scanner.nextInt();
            userGuesses[count++] = gamer;
            if (gamer < eventYear) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (gamer > eventYear) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        Arrays.sort(userGuesses, 0, count);
        System.out.print("Your numbers: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(userGuesses[i] + " ");
        }
    }

    private static String[][] eventsFill() {
        return new String[][]{
                {"World War II", "1939"},
                {"Apollo 11 moon landing", "1969"},
                {"Falling of the Berlin Wall", "1989"},
                {"First iPhone release", "2007"},
                {"Discovery of America by Columbus", "1492"},
                {"Invention of the printing press", "1440"},
                {"Attack on Pearl Harbor", "1941"},
                {"Assassination of John F. Kennedy", "1963"},
                {"The Beatles' first appearance on The Ed Sullivan Show", "1964"},
                {"First successful heart transplant", "1967"},
                {"First electric light bulb", "1879"},
                {"Publication of Isaac Newton's Principia Mathematica", "1687"},
                {"End of the Korean War", "1953"},
                {"End of the Vietnam War", "1975"},
                {"Death of Princess Diana", "1997"},
                {"First successful airplane flight by the Wright brothers", "1903"},
                {"Invention of the telephone by Alexander Graham Bell", "1876"},
                {"First Olympic Games held in Athens, Greece", "1896"},
                {"First successful kidney transplant", "1954"},
                {"First nuclear bomb test", "1945"},
                {"First color television broadcast", "1954"},
                {"First successful polio vaccine", "1955"},
                {"First successful human genome sequencing", "2003"},
                {"First successful cloning of a mammal (Dolly the sheep)", "1996"},
                {"First successful spacewalk by Alexei Leonov", "1965"},
                {"Discovery of penicillin by Alexander Fleming", "1928"},
                {"First successful organ transplant (liver)", "1967"},
                {"First successful use of insulin to treat diabetes", "1922"},
                {"First successful unmanned mission to Mars (Viking 1)", "1976"},
                {"First successful human mission to the Moon (Apollo 8)", "1968"},
                {"Publication of Charles Darwin's On the Origin of Species", "1859"},
                {"First successful artificial heart transplant", "1982"},
                {"First successful lung transplant", "1963"},
                {"First successful bone marrow transplant", "1956"},
                {"First successful gene therapy treatment", "1990"},
                {"First successful cochlear implant", "1957"},
                {"First successful liver transplant", "1963"},
                {"First successful heart-lung transplant", "1981"},
                {"First successful human kidney dialysis", "1945"},
                {"First successful in vitro fertilization (IVF)", "1978"},
                {"First successful pacemaker implantation", "1958"},
                {"First successful laser eye surgery", "1987"},
                {"First successful MRI scan of the human body", "1977"},
                {"First successful CT scan of the human body", "1972"},
                {"First successful PET scan of the human body", "1975"},
                {"First successful heart bypass surgery", "1960"},
                {"First successful hip replacement surgery", "1960"},
                {"Pope John Paul II elected", "1978"},
                {"Vietnam War ends", "1975"},
                {"Mandela released from prison", "1990"},
                {"Facebook launched", "2004"},
                {"O.J. Simpson murder trial verdict", "1995"},
                {"The Titanic sinks", "1912"},
                {"Hurricane Katrina hits New Orleans", "2005"},
                {"Saddam Hussein captured", "2003"},
                {"Israel founded", "1948"},
                {"Great Depression begins", "1929"},
                {"Higgs boson particle discovered", "2012"},
                {"Cloning of Dolly the sheep", "1996"},
                {"The Simpsons premieres", "1989"},
                {"Star Wars released", "1977"},
                {"Death of Princess Diana", "1997"},
                {"Russia annexes Crimea", "2014"},
                {"Hurricane Andrew hits Florida", "1992"},
                {"Challenger Space Shuttle disaster", "1986"},
                {"Ebola outbreak in West Africa", "2014"},
                {"First mammal cloned", "1997"},
                {"The Wizard of Oz released", "1939"},
                {"Mount St. Helens eruption", "1980"},
                {"Columbine High School shooting", "1999"},
                {"First U.S. presidential debate", "1960"},
                {"The Great Chicago Fire", "1871"},
                {"First satellite launched into space", "1957"},
                {"Prince Charles and Lady Diana marry", "1981"},
                {"Kent State University shooting", "1970"},
                {"First African-American president elected", "2008"},
                {"First heart transplant", "1967"},
                {"The Berlin Wall is built", "1961"},
                {"Olympic Games in Munich attacked", "1972"},
                {"The Beatles break up", "1970"},
                {"Indian independence from Britain", "1947"},
                {"Enron scandal uncovered", "2001"},
                {"Death of John F. Kennedy", "1963"},
                {"Cuban Missile Crisis", "1962"},
                {"London Bridge sold to U.S. buyer", "1968"},
                {"Largest earthquake in U.S. history", "1964"},
                {"NASA's Voyager 1 reaches interstellar space", "2012"},
                {"John Glenn becomes first American to orbit Earth", "1962"},
                {"Tiananmen Square protests", "1989"},
                {"Invention of the World Wide Web", "1989"},
                {"Discovery of King Tut's tomb", "1922"},
                {"Chernobyl nuclear disaster", "1986"},
                {"Assassination of Martin Luther King Jr.", "1968"},
                {"First commercial flight around the world", "1947"},
                {"Assassination of Julius Caesar", "-44"}
        };
    }
}

