package com.xiaotu.spring5.testDemo;

import com.xiaotu.spring5.config.SpringConfig;
import com.xiaotu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring3 {

  @Test
  public void test1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    UserService userService = context.getBean("userService",UserService.class);
    userService.add();

  }

  @Test
  public void test2(){
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = context.getBean("userService",UserService.class);
    userService.add();
  }


}
