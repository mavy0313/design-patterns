package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class WinFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new WinButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WinCheckBox();
  }
}
