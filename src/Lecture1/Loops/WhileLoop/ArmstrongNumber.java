package Lecture1.Loops.WhileLoop;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = number;
        while(temp > 0){
            count++;
            temp /= 10;
        }

        int result = 0;
        int remainder = 0;
        while(temp != 0){
            remainder = temp % 10;
            result += Math.pow(remainder, count);
            temp /= 10;
        }
        if(result == number) System.out.println(number + " is Armstrong number.");
        else System.out.println(number + " is not Armstrong number.");
        sc.close();
    }
}
