import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int num2=num;
        int sum=0;
        while (num!=0){
           sum+=(num%10);
           num/=10;
        }
        System.out.println("the sum of digits of "+ num2 + " = "+ sum);
    }
}
