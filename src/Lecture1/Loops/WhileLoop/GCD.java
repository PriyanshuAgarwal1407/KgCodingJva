package Lecture1.Loops.WhileLoop;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int gcd = 1;
        int i = 2;
        int least;

        if(first > second) least = first;
        else least = second;

        while(i <= least){
            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        System.out.print("GCD of " + first + " and " + second + " is: " + gcd);
        sc.close();
    }
}
