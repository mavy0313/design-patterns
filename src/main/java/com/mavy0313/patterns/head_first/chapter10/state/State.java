package com.mavy0313.patterns.head_first.chapter10.state;

public interface State {
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}
