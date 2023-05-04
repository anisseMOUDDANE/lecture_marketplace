package com.bookback.back_book.services;

import com.bookback.back_book.models.Commande;
import com.bookback.back_book.models.CommandeRepository;
import com.bookback.back_book.models.Librairie;
import com.bookback.back_book.models.LibrairieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrairieService {
    private final LibrairieRepository librairieRepository;


    public LibrairieService(LibrairieRepository librairieRepository) {
        this.librairieRepository = librairieRepository;
    }


    public List<Librairie> findAllCommandes() {
        return librairieRepository.findAll();
    }

    public Optional<Librairie> findCommandeById(Long id) {
        return librairieRepository.findById(id);
    }
}

