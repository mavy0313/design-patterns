package com.mavy0313.patterns.head_first.chapter4.factorymethod.pizza;

abstract class PizzaStore {

  Pizza orderPizza(String type) {
    Pizza pizza;

    pizza = createPizza(type);
    
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  abstract Pizza createPizza(String type);
}
