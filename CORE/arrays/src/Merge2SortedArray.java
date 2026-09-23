public class Merge2SortedArray {
    public static void main(String[] args) {
        System.out.println("enter the elements in ascending order");
        int []arr1=ArrayUtility.arrayInput();
        int []arr2=ArrayUtility.arrayInput();
        int[]arr3=new int[arr1.length+ arr2.length];
        int k=0;
        for (int i=0,j=0; k<arr3.length;k++)
        {
            if (i!=arr1.length && j!=arr2.length)
        {
            if (arr1[i]<arr2[j]) {
               arr3[k]=arr1[i];
               i++;
            }
            else {
                arr3[k]=arr2[j];
                j++;
        }
        }
        else if (i==arr1.length && j!=arr2.length){
                arr3[k]=arr2[j];
                j++;

            }
        else if (j==arr2.length && i!=arr1.length){
            arr3[k]=arr1[i];
             i++;
            }
    }
        System.out.println("new array is");
        for (int l=0 ;l< arr3.length;l++){
            System.out.print(arr3[l] +" ");
        }
}}
