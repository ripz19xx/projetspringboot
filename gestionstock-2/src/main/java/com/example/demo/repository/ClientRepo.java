package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Client;

public interface ClientRepo extends JpaRepository<Client,Integer>{

}
