package com.mavy0313.patterns.head_first.chapter12;

public class RubberDuck implements Quackable {

  private final Observable observable;

  public RubberDuck() {
    observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Squeak");
    notifyObservers();
  }


  @Override
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    observable.notifyObservers();
  }

  @Override
  public String toString() {
    return "RubberDuck";
  }
}
