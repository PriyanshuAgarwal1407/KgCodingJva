package Lecture1.Loops.ForLoop;

import java.util.Scanner;
public class EvenOddUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Even numbers upto " + n + ":");
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\nOdd numbers upto " + n + ":");
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0) System.out.print(i + " ");
        }
    }
}
