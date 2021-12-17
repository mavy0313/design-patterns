package com.mavy0313.patterns.head_first.chapter4.factorymethod.hotdog;

public abstract class HotDog {
  String name;

  public void prepare() {
    System.out.println("Preparing " + name);

  }

  public void bake() {
    System.out.println("Baking " + name);
  }

  public String getName() {
    return name;
  }
}
