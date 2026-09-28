package com.example.utils;
//import com.example.geometry.*; not recommended practise (importing all at once)

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    static void main() {
        Circle circle=new Circle(5.5);
        Rectangle rectangle=new Rectangle(10,5);
        double circArea=Math.PI*Math.pow(circle.radius,2);
        double rectArea=rectangle.length*rectangle.breadth;
        System.out.printf("\nArea of circle: %f\n",circArea);
        System.out.printf("\nArea of rectangle: %f\n",rectArea);
    }
}
