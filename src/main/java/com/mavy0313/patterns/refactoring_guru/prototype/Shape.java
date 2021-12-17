package com.mavy0313.patterns.refactoring_guru.prototype;

public abstract class Shape {
  public int x;
  public int y;
  public String color;

  public Shape(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  public Shape(Shape source) {
    this.x = source.x;
    this.y = source.y;
    this.color = source.color;

  }

  public Shape() {

  }

  public abstract Shape clone();
}
