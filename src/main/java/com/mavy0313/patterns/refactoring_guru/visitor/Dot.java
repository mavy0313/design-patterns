package com.mavy0313.patterns.refactoring_guru.visitor;

public class Dot extends Shape {

  private int id;
  private int x;
  private int y;

  public Dot() {
  }

  public Dot(int id, int x, int y) {
    this.id = id;
    this.x = x;
    this.y = y;
  }

  @Override
  public void move(int x, int y) {
    System.out.println("Moving dot");
  }

  @Override
  public void draw() {
    System.out.println("Drawing dot");
  }

  @Override
  public String accept(Visitor visitor) {
    return visitor.visitDot(this);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getId() {
    return id;
  }
}
