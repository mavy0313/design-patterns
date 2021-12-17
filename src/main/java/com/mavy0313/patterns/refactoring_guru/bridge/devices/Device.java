package com.mavy0313.patterns.refactoring_guru.bridge.devices;

public interface Device {
  boolean isEnabled();

  void enable();

  void disable();

  int getVolume();

  void setVolume(int percent);

  int getChannel();

  void setChannel(int channel);

  void printStatus();
}
