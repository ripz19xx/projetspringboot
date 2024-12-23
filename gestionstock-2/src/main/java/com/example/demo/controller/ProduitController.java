package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.entity.Fournisseur;
import com.example.demo.entity.Produit;
import com.example.demo.repository.CategoryRepo;
import com.example.demo.repository.FournisseurRepo;
import com.example.demo.service.CategoryService;
import com.example.demo.service.FournisseurService;
import com.example.demo.service.ProduitService;

@RestController
@CrossOrigin
@RequestMapping("/api/produit")
public class ProduitController {
	@Autowired
	private ProduitService produitservice;
	
	
	
	@PostMapping("/ajout")
	 public Produit saveProduit(
		         @RequestBody Produit produit)
		    {
		        return produitservice.ajoutProduit(produit);
		    }
	
	@Autowired
    private CategoryService categoryService;

    @Autowired
    private FournisseurService fournisseurService;

    /*@PostMapping("/ajout")
    public ResponseEntity<?> addProduit(@RequestBody Produit produit) {
        try {
            // Récupérer la catégorie et le fournisseur à partir de l'ID
            Category category = categoryService.findById(produit.getCategory().getId_cat());
            Fournisseur fournisseur = fournisseurService.findById(produit.getFournisseur().getId_f());

            if (category == null || fournisseur == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("La catégorie ou le fournisseur spécifié n'existe pas.");
            }

            // Associer la catégorie et le fournisseur avant d'ajouter le produit
            produit.setCategory(category);
            produit.setFournisseur(fournisseur);

            // Ajouter le produit
            Produit savedProduit = produitservice.ajoutProduit(produit);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedProduit);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erreur lors de l'ajout du produit : " + e.getMessage());
        }
    }*/
	 
	
	 /*@GetMapping
	    public String getAllProduits(Model model) {
	        model.addAttribute("produits", produitservice.getAll());
	        return "produits";
	    }
	 
	 @GetMapping("/supprimer/{id}")
	    public String supprimerProduit(@PathVariable int id_p) {
	        produitservice.deleteProduit(id_p);
	        return "redirect:/produits";
	    }*/
	
	 @GetMapping("/all")
	    public List<Produit> getAll()
	    {
	        return produitservice.getAll();
	    }
	 
	 @PutMapping("/update/{id}")
	    public Produit
	    updateFournisseur(@RequestBody Produit produit,
	                     @PathVariable("id") int id_p)
	    {
	        return produitservice.updateProduit(
	        		produit, id_p);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public String deleteProduitById(@PathVariable("id")
	                                       int id_p)
	    {
		 produitservice.deleteProduit(
				 id_p);
	        return "Produit supprimé";
	    }
	 
	 /*@GetMapping("/supprimer/{id}")
	    public String supprimerProduit(@PathVariable int id_p) {
	        produitservice.deleteProduit(id_p);
	        return "redirect:/produits";
	    }*/
}
