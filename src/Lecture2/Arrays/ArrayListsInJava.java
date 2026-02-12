package Lecture2.Arrays;

/*
ArrayList:
    ArrayList is a non-synchronized dynamic array.

Key Features:
    Allows duplicate elements
    Maintains insertion order
    Not thread-safe (not synchronized)
    Faster than Vector in single-threaded scenarios
    Introduced in Java 1.2
 */

import java.util.ArrayList;
public class ArrayListsInJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.get(2));    // list[2]
        list.set(3,50);                     // list[3] = 50
        System.out.println(list.get(3));

        System.out.println(list); // not traversing the array by ourselves
        int n = list.size(); // list.length
//        for(int i=0;i<n;i++){
//            System.out.print(list.get(i)+" ");  // 10 20 30 50 50
//        }
//        for(int ele : list){
//            System.out.print(ele+" ");  // 10 20 30 50 50
//        }

        list.add(60);
        System.out.println(list);  // [10, 20, 30, 50, 50, 60]

        list.add(1,100);
        System.out.println(list);  // [10, 100, 20, 30, 50, 50, 60]

        list.remove(2);
        System.out.println(list);  // [10, 100, 30, 50, 50, 60]

        list.removeLast();  // it is same as list.remove(list.size()-1);
        System.out.println(list);  // [10, 100, 30, 50, 50]

        // without collection reversing arrayList
        int i = 0, j = list.size()-1;
        while(i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            list.set(j, temp);
            i++;
            j--;
        }
        System.out.println(list); // [50, 50, 30, 100, 10]

//        Collections.reverse(list);
//        System.out.println(list);  // [50, 50, 30, 100, 10]

        // HW -> {3,5,2,0,7} + {9,2,1} = {3,6,1,2,8}
    }
}
