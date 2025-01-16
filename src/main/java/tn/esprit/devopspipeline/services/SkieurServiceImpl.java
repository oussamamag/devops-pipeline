package tn.esprit.devopspipeline.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.devopspipeline.entities.Skieur;
import tn.esprit.devopspipeline.repositories.SkieurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class SkieurServiceImpl implements ISkieurService{

    private SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkiers() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkier(Skieur skier) {
        return skieurRepository.save(skier);
    }

    @Override
    public void removeSkier(Long numSkier) {
skieurRepository.deleteById(numSkier);
    }

    @Override
    public Skieur retrieveSkier(Long numSkier) {
        return skieurRepository.findById(numSkier).orElse(null);
    }
}
