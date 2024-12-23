package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Client;

public interface ClientService {

	
	Client ajoutClient(Client client);
	List<Client> getAll();
	Client updateClient(Client client,int id_cl);
    void deleteClient(int id_cl);
    public Client getClientById(int id_cl);

}
