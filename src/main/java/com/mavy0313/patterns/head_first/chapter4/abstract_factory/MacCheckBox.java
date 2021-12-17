package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class MacCheckBox implements CheckBox {
  @Override
  public void paint() {
    System.out.println("MacCheckBox was painted");
  }
}
