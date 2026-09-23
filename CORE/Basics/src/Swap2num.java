import java.util.Scanner;

public class Swap2num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int swap=num1;
        num1=num2;
        num2=swap;
        System.out.println(" new value of number are " + num1+ "  "+ num2);

    }
}
