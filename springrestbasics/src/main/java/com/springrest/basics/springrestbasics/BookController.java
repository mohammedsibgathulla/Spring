package com.springrest.basics.springrestbasics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("/books")
	public List<Book> getBooks() {
		return Arrays.asList(new Book("1", "The Sealed Nectar", "Saifur Rahman"), new Book("1", "Bukhari", "Imam Bukhari"));
	}
}
