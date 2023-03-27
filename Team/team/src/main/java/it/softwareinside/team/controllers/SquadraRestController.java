package it.softwareinside.team.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.team.models.Squadra;
import it.softwareinside.team.services.SquadraService;

@RestController
public class SquadraRestController {
    
    @Autowired
    SquadraService sS;

    @PostMapping("/add-s")
    public boolean addS(@RequestBody Squadra squadra){
        return sS.add(squadra);
        
    }

    @PostMapping("/update-s")
    public boolean updateS(@RequestBody Squadra squadra){
        return sS.update(squadra);

    }

    @GetMapping("/find-s")
    public Squadra findS(@RequestParam String nome){
        return sS.find(nome);
    }

    @GetMapping("/database")
    public Iterable<Squadra> databaseS(){
        return sS.database();
    }

    @DeleteMapping("/delete-s")
    public boolean deleteS(String nome){
        return sS.delete(nome);
    }

    @DeleteMapping("/delete")
    public boolean delete(){
        return sS.deleteAll();
    }
}
