package com.mavy0313.patterns.head_first.chapter3.decorator.icecream;

public class Caramel extends ToppingDecorator {

  private IceCream iceCream;

  public Caramel(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public double cost() {
    return 0.1 + iceCream.cost();
  }

  @Override
  public String getDescription() {
    return iceCream.getDescription() + ", Caramel";
  }
}
