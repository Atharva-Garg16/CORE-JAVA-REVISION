import java.util.Scanner;

public class test {
    static void main() {
        int i=0b101;
        System.out.println(i);
        int[]ar={1,2,3,4,5,6,7,8,9};
        int[]ar1=new int[ar.length];
        ar1=ar;
        ar1[2]=67;
        for (int j = 0; j < ar.length; j++) {
            System.out.print(" "+ar[j]);
            // shallow copy
        }

    }
}
