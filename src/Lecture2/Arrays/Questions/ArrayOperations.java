package Lecture2.Arrays.Questions;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        
        // Calculate all operations
        int sum = findSum(arr);
        long product = findProduct(arr);
        int max = findMax(arr);
        int min = findMin(arr);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    private static int findSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    private static long findProduct(int[] arr) {
        long product = 1;
        for(long ele : arr){
            product *= ele;
        }
        return product;
    }

    private static int findMin(int[] arr) {
        // int min = arr[0];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
