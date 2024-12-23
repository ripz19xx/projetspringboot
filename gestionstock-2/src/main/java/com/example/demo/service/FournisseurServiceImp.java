package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Fournisseur;
import com.example.demo.repository.CategoryRepo;
import com.example.demo.repository.FournisseurRepo;

@Service
public class FournisseurServiceImp implements FournisseurService{

	@Autowired
	private FournisseurRepo fournisseurRepo;
	@Override
	public Fournisseur ajoutFournisseur(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		return fournisseurRepo.save(fournisseur);
	}

	@Override
	public List<Fournisseur> getAll() {
		// TODO Auto-generated method stub
		return (List<Fournisseur>)
				fournisseurRepo.findAll();
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur fournisseur, int id_f) {
		// TODO Auto-generated method stub
		Fournisseur f
        = fournisseurRepo.findById(id_f)
              .get();

    if (Objects.nonNull(fournisseur.getNom())
        && !"".equalsIgnoreCase(
        		fournisseur.getNom())) {
        f.setNom(
        		f.getNom());
        }
    
    if (Objects.nonNull(fournisseur.getContact())
            && !"".equalsIgnoreCase(
            		fournisseur.getContact())) {
            f.setContact(
            		f.getContact());
            }
        	return fournisseurRepo.save(f);
	}

	@Override
	public void deleteFournisseur(int id_f) {
		// TODO Auto-generated method stub
		fournisseurRepo.deleteById(id_f);
	}

	@Override
	public Fournisseur findById(int id_f) {
		// TODO Auto-generated method stub
		Optional<Fournisseur> fournisseur = fournisseurRepo.findById(id_f);
        return fournisseur.orElse(null);
	}

}
