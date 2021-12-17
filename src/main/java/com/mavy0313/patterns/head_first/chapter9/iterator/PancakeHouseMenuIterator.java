package com.mavy0313.patterns.head_first.chapter9.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

  ArrayList items;
  int position = 0;

  public PancakeHouseMenuIterator(ArrayList items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return items.size() > position;
  }

  @Override
  public Object next() {
    return items.get(position++);
  }
}
