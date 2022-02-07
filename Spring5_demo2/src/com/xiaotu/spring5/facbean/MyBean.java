package com.xiaotu.spring5.facbean;

import com.xiaotu.spring5.collectiontype.Courses;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Courses> {

  public Courses getObject() throws Exception{
    Courses courses = new Courses();
    courses.setCname("abc");
    return courses;
  }

  @Override
  public Class<?> getObjectType() {
    return null;
  }

  @Override
  public boolean isSingleton() {
    return false;
  }
}
