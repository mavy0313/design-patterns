package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class WinCheckBox implements CheckBox {
  @Override
  public void paint() {
    System.out.println("WinCHeckBox was painted");
  }
}
