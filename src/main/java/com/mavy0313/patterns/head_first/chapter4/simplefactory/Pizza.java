package com.mavy0313.patterns.head_first.chapter4.simplefactory;

abstract class Pizza {
  public void prepare() {
    System.out.println("Preparing pizza");
  }

  public void bake() {
    System.out.println("Baking pizza");
  }

  public void cut() {
    System.out.println("Cutting pizza");
  }

  public void box() {
    System.out.println("Boxing pizza");
  }
}
