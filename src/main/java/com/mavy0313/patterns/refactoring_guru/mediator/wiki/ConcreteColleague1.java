package com.mavy0313.patterns.refactoring_guru.mediator.wiki;

public class ConcreteColleague1 extends Colleague {

  public ConcreteColleague1(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void notify(String message) {
    System.out.println("Colleague1 gets message: " + message);
  }
}
