package Lecture1.Methods;

import java.util.Scanner;
public class PassingArguments {
    public static void max(int a, int b, int c){
        if(a>=b && a>=c) System.out.println(a + " is largest");
        else if(b>=c && b>=a) System.out.println(b + " is largest");
        else System.out.println(c + " is largest");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a,b,c);
        sc.close();
    }
}
