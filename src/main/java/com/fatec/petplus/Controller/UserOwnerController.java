package com.fatec.petplus.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fatec.petplus.model.UserOwner;
import com.fatec.petplus.repository.UserOwnerRepository;

@Controller
@RequestMapping("/userowner")
@CrossOrigin(value= "*", allowedHeaders = "*")
public class UserOwnerController {
	
	@Autowired
	private UserOwnerRepository ownerRepository;
	
	
	@GetMapping
	public ResponseEntity<List<UserOwner>> GetAll(){
		return ResponseEntity.ok(ownerRepository.findAll());
	}
	
	
	
	@PostMapping
	public ResponseEntity<UserOwner> post(@Valid @RequestBody UserOwner UserOwner){
		return ResponseEntity.status(HttpStatus.CREATED).body(ownerRepository.save(UserOwner));
	}

	
}
