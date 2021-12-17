package com.mavy0313.patterns.head_first.chapter3.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }
}
