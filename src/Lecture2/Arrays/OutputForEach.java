package Lecture2.Arrays;

public class OutputForEach {
    public static void main(String[] args) {
        int[] arr = {4,1,6,78,31,13};

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        for(int ele : arr){
            System.out.print(ele +" ");
        }

        System.out.println();

//        for(int i=0;i<arr.length;i++){
//            arr[i] *= 2;
//            System.out.print(ele +" ");
//        }

        for(int ele : arr){
            ele *= 2;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        // for-each loop does not modify element it only passes copy
    }
}
