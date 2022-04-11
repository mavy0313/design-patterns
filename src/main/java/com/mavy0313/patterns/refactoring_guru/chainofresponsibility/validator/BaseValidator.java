package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.validator;

public abstract class BaseValidator implements Validator {

  private Validator next;

  @Override
  public void validate(Client client) {
    if (next != null) {
      next.validate(client);
    }
  }

  @Override
  public void setNext(Validator validator) {
    this.next = validator;
  }
}
