package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class MacButton implements Button {

  @Override
  public void paint() {
    System.out.println("MacButton was painted");
  }
}
