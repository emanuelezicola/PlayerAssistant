package it.projectalpha.playerassistant.repository.utente;

import it.projectalpha.playerassistant.model.Utente;
import org.springframework.data.repository.CrudRepository;


/**
 * Interfaccia per il caricamento dell'utente
 */
public interface UtenteRepository extends CrudRepository<Utente, Long> {

    Utente findByUsernameAndPassword(String username, String password);

}
