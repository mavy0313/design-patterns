package com.mavy0313.patterns.refactoring_guru.visitor;

public class XmlExportVisitor implements Visitor {

  public String export(Shape... args) {
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
    for (Shape shape : args) {
      sb.append(shape.accept(this)).append("\n");
    }
    return sb.toString();
  }

  @Override
  public String visitDot(Dot dot) {
    return "<dot>" + "\n" +
        "    <id>" + dot.getId() + "</id>" + "\n" +
        "    <x>" + dot.getX() + "</x>" + "\n" +
        "    <y>" + dot.getY() + "</y>" + "\n" +
        "</dot>";
  }

  @Override
  public String visitCircle(Circle c) {
    return "<circle>" + "\n" +
        "    <id>" + c.getId() + "</id>" + "\n" +
        "    <x>" + c.getX() + "</x>" + "\n" +
        "    <y>" + c.getY() + "</y>" + "\n" +
        "    <radius>" + c.getRadius() + "</radius>" + "\n" +
        "</circle>";
  }

  @Override
  public String visitRectangle(Rectangle r) {
    return "<rectangle>" + "\n" +
        "    <id>" + r.getId() + "</id>" + "\n" +
        "    <x>" + r.getX() + "</x>" + "\n" +
        "    <y>" + r.getY() + "</y>" + "\n" +
        "    <width>" + r.getWidth() + "</width>" + "\n" +
        "    <height>" + r.getHeight() + "</height>" + "\n" +
        "</rectangle>";
  }
}
