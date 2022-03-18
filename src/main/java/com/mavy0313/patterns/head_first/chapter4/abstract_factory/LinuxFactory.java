package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class LinuxFactory implements UIFactory {
  @Override
  public Button createButton() {
    return new LinuxButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new LinuxCheckBox();
  }
}
