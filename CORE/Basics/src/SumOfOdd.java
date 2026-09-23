import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        for (int i=1; i<=num; i+=2){
            System.out.print(i + " ");
        }
    }
}
