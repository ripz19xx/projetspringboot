package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Commande {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_com;

	private int quantite;

    private double totalAPayer;


    @ManyToOne
    @JoinColumn(name = "id_cl")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_p")
    private Produit produit;

    


	
    
    public int getId_com() {
		return id_com;
	}






	public void setId_com(int id_com) {
		this.id_com = id_com;
	}






	public int getQuantite() {
		return quantite;
	}






	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}






	public double getTotalAPayer() {
		return totalAPayer;
	}






	public void setTotalAPayer(double totalAPayer) {
		this.totalAPayer = totalAPayer;
	}






	public Client getClient() {
		return client;
	}






	public void setClient(Client client) {
		this.client = client;
	}






	public Produit getProduit() {
		return produit;
	}






	public void setProduit(Produit produit) {
		this.produit = produit;
	}






	public Commande(int id_com, int quantite, double totalAPayer, Client client, Produit produit) {
		super();
		this.id_com = id_com;
		this.quantite = quantite;
		this.totalAPayer = totalAPayer;
		this.client = client;
		this.produit = produit;
	}




	public void calculerTotal() {
        if (produit != null) {
            this.totalAPayer = produit.getPrix() * quantite;
        }
    }

	public Commande() {}

}
