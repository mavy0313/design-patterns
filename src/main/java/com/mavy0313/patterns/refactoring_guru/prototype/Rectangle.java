package com.mavy0313.patterns.refactoring_guru.prototype;

public class Rectangle extends Shape {

  public int width;
  public int height;

  public Rectangle(Rectangle source) {
    super(source);
    this.width = source.width;
    this.height = source.height;
  }

  public Rectangle() {

  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }
}
