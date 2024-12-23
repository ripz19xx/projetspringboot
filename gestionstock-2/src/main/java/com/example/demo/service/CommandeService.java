package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Client;
import com.example.demo.entity.Commande;
import com.example.demo.entity.Produit;

public interface CommandeService {
	//Commande ajoutCommande(int id_cl, int id_p, int quantite);
	Commande ajoutCommande(Commande commande);
	List<Commande> getAll();
	Commande updateClient(Commande commande,int id_com);
    void deleteCommande(int id_com);
}
