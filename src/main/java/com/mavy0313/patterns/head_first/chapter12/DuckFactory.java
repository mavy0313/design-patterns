package com.mavy0313.patterns.head_first.chapter12;

public class DuckFactory extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new MallardDuck();
  }

  @Override
  public Quackable createRedheadDuck() {
    return new RedheadDuck();
  }

  @Override
  public Quackable createDuckCall() {
    return new DuckCall();
  }

  @Override
  public Quackable createRubberDuck() {
    return new RubberDuck();
  }
}
