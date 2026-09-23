import java.util.Scanner;

public class SumOf2D {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows= scanner.nextInt();
        System.out.println("enter number of columns");
        int columns= scanner.nextInt();
        int [][]arr=new int[rows][columns];
        int sum=0;
        for (int i=0; i<rows;i++){
            for (int j=0;j<columns;j++){
                arr[i][j]=scanner.nextInt();
                sum+=arr[i][j];
            }
        }
        System.out.println("sum of array is "+ sum);
        double average=sum/ (rows*columns*1.0);
        System.out.println("average of elements of array is" + average);
    }
}
