import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= scanner.nextInt();
        int []arr=new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            System.out.println("enter element ");
            arr[i]= scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println("sum of the elements is "+ sum);


    }
}
