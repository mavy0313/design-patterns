package com.mavy0313.patterns.refactoring_guru.mediator.wiki;

public class ConcreteColleague2 extends Colleague {

  public ConcreteColleague2(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void notify(String message) {
    System.out.println("Colleague2 gets message: " + message);
  }
}
