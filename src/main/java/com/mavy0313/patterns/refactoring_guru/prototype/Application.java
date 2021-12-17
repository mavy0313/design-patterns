package com.mavy0313.patterns.refactoring_guru.prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {
  public static void main(String[] args) {
    List<Shape> shapes = new ArrayList<>();

    Circle circle = new Circle();
    circle.x = 10;
    circle.y = 10;
    circle.radius = 20;

    shapes.add(circle);

    Circle anotherCircle = (Circle) circle.clone();
    shapes.add(anotherCircle);

    Rectangle rectangle = new Rectangle();
    rectangle.width = 10;
    rectangle.height = 20;
    shapes.add(rectangle);

    List<Shape> shapesCopy = new ArrayList<>();

    for (Shape shape : shapes) {
      shapesCopy.add(shape.clone());
    }

    shapes.forEach(System.out::println);
    shapesCopy.forEach(System.out::println);
  }
}
