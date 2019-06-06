package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginResource {

	@Autowired
	private LoginRepository service;
	
	private Login loginTemp;
	
	@PostMapping
	public ResponseEntity<?> login(@Valid @RequestBody Login login) {
		
		loginTemp = service.findByEmail(login.getEmail());
		
		if( loginTemp == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else if(!loginTemp.getPassword().equals(login.getPassword())){
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
		return ResponseEntity.ok().build();
	}
	
	
}
