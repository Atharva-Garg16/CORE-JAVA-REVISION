import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1= scanner.nextInt();
        int reverse=0;
        while (num1!=0){
            reverse=reverse*10+(num1%10);
            num1/=10;
        }
        System.out.println(reverse);
    }
}
