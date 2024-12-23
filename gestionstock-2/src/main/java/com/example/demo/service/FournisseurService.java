package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.*;

public interface FournisseurService {

	Fournisseur ajoutFournisseur(Fournisseur fournisseur);
	List<Fournisseur> getAll();
	Fournisseur updateFournisseur(Fournisseur fournisseur,int id_f);
    void deleteFournisseur(int id_f);
	 Fournisseur findById(int id_f);
}
