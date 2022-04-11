package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.validator;

public class CreditHistoryValidator extends BaseValidator {
  @Override
  public void validate(Client client) {
    if (client.goodCreditHistory) {
      System.out.println("Passed: Client has good credit history");
    } else {
      System.out.println("Failed: Client has bad credit history");
    }
    super.validate(client);
  }
}
