package com.xiaotu.spring5.service;

import com.xiaotu.spring5.dao.BookDao;
import com.xiaotu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired()
    private BookDao bookDao;

    //    添加的方法
    public void addBook(Book book) {
        bookDao.add(book);
    }

    //    修改
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    //    删除
    public void deleteBook(int id) {
        bookDao.delete(id);
    }

    //    查询行数 记录数学
    public int findConutBook() {
        return bookDao.selectCount();
    }

    //    查询一个对象
    public Book findOneBook(int id) {
        return bookDao.findOne(id);
    }

    //    查询所有对象
    public List<Book> findAllBook() {
        return bookDao.findAll();
    }

    //    批量add
    public void batchAddBook(List<Object[]> batchArgs) {
        bookDao.batchAdd(batchArgs);
    }

    //    批量修改
    public void batchUpdateBook(List<Object[]> batchArgs) {
        bookDao.batchUpdate(batchArgs);
    }

    //    批量删除
    public void batchDeleteBook(List<Object[]> batchArgs) {
        bookDao.batchDelete(batchArgs);
    }


}