package Lecture2.Arrays.Questions;

import java.util.Scanner;
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int result = linearSearch(arr, target);

        if (result == -1)
            System.out.println("Element " + target + " not found in the array");
        else
            System.out.println("Element " + target + " found at index " + result);
    }
}
