package com.mavy0313.patterns.head_first.chapter2.observer.stock;

public class StockMarketApp {
  public static void main(String[] args) {
    StockMarket stockMarket = new StockMarket();
    NewYorkBank newYorkBank = new NewYorkBank(stockMarket);
    SwedBank swedBank = new SwedBank(stockMarket);

    stockMarket.setPrices(50.00, 100.00);
    stockMarket.setPrices(52.02, 101.01);
    stockMarket.setPrices(53.03, 105.03);
  }
}
