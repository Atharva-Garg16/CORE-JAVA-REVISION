package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapArrListMembers {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(arr.toString());
        swap(arr,0,5);// type cast
        System.out.println(arr.toString());
    }
    static  void swap(List arr, int i, int j){
        int temp = (int)arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
