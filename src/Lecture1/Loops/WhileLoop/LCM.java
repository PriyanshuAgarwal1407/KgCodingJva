package Lecture1.Loops.WhileLoop;

// LCM of two or more numbers is the smallest positive number that is exactly divisible by all of them.

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int i = 1;
        int lcm = 0;

        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                lcm = factor;
                break;
            }
            i++;
        }

        System.out.println("LCM of the two numbers is: " + lcm);
        sc.close();
    }
}
