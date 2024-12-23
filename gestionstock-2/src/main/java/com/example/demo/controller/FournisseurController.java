package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Fournisseur;
import com.example.demo.service.FournisseurService;

@RestController
@CrossOrigin
@RequestMapping("api/fournisseur")
public class FournisseurController {

	@Autowired
	private FournisseurService fournisseurservice;
	
	@PostMapping("/ajout")
	 public Fournisseur saveFournisseur(
		         @RequestBody Fournisseur fournisseur)
		    {
		        return fournisseurservice.ajoutFournisseur(fournisseur);
		    }
	 
	 @GetMapping("/all")
	    public List<Fournisseur> getAll()
	    {
	        return fournisseurservice.getAll();
	    }
	 
	 @PutMapping("/update/{id}")
	    public Fournisseur
	    updateFournisseur(@RequestBody Fournisseur fournisseur,
	                     @PathVariable("id") int id_f)
	    {
	        return fournisseurservice.updateFournisseur(
	        		fournisseur, id_f);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public String deleteFournisseurById(@PathVariable("id")
	                                       int id_f)
	    {
		 fournisseurservice.deleteFournisseur(
				 id_f);
	        return "Fournisseur supprimé";
	    }
}
