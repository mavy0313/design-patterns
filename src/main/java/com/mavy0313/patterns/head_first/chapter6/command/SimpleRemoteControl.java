package com.mavy0313.patterns.head_first.chapter6.command;

public class SimpleRemoteControl {
  Command slot;

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
