package tn.esprit.devopspipeline.services;

import tn.esprit.devopspipeline.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkiers();

    Skieur  addSkier(Skieur  skier);

    void removeSkier (Long numSkier);

    Skieur retrieveSkier (Long numSkier);
}
