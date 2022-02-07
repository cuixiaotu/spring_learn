package com.xiaotu.spring5.dao.testDemo;

import com.xiaotu.spring5.dao.UserDao;
import com.xiaotu.spring5.dao.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testSpring4 {

  @Test
  public void test(){
    ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
    UserDao userDao = context.getBean("userDaoImpl",UserDao.class);
    userDao.update("1");
  }

}
