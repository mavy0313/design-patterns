package com.mavy0313.patterns.head_first.chapter12;

public interface QuackObservable {
  void registerObserver(Observer observer);
  void notifyObservers();
}
