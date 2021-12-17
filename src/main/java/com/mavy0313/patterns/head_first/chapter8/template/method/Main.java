package com.mavy0313.patterns.head_first.chapter8.template.method;

public class Main {
  public static void main(String[] args) {
    Tea tea = new Tea();
    tea.prepareRecipe();

    Coffee coffee = new Coffee();
    coffee.prepareRecipe();
  }
}
