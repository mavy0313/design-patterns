package com.mavy0313.patterns.head_first.chapter9.iterator;

public class Waitress {

  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
    Iterator dinerMenuIterator = dinerMenu.createIterator();
    System.out.println("MENU\n---\nBREAKFAST");
    printMenu(pancakeHouseMenuIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerMenuIterator);
  }

  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem.getName() + ", ");
      System.out.println(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}
