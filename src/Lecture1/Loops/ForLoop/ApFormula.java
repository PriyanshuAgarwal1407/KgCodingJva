package Lecture1.Loops.ForLoop;

// Print AP With Math Formula
import java.util.Scanner;
public class ApFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("\nAP Series using formula:");
        for (int i = 1; i <= n; i++) {
            int term = a + (i - 1) * d;     // Tn = a + (n-1)d
            System.out.print(term + " ");
        }
        sc.close();
    }
}
