package it.projectalpha.playerassistant.repository.personaggio;

import it.projectalpha.playerassistant.model.Personaggio;
import it.projectalpha.playerassistant.model.Utente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaggioRepository extends CrudRepository<Personaggio, Long> {


    Personaggio findByNome(String nome);

    List<Personaggio> findByUtente(Utente utente);
}
