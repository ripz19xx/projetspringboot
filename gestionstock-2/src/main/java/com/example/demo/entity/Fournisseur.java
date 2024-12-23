package com.example.demo.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="fournisseur")
public class Fournisseur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_f",length=11)
	private int id_f;
	
	@Column(name="nom",length=11)
	private String nom ;
	
	@Column(name="contact",length=11)
	private String contact ;

	@OneToMany(mappedBy = "fournisseur")
    private List<Produit> produits;
	
	public int getId_f() {
		return id_f;
	}

	public void setId_f(int id_f) {
		this.id_f = id_f;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Fournisseur(int id_f, String nom, String contact) {
		super();
		this.id_f = id_f;
		this.nom = nom;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Fournisseur [id_f=" + id_f + ", nom=" + nom + ", contact=" + contact + "]";
	}
	
	public Fournisseur() {
		
	}

	public Fournisseur(int id_f) {
		
		this.id_f = id_f;
	}
	
	
}


