package Lecture1.Loops.WhileLoop;

import java.util.Scanner;
public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum Calculator (enter 0 to stop)");
        int number, sum = 0;

        System.out.print("Enter numbers (0 to stop): ");
        number = sc.nextInt();

        while (number != 0) {
            sum += number;
            System.out.print("Enter next number (0 to stop): ");
            number = sc.nextInt();
        }
        System.out.println("Total sum: " + sum);
        sc.close();
    }
}
