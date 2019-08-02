package it.projectalpha.playerassistant.service.equipaggiamento;

import it.projectalpha.playerassistant.model.EquipaggiamentoItem;
import it.projectalpha.playerassistant.repository.equipaggiamentoitem.EquipaggiamentoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EquipaggiamentoItemServiceImpl implements EquipaggiamentoItemService {

    @Autowired
    private EquipaggiamentoItemRepository repository;

    @Transactional(readOnly = true)
    public List<EquipaggiamentoItem> listAllEquipaggiamenti() {
        return (List<EquipaggiamentoItem>) repository.findAll();
    }

    @Transactional(readOnly = true)
    public EquipaggiamentoItem caricaSingoloEquipaggiamento(long id) {
        return repository.findOne(id);
    }

    @Transactional
    public void aggiorna(EquipaggiamentoItem equipaggiamentoInstance) {
        repository.save(equipaggiamentoInstance);
    }

    @Transactional
    public void inserisciNuovo(EquipaggiamentoItem equipaggiamentoInstance) {
        repository.save(equipaggiamentoInstance);
    }

    @Transactional
    public void rimuovi(EquipaggiamentoItem equipaggiamentoInstance) {
        repository.delete(equipaggiamentoInstance);

    }

    @Transactional(readOnly = true)
    public List<EquipaggiamentoItem> findByExample(EquipaggiamentoItem example) {
        // TODO Auto-generated method stub
        return null;
    }



}
