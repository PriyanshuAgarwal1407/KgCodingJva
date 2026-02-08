package Lecture1.Loops.ForLoop;

import java.util.Scanner;
public class GeometricProgressionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int term = a;
        int sum = 0;

        System.out.print("\nGeometric Progression: ");
        for (int i = 1; i < n; i++) {
            System.out.print(term + " ");
            sum += term;
            term *= r;  // next term
        }
        System.out.println("\nSum of G.P. = " + sum);
        sc.close();
    }
}
