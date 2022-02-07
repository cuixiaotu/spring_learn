package com.xiaotu.spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {

  public Object postProcessBeforeInitialization(Object bean,String beanName)  throws BeansException{
    System.out.println(" 初始化之前 ");
    return bean;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println(" 初始化之后 ");
    return bean;
  }

}
