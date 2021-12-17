package com.mavy0313.patterns.head_first.chapter1.strategy.duck;

public class MuteQuack implements QuackBehavior {
  public void quack() {
    System.out.println("<<Silence>>");
  }
}
