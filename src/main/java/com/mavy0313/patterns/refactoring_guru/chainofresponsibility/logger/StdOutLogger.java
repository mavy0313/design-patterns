package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.logger;

public class StdOutLogger extends Logger {

  public StdOutLogger(int mask) {
    this.mask = mask;
  }

  @Override
  protected void writeMessage(String msg) {
    System.out.println("Writing to stdout: " + msg);
  }
}
