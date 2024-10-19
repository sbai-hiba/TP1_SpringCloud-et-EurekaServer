package org.example.voiture.repositories;

import org.example.voiture.entities.Voiture;
import org.springframework.data.repository.CrudRepository;

public interface VoitureRepository extends CrudRepository<Voiture, Long> {
}
