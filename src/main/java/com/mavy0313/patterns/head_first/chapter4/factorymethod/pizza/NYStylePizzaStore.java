package com.mavy0313.patterns.head_first.chapter4.factorymethod.pizza;

class NYStylePizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    } else if (type.equals("clam")) {
      pizza = new NYStyleClamPizza();
    } else if (type.equals("pepperoni")) {
      pizza = new NYStylePepperoniPizza();
    } else if (type.equals("veggie")) {
      pizza = new NYStyleVeggiePizza();
    }
    return pizza;
  }
}
