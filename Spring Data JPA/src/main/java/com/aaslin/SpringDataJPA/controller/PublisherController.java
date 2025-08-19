package com.aaslin.SpringDataJPA.controller;

import com.aaslin.SpringDataJPA.entity.Publisher;
import com.aaslin.SpringDataJPA.repository.PublisherRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    private final PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
		this.publisherRepository = publisherRepository;
	}

	@PostMapping
    public Publisher create(@RequestBody Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @GetMapping
    public List<Publisher> getAll() {
        return publisherRepository.findAll();
    }

    @PutMapping("/{id}")
    public Publisher update(@PathVariable Long id, @RequestBody Publisher updatedPublisher) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow();
        publisher.setName(updatedPublisher.getName());
        publisher.setLocation(updatedPublisher.getLocation());
        return publisherRepository.save(publisher);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        publisherRepository.deleteById(id);
        return "Publisher deleted Succesfully!";
    }
}