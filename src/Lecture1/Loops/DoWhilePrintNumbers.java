package Lecture1.Loops;

import java.util.Scanner;
public class DoWhilePrintNumbers {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);

        System.out.println();
        sc.close();
    }
}
