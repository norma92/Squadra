package it.softwareinside.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareinside.team.models.Allenatore;

@Repository
public interface AllenatoreRepository extends JpaRepository<Allenatore, String>{
    
}