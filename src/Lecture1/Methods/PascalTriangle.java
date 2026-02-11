package Lecture1.Methods;

import java.util.Scanner;
public class PascalTriangle {
    public static int fact(int x){
        int f = 1;
        for(int i = 1; i <= x; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int a  = sc.nextInt();
        for (int i = 0; i <= a-1; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j <= i; j++) {
                int icj = fact(i)/(fact(j)*fact(i-j));
                System.out.print(icj + "   ");
            }
            System.out.println();
        }
        sc.close();
    }
}