import java.util.Scanner;

public class Armstrong {
    public static int count(int number){
        int k=0;
        while (number!=0){
            k++;
            number/=10;
        }
        return k;
    }
    public static boolean isArmstrong(int digits , int number){
        int copy=number;
        int sum=0;
        while (number!=0){
            sum+=(int)Math.pow((number%10),digits);
            number/=10;
        }
        return sum == copy;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number to check armstrong or not ");
        int number= scanner.nextInt();
        if (isArmstrong(count(number),number)){
            System.out.println(number+" is armstrong");
        }
        else System.out.println(number+ " is not an armstrong number");
    }
}
