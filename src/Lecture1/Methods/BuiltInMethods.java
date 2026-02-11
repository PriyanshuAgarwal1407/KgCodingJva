package Lecture1.Methods;

public class BuiltInMethods {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.min(4,8));
        System.out.println(Math.max(40,8));
        System.out.println(Math.abs(-5));
        System.out.println(Math.floor(-3.1));
        System.out.println(Math.ceil(-3.1));
        System.out.println(Math.sqrt(12.4));
        System.out.println(Math.cbrt(1000));
        System.out.println(Math.PI);
        System.out.println(Math.pow(0,0));  // In Java, Math.pow(0,0) returns 1.0 as per IEEE 754 standard.

        System.out.println();
        int a = 4, b = 8, c = -8;
        System.out.println(Math.min(a,Math.min(b,c)));
    }
}
