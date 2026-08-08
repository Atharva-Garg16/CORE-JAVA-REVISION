import java.util.Scanner;

public class SumOf2diagonalMatrix {
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
               if(i==j || i+j==rows-1){
                   sum+=arr[i][j];
               }
            }}

        System.out.println(sum);
    }
}
