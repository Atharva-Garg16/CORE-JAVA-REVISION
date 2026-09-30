package Static_inner_class;

import java.util.Arrays;

public class ArrayOperations {
    // as inner class will be static it's associated with outer class not just by an object of outer class
    public static class  Stats {

        public double getMean(int[]arr) {
            double sum=0;
            for (int a:arr) {
                sum+=a;
            }
            return sum/arr.length;

        }
        public double median(int[] arr) {
            Arrays.sort(arr);
            if (arr.length % 2 == 0) {
                return (arr[arr.length/2] + arr[arr.length/2-1]) / 2.0;
            }
            return arr[arr.length/2];
        }
    }
}
class TestClass {
    public static void main(String[] args) {
        ArrayOperations.Stats stats = new ArrayOperations.Stats();
        System.out.println(stats.getMean(new int[]{1,2,3,4,5,6,7,8}));
        System.out.println(stats.median(new int[]{1,2,3,4,5,6,7,8}));
    }
}
