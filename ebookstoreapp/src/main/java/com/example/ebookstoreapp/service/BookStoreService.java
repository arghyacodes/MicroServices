package com.example.ebookstoreapp.service;

import com.example.ebookstoreapp.entity.Book;

import com.example.ebookstoreapp.repository.BookStoreRepository;

import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service

public class BookStoreService {

    private final BookStoreRepository repository;

    public BookStoreService(BookStoreRepository repository) {

        this.repository = repository;

    }

    // Add / Update Book

    public Book saveBook(Book book) {

        return repository.save(book);

    }

    // Get all books

    public List<Book> getAllBooks() {

        return repository.findAll();

    }

    // Get book by id

    public Optional<Book> getBookById(Long bookId) {

        return repository.findById(bookId);

    }

    // Delete book by id

    public void deleteBookById(Long bookId) {

        repository.deleteById(bookId);

    }

    // Search methods

    public List<Book> getBooksByTitle(String title) {

        return repository.findByBookTitle(title);

    }

    public List<Book> getBooksByPublisher(String publisher) {

        return repository.findByBookPublisherLike("%" + publisher + "%");

    }

    public List<Book> getBooksByYear(Integer year) {

        return repository.findByYear(year);

    }

}