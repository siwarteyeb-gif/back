package com.siwar.demo.service;

import java.util.List;

import com.siwar.demo.entities.Genre;
import com.siwar.demo.entities.Parfum;

public interface ParfumService {
	Parfum saveParfum(Parfum p);
	Parfum updateParfum(Parfum p);
	void deleteParfum(Parfum p);
	void deleteParfumById(Long id);
	Parfum getParfum(Long id);
	List<Parfum> getAllParfums();
	List<Parfum> findByNomParfum(String nom); 
	List<Parfum> findByNomParfumContains(String nom); 
	List<Parfum> findByNomPrix (String nom, int prix); 
	List<Parfum> findByGenre (Genre genre); 
	List<Parfum> findByGenreIdGen(int id); 
	List<Parfum> findByOrderByNomParfumAsc(); 
	List<Parfum> trierParfumsNomsPrix();

}
