package ru.stqa.dim;

import java.util.ArrayList;
import java.util.List;

public class Collections {

  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"};


    for(String l : langs){
      System.out.println("Я хочу выучить " + l);
    }
  }
}
