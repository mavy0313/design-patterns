package com.mavy0313.patterns.head_first.chapter8.template.method;

public class Tea extends CaffeineBeverage {
  @Override
  void brew() {
    System.out.println("Steeping the tea");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding lemon");
  }

  @Override
  public boolean customerWantsCondiments() {
    System.out.println("Would you like lemon with your tea (y/n)?");
    return getUserInput().toLowerCase().startsWith("y");
  }
}
