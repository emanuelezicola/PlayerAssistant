package it.projectalpha.playerassistant.service.personaggio;

import it.projectalpha.playerassistant.model.Personaggio;
import it.projectalpha.playerassistant.model.Utente;

import java.util.List;

public interface PersonaggioService {


    List<Personaggio> listAllPersonaggi() ;

    Personaggio caricaSingoloPersonaggio(long id);

    void aggiorna(Personaggio personaggioInstance);

    void inserisciNuovo(Personaggio personaggioInstance);

    void rimuovi(Personaggio personaggioInstance);

    List<Personaggio> findByExample(Personaggio example);

    List<Personaggio> caricaPersonaggi(Utente utente);
}
