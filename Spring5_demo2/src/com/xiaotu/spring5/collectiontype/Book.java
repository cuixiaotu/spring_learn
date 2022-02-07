package com.xiaotu.spring5.collectiontype;

import java.util.List;

public class Book {
  private List<String> list;

  public void setList(List<String> list){
    this.list = list;
  }

  public void show(){
    System.out.println(list);
  }
}
