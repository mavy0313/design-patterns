package com.mavy0313.patterns.head_first.chapter11.proxy.dynamic;

public interface PersonBean {
  String getName();
  String getGender();
  String getInterests();
  int getHotOrNotRating();

  void setName(String name);
  void setGender(String gender);
  void setInterests(String interests);
  void setHotOrNotRating(int rating);
}
