import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String color=sc.next();
        switch (color.toLowerCase()){
            case "red":
                System.out.println("stop");
                break;
            case "yellow":
                System.out.println("ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("invalid traffic light colour");
        }
    }
}
