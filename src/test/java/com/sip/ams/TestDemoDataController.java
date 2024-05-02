package com.sip.ams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sip.ams.entities.Etudiant;
import com.sip.ams.repositories.EtudiantRepository;

import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest
public class TestDemoDataController {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Test
    public void testCRUDOperations() {
        // Create
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("John Doe");
        etudiant.setAge(25);
        etudiantRepository.save(etudiant);

        // Read
        Etudiant retrievedEtudiant = etudiantRepository.findById(etudiant.getId()).orElse(null);
        assertEquals("John Doe", retrievedEtudiant.getNom());
        assertEquals(25, retrievedEtudiant.getAge());

        // Update
        retrievedEtudiant.setNom("Jane Doe");
        retrievedEtudiant.setAge(30);
        etudiantRepository.save(retrievedEtudiant);

        Etudiant updatedEtudiant = etudiantRepository.findById(etudiant.getId()).orElse(null);
        assertEquals("Jane Doe", updatedEtudiant.getNom());
        assertEquals(30, updatedEtudiant.getAge());

        // Delete
        etudiantRepository.deleteById(etudiant.getId());
        Etudiant deletedEtudiant = etudiantRepository.findById(etudiant.getId()).orElse(null);
        assertEquals(null, deletedEtudiant);
    }
}
