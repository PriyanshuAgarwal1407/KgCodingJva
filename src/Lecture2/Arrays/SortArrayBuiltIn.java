package Lecture2.Arrays;

import Lecture2.Arrays.Questions.ArrayUtility;
import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // sort - ascending order
        int[] arr = ArrayUtility.inputArray();
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        System.out.println("Sorted Array is:");
        ArrayUtility.displayArray(arr);
    }
}
