import java.util.Scanner;

public class positiveNegZEro
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        if (num>0){
            System.out.println("+ve");
        }
        else if (num<0){
            System.out.println("-ve");
        }
        else System.out.println("0");

    }

}
