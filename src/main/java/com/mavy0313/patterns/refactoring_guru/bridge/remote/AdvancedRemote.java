package com.mavy0313.patterns.refactoring_guru.bridge.remote;

import com.mavy0313.patterns.refactoring_guru.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

  public AdvancedRemote(Device device) {
    super(device);
  }

  public void mute() {
    device.setVolume(0);
  }
}
