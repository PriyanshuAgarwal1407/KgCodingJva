package Lecture2.Arrays.Questions;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = ArrayUtility.inputArray();
        int[] b = ArrayUtility.inputArray();
        int[] c = new int[a.length + b.length];

        merge(c,a,b);
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
//        while(i<a.length && j<b.length){
//            if(a[i]<b[j]){
//                c[k] = a[i];
//                i++;
//                k++;
//            }
//            else{
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//        }
        while(i<a.length && j<b.length){
            if(a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while(i<a.length)
            c[k++] = a[i++];
        while(j<b.length)
            c[k++] = b[j++];
        ArrayUtility.displayArray(c);
    }
}

/*
Enter Array Size: 5
Enter array elements: 1 10 18 19 333
Enter Array Size: 4
Enter array elements: 7 17 22 33
 */