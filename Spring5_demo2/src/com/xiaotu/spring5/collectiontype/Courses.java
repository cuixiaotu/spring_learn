package com.xiaotu.spring5.collectiontype;

public class Courses {
  private String cname;

  public void setCname(String cname) {
    this.cname = cname;
  }

  @Override
  public String toString() {
    return "Course{" +
        "cname='" + cname + '\'' +
        '}';
  }
}
