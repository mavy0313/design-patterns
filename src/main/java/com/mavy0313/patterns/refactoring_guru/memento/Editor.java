package com.mavy0313.patterns.refactoring_guru.memento;

public class Editor {
  private String text;
  private int curX;
  private int curY;
  private int selectionWidth;

  public void setText(String text) {
    this.text = text;
  }

  public void setSelectionWidth(int selectionWidth) {
    this.selectionWidth = selectionWidth;
  }

  public void setCursor(int curX, int curY) {
    this.curX = curX;
    this.curY = curY;
  }

  public Snapshot createSnapshot() {
    return new Snapshot(this, text, curX, curY, selectionWidth);
  }
}
