package com.xiaotu.spring5.test;

import com.xiaotu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testTx {
        @Autowired
        private UserService userService;

        @Test
        public void test1(){
                ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
                UserService userService = context.getBean("bookService", UserService.class);

                userService.accountMoney();
        }
}
