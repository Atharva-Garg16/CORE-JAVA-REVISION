import java.util.Scanner;

public class OddEve
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int nu=scanner.nextInt();
        if (nu%2==0) System.out.println("even");
        else System.out.println("odd");
    }
}
