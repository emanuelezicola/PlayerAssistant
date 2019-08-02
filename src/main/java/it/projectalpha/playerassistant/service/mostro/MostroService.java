package it.projectalpha.playerassistant.service.mostro;

import it.projectalpha.playerassistant.model.Mostro;

import java.util.List;

public interface MostroService {

    List<Mostro> listAllMostri() ;

    Mostro caricaSingoloMostro(long id);

    void aggiorna(Mostro mostroInstance);

    void inserisciNuovo(Mostro mostroInstance);

    void rimuovi(Mostro mostroInstance);

    List<Mostro> findByExample(Mostro example);

}
