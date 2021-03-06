package com.mavy0313.patterns.head_first.chapter12;

public class QuackCounter implements Quackable {

  public static int numberOfQuacks;
  private Quackable duck;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
  }

  @Override
  public void quack() {
    duck.quack();
    numberOfQuacks++;
  }

  public static int getNumberOfQuacks() {
    return numberOfQuacks;
  }

  @Override
  public void registerObserver(Observer observer) {
    duck.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    duck.notifyObservers();
  }

  @Override
  public String toString() {
    return "QuackCounter " + duck.toString();
  }
}
