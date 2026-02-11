package Lecture1.Methods;

import java.util.Scanner;
public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int w = sc.nextInt();
        int maxNo = Math.max(x,Math.max(y,Math.max(z,w)));
        System.out.printf("Maximum of %d, %d, %d and %d is: %d", x,y,z,w,maxNo);
        sc.close();
    }
}
