package com.mavy0313.patterns.head_first.chapter7.adapter;

public class WildTurkey implements Turkey {
  @Override
  public void gobble() {
    System.out.println("WildTurkey is gobbling");
  }

  @Override
  public void fly() {
    System.out.println("WildTurkey is flying");
  }
}
