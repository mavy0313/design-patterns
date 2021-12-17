package com.mavy0313.patterns.head_first.chapter1.strategy.weapon;

public class Queen extends Character {
  public Queen() {
    weaponBehavior = new AxeWeapon();
  }

  @Override
  public void fight() {
    System.out.println("Queen is fighting");
    useWeapon();
  }
}
