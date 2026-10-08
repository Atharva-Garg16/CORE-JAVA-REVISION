package Enums;

public class TestingDaysOfWeek {
    public static void main(String[] args) {
        DaysOfWeek[] daysOfWeek=DaysOfWeek.values();
        for(DaysOfWeek day:daysOfWeek){
            System.out.println(day+"--> "+day.getDayOfWeek());
        }
        String s1="MONDAY";
        DaysOfWeek d1=DaysOfWeek.valueOf(s1);
        // valueOf() function converts value to DaysOfWeek type, Remind Integer.valueOf("1")...


    }
}
