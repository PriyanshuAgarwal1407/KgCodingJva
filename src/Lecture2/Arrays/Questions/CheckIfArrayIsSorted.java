package Lecture2.Arrays.Questions;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean result = isSorted(arr);
        System.out.print("Array is sorted: " + result);
    }

    private static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
