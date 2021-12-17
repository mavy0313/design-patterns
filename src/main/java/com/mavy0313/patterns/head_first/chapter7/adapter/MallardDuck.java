package com.mavy0313.patterns.head_first.chapter7.adapter;

public class MallardDuck implements Duck {

  @Override
  public void quack() {
    System.out.println("Mallard duck is quacking");
  }

  @Override
  public void fly() {
    System.out.println("MallardDuck is flying");
  }
}
