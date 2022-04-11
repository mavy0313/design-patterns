package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.logger;

public class EmailLogger extends Logger {

  public EmailLogger(int mask) {
    this.mask = mask;
  }

  @Override
  protected void writeMessage(String msg) {
    System.out.println("Sending via Email: " + msg);
  }
}
