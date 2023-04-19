package com.caique.workshopmongo.resources;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caique.workshopmongo.domain.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1","Caique silva", "caique@gmail.com");
		User jorge = new User("2","Jorge silva", "jorge@gmail.com");
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(maria, jorge));
		return ResponseEntity.ok().body(list);
	}
}
