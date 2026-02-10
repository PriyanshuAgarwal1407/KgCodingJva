package Lecture1.Loops.WhileLoop;

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int reversed = 0;
        while(temp != 0){
            int lastDigit = temp % 10;
            reversed = reversed*10 + lastDigit;
            temp /= 10;
        }
        if(reversed == n) System.out.println(n + " is a palindrome number.");
        else System.out.println(n + " is not a palindrome number.");
        sc.close();
    }
}
