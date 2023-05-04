package com.bookback.back_book.services;

import com.bookback.back_book.models.ConditionsDeVentesRepository;
import org.springframework.stereotype.Service;

@Service
public class ConditionsDeVentesServices {

    private final ConditionsDeVentesRepository conditionsDeVentesRepository;

    public ConditionsDeVentesServices(ConditionsDeVentesRepository conditionsDeVentesRepository) {
        this.conditionsDeVentesRepository = conditionsDeVentesRepository;
    }

    public ConditionsDeVentesRepository getConditionsDeVentesRepository() {
        return conditionsDeVentesRepository;
    }
}
