package az.atlacademy.aHappyFamilyMiniProject.enums;

public enum DayOfWeek {
    SUNDAY("do home work"),
    MONDAY("go to courses; watch a film"),
    TUESDAY("go to the gym"),
    WEDNESDAY("Travel or explore your city"),
    THURSDAY("Learn a new skill"),
    FRIDAY("Connect with friends and family, read a book"),
    SATURDAY("Attend a cultural event, spend time outdoors");
    private final String task;
    DayOfWeek(String task) {
        this.task=task;
    }

    public String getTask() {
        return task;
    }
}
