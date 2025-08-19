package com.aaslin.SpringDataJPA.controller;

import com.aaslin.SpringDataJPA.entity.Book;
import com.aaslin.SpringDataJPA.repository.BookRepository;
import com.aaslin.SpringDataJPA.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;
    private final BookService bookService;

    public BookController(BookRepository bookRepository, BookService bookService) {
		this.bookRepository = bookRepository;
		this.bookService = bookService;
	}

    @PostMapping("/author/{authorId}")
    public Book createBook(@PathVariable Long authorId, @RequestBody Book book) {
        return bookService.createBookForAuthor(authorId, book);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book updatedBook) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(updatedBook.getTitle());
        book.setGenre(updatedBook.getGenre());
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "Book deleted Succesfully!";
    }
}