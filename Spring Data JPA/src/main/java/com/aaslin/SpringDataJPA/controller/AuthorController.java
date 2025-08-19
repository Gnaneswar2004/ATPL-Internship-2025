package com.aaslin.SpringDataJPA.controller;

import com.aaslin.SpringDataJPA.entity.Author;
import com.aaslin.SpringDataJPA.repository.AuthorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@PostMapping
    public Author create(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @GetMapping
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @PutMapping("/{id}")
    public Author update(@PathVariable Long id, @RequestBody Author updatedAuthor) {
        Author author = authorRepository.findById(id).orElseThrow();
        author.setName(updatedAuthor.getName());
        return authorRepository.save(author);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        authorRepository.deleteById(id);
        return "Author deleted Succesfully!";
    }
}