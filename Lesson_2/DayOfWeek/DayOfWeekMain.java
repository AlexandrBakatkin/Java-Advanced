package DayOfWeek;

public class DayOfWeekMain {
    public static void main (String[] args){
        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));
    }

    private static String getWorkingHours(DayOfWeek dayOfWeekEnum) {
        if (dayOfWeekEnum.getHours() == 0){
            return dayOfWeekEnum.getName() + ":" + " выходной день";
        }
        return dayOfWeekEnum.getName() + ": до конца рабочей недели " + dayOfWeekEnum.getHours() + " часов.";
    }
}