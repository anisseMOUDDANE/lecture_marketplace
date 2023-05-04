package com.bookback.back_book.services;

import com.bookback.back_book.models.Livre;
import com.bookback.back_book.models.LivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {
    private final LivreRepository livreRepository;

    public LivreService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    public List<Livre> findAllLivres() {
        return livreRepository.findAll();
    }

    public Optional<Livre> findLivreById(Long id) {
        return livreRepository.findById(id);
    }
}
