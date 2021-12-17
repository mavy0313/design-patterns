package com.mavy0313.patterns.refactoring_guru.chainofresponsibility;

public class StderrLogger extends Logger {

  public StderrLogger(int mask) {
    this.mask = mask;
  }

  @Override
  protected void writeMessage(String msg) {
    System.out.println("Sending to stderr: " + msg);
  }
}
