package com.mavy0313.patterns.head_first.chapter8.template.method;

public class Coffee extends CaffeineBeverage {
  @Override
  void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding sugar and milk");
  }

  @Override
  public boolean customerWantsCondiments() {
    System.out.println("Would you like milk and sugar with your coffee (y/n)?");
    return getUserInput().toLowerCase().startsWith("y");
  }
}
