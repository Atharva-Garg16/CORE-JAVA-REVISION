import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter your name ");
        String name = sc.next();
        System.out.println("Good evening "+ name);
    }
}
