import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your %age");
        int percent= scanner.nextInt();
        if (percent>100){
            System.out.println("padhai chad de khote de puttar");
        }
        else{
            if (percent>90){
                System.out.println("Good job");
            }
            else {
                if (percent>80){
                    System.out.println("average");
                }
                else if (percent>70){
                    System.out.println("padhle 😠");
                }
                else System.out.println("fail 🤬");
            }

        }

    }
}
