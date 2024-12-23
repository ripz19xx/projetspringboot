package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Fournisseur;
import com.example.demo.entity.Produit;
import com.example.demo.repository.CategoryRepo;
import com.example.demo.repository.FournisseurRepo;
import com.example.demo.repository.ProduitRepo;


@Service
public class ProduitServiceImp implements ProduitService {

	@Autowired
	private ProduitRepo produitRepo;
	
	
	@Override
	public Produit ajoutProduit(Produit produit) {
		// TODO Auto-generated method stub
		
	        return produitRepo.save(produit);

	}

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return (List<Produit>)
				produitRepo.findAll();
	}

	@Override
	public Produit updateProduit(Produit produit, int id_p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(int id_p) {
		// TODO Auto-generated method stub
		produitRepo.deleteById(id_p);
	}

	@Override
	public Produit getProduitById(int id_p) {
		// TODO Auto-generated method stub
		return produitRepo.findById(id_p)
                .orElseThrow(() -> new RuntimeException("Produit not found with ID: " + id_p));
	}

}
