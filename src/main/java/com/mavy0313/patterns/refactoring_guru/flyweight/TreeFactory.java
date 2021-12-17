package com.mavy0313.patterns.refactoring_guru.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

  private static final Map<String, TreeType> treeTypes = new HashMap<>();

  public static TreeType getTreeType(String name, Color color, String texture) {
    TreeType type = treeTypes.get(name);
    if (type == null) {
      type = new TreeType(name, color, texture);
      treeTypes.put(name, type);
    }
    return type;
  }
}
