package com.xiaotu.spring5.service;

import com.xiaotu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = -1,readOnly = false,rollbackFor = {},noRollbackFor = {})
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){
        userDao.reduceMoney();
        //int x = 10/0;
        userDao.addMoney();
    }

}
