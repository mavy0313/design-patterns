package com.mavy0313.patterns.head_first.chapter5.singleton;

public class App {
  public static void main(String[] args) {
    System.out.println(Singleton.getInstance());

    Runnable runnable = () -> System.out.println(Singleton.getInstance());

    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);
    thread1.start();
    thread2.start();
  }
}
