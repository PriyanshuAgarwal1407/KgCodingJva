package Lecture2.Arrays.Questions;

public class PrintNegativeElements {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        negativeEle(arr);
    }

    public static void negativeEle(int[] arr) {
        boolean found = false;
        System.out.print("Negative Elements: ");
        for (int element : arr) {
            if (element < 0) {
                System.out.print(element + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
    }
}