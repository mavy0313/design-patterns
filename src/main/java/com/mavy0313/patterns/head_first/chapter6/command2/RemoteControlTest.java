package com.mavy0313.patterns.head_first.chapter6.command2;

public class RemoteControlTest {

  public static void main(String[] args) {
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);
    RemoteControl remoteControl = new RemoteControl();
    remoteControl.setCommand(lightOnCommand);
    remoteControl.buttonWasPressed();

    remoteControl.setCommand(lightOffCommand);
    remoteControl.buttonWasPressed();
  }
}
