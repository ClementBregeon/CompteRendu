package com.sip.ams.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sip.ams.entities.Etudiant;

@Repository 
public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {

}
