package com.mavy0313.patterns.head_first.chapter1.strategy.duck;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("Mallard Duck");
  }
}
