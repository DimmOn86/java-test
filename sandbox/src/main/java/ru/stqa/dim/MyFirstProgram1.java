package ru.stqa.dim;

public class MyFirstProgram1 {


    public static void main(String[] args) {

        hello();
        double l = 6;
        System.out.println("Площадь квадрата со сторойной " + l + " = " + area(l));
        double a = 4;
        double b =6;
        System.out.println("Произведение чисел " + a + " + " + b + " = " + area(a,b));

    }

    public static void hello(){
        System.out.println("Hello, world!");
    }

    public static double area(double l){
      return l * l;
    }

    public static double area(double a, double b){
      return a * b;
    }

}
