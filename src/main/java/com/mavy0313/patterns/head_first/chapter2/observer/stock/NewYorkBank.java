package com.mavy0313.patterns.head_first.chapter2.observer.stock;

public class NewYorkBank implements Observer {

  private Subject subject;
  private double microsoftStockPrice;
  private double teslaStockPrice;

  public NewYorkBank(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  @Override
  public void update(double microsoftStockPrice, double teslaStockPrice) {
    this.microsoftStockPrice = microsoftStockPrice;
    this.teslaStockPrice = teslaStockPrice;
    print();
  }

  public void print() {
    System.out.println("New York bank print stock prices");
    System.out.println(microsoftStockPrice);
    System.out.println(teslaStockPrice);
  }
}
