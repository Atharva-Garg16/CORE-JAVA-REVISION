import java.util.Scanner;


public class Perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the shape");
        String shape= sc.next();
        if (shape.equalsIgnoreCase("circle")){

            System.out.println("enter radius");
           double r= sc.nextInt();
            double pi=Math.PI;
            double circum=2*pi*r;
            System.out.println(circum);
        } else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.println("enter sides");
            int a,b,c,d;
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
            d= sc.nextInt();
            System.out.println(a+b+c+d);
        }
    }
}
