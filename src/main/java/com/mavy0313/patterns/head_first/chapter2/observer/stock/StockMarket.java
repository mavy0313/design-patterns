package com.mavy0313.patterns.head_first.chapter2.observer.stock;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {

  private List<Observer> observers = new ArrayList<>();

  private double microsoftStockPrice;
  private double teslaStockPrice;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    int index = observers.indexOf(observer);
    if (index >= 0) {
      observers.remove(index);
    }
  }

  @Override
  public void notifyObserver() {
    observers.forEach(observer -> observer.update(microsoftStockPrice, teslaStockPrice));
  }

  public void setPrices(double microsoftStockPrice, double teslaStockPrice) {
    this.microsoftStockPrice = microsoftStockPrice;
    this.teslaStockPrice = teslaStockPrice;
    pricesChanged();
  }

  public void pricesChanged() {
    notifyObserver();
  }
}
