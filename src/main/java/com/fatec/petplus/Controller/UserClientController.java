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

import com.fatec.petplus.model.UserClient;
import com.fatec.petplus.model.UserOwner;
import com.fatec.petplus.repository.UserClientRepository;
import com.fatec.petplus.repository.UserOwnerRepository;

@Controller
@RequestMapping("/userclient")
@CrossOrigin(value= "*", allowedHeaders = "*")
public class UserClientController {
	
	@Autowired
	private UserClientRepository clientRepository;
	
	
	@GetMapping
	public ResponseEntity<List<UserClient>> GetAll(){
		return ResponseEntity.ok(clientRepository.findAll());
	}
	
	
	
	@PostMapping
	public ResponseEntity<UserClient> post(@Valid @RequestBody UserClient userClient){
		return ResponseEntity.status(HttpStatus.CREATED).body(clientRepository.save(userClient));
	}
}
