package com.mavy0313.patterns.head_first.chapter4.abstract_factory;

public class LinuxButton implements Button {
  @Override
  public void paint() {
    System.out.println("Linux Button was painted");
  }
}
