import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day=input.nextInt();
        String output=switch (day){
            case 1-> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            case 7-> "Sunday";
            default -> "not valid weekday";
        };
        System.out.println(output);
    }
}
