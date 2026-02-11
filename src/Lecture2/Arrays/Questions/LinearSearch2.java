package Lecture2.Arrays.Questions;

import java.util.Scanner;

public class LinearSearch2 {

    public static void linearSearch(int[] arr, int target){
        boolean flag = false; // false means target doesn't exist in array
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                System.out.println("Target Found at index " + i);
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("Target not found");
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

        linearSearch(arr,target);
    }
}
