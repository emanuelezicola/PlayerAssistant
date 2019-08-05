package it.projectalpha.playerassistant.service.mostro;

import it.projectalpha.playerassistant.model.Mostro;
import it.projectalpha.playerassistant.repository.mostro.MostroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class MostroServiceImpl implements MostroService {

    @Autowired
    private MostroRepository repository;

        @Transactional(readOnly = true)
        public List<Mostro> listAllMostri() {
            return (List<Mostro>) repository.findAll();
        }

        @Transactional(readOnly = true)
        public Mostro caricaSingoloMostro(long id) {
            return repository.findOne(id);
        }

        @Transactional
        public void aggiorna(Mostro mostroInstance) {
            repository.save(mostroInstance);
        }

        @Transactional
        public void inserisciNuovo(Mostro mostroInstance) {
            repository.save(mostroInstance);
        }

        @Transactional
        public void rimuovi(Mostro mostroInstance) {
            repository.delete(mostroInstance);

        }

        @Transactional(readOnly = true)
        public List<Mostro> findByExample(Mostro example) {
            // TODO Auto-generated method stub
            return null;
        }

}
