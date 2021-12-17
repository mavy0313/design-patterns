package com.mavy0313.patterns.head_first.chapter4.factorymethod.hotdog;

public class TltHotDogStore extends HotDogStore {
  @Override
  protected HotDog createHotDog() {
    return new TltHotDog();
  }
}
