package com.mavy0313.patterns.head_first.chapter3.decorator.starbuzz;

public abstract class Beverage {
  String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
