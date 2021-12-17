package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class App {
  public static void main(String[] args) {
    createUI(new MacFactory());
    createUI(new WinFactory());
  }

  public static void createUI(UIFactory uiFactory) {
    Button button = uiFactory.createButton();
    CheckBox checkBox = uiFactory.createCheckBox();

    button.paint();
    checkBox.paint();
  }
}
