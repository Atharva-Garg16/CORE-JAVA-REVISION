import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the greater number");
        int num1= scanner.nextInt();
        int k=num1;
        System.out.println("enter smaller number");
        int num2= scanner.nextInt();
        for (int i=2; i<=num2+1 ;i++){
            if (num1%num2==0){
                System.out.println("the lcm of "+k +" and "+(num2)+ "="+ num1);
                break;
            }
            else num1=k*i;
        }

    }
}

