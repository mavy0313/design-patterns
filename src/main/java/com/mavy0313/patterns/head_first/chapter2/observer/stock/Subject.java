package com.mavy0313.patterns.head_first.chapter2.observer.stock;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObserver();
}
