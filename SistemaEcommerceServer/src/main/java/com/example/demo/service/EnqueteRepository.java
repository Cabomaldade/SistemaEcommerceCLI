package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Enquete;

@Repository
public interface EnqueteRepository extends JpaRepository<Enquete,Integer>{
	

}

