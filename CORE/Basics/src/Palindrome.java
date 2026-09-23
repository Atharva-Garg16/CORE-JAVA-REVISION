import java.util.Scanner;

public class Palindrome {
    public static int reverse(int num1){
        int reverse=0;
        while (num1!=0){
            reverse=reverse*10+(num1%10);
            num1/=10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        if (num==reverse(num)) System.out.println("its a palindrome");
        else System.out.println("not a palindrome");
    }
}
