package com.example.ebookstoreapp.repository;

import com.example.ebookstoreapp.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookStoreRepository extends JpaRepository<Book, Long> {

    // Basic behaviors inherited from JpaRepository:

    // save(), findAll(), findById(), deleteById(), etc.

    // Custom JPA Query Methods

    List<Book> findByBookTitle(String bookTitle);

    List<Book> findByBookPublisherLike(String bookPublisher);

    List<Book> findByYear(Integer year);

}