package com.xiaotu.spring5.autowire;

public class Dept {
  private String dname;

  public void setDname(String dname) {
    this.dname = dname;
  }

  @Override
  public String toString() {
    return "Dept{" +
        "dname='" + dname + '\'' +
        '}';
  }
}
