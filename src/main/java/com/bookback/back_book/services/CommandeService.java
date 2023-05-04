package com.bookback.back_book.services;

import com.bookback.back_book.models.CommandeRepository;
import org.springframework.stereotype.Service;
import com.bookback.back_book.models.Commande;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeService {
    private final CommandeRepository commandeRepository;


    public CommandeService(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    public List<Commande> findAllCommandes() {
        return commandeRepository.findAll();
    }

    public Optional<Commande> findCommandeById(Long id) {
        return commandeRepository.findById(id);
    }
}
