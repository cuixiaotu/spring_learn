package com.xiaotu.spring5.dao.impl;

import com.xiaotu.spring5.dao.UserDao;
import org.springframework.stereotype.Repository;

//@Repository
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {

  @Override
  public void add() {
    System.out.println("UserDaoImpl.add()...");
  }
}
