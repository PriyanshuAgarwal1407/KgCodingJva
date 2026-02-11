package Lecture2.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
//        System.out.println(arr[0].length); // 3


        // Traversal
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
