package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.validator;

public interface Validator {

  void validate(Client client);

  void setNext(Validator validator);

}
