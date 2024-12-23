package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id_cl;

	    private String nom;
	    private String adresse;

	    @OneToMany(mappedBy = "client")
	    private List<Commande> commandes;

		public Client(int id_cl, String nom, String adresse, List<Commande> commandes) {
			super();
			this.id_cl = id_cl;
			this.nom = nom;
			this.adresse = adresse;
			this.commandes = commandes;
		}

		public int getId_cl() {
			return id_cl;
		}

		public void setId_cl(int id_cl) {
			this.id_cl = id_cl;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public List<Commande> getCommandes() {
			return commandes;
		}

		public void setCommandes(List<Commande> commandes) {
			this.commandes = commandes;
		}
	    
	    public Client() {}

}
