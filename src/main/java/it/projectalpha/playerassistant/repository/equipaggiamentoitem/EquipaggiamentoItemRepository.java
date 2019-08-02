package it.projectalpha.playerassistant.repository.equipaggiamentoitem;

import it.projectalpha.playerassistant.model.EquipaggiamentoItem;
import org.springframework.data.repository.CrudRepository;

public interface EquipaggiamentoItemRepository extends CrudRepository<EquipaggiamentoItem, Long> {


    EquipaggiamentoItem findByNome(String nome);
}
