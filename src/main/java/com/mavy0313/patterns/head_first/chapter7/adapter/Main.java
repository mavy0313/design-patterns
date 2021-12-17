package com.mavy0313.patterns.head_first.chapter7.adapter;

public class Main {
  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();
    testDuck(mallardDuck);

    Turkey wildTurkey = new WildTurkey();
    TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
    testDuck(turkeyAdapter);
  }

  private static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
