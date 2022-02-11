package com.xiaotu.spring5.test;

import com.xiaotu.spring5.aopanno.User;
import com.xiaotu.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testAop {
  @Test
  public void test1(){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    User user = context.getBean("user", User.class);
    user.add();
  }


  @Test
  public void test2(){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
    Book book = context.getBean("book", Book.class);
    book.buy();
  }
}