package com.mavy0313.patterns.head_first.chapter12;

public class GooseAdapter implements Quackable {

  private final Observable observable;
  private Goose goose;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
    observable = new Observable(this);
  }

  @Override
  public void quack() {
    goose.honk();
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

  public String toString() {
    return "Goose pretending to be a Duck";
  }
}
