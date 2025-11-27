package com.siwar.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.siwar.demo.entities.Genre;

@RepositoryRestResource(path = "gen")
@CrossOrigin(origins="http://localhost:4200/")
public interface GenreRepository extends JpaRepository<Genre,Integer>{

}
