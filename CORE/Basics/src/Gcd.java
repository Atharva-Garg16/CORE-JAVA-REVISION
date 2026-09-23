import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter greater number");
        int num1=scanner.nextInt();
        System.out.println("enter smaller number");
        int num2= scanner.nextInt();
        for (int i=1; ;i++){
            if (num1%num2==0){
                System.out.println("the hcf is "+num2); break;
            }
            else {
                int x=num1;
                num1=num2;
                num2=x%num2;
            }
        }
    }
}
