package Lecture1.Loops.ForLoop;

// Print AP Without Math Formula (Naive Method)
import java.util.Scanner;
public class ApNoFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("\nAP Series:");
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            a += d;
        }
        sc.close();
    }
}
