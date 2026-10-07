package VarArgs;

public class VarArgs {
    static int sum(int k,int ...a){
        int sum=k;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    static int maxi(int []a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
//    static int maxi(int... a) maxi(int[]) is already defined in 'VarArgs.VarArgs'

    static void main() {
        /**var args mean variable number of arguments
         * internally its also treated as array only declared using (...) introduced in java 5
         * Its needed because array leads to wastage of memory and complex declaration*/
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println(maxi(new int[]{1,2,3,4,5,6,7,8,9,10}));


    }
}
