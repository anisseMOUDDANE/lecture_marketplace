package com.bookback.back_book.services;

import com.bookback.back_book.models.Client;
import com.bookback.back_book.models.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> findClientById(Long id) {
        return clientRepository.findById(id);
    }

}
