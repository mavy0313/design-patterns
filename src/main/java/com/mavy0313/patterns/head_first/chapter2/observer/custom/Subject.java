package com.mavy0313.patterns.head_first.chapter2.observer.custom;

public interface Subject {
  void registerObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObservers();
}
