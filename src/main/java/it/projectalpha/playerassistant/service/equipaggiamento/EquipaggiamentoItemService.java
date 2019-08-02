package it.projectalpha.playerassistant.service.equipaggiamento;

import it.projectalpha.playerassistant.model.EquipaggiamentoItem;

import java.util.List;

public interface EquipaggiamentoItemService {

    List<EquipaggiamentoItem> listAllEquipaggiamenti() ;

    EquipaggiamentoItem caricaSingoloEquipaggiamento(long id);

    void aggiorna(EquipaggiamentoItem equipaggiamentoInstance);

    void inserisciNuovo(EquipaggiamentoItem equipaggiamentoInstance);

    void rimuovi(EquipaggiamentoItem equipaggiamentoInstance);

    List<EquipaggiamentoItem> findByExample(EquipaggiamentoItem example);
}
