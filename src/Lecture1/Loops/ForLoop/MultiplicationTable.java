package Lecture1.Loops.ForLoop;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        int n = sc.nextInt();

        System.out.println("Table of " + n + ":");
        for(int i = 1; i <= 10; i++) System.out.printf("%d x %2d = %3d%n", n, i, n * i);
        sc.close();
    }
}
