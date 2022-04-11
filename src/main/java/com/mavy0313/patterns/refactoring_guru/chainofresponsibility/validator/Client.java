package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.validator;

public class Client {
  public int age;
  public boolean goodCreditHistory;

  public Client(int age, boolean goodCreditHistory) {
    this.age = age;
    this.goodCreditHistory = goodCreditHistory;
  }

}
