import java.util.Scanner;

public class SearchElement2D {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows= scanner.nextInt();
        System.out.println("enter number of columns");
        int columns= scanner.nextInt();
        int [][]arr=new int[rows][columns];
        for (int i=0; i<rows;i++){
            for (int j=0;j<columns;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("enter element you want to search");
        int target=scanner.nextInt();
        boolean b=true;
        for (int i=0; i<rows;i++){
            for (int j=0;j<columns;j++){
                if (arr[i][j]==target){
                b=false;
                    System.out.println("target deliberated at "+ i + " row and " + j+ " column");
                break;
                }
            }
        }
        if(b)System.out.println("target not found");


    }
}
