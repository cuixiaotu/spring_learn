package com.xiaotu.spring5.dao.impl;

import com.xiaotu.spring5.dao.UserDao;

public class UserDaoImpl implements UserDao {

  @Override
  public void update() {
    System.out.println("UserDaoImpl.update()...");
  }
}
