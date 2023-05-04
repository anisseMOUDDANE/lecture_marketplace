package com.bookback.back_book.services;

import com.bookback.back_book.models.CommandeLivre;
import com.bookback.back_book.models.CommandeLivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeLivreService {

    private final CommandeLivreRepository commandeLivreRepository;

    public CommandeLivreService(CommandeLivreRepository commandeLivreRepository) {
        this.commandeLivreRepository = commandeLivreRepository;
    }

    public List<CommandeLivre> findAllCommandeLivres() {
        return commandeLivreRepository.findAll();
    }

   public Optional<CommandeLivre> findCommandeLivreById(Long id) {
        return commandeLivreRepository.findById(id);
    }

    //TODO : ajouter les méthode de recherche avec les autres paramètres


}
