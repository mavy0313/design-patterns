package com.mavy0313.patterns.head_first.chapter3.decorator.icecream;

public class Sprinkles extends ToppingDecorator {

  private IceCream iceCream;

  public Sprinkles(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public double cost() {
    return 0.05 + iceCream.cost();
  }

  @Override
  public String getDescription() {
    return iceCream.getDescription() + ", Sprinkles";
  }
}
