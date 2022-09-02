package com.fatec.petplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.petplus.model.UserOwner;

public interface UserOwnerRepository  extends JpaRepository<UserOwner, Long>{

}
