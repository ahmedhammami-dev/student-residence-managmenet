package tn.esprit.tp_foyer.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.entity.Chambre;
import tn.esprit.tp_foyer.repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class ChambreServiceImpl implements IChambreService{
    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long id) {
        return chambreRepository.findById(id).isPresent() ? chambreRepository.findById(id).get() : null;
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambreByNumero(Long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);    }





}
