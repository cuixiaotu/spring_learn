package com.xiaotu.spring5.dao.impl;

import com.xiaotu.spring5.dao.UserDao;

public class UserDaoImpl implements UserDao {

  @Override
  public int add(int a, int b) {
    System.out.println("UserDaoImpl add()...");
    return a+b;
  }

  @Override
  public String update(String id) {
    System.out.println("UserDaoImpl update()...");
    return id;
  }

}
