package com.xiaotu.spring5.dao;
import com.xiaotu.spring5.entity.Book;
import java.util.List;

public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void delete(int id);

    int selectCount();

    Book findOne(int id);

    List<Book> findAll();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}