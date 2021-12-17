package com.mavy0313.patterns.head_first.chapter12;

public class Quackologist implements Observer{
  @Override
  public void update(QuackObservable duck) {
    System.out.println("Quackologist: " + duck + " just quacked");
  }
}
