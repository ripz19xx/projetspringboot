package com.example.demo.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_cat",length=11)
	private int id_cat;
	
	@Column(name="nom",length=11)
	private String nom ;
	
	@OneToMany(mappedBy = "category")
    private List<Produit> produits;

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Category(int id_cat, String nom) {
		super();
		this.id_cat = id_cat;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Category [id_cat=" + id_cat + ", nom=" + nom + "]";
	}
	
	public Category() {
		
	}

	public Category(int id_cat) {
		this.id_cat = id_cat;
	}
	
}
