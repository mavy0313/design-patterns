package com.mavy0313.patterns.refactoring_guru.visitor;

public class App {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    Dot dot = new Dot(1, 10, 55);
    Circle circle = new Circle(2, 23, 15, 10);
    Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);
    shapes[0] = dot;
    shapes[1] = rectangle;
    shapes[2] = circle;

    exportToXml(shapes);
    exportToCsv(shapes);
    exportToJson(shapes);
  }

  private static void exportToXml(Shape... shapes) {
    XmlExportVisitor exportVisitor = new XmlExportVisitor();
    System.out.println(exportVisitor.export(shapes));
  }

  private static void exportToCsv(Shape... shapes) {
    CsvExportVisitor exportVisitor = new CsvExportVisitor();
    System.out.println(exportVisitor.export(shapes));
  }

  private static void exportToJson(Shape... shapes) {
    JsonExportVisitor exportVisitor = new JsonExportVisitor();
    System.out.println(exportVisitor.export(shapes));
  }
}
