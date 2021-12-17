package com.mavy0313.patterns.head_first.chapter3.decorator.starbuzz;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast";
  }

  @Override
  public double cost() {
    return .99;
  }
}
