package tn.esprit.devopspipeline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.devopspipeline.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
