package com.mavy0313.patterns.refactoring_guru.visitor;

public abstract class Shape {
  public abstract void move(int x, int y);
  public abstract void draw();
  public abstract String accept(Visitor visitor);
}
