package Lecture2.Arrays.Questions;

public class MultiplyOddIndex {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        print(arr);
        for(int i=0; i<arr.length; i++){
            if(i%2 == 1) arr[i] *= 2;
            else arr[i] += 10;
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for(int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
