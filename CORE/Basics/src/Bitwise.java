import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // BITWISE OPERATIONS
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println(num1 + "OR" + num2 +"=" + (num1|num2));
        System.out.println(num1 + "AND" + num2 +"=" + (num1&num2));
        System.out.println(num1 + "xOR" + num2 +"=" + (num1^num2));
        System.out.println(num1 + "RIGHT SHIFT DIVIDES BY 2 KI POWER NUMBER AT RIGHT=" + (num1>>2));
        System.out.println(num1 + "LEFT SHIFT MULTIPLIES BY 2 KI POWER NUM AT RIGHT" + num2 +"=" + (num1<<3));
        System.out.println("not num 1 =" + ~num1);
    }
}
