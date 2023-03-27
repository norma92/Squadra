package it.softwareinside.team.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Squadra {

    @Id
    private String nome;

    private Integer trofei;

    @OneToOne(cascade =  CascadeType.ALL)
    private Allenatore allenatore;

    @OneToMany(cascade = CascadeType.ALL)    
    private Set<Giocatore> giocatori;
    
}
