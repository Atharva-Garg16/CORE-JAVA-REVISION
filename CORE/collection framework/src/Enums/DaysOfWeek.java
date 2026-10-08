package Enums;

public enum DaysOfWeek {
    MONDAY("Somwaar"),
    TUESDAY("Mangalwaar"),
    WEDNESDAY("Budhwaar"),
    THURSDAY("Guruwaar"),
    FRIDAY("Shukrawaar"),
    SATURDAY("Shaiwaar"),
    SUNDAY("Ravivaar");
    private String dayOfWeek;
    private DaysOfWeek(String daysOfWeek){
        this.dayOfWeek=daysOfWeek;
    }/// constructor private??
    public String getDayOfWeek() {
        return dayOfWeek;
    }
}

