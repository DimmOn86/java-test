package ru.stqa.dim;

public class MyFirstProgram1 {


    public static void main(String[] args) {

        hello();

        Square s = new Square(5);
        System.out.println("Площадь квадрата со сторойной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(4,6);

        System.out.println("Произведение чисел " + r.a + " и " + r.b + " = " + area(r));

    }

    public static void hello(){
        System.out.println("Hello, world!");
    }

    public static double area(Square s){
      return s.l * s.l;
    }

    public static double area(Rectangle r){
      return r.a * r.b;
    }

}
