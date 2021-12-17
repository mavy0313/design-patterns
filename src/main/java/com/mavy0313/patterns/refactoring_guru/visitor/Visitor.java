package com.mavy0313.patterns.refactoring_guru.visitor;

public interface Visitor {

  String visitDot(Dot dot);
  String visitRectangle(Rectangle rectangle);
  String visitCircle(Circle circle);
}
