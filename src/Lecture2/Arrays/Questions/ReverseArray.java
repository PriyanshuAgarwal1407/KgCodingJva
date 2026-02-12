package Lecture2.Arrays.Questions;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        reverse(arr);
        System.out.println("Your reversed array is:");
        ArrayUtility.displayArray(arr);
    }

    public static void reverse(int[] arr){
        int i = 0, j = arr.length-1;
        while(i< arr.length/2){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
