package com.mavy0313.patterns.refactoring_guru.flyweight;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
  private List<Tree> trees = new ArrayList<>();

  public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
    TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
    Tree tree = new Tree(x, y, type);
    trees.add(tree);
  }

  public void paint(Graphics graphics) {
    for (Tree tree : trees) {
      tree.draw(graphics);
    }
  }
}
