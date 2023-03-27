package it.softwareinside.team.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.team.models.Squadra;
import it.softwareinside.team.repository.SquadraRepository;

@Service
public class SquadraService {

    @Autowired
    SquadraRepository sR;

    /**
     * il metodo permette di inserire una squadra nel database
     * restituendo un booleano che corrisponde all'esito dell'operazione
     * @param squadra
     * @return
     */
    public boolean add(Squadra squadra){
        try {
            sR.save(squadra);
            return true;
        } catch (Exception e) {
            System.out.println("errore nell'aggiunta della squadra: " + e);
            return false;
        }
    }

    /**
     * il metodo permette di modificare una squadra
     * serve inserire l'id di ciascuna classe in modo corretto, devono essere corrispondenti a quelli della squadra da modificare
     * altrimenti vengono creati elementi dei quali è stato inserito un id non corrispondente
     * restituendo un booleano che corrisponde all'esito dell'operazione
     * 
     * @param squadra
     * @return
     */
    public boolean update(Squadra squadra){
        try {
            add(squadra);
            return true;
        } catch (Exception e) {
            System.out.println("errore nella modifica della squadra: " + e);
            return false;
        }
    }

    /**
     * il metodo restituisce la squadra di cui viene inserito il nome,
     * che corrisponde all'id
     * 
     * @param nome
     * @return
     */
    public Squadra find(String nome){
        try {
            //il metodo findById ha bisogno del get() per essere sicuri di avere un ritorno
            return sR.findById(nome).get();

        } catch (Exception e) {
            System.out.println("errore nella ricerca di una squadra: " + e);
            return null;
        }
    }

    /**
     * questo metodo permette di avere la stampa di tutte le squadre presenti nel database
     * 
     * @return
     */
    public Iterable<Squadra> database(){
        try {
            return sR.findAll();

        } catch (Exception e) {
            System.out.println("errore nella stampa di tutti gli elementi " + e);
            return null;

        }
    }

    /**
     * il metodo cancella l'elemento di cui passiamo l'id
     * 
     * @param nome
     * @return
     */
    public boolean delete(String nome){
        try {
            sR.deleteById(nome);
            return true;
        } catch (Exception e) {
            System.out.println("errore nell'eliminazione dell'elemento: " + e);
            return false;

        }
    }

    /**
     * il metodo cancella ogni elemento del database
     * 
     * @return
     */
    public boolean deleteAll(){
        try {
            sR.deleteAll();
            return true;
        } catch (Exception e) {
            System.out.println("errore nell'eliminazione degli elementi: " + e);
            return false;
        }
    }
}
