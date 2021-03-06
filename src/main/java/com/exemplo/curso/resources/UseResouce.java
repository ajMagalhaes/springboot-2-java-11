package com.exemplo.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UseResouce {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "90909090", "1234");
		return ResponseEntity.ok().body(u);
	}
	
}
