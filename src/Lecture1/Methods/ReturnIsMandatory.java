package Lecture1.Methods;

public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(num(3));
    }

    private static int num(int a) {
        if(a < 5) return a;
        return -9;  // without this return java will show `java: missing return statement`
        // as if `if statement` fails no return statement will execute show we have to either use `else` or return
    }
}
