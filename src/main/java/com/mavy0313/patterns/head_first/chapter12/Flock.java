package com.mavy0313.patterns.head_first.chapter12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
  List<Quackable> quackers = new ArrayList<>();

  public void add(Quackable quacker) {
    quackers.add(quacker);
  }

  @Override
  public void quack() {
//    Iterator<Quackable> iterator = quackers.iterator();
//    while (iterator.hasNext()) {
//      iterator.next().quack();
//    }
//
//    for (Quackable quacker : quackers) {
//      quacker.quack();
//    }

    quackers.forEach(Quackable::quack);
  }

  @Override
  public void registerObserver(Observer observer) {
    quackers.forEach(quacker -> quacker.registerObserver(observer));
  }

  @Override
  public void notifyObservers() {
  }

  @Override
  public String toString() {
    return "Flock of ducks";
  }
}
