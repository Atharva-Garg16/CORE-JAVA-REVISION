import java.util.Scanner;

public class evenOddBitwise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        if ((num&1)==1) System.out.println("odd");
        else System.out.println("even");
    }
}
