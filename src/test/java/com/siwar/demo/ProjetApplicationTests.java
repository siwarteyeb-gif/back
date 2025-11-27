package com.siwar.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.siwar.demo.entities.Genre;
import com.siwar.demo.entities.Parfum;
import com.siwar.demo.repos.ParfumRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
class ProjetApplicationTests {

	@Autowired
	private ParfumRepository parfumRepository;
	@Test
	 @Rollback(false)
	public void testCreateParfum() {
	Parfum prod = new Parfum("Hermès","Terre d’Hermès",350,"50 ml","hermes@parfum.com");
	parfumRepository.save(prod);
	}
	@Test
	public void testFindParfum()
	{
	Parfum p = parfumRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	 @Rollback(false)
	public void testFUpdateParfum()
	{
	Parfum p = parfumRepository.findById(1L).get();
	p.setPrixParfum(2000);
	parfumRepository.save(p);
	System.out.println(p);
	}
	@Test
	public void testDeletedParfum()
	{
	parfumRepository.deleteById(1L);
	}
	@Test
	public void testFindAllParfums()
	{
		List<Parfum> parfs=parfumRepository.findAll();
		for(Parfum p:parfs)
			System.out.println(p);
	}
	@Test
	public void testFindParfumByNom()
	{
	List<Parfum> prods = parfumRepository.findByNomParfum("Libre");
	for(Parfum p:prods)
		System.out.println(p);
	}
	@Test
	public void testFindParfumByNomContains()
	{
	List<Parfum> prods = parfumRepository.findByNomParfumContains("i");
	for(Parfum p:prods)
		System.out.println(p);
	}
	@Test
	public void testfindByNomPrix()
	{
	List<Parfum> prods = parfumRepository.findByNomPrix("Libre", 100);
	for (Parfum p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByGenre()
	{
	Genre gen = new Genre();
	gen.setIdGen(1);
	List<Parfum> prods = parfumRepository.findByGenre(gen);
	for (Parfum p : prods)
	{
	System.out.println(p);
	}
	}
	@Test 
	public void findByGenreIdGen() 
	{    
	List<Parfum>  prods = parfumRepository.findByGenreIdGen(1); 
	for (Parfum p : prods) 
	{ 
	System.out.println(p); 
	} 
	}
	@Test 
	 public void testfindByOrderByNomParfumAsc() 
	  { 
	  List<Parfum>  prods =    
	parfumRepository.findByOrderByNomParfumAsc();   
	   for (Parfum p : prods) 
	   { 
	    System.out.println(p); 
	   } 
	  }
	@Test 
	 public void testTrierParfumsNomsPrix() 
	  { 
	  List<Parfum>  prods = parfumRepository.trierParfumsNomsPrix();
	   
	   for (Parfum p : prods) 
	   { 
	    System.out.println(p); 
	   } 
	  }


	


}
