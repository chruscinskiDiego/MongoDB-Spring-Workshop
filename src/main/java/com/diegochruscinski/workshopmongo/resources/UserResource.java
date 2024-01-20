package com.diegochruscinski.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegochruscinski.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User diego = new User("1","Diego Chruscinski de Souza", "contato@diegochruscinski.com.br");
		User milena = new User("2","Milena Chruscinski de Souza", "contato@milenachruscinski.com.br");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(diego,milena));
		return ResponseEntity.ok().body(list);
	}
}
