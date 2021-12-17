package com.mavy0313.patterns.refactoring_guru.visitor;

public class CsvExportVisitor implements Visitor {

  public String export(Shape... args) {
    StringBuilder sb = new StringBuilder();
    for (Shape shape : args) {
      sb.append(shape.accept(this)).append("\n");
    }
    return sb.toString();
  }

  @Override
  public String visitDot(Dot dot) {
    return dot.getId() + "," + dot.getX() + "," + dot.getY();
  }

  @Override
  public String visitCircle(Circle c) {
    return c.getId() + "," + c.getX() + "," + c.getY() + "," + c.getRadius();
  }

  @Override
  public String visitRectangle(Rectangle r) {
    return r.getId() + "," + r.getX() + "," + r.getY() + "," + r.getWidth() + "," + r.getHeight();
  }
}
