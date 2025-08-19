package com.aaslin.SpringDataJPA.service;

import com.aaslin.SpringDataJPA.entity.*;
import com.aaslin.SpringDataJPA.repository.BookRepository;
import com.aaslin.SpringDataJPA.repository.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

	@Transactional
    public Book createBookForAuthor(Long authorId, Book book) {
        Author author = authorRepository.findById(authorId).orElseThrow(() -> new RuntimeException("Author not found"));
        book.setAuthor(author);
        return bookRepository.save(book);
    }
}