package com.store.application.book.service;

import com.store.application.book.model.Book;

import java.util.List;


public interface IBookService
{
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
