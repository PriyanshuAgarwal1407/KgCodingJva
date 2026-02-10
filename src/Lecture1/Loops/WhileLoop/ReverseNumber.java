package Lecture1.Loops.WhileLoop;

import java.util.Scanner;
public class ReverseNumber {
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
        System.out.println("Reverse of number " + n + ": " + reversed);
        sc.close();
    }
}
