import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age");
        int age = input.nextInt();
        String voteEligible=age>18?"yes":"no";
        System.out.println(voteEligible);
    }
}
