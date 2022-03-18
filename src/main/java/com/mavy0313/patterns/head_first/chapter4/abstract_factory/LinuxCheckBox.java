package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class LinuxCheckBox implements CheckBox {
  @Override
  public void paint() {
    System.out.println("Linux CheckBox was painted");
  }
}
