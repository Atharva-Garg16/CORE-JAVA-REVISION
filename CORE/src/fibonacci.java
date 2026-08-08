import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int t1= 1;
        int t2= 1;
        System.out.println("enter the term till you want to print");
        int N= scanner.nextInt();
       int x;
        System.out.print("1,1,");
       for (int i=1; i<=N-2; i++){
           int fib=t1+t2;
           x=t1;
           t1=fib;
           t2=x;
           System.out.print(fib+",");
       }

    }
}
