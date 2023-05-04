package com.bookback.back_book.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrairieRepository extends JpaRepository<Librairie, Long> {
}