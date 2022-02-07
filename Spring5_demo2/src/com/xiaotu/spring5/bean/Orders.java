package com.xiaotu.spring5.bean;

public class Orders {
  private String oname;

  public Orders(){
    System.out.println("1.默认的构造函数");
  }

  public void setOname(String oname) {
    this.oname = oname;
    System.out.println("2.调用了set方法");
  }

  //创建构建方法
  public void initMethod(){
    System.out.println("3.执行了初始化方法");
  }

  public void destroyMethod(){
    System.out.println("5.执行了销毁方法");
  }
}
