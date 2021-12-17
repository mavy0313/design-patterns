package com.mavy0313.patterns.head_first.chapter3.decorator.starbuzz;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return .89;
  }
}
