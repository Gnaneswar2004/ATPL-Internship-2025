package com.aaslin.SpringDataJPA.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publisher_gnani")
public class Publisher {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    // Many-to-Many with Books
    @ManyToMany(mappedBy = "publishers")
    private List<Book> books;

	public Publisher() {
	}

	public Publisher(Long id, String name, String location, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}