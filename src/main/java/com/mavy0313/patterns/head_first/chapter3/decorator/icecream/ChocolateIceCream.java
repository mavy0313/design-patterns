package com.mavy0313.patterns.head_first.chapter3.decorator.icecream;

public class ChocolateIceCream extends IceCream {

  public ChocolateIceCream() {
    description = "Chocolate Ice Cream";
  }

  @Override
  public double cost() {
    return .55;
  }
}
