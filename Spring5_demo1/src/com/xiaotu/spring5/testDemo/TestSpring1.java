package com.xiaotu.spring5.testDemo;


import com.xiaotu.spring5.Book;
import com.xiaotu.spring5.Orders;
import com.xiaotu.spring5.User;
import com.xiaotu.spring5.bean.Emp;
import com.xiaotu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {

    @Test
    public void testAdd(){
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //BeanFactory

        //2.获取配置创建对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

        //3.设置对象属性
        Book book1 = context.getBean("book1", Book.class);
        System.out.println(book1);
        Book book2 = context.getBean("book2", Book.class);
        System.out.println(book2);

        //4.有参构造
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println(orders);
        //5.注入空值和特殊字符
        Book book3 = context.getBean("book3",Book.class);
        System.out.println(book3);

        //6.注入外部bean
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();

        //7.注入内部bean
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);


    }

}
