package Lecture1.Loops.WhileLoop;

import java.util.Scanner;

public class CountDigitOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter digit to count: ");
        int digit = sc.nextInt();

        int count = 0;
        int temp = number;

        while (temp != 0) {
            int lastDigit = temp % 10;
            if(lastDigit == digit) count++;
            temp /= 10;
        }
        System.out.println("Digit " + digit + " occurs " + count + " times in " + number);
        sc.close();
    }
}
