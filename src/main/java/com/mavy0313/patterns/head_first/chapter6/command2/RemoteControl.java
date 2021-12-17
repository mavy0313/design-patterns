package com.mavy0313.patterns.head_first.chapter6.command2;

public class RemoteControl {
  Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void buttonWasPressed() {
    command.execute();
  }
}
