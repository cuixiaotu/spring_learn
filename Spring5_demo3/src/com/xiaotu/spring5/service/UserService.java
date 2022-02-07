package com.xiaotu.spring5.service;
import com.xiaotu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//在注解里面value属性值可以省略不写，
//默认值是类名称，首字母小写
//UserService -- userService
//@Component(value = "userService")  //<bean id="userService" class=".."/>
@Component
public class UserService {

  @Autowired
  @Qualifier(value = "userDaoImpl1")
  private UserDao userDao;

  @Value(value = "cuixiaotu")
  private String name;
  public void add(){
    System.out.println("service add " + this.name);
    userDao.add();
  }

}
