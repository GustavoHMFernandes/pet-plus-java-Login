package com.fatec.petplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.petplus.model.UserClient;

public interface UserClientRepository  extends JpaRepository<UserClient, Long>{

}
