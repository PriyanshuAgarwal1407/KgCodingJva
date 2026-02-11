package Lecture2.Arrays.Questions;

import java.util.Scanner;

public class DeletingSpecificElement {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to delete from array: ");
        int n = sc.nextInt();

        int[] num = deleteArray(arr,n);
        System.out.println("\nThis is your new array: ");
        ArrayUtility.displayArray(num);
    }

    public static int[] deleteArray(int[] arr, int n) {
        int occ = Occurrence.countOccurrence(n, arr);
        if(occ == 0){
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while(i < arr.length){
            if(arr[i] != n){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
