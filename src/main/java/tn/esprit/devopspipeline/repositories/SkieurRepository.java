package tn.esprit.devopspipeline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.devopspipeline.entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
}
