package com.bookback.back_book.services;

import com.bookback.back_book.models.Administrateur;
import com.bookback.back_book.models.AdministrateurRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdministrateurService {

    private final AdministrateurRepository administrateurRepository;

    public AdministrateurService(AdministrateurRepository administrateurRepository) {
        this.administrateurRepository = administrateurRepository;
    }

    public AdministrateurRepository getAdministrateurRepository() {
        return administrateurRepository;
    }

    public Optional<Administrateur> findAdministrateurById(Long id) {
        return administrateurRepository.findById(id);
    }
}
