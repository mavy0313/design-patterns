package com.mavy0313.patterns.head_first.chapter11.proxy.logging;

public class LoggingProxyCalculator implements Calculator {

  private Calculator calculator;

  public LoggingProxyCalculator(Calculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public int add(int a, int b) {
    System.out.println("Proxy logging input args, a=" + a + ", b=" + b);
    return calculator.add(a, b);
  }
}
