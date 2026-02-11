package Lecture1.Loops.ForLoop;

import java.util.Scanner;
public class Exponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();

        int pow = 1;
        for(int i = 1; i<= b; i++) pow *= a;
        System.out.println(a + " raised to the power " + b + " is " + pow);
        sc.close();
    }
}
