package it.softwareinside.team.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Giocatore {

    @Id
    private String cognomeG;

    private String ruolo;
    private Integer eta;
    
}
