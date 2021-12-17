package com.mavy0313.patterns.head_first.chapter6.command2;

public class LightOnCommand implements Command {

  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}
