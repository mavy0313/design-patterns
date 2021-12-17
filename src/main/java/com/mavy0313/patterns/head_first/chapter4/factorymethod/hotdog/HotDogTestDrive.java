package com.mavy0313.patterns.head_first.chapter4.factorymethod.hotdog;

public class HotDogTestDrive {
  public static void main(String[] args) {
    HotDogStore store = new TltHotDogStore();
    HotDog hotDog = store.orderHotDog();
    System.out.println(hotDog.getName());

    store = new SpbHotDogStore();
    hotDog = store.orderHotDog();
    System.out.println(hotDog.getName());
  }
}
