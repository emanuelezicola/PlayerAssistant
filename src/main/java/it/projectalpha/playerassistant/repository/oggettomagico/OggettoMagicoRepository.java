package it.projectalpha.playerassistant.repository.oggettomagico;

import it.projectalpha.playerassistant.model.OggettoMagicoItem;
import org.springframework.data.repository.CrudRepository;

public interface OggettoMagicoRepository extends CrudRepository<OggettoMagicoItem, Long> {


    OggettoMagicoItem findByNome(String nome);
}
