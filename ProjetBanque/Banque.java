package com.ProjetBanque;

public class Banque {
    private String id;
    private String dateOuverture;
    private long numero;
    private String nom;
    private String adresse;

    public Banque (String id, String dateOuverture, long numero, String nom, String adresse) {
        this.id = id;
        this.dateOuverture = dateOuverture;
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id ;
    }

    public String getDateOuverture () {
        return dateOuverture;
    }

    public void setDateOuverture ( String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public long getNumero () {
        return numero;
    }

    public void setNumero (long numero) {
        this.numero = numero;
    }

    public String getNom () {
        return nom;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getAdresse () {
        return adresse;
    }

    public void setAdresse (String adresse) {
        this.adresse = adresse;
    }
}
