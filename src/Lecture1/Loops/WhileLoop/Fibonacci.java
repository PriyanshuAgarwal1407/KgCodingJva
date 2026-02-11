package Lecture1.Loops.WhileLoop;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        if (n >= 1) System.out.print(first + " ");
        if (n >= 2) System.out.print(second + " ");

        int i = 3;
        while(i <= n){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
            i++;
        }
        sc.close();
    }
}
