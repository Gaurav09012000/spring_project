package com.nagarro.bookservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping("/")
	public String getInfo() {
		return "Docker Assignment";
	}
}
