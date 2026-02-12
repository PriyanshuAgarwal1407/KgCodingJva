package Lecture1.Loops;

public class BreakStatement {
    public static void main(String[] args) {
        System.out.println("Numbers 1 to 10, but stop at 6:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
