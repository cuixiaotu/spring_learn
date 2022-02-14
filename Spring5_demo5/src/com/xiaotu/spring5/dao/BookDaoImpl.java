package com.xiaotu.spring5.dao;
import com.xiaotu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BookDaoImpl implements BookDao {
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        int i = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println(i);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "UPDATE t_book SET username=?,ustatus=? WHERE user_id=?";
        int i = jdbcTemplate.update(sql, book.getUsername(), book.getUstatus(), book.getUserId());
        System.out.println(i);
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM t_book WHERE user_id=?";
        int i = jdbcTemplate.update(sql, id);
        System.out.println(i);
    }

    @Override
    public int selectCount() {
        String sql = "SELECT COUNT(*) FROM t_book";
        Integer i = jdbcTemplate.queryForObject(sql, Integer.class);
        return i;
    }

    @Override
    public Book findOne(int id) {
        String sql = "SELECT * FROM t_book WHERE user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAll() {
        String sql = "SELECT * FROM t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints.length);
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "UPDATE t_book SET username=?,ustatus=? WHERE user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints.length);
    }

    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "DELETE FROM t_book WHERE user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints.length);
    }
}
