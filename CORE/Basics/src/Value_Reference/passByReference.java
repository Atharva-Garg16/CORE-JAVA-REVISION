package Value_Reference;


import java.util.Arrays;

public class passByReference {
    int x;
    int y;
    public passByReference(int a,int b) {
        x = a;
        y = b;
    }
    public void move(){
        x+=5;y+=5;
        System.out.println("x= "+x+" y= "+y);
    }

    public static void modify(int[]a){
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        passByReference p1 = new passByReference(5,7);
        System.out.println("x= "+p1.x+" y= "+p1.y);
        p1.move();
        System.out.println("x= "+p1.x+" y= "+p1.y);
       int[] a={90,12,14,54,32,156,900,875,32};
       modify(a);

        System.out.println();
        for (int i : a) {
            System.out.print(i+" ");// original array modified as reference is passed not just value
        }


    }
}
