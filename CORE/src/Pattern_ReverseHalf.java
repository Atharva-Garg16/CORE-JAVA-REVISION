import java.util.Scanner;

public class Pattern_ReverseHalf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        for (int i=num;i>=1;i--){
            for (int j=num;j>=num-i+1;j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
