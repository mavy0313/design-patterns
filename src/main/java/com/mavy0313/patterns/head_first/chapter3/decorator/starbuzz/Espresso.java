package com.mavy0313.patterns.head_first.chapter3.decorator.starbuzz;

public class Espresso extends Beverage {
  public Espresso() {
    description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
