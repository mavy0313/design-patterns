package com.mavy0313.patterns.refactoring_guru.prototype;

public class Circle extends Shape {

  public int radius;

  public Circle(Circle source) {
    super(source);
    this.radius = source.radius;
  }

  public Circle() {

  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }
}
