package it.projectalpha.playerassistant.service.oggettomagico;

import it.projectalpha.playerassistant.model.OggettoMagicoItem;

import java.util.List;

public interface OggettoMagicoService {

    List<OggettoMagicoItem> listAllOggettiMagici() ;

    OggettoMagicoItem caricaSingoloOggettoMagico(long id);

    void aggiorna(OggettoMagicoItem oggettoMagicoItemInstance);

    void inserisciNuovo(OggettoMagicoItem oggettoMagicoItemInstance);

    void rimuovi(OggettoMagicoItem oggettoMagicoItemInstance);

    List<OggettoMagicoItem> findByExample(OggettoMagicoItem example);
}
