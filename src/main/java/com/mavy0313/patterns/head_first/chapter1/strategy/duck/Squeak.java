package com.mavy0313.patterns.head_first.chapter1.strategy.duck;

public class Squeak implements QuackBehavior {
  public void quack() {
    System.out.println("Squeak");
  }
}
