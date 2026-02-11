package Lecture2.Arrays.Questions;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find occurrence: ");
        int n = sc.nextInt();

        countOccurrence(n,arr);
    }

    public static int countOccurrence(int n, int[] arr) {
        int count = 0;
        for(int ele : arr){
            if(ele==n){
                count++;
            }
        }
        System.out.printf("%d is found in array %d times", n , count);
        return count;
    }
}
