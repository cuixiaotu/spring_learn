package com.xiaotu.spring5.proxy;

import com.xiaotu.spring5.dao.UserDao;
import com.xiaotu.spring5.dao.impl.UserDaoImpl;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args){
      Class interfaces[] = {UserDao.class};
      UserDaoImpl userDao = new UserDaoImpl();
      /*
      * 1.类加载器
      * 2.增强方法所在的类,这个类实现的接口，支持多个接口
      * 3.实现这个接口，InvocationHandler
      * */
      UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProcy(userDao));

      int result = dao.add(1,2);
      System.out.println(result);
    }
}

class UserDaoProcy implements InvocationHandler{
  private Object obj;
  public UserDaoProcy(Object obj){
    this.obj = obj;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("方法之前。。。。"+ method.getName() + "传递的参数："+ Arrays.toString(args));

    Object res  = method.invoke(obj,args);
    System.out.println("方法之后。。。。"+ obj);
    return res;
  }

}