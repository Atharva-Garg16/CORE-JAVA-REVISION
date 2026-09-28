package com.Test1;

public class Check {


    // public class accessed anywhere
    A app =new A();
    // default class package specific
    static void main() {
        Test test5 =new Test();
        test5.age=15;
        test5.name="A";
        test5.roll="072";
//        test5.account=123; account' has private access in 'com.Test1.Test'
    }



}
