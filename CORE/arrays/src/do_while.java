import java.util.Scanner;

public class do_while
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        do{
            System.out.println("ENTER EXIT TO EXIT");
            str=sc.nextLine();
        }
        while (!str.equals("EXIT"));
        System.out.println("successfuly exited");
    }
}
