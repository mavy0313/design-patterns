package com.mavy0313.patterns.refactoring_guru.visitor;

public class Circle extends Dot {

  private int radius;

  public Circle(int id, int x, int y, int radius) {
    super(id, x, y);
    this.radius = radius;
  }

  @Override
  public void move(int x, int y) {
    System.out.println("Moving circle");
  }

  @Override
  public void draw() {
    System.out.println("Drawing Circle");
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitCircle(this);
  }

  public int getRadius() {
    return radius;
  }
}
