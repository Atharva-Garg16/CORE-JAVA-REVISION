import java.util.Scanner;

public class Finally_block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            throw  new ArithmeticException("zero as denominator");
        }
        finally {
            System.out.print("it runs always weather exception caught or thrown");
            System.out.println("\nuse to prevent resource leakage ");
        }
    }
}
