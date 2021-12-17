package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class WinButton implements Button {
  @Override
  public void paint() {
    System.out.println("WinButton was painted");
  }
}
