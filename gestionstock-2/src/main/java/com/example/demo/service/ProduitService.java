package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Produit;

public interface ProduitService {

	Produit ajoutProduit(Produit produit);
	List<Produit> getAll();
	Produit updateProduit(Produit produit,int id_p);
    void deleteProduit(int id_p);
    public Produit getProduitById(int id_p);
}
