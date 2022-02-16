package com.xiaotu.spring5.dao.impl;

import com.xiaotu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username=?";
        int i = jdbcTemplate.update(sql,100,"lucy");
        System.out.println(i);
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";
        int i = jdbcTemplate.update(sql,100,"mary");
        System.out.println(i);
    }
}
