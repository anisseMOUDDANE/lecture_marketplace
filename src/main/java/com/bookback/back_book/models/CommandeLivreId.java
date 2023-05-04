package com.bookback.back_book.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CommandeLivreId implements Serializable {

    @Column(name = "id_commande")
    private Long id_commande;

    @Column(name = "id_livre")
    private Long id_livre;

    // constructeurs, getters, setters, equals, hashCode

    public CommandeLivreId() {
    }

    public CommandeLivreId(Long idCommande, Long idLivre) {
        this.id_commande = idCommande;
        this.id_livre = idLivre;
    }

    public Long getIdCommande() {
        return id_commande;
    }

    public void setIdCommande(Long idCommande) {
        this.id_commande = idCommande;
    }

    public Long getIdLivre() {
        return id_livre;
    }

    public void setIdLivre(Long idLivre) {
        this.id_livre = idLivre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommandeLivreId)) return false;
        CommandeLivreId that = (CommandeLivreId) o;
        return getIdCommande().equals(that.getIdCommande()) &&
                getIdLivre().equals(that.getIdLivre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCommande(), getIdLivre());
    }



}
