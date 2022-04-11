package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.validator;

public class App {
  public static void main(String[] args) {
    Validator ageValidator = new AgeValidator();
    Validator creditHistoryValidator = new CreditHistoryValidator();
    ageValidator.setNext(creditHistoryValidator);

    Client client = new Client(18, true);
    ageValidator.validate(client);
  }
}
