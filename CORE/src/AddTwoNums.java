import java.util.Scanner;


public class AddTwoNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS FOR ADDITION");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println(num1+num2 +" is the sum ");
        //System.out.println(" is the sum "+num1+num2 ); see string catenation
    }
}
