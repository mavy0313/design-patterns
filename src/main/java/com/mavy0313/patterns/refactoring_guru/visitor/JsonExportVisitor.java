package com.mavy0313.patterns.refactoring_guru.visitor;

public class JsonExportVisitor implements Visitor {

  @Override
  public String visitDot(Dot dot) {
    return "\t{\"dot\": {\n\t\t\"id\": " + dot.getId() + ",\n\t\t\"x\": " + dot.getX() + ",\n\t\t\"y\": " + dot.getY() + "\n\t}";
  }

  @Override
  public String visitRectangle(Rectangle rectangle) {
    return "\t{\"rectangle\": {\n" +
        "\t\t\"id\": " + rectangle.getId() + ",\n" +
        "\t\t\"x\": " + rectangle.getX() + ",\n" +
        "\t\t\"y\": " + rectangle.getY() + ",\n" +
        "\t\t\"height\": " + rectangle.getHeight() + ",\n" +
        "\t\t\"width\": " + rectangle.getWidth() + "\n" +
        "\t}";
  }

  @Override
  public String visitCircle(Circle circle) {
    return "\t{\"circle\": {\n" +
        "\t\t\"id\": " + circle.getId() + ",\n" +
        "\t\t\"x\": " + circle.getX() + ",\n" +
        "\t\t\"y\": " + circle.getY() + ",\n" +
        "\t\t\"radius\": " + circle.getRadius() + "\n" +
        "\t}";
  }

  public String export(Shape... args) {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    for (Shape shape : args) {
      sb.append(shape.accept(this)).append("\n");
    }
    sb.append("}");
    return sb.toString();
  }
}
