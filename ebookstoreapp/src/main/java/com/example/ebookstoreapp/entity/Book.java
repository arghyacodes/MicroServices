package com.example.ebookstoreapp.entity;

import jakarta.persistence.*;

@Entity

@Table(name = "books")

public class Book {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long bookId;

    private String bookTitle;

    private String bookPublisher;

    private Integer year;

    private String author;

    private Double price;

    // Constructors

    public Book() {}

    public Book(String bookTitle, String bookPublisher, Integer year, String author, Double price) {

        this.bookTitle = bookTitle;

        this.bookPublisher = bookPublisher;

        this.year = year;

        this.author = author;

        this.price = price;

    }

    // Getters & Setters

    public Long getBookId() {

        return bookId;

    }

    public void setBookId(Long bookId) {

        this.bookId = bookId;

    }

    public String getBookTitle() {

        return bookTitle;

    }

    public void setBookTitle(String bookTitle) {

        this.bookTitle = bookTitle;

    }

    public String getBookPublisher() {

        return bookPublisher;

    }

    public void setBookPublisher(String bookPublisher) {

        this.bookPublisher = bookPublisher;

    }

    public Integer getYear() {

        return year;

    }

    public void setYear(Integer year) {

        this.year = year;

    }

    public String getAuthor() {

        return author;

    }

    public void setAuthor(String author) {

        this.author = author;

    }

    public Double getPrice() {

        return price;

    }

    public void setPrice(Double price) {

        this.price = price;

    }

}