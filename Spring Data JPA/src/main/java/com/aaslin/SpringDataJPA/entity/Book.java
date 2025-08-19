package com.aaslin.SpringDataJPA.entity;

import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "book_gnani")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String genre;
	
	@ManyToOne
	@JoinColumn(name = "author_id", nullable = false)
	@JsonIgnore
	private Author author;

	@ManyToMany
    @JoinTable(name = "book_publisher", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "publisher_id"))
    private List<Publisher> publishers;

	public Book() {
	}

	public Book(Long id, String title, String genre, Author author, List<Publisher> publishers) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.publishers = publishers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Publisher> getPublishers() {
		return publishers;
	}

	public void setPublishers(List<Publisher> publishers) {
		this.publishers = publishers;
	}
}