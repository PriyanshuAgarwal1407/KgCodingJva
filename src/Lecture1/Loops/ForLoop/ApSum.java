package Lecture1.Loops.ForLoop;

// Sum of n terms
// Sn = (n / 2) * [2a + (n - 1) * d]

import java.util.Scanner;
public class ApSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        System.out.println("\nSum of AP is: " + sum);

        sc.close();
    }
}
