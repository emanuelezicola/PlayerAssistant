package it.projectalpha.playerassistant.repository.personaggio;

import it.projectalpha.playerassistant.model.Personaggio;
import org.springframework.data.repository.CrudRepository;

public interface PersonaggioRepository extends CrudRepository<Personaggio, Long> {


    Personaggio findByNome(String nome);
}
