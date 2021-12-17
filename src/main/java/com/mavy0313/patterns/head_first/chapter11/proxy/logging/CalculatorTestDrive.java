package com.mavy0313.patterns.head_first.chapter11.proxy.logging;

public class CalculatorTestDrive {
  public static void main(String[] args) {
    Calculator calculator = new BasicCalculator();
    int sum = calculator.add(2, 3);
    System.out.println("Basic calc 2 and 3 sum=" + sum);

    Calculator proxyCalculator = new LoggingProxyCalculator(calculator);
    sum = proxyCalculator.add(2,3);
    System.out.println("Proxy calc 2 and 3 sum=" + sum);
  }
}
