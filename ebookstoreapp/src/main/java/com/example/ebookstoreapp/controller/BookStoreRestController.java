package com.example.ebookstoreapp.controller;

import com.example.ebookstoreapp.entity.Book;

import com.example.ebookstoreapp.service.BookStoreService;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/books")

public class BookStoreRestController {

    private final BookStoreService service;

    public BookStoreRestController(BookStoreService service) {

        this.service = service;

    }

    // POST /books → Add book

    @PostMapping

    public Book addBook(@RequestBody Book book) {

        return service.saveBook(book);

    }

    // PUT /books → Update book

    @PutMapping

    public Book updateBook(@RequestBody Book book) {

        return service.saveBook(book);

    }

    // GET /books → Get all books

    @GetMapping

    public List<Book> getAllBooks(@RequestParam(required = false) Integer year) {

        if (year != null) {

            return service.getBooksByYear(year);

        }

        return service.getAllBooks();

    }

    // GET /books/{book_id} → Get book by id

    @GetMapping("/{book_id}")

    public ResponseEntity<Book> getBookById(@PathVariable("book_id") Long bookId) {

        return service.getBookById(bookId)

                .map(ResponseEntity::ok)

                .orElse(ResponseEntity.notFound().build());

    }

    // DELETE /books/{book_id} → Delete book

    @DeleteMapping("/{book_id}")

    public ResponseEntity<Void> deleteBook(@PathVariable("book_id") Long bookId) {

        service.deleteBookById(bookId);

        return ResponseEntity.noContent().build();

    }

    // GET /books/title/{book_title}

    @GetMapping("/title/{book_title}")

    public List<Book> getBooksByTitle(@PathVariable("book_title") String title) {

        return service.getBooksByTitle(title);

    }

    // GET /books/publisher/{book_publisher}

    @GetMapping("/publisher/{book_publisher}")

    public List<Book> getBooksByPublisher(@PathVariable("book_publisher") String publisher) {

        return service.getBooksByPublisher(publisher);

    }

}