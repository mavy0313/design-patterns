package com.mavy0313.patterns.head_first.chapter3.decorator.icecream;

public class WhiteIceCream extends IceCream {

  public WhiteIceCream() {
    description = "White Ice Cream";
  }

  @Override
  public double cost() {
    return .50;
  }
}
