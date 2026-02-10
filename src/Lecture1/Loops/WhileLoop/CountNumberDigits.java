package Lecture1.Loops.WhileLoop;

import java.util.Scanner;
public class CountNumberDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        int temp = number;
        int reversed = 0;
        while(temp != 0){
            int lastDigit = temp % 10;
            temp /= 10;
            count++;
        }
        System.out.println("Total count of digit in " + number + " is: " + count);
        sc.close();
    }
}
