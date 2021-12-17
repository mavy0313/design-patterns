package com.mavy0313.patterns.head_first.chapter1.strategy.weapon;

public abstract class Character {

  WeaponBehavior weaponBehavior;

  public void useWeapon() {
    weaponBehavior.useWeapon();
  }

  public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
    System.out.println("Changing weapon");
    this.weaponBehavior = weaponBehavior;
  }

  public abstract void fight();

}
