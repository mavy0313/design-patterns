package com.mavy0313.patterns.head_first.chapter2.observer.stock;

public interface Observer {
  void update(double microsoftStockPrice, double teslaStockPrice);
}
