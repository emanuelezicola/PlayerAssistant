package it.projectalpha.playerassistant.service.personaggio;

import it.projectalpha.playerassistant.model.Personaggio;
import it.projectalpha.playerassistant.model.Utente;
import it.projectalpha.playerassistant.repository.personaggio.PersonaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PersonaggioServiceImpl implements PersonaggioService {

    @Autowired
    private PersonaggioRepository repository;

    @Transactional(readOnly = true)
    public List<Personaggio> listAllPersonaggi() {
        return (List<Personaggio>) repository.findAll();
    }

    @Transactional(readOnly = true)
    public Personaggio caricaSingoloPersonaggio(long id) {
        return repository.findOne(id);
    }

    @Transactional
    public void aggiorna(Personaggio personaggioInstance) {
        repository.save(personaggioInstance);
    }

    @Transactional
    public void inserisciNuovo(Personaggio personaggioInstance) {
        repository.save(personaggioInstance);
    }

    @Transactional
    public void rimuovi(Personaggio personaggioInstance) {
        repository.delete(personaggioInstance);

    }

    @Transactional(readOnly = true)
    public List<Personaggio> findByExample(Personaggio example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Personaggio> caricaPersonaggi(Utente utente) {
        return repository.findByUtente(utente);
    }
}
