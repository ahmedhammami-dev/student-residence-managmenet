package tn.esprit.tp_foyer.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Foyer;
import tn.esprit.tp_foyer.repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class FoyerServiceImpl implements IFoyerService{

    private FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long id) {
        return foyerRepository.findById(id).isPresent() ? foyerRepository.findById(id).get() : null;
    }

    @Override
    public Foyer saveFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void removeFoyer(Long id) {
        foyerRepository.deleteById(id);
    }

}
