package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.logger;

public class StdErrLogger extends Logger {

  public StdErrLogger(int mask) {
    this.mask = mask;
  }

  @Override
  protected void writeMessage(String msg) {
    System.out.println("Sending to stderr: " + msg);
  }
}
