package ru.stqa.dim;

public class Point {
  public double x;
  public double y;

 public Point(double x1, double x2, double y1, double y2) {

   this.x = (x2 - x1) * (x2 - x1);
   this.y = (y2 - y1) * (y2 - y1);

  }

  public double sum(){

    return Math.sqrt(x + y);
  }


}

