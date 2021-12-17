package com.mavy0313.patterns.refactoring_guru.mediator.wiki;

public abstract class Colleague {

  protected Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

  public void send(String message) {
    mediator.send(message, this);
  }

  public abstract void notify(String message);
}

