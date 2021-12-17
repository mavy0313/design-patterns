package com.mavy0313.patterns.head_first.chapter1.strategy.duck;

public class FlyWithWings implements FlyBehavior {
  public void fly() {
    System.out.println("I'm flying");
  }
}
