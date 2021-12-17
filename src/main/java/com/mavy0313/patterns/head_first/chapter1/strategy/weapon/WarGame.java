package com.mavy0313.patterns.head_first.chapter1.strategy.weapon;

public class WarGame {
  public static void main(String[] args) {
    Character knight = new Knight();
    knight.fight();

    Character queen = new Queen();
    queen.fight();

    queen.setWeaponBehavior(new SwordWeapon());
    queen.fight();
  }
}
