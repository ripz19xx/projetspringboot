package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Produit;

public interface ProduitRepo extends JpaRepository<Produit,Integer>{

}
