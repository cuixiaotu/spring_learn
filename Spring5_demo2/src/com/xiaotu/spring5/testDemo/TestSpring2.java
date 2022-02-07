package com.xiaotu.spring5.testDemo;

import com.xiaotu.spring5.autowire.Emp;
import com.xiaotu.spring5.bean.Orders;
import com.xiaotu.spring5.collectiontype.Book;
import com.xiaotu.spring5.collectiontype.Courses;
import com.xiaotu.spring5.collectiontype.Stu;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {

  @Test
  public void test(){

    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

    Stu stu = context.getBean("stu", Stu.class);
    stu.show();
  }

  @Test
  public void test2(){
    ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
    Book book1 = context.getBean("book",Book.class);
    Book book2 = context.getBean("book",Book.class);
    book1.show();
    book2.show();
    System.out.println(book1);
    System.out.println(book2);
  }

  @Test
  public void test3(){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
    Courses courses = context.getBean("myBean",Courses.class);
    System.out.println(courses);
  }

  @Test
  public void test4(){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
    Orders orders = context.getBean("orders",Orders.class);
    System.out.println("4.创建bean对象");
    System.out.println(orders);
    context.close();
  }

  @Test
  public void test5(){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
    Emp emp = context.getBean("emp",Emp.class);
    System.out.println(emp);
  }

  @Test
  public void test6() throws SQLException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
    DataSource dataSource = context.getBean("dataSource",DataSource.class);
    System.out.println(dataSource);
    System.out.println(dataSource.getConnection());
  }

}
