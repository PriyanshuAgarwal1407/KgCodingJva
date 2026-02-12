package Lecture1.Loops;

public class ContinueStatement {
     public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
