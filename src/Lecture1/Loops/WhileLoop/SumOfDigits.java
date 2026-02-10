package Lecture1.Loops.WhileLoop;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n;
        int sum = 0;
        while(n != 0){
            sum = sum + n%10;
            n /= 10;
        }
        System.out.print("Sum of digits of " + num + ": " + sum);
        sc.close();
    }
}
