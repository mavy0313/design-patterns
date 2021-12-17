package com.mavy0313.patterns.head_first.chapter3.decorator.icecream;

public class IceCreamShop {
  public static void main(String[] args) {
    IceCream iceCream = new WhiteIceCream();
    iceCream = new Caramel(iceCream);
    iceCream = new Sprinkles(iceCream);
    System.out.println(iceCream.getDescription() + " $"+ iceCream.cost());

    IceCream iceCream2 = new ChocolateIceCream();
    iceCream2 = new Caramel(iceCream2);
    iceCream2 = new Caramel(iceCream2);
    System.out.println(iceCream2.getDescription() + " $"+ iceCream2.cost());
  }
}
