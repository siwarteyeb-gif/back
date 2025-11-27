package com.siwar.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siwar.demo.entities.Genre;
import com.siwar.demo.entities.Parfum;
import com.siwar.demo.repos.ParfumRepository;
@Service
public class ParfumServiceImpl implements ParfumService{
	@Autowired
	ParfumRepository parfumRepository;

	@Override
	public Parfum saveParfum(Parfum p) {
		return parfumRepository.save(p);
	}

	@Override
	public Parfum updateParfum(Parfum p) {
		return parfumRepository.save(p);
	}

	@Override
	public void deleteParfum(Parfum p) {
		parfumRepository.delete(p);
		
	}

	@Override
	public void deleteParfumById(Long id) {
		parfumRepository.deleteById(id);
		
	}

	@Override
	public Parfum getParfum(Long id) {
		return parfumRepository.findById(id).get();
	}

	@Override
	public List<Parfum> getAllParfums() {
		
		return parfumRepository.findAll();
	}

	@Override
	public List<Parfum> findByNomParfum(String nom) {
		
		return parfumRepository.findByNomParfum(nom);
	}

	@Override
	public List<Parfum> findByNomParfumContains(String nom) {
		return parfumRepository.findByNomParfumContains(nom);
	}

	@Override
	public List<Parfum> findByNomPrix(String nom, int prix) {
		return parfumRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Parfum> findByGenre(Genre genre) {
		return parfumRepository.findByGenre(genre);
	}

	@Override
	public List<Parfum> findByGenreIdGen(int id) {
		return parfumRepository.findByGenreIdGen(id);
	}

	@Override
	public List<Parfum> findByOrderByNomParfumAsc() {
		return parfumRepository.findByOrderByNomParfumAsc();
	}

	@Override
	public List<Parfum> trierParfumsNomsPrix() {
		return parfumRepository.trierParfumsNomsPrix();
	}


	
	


}
