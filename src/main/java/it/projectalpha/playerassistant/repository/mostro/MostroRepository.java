package it.projectalpha.playerassistant.repository.mostro;

import it.projectalpha.playerassistant.model.Mostro;
import org.springframework.data.repository.CrudRepository;

public interface MostroRepository extends CrudRepository<Mostro, Long> {


    Mostro findByNome(String nome);
}
