package com.mavy0313.patterns.refactoring_guru.mediator.wiki;

public abstract class Mediator {

  public abstract void send(String message, Colleague sender);
}
