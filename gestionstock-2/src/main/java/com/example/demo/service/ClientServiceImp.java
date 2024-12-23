package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepo;

@Service
public class ClientServiceImp implements ClientService{

	
	@Autowired
	private ClientRepo clientRepo;
	
	@Override
	public Client ajoutClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepo.save(client);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return (List<Client>)
				clientRepo.findAll();
	}

	@Override
	public Client updateClient(Client client, int id_cl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(int id_cl) {
		// TODO Auto-generated method stub
		clientRepo.deleteById(id_cl);
	}

	@Override
	public Client getClientById(int id_cl) {
		// TODO Auto-generated method stub
		return clientRepo.findById(id_cl)
                .orElseThrow(() -> new RuntimeException("Client not found with ID: " + id_cl));
    }

}
