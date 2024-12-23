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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Client;
import com.example.demo.entity.Commande;
import com.example.demo.entity.Produit;
import com.example.demo.service.ClientService;
import com.example.demo.service.CommandeService;
import com.example.demo.service.ProduitService;

@RestController
@CrossOrigin
@RequestMapping("api/commande")
public class CommandeCotroller {

	@Autowired
	private CommandeService commandeService;
	
	@Autowired
    private ProduitService produitService;

    @Autowired
    private ClientService clientService;
	
	 /*@PostMapping("/ajout")
	 public Commande saveClient(
		         @RequestBody Commande commande)
		    {
		        return commandeService.ajoutCommande(commande);
		    }*/
    /*@PostMapping("/ajout")
	public Commande ajouterCommande(
            @RequestParam int id_cl,
            @RequestParam int id_p,
            @RequestParam int quantite
			
			) {
        
      

       
        return commandeService.ajoutCommande(id_cl, id_p, quantite);
    	
    }*/
    @PostMapping("/ajout")
    public Commande passerCommande(@RequestBody Commande commande) {
        return commandeService.ajoutCommande(commande);
    }
	 
	 @GetMapping("/all")
	    public List<Commande> getAll()
	    {
	        return commandeService.getAll();
	    }
	 
	 @PutMapping("/update/{id}")
	    public Commande
	    updateCommande(@RequestBody Commande commande,
	                     @PathVariable("id") int id_com)
	    {
	        return commandeService.updateClient(
	        		commande, id_com);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public String deleteCommandeById(@PathVariable("id")
	                                       int id_com)
	    {
		 commandeService.deleteCommande(
				 id_com);
	        return "Commande supprimé";
	    }
	
}
