package com.mavy0313.patterns.head_first.chapter8.template.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverage {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  abstract void brew();

  abstract void addCondiments();

  private void boilWater() {
    System.out.println("Boiling water");
  }

  private void pourInCup() {
    System.out.println("Pouring into cup");
  }

  boolean customerWantsCondiments() {
    return true;
  }

  String getUserInput() {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String answer = null;
    try {
      answer = bufferedReader.readLine();
    } catch (IOException e) {
      System.err.println("IO error trying to read your answer");
    }

    if (answer == null) {
      return "no";
    }

    return answer;
  }

}
