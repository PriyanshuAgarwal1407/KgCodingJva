package Lecture2.Arrays.Questions;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean res = palindromeArray(arr);
        if(res == true) System.out.println("Array is palindrome");
        else System.out.println("Array is not palindrome");
    }

    public static boolean palindromeArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
