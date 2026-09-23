public class DeletionOfElement {
    static int count(int[]arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,3,2,1,2,3,4,5,6,78,91,1,2,3,1,2,3};
        // we want to delete element 3
        // step 1 count occurrence of digit
        // step 2 create new array of size == sizeOfArray-count
        // skip that value and fill to new array
        int res[]=new int[arr.length-count(arr,1)];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                res[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}
