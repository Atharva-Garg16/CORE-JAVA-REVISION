import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        boolean b=false;
        for (int i=2 ; i<num;i++){
            if (num%i==0){
                b=true; break;
            }
        }
        if (b || num==1){
            System.out.println(num + " is not prime");
        }
        else System.out.println(num+" is prime");
    }
}
