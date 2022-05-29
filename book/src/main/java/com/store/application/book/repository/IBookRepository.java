package com.store.application.book.repository;

import com.store.application.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBookRepository extends JpaRepository<Book, Long>
{
}
