package it.softwareinside.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareinside.team.models.Squadra;

@Repository
public interface SquadraRepository extends JpaRepository<Squadra, String>{
    
}