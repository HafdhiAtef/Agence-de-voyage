package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ReclamationRepository extends JpaRepository<Reclamation, Integer> {

	@Query("select c from Reclamation c where c.Titre like :Titre")
	public Page<Reclamation> reclamationByNom(@Param("Titre") String n, Pageable pageable);
}