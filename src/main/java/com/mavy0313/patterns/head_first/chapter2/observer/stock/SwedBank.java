package com.mavy0313.patterns.head_first.chapter2.observer.stock;

public class SwedBank implements Observer {

  private Subject subject;
  private double microsoftStockPrice;
  private double teslaStockPrice;

  public SwedBank(Subject subject) {
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
    System.out.println("Swed Bank print stock prices");
    System.out.println(microsoftStockPrice);
    System.out.println(teslaStockPrice);
  }
}
