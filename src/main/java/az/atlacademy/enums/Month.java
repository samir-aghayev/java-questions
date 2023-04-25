package az.atlacademy.enums;

public enum Month {
    January(31, "Winter"),
    February(28, "Winter"),
    March(31, "Spring"),
    April(30, "Spring"),
    May(31, "Spring"),
    June(30, "Summer"),
    July(31, "Summer"),
    August(31, "Summer"),
    September(30, "Autumn"),
    October(31, "Autumn"),
    November(30, "Autumn"),
    December(31, "Winter");

    private final int monthDay;
    private final String season;

    Month(int monthDay, String season) {
        this.monthDay = monthDay;
        this.season = season;
    }

    public static void main(String[] args) {
        System.out.println(Month.April.monthDay);
        System.out.println(Month.April.season);
        System.out.println(Month.August);
    }
}
