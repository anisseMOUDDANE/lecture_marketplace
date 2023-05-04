package com.bookback.back_book.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommandeLivreRepository extends JpaRepository<CommandeLivre, Long> {
}
