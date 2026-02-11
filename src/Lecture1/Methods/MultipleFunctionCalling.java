package Lecture1.Methods;

public class MultipleFunctionCalling {
    public static void main(String[] args) {
        countryA();
    }
    public static void countryA(){
        System.out.println("India");
        countryB();
    }
    public static void countryB(){
        System.out.println("USA");
        countryC();
    }
    public static void countryC(){
        System.out.println("Brazil");
    }
}
