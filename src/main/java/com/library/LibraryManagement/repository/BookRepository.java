package com.library.LibraryManagement.repository;

import com.library.LibraryManagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByNameBookContainingIgnoreCase(String bookName);
    Book findByBookSeri(String bookSeri);
}
