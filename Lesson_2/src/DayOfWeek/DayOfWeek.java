package DayOfWeek;

public enum DayOfWeek {
    MONDAY ("Понедельник", 40), TUESDAY ("Вторник", 32), WEDNESDAY ("Среда", 24), THURSDAY ("Четверг", 16), FRIDAY ("Пятница", 8),
    SATURDAY("Суббота", 0), SUNDAY("Воскресенье", 0);

    private String name;
    private int hours;

    DayOfWeek (String name, int hours){
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }
}