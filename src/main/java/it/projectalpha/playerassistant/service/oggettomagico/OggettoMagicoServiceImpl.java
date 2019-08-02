package it.projectalpha.playerassistant.service.oggettomagico;

import it.projectalpha.playerassistant.model.OggettoMagicoItem;
import it.projectalpha.playerassistant.repository.oggettomagico.OggettoMagicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class OggettoMagicoServiceImpl implements OggettoMagicoService {


    @Autowired
    private OggettoMagicoRepository repository;

    @Transactional(readOnly = true)
    public List<OggettoMagicoItem> listAllOggettiMagici() {
        return (List<OggettoMagicoItem>) repository.findAll();
    }

    @Transactional(readOnly = true)
    public OggettoMagicoItem caricaSingoloOggettoMagico(long id) {
        return repository.findOne(id);
    }

    @Transactional
    public void aggiorna(OggettoMagicoItem oggettoMagicoItemInstance) {
        repository.save(oggettoMagicoItemInstance);
    }

    @Transactional
    public void inserisciNuovo(OggettoMagicoItem oggettoMagicoItemInstance) {
        repository.save(oggettoMagicoItemInstance);
    }

    @Transactional
    public void rimuovi(OggettoMagicoItem oggettoMagicoItemInstance) {
        repository.delete(oggettoMagicoItemInstance);

    }

    @Transactional(readOnly = true)
    public List<OggettoMagicoItem> findByExample(OggettoMagicoItem example) {
        // TODO Auto-generated method stub
        return null;
    }

}
