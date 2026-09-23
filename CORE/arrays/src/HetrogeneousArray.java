public class HetrogeneousArray {
    public static void main(String[] args) {
        int[][]arr=new int[5][];
        arr[0]= new int[]{1, 2, 3};
        arr[1]= new int[]{4,5};
        arr[2]= new int[]{6,7,8,9,10};
        arr[3]= new int[]{11};
        arr[4]= new int[3];// By default assignment its {0,0,0}
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.print("\b");
            System.out.println();
        }
    }
}
