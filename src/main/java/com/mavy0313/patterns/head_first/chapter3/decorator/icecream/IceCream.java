package com.mavy0313.patterns.head_first.chapter3.decorator.icecream;

public abstract class IceCream {
  String description = "Unknown Ice Cream";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}
