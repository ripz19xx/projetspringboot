package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_p",length=11)
	private int id_p;
	
	@Column(name="nom",length=11)
	private String nom ;
	
	@Column(name="prix",length=11)
	private double prix;
	
	@ManyToOne
    @JoinColumn(name = "id_c")
    private Category category;
	
	@ManyToOne
    @JoinColumn(name = "id_f")
    private Fournisseur fournisseur;

	public Produit(int id_p, String nom, double prix, Category category, Fournisseur fournisseur) {
		super();
		this.id_p = id_p;
		this.nom = nom;
		this.prix = prix;
		this.category = category;
		this.fournisseur = fournisseur;
	}

	public Produit() {
		
	}

	public int getId_p() {
		return id_p;
	}

	public void setId_p(int id_p) {
		this.id_p = id_p;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	@Override
	public String toString() {
		return "Produit [id_p=" + id_p + ", nom=" + nom + ", prix=" + prix + ", category=" + category + ", fournisseur="
				+ fournisseur + "]";
	}
	
	
	
}
