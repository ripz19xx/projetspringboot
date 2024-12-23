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

import com.example.demo.entity.Client;
import com.example.demo.service.ClientService;

@RestController
@CrossOrigin
@RequestMapping("api/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	
	 @PostMapping("/ajout")
	 public Client saveClient(
		         @RequestBody Client client)
		    {
		        return clientService.ajoutClient(client);
		    }
	 
	 @GetMapping("/all")
	    public List<Client> getAll()
	    {
	        return clientService.getAll();
	    }
	 
	 @PutMapping("/update/{id}")
	    public Client
	    updateDepartment(@RequestBody Client client,
	                     @PathVariable("id") int id_cl)
	    {
	        return clientService.updateClient(
	        		client, id_cl);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public String deleteClientById(@PathVariable("id")
	                                       int id_cl)
	    {
		 clientService.deleteClient(
				 id_cl);
	        return "Client supprimé";
	    }
	
}
