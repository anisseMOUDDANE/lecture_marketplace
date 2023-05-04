package com.bookback.back_book.models;

import jakarta.persistence.*;

@Entity
@Table(name = "livre")

public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "isbn")
    private String isbn;

    @Column(name = "titre")
    private String titre;

    @Column(name = "auteur")
    private String auteur;

    @Column(name = "annee")
    private String annee;

    @Column(name = "edition")
    private String edition;

    @Column(name = "quantite")
    private Integer quantite;

    @Column(name = "prix")
    private Double prix;

    @Column(name = "editeur")
    private String editeur;

    @Column(name = "resume")
    private String resume;

    @Column(name = "quart_page")
    private String quartPage;

    @Column(name = "description")
    private String description;

    @Column(name = "sommaire")
    private String sommaire;

    @Column(name = "id_librairie")
    private Long idLibrairie;


    public String getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getAnnee() {
        return annee;
    }

    public String getEdition() {
        return edition;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public Double getPrix() {
        return prix;
    }

    public String getEditeur() {
        return editeur;
    }

    public String getResume() {
        return resume;
    }

    public String getQuartPage() {
        return quartPage;
    }

    public String getDescription() {
        return description;
    }

    public String getSommaire() {
        return sommaire;
    }

    public Long getIdLibrairie() {
        return idLibrairie;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setQuartPage(String quartPage) {
        this.quartPage = quartPage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSommaire(String sommaire) {
        this.sommaire = sommaire;
    }

    public void setIdLibrairie(Long idLibrairie) {
        this.idLibrairie = idLibrairie;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
