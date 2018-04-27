package ru.stqa.dim;

public class MySecondProgram {

  public static void main(String[] args) {

    double x1 = 5.0;
    double x2 = 4.0;
    double y1 = 3.0;
    double y2 = 6.0;

    Point dist = new Point(x1, x2, y1, y2);

    System.out.println(dist.sum());

  }
}
