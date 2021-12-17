package com.mavy0313.patterns.refactoring_guru.bridge;

import com.mavy0313.patterns.refactoring_guru.bridge.devices.Device;
import com.mavy0313.patterns.refactoring_guru.bridge.devices.Radio;
import com.mavy0313.patterns.refactoring_guru.bridge.devices.Tv;
import com.mavy0313.patterns.refactoring_guru.bridge.remote.AdvancedRemote;
import com.mavy0313.patterns.refactoring_guru.bridge.remote.BasicRemote;
import com.mavy0313.patterns.refactoring_guru.bridge.remote.Remote;

public class App {
  public static void main(String[] args) {
//    Tv tv = new Tv();
//    tv.printStatus();
//    Remote remote = new BasicRemote(tv);
//    remote.power();
//    tv.printStatus();
//
//    Radio radio = new Radio();
//    radio.printStatus();
//    AdvancedRemote advancedRemote = new AdvancedRemote(radio);
//    advancedRemote.power();
//    advancedRemote.mute();
//    radio.printStatus();

    testDevice(new Tv());
    testDevice(new Radio());
  }

  public static void testDevice(Device device) {
    System.out.println("Tests with basic remote.");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();

    System.out.println("Tests with advanced remote.");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }
}
