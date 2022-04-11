package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.validator;

public class AgeValidator extends BaseValidator {
  @Override
  public void validate(Client client) {
    if (client.age >= 18) {
      System.out.println("Passed: Client is older then 18");
    } else {
      System.out.println("Failed: Client is younger then 18");
    }
    super.validate(client);
  }
}
