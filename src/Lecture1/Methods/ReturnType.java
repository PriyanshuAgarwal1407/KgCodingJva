package Lecture1.Methods;

public class ReturnType {
    public static int sum(int a, int b){
        return a + b;
        // System.out.println();  // it will show error as non statement will be executed after return
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int x = sum(31,25,56);
        System.out.println("Sum: " + x);

        System.out.println("Sum: " + sum(31,25));
    }
}
