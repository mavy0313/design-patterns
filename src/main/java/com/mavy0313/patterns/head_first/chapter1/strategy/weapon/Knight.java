package com.mavy0313.patterns.head_first.chapter1.strategy.weapon;

public class Knight extends Character {
  public Knight() {
    weaponBehavior = new SwordWeapon();
  }

  @Override
  public void fight() {
    System.out.println("Knight is fighting");
    useWeapon();
  }
}
