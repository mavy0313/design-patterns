package com.mavy0313.patterns.head_first.chapter4.factorymethod.hotdog;

public abstract class HotDogStore {

  public HotDog orderHotDog() {
    HotDog hotDog = createHotDog();
    hotDog.prepare();
    hotDog.bake();
    return hotDog;
  }

  protected abstract HotDog createHotDog();
}
