import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t= sc.nextDouble();
        double ci=Math.pow(p*(1/r +100),t);
        System.out.println(ci);
    }
}
