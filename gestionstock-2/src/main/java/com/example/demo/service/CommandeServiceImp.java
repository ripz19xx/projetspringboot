package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Client;
import com.example.demo.entity.Commande;
import com.example.demo.entity.Produit;
import com.example.demo.repository.ClientRepo;
import com.example.demo.repository.CommandeRepo;
import com.example.demo.repository.ProduitRepo;

@Service
public class CommandeServiceImp implements CommandeService{

	 @Autowired
	    private CommandeRepo commandeRepo;
	 
	 @Autowired
	    private ProduitRepo produitRepo;

	    @Autowired
	    private ClientRepo clientRepo;
	
	/*@Override
	public Commande ajoutCommande(int id_cl, int id_p, int quantite) {
		Client client = clientRepo.findById(id_cl).orElse(null);
        Produit produit = produitRepo.findById(id_p).orElse(null);

       
            Commande commande = new Commande();
            commande.setClient(client);
            commande.setProduit(produit);
            commande.setQuantite(quantite);
            commande.setTotalAPayer(produit.getPrix() * quantite);
           
            
            return commandeRepo.save(commande);
        
       
	}*/
	    
	    public Commande ajoutCommande(Commande commande) {
	    	 Produit produit = commande.getProduit();

	        

	         double total = commande.getQuantite() * produit.getPrix();
	         commande.setTotalAPayer(total);

	        

	         return commandeRepo.save(commande);
	    }

	@Override
	public List<Commande> getAll() {
		// TODO Auto-generated method stub
		return (List<Commande>)
				commandeRepo.findAll();
	}

	@Override
	public Commande updateClient(Commande commande, int id_com) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCommande(int id_com) {
		// TODO Auto-generated method stub
		commandeRepo.deleteById(id_com);

	}

}
