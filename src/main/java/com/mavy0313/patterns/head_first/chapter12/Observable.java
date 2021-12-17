package com.mavy0313.patterns.head_first.chapter12;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {

  List<Observer> observers = new ArrayList<>();
  private QuackObservable duck;

  public Observable(QuackObservable duck) {
    this.duck = duck;
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(duck));
  }
}
