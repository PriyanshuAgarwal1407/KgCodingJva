package Lecture2.Arrays;

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Array Size
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // n size ka array ban gaya

        // Input Array Elements
        System.out.print("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Output Array Elements
        System.out.print("\nArray Elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nSquare of Array Elements: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]*arr[i]+" ");
        }
    }
}

// Note: In array we generally use for-each loop