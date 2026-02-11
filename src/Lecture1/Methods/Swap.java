package Lecture1.Methods;

import java.util.Scanner;

//public class Swap {
//    public static void swap(int x, int y){
//        int temp = x;
//        x = y;
//        y = temp;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a + " " + b);
//        swap(a,b);
//        System.out.println(a + " " + b);
//    }
//}

// This above method use pass by value, not by reference. This means any changes made to x and y inside the
// swap() method don't affect the original a and b variables in main().


//public class Swap {
//    public static int[] swap(int x, int y){
//        int temp = x;
//        x = y;
//        y = temp;
//        return new int[]{x, y};
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a + " " + b);
//        int[] result = swap(a, b);
//        a = result[0];
//        b = result[1];
//        System.out.println(a + " " + b);
//    }
//}

public class Swap {
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " " + b);
        swap(a,b);
        sc.close();
    }
}

