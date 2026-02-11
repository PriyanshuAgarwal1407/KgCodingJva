package Lecture1.Methods;

// Java is strictly pass-by-value — object references are passed by value,
// so method changes affect the object’s state but not the reference itself.

public class PassByValueAndReference {
    public static void change(int x){
        x = 10;
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
