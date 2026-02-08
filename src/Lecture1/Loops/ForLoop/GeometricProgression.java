package Lecture1.Loops.ForLoop;

// General Term (nth term): an = a * r^(n-1)

import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int term = a;
        System.out.print("\nGeometric Progression: ");
        for (int i = 1; i < n; i++) {
            System.out.print(term + " ");
            term *= r;  // next term
        }

        System.out.println();

        // nth term formula
        int nthTerm = (int)(a * Math.pow(r, n - 1));
        System.out.println("The " + n + "th term of the G.P. is: " + nthTerm);
        sc.close();
    }
}
