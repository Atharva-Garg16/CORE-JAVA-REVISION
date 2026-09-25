import java.util.Scanner;

public class Recurse
{
    // function calling itself
    static int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        return n * factorial(n-1);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number greater than or equal to 0: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}

