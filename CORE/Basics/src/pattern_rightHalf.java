import java.util.Scanner;

public class pattern_rightHalf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n= scanner.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
