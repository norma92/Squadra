package it.softwareinside.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareinside.team.models.Giocatore;

@Repository
public interface GiocatoreRepository extends JpaRepository<Giocatore, String>{
    
}