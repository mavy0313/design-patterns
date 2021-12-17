package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class MacFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}
