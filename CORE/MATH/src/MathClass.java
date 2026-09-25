import java.util.Scanner;

public class MathClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(Math.PI);
        System.out.println(Math.E);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(Math.pow(a,b));
        System.out.println(Math.abs(a-b));
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
        System.out.println(Math.sqrt(16.0));
        System.out.println(Math.random());// random no from [0,1)
        System.out.println(Math.round(a));

    }
}
