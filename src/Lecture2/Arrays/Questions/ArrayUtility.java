package Lecture2.Arrays.Questions;

import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


