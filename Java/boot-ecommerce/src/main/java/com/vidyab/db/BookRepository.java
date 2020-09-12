package com.vidyab.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidyab.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}