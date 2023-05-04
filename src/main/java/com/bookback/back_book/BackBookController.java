package com.bookback.back_book;

import com.bookback.back_book.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BackBookController {
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private LibrairieRepository librairieRepository;

    @Autowired
    private LivreRepository livreRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CommandeLivreRepository commandeLivreRepository;

    @Autowired
    private AdministrateurRepository administrateurRepository;

    @Autowired
    private ConditionsDeVentesRepository conditionsDeVentesRepository;

    @GetMapping("/about")
    public MyData index() {
        MyData data = new MyData();
        data.setValue("Hello World");
        return data;
    }

    @GetMapping("/commande")
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @GetMapping("/librairie")
    public List<Librairie> getAllLibrairies() {
        return librairieRepository.findAll();
    }

    @GetMapping("/livre")
    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    @GetMapping("/client")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/commandeLivre")
    public List<CommandeLivre> getAllCommandeLivres() {
        return commandeLivreRepository.findAll();
    }

    @GetMapping("/administrateur")
    public List<Administrateur> getAllAdministrateurs() {
        return administrateurRepository.findAll();
    }

    @GetMapping("/conditionsDeVentes")
    public List<ConditionsDeVentes> getAllConditionsDeVentes() {
        return conditionsDeVentesRepository.findAll();
    }

    @GetMapping("/livrebyid/{id}")
    public ResponseEntity<Livre> getLivreById(@PathVariable Long id) {
        Optional<Livre> optionalLivre = livreRepository.findById(id);
        if (optionalLivre.isPresent()) {
            Livre livre = optionalLivre.get();
            return ResponseEntity.ok(livre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/commandebyid/{id}")
    public ResponseEntity<Commande> getCommandeById(@PathVariable Long id) {
        Optional<Commande> optionalCommande = commandeRepository.findById(id);
        if (optionalCommande.isPresent()) {
            Commande commande = optionalCommande.get();
            return ResponseEntity.ok(commande);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/commandeLivrebyid/{id}")
    public ResponseEntity<CommandeLivre> getCommandeLivreById(@PathVariable Long id) {
        Optional<CommandeLivre> optionalCommandeLivre = commandeLivreRepository.findById(id);
        if (optionalCommandeLivre.isPresent()) {
            CommandeLivre commandeLivre = optionalCommandeLivre.get();
            return ResponseEntity.ok(commandeLivre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/librairiebyid/{id}")
    public ResponseEntity<Librairie> getLibrairieById(@PathVariable Long id) {
        Optional<Librairie> optionalLibrairie = librairieRepository.findById(id);
        if (optionalLibrairie.isPresent()) {
            Librairie librairie = optionalLibrairie.get();
            return ResponseEntity.ok(librairie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/clientbyid/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        if (optionalClient.isPresent()) {
            Client client = optionalClient.get();
            return ResponseEntity.ok(client);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/administrateurbyid/{id}")
    public ResponseEntity<Administrateur> getAdministrateurById(@PathVariable Long id) {
        Optional<Administrateur> optionalAdministrateur = administrateurRepository.findById(id);
        if (optionalAdministrateur.isPresent()) {
            Administrateur administrateur = optionalAdministrateur.get();
            return ResponseEntity.ok(administrateur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/conditionsDeVentesbyid/{id}")
    public ResponseEntity<ConditionsDeVentes> getConditionsDeVentesById(@PathVariable Long id) {
        Optional<ConditionsDeVentes> optionalConditionsDeVentes = conditionsDeVentesRepository.findById(id);
        if (optionalConditionsDeVentes.isPresent()) {
            ConditionsDeVentes conditionsDeVentes = optionalConditionsDeVentes.get();
            return ResponseEntity.ok(conditionsDeVentes);
        } else {
            return ResponseEntity.notFound().build();
        }
    }







    static class MyData {
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
